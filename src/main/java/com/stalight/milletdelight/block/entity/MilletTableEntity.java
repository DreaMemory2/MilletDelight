package com.stalight.milletdelight.block.entity;

import com.stalight.milletdelight.item.ItemList;
import com.stalight.milletdelight.registries.ModBlockEntities;
import com.stalight.milletdelight.screen.handler.MilletTableScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class MilletTableEntity extends BlockEntity implements SidedInventory, ExtendedScreenHandlerFactory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(10, ItemStack.EMPTY);
    private final PropertyDelegate propertyDelegate;
    private int minProgress = 0;
    private int maxProgress = 100;
    public MilletTableEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MILLET_TABLE_ENTITY, pos, state);
        this.propertyDelegate = new MilletTablePropertyDelegate();
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);
    }

    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    @Override
    public int[] getAvailableSlots(Direction side) {
        int[] result = new int[getItems().size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }
        return result;
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction dir) {
        return true;
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction dir) {
        return true;
    }

    @Override
    public int size() {
        return getItems().size();
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < size(); i++) {
            ItemStack itemStack = this.getStack(i);
            if (!itemStack.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public ItemStack getStack(int slot) {
        return this.getItems().get(slot);
    }

    @Override
    public ItemStack removeStack(int slot, int amount) {
        ItemStack result = Inventories.splitStack(this.getItems(), slot, amount);
        if (!result.isEmpty()) {
            markDirty();
        }
        return result;
    }

    @Override
    public ItemStack removeStack(int slot) {
        return Inventories.removeStack(this.getItems(), slot);
    }

    @Override
    public void setStack(int slot, ItemStack stack) {
        this.getItems().set(slot, stack);
        if (stack.getCount() > this.getMaxCountPerStack()) {
            stack.setCount(this.getMaxCountPerStack());
        }
    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return true;
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Millet Craft Table");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new MilletTableScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
        this.minProgress = nbt.getInt("drink_machine.progress");
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, this.inventory);
        nbt.putInt("drink_machine.progress", this.minProgress);
    }

    @Override
    public void clear() {
        this.getItems().clear();
    }

    private void resetProgress() {
        this.minProgress = 0;
    }

    public static void tick(World world, BlockPos pos, BlockState state, MilletTableEntity entity) {
        if (world.isClient) {
            return;
        }
        if (entity.hasRecipe(entity)) {
            entity.minProgress++;
            markDirty(world, pos, state);
            if (entity.minProgress >= entity.maxProgress) {
                entity.craftItem(entity);
            }
        } else {
            entity.resetProgress();
            markDirty(world, pos, state);
        }
    }
    private static boolean hasRecipe(MilletTableEntity entity) {
        // 提供简单库存，插槽的数量为3
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            // 将当前的物品存入到简单库存中
            inventory.setStack(i, entity.getStack(i));
        }
        // 判断第一槽位的物品与合成表是否匹配
        boolean firstSlot = entity.getStack(0).getItem() == Items.APPLE;
        // 全部满足三种情况，则合成表继续
        return firstSlot && canInsertAmountIntOutputSlot(inventory)
                && canInsertItemIntOutputSlot(inventory, Items.GOLDEN_APPLE);
    }
    private static boolean canInsertItemIntOutputSlot(SimpleInventory inventory, Item output) {
        return inventory.getStack(2).getItem() == output || inventory.getStack(2).isEmpty();
    }
    private static boolean canInsertAmountIntOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(2).getMaxCount() > inventory.getStack(2).getCount();
    }
    public static void craftItem(MilletTableEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }
        if (MilletTableEntity.hasRecipe(entity)) {
            entity.removeStack(1, 1);
            entity.setStack(2, new ItemStack(ItemList.AppleSauce,
                    entity.getStack(2).getCount() + 1));
            entity.resetProgress();
        }
    }
    class MilletTablePropertyDelegate implements PropertyDelegate {
        @Override
        public int get(int index) {
            switch (index) {
                case 0:
                    return MilletTableEntity.this.minProgress;
                case 1:
                    return MilletTableEntity.this.maxProgress;
                default:
                    return 0;
            }
        }

        @Override
        public void set(int index, int value) {
            switch (index) {
                case 0:
                    MilletTableEntity.this.minProgress = value;
                    break;
                case 1:
                    MilletTableEntity.this.maxProgress = value;
                    break;
            }
        }

        /**
         * <p>同步数量的值</p>
         */
        @Override
        public int size() {
            return 2;
        }
    }
}
