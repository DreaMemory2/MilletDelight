package com.stalight.milletdelight.screen.handler;

import com.stalight.milletdelight.block.entity.MilletTableEntity;
import com.stalight.milletdelight.registries.ModScreenHandlers;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class MilletTableScreenHandler extends ScreenHandler {

    private final Inventory inventory;
    private final PropertyDelegate propertyDelegate;
    private final MilletTableEntity blockEntity;

    public MilletTableScreenHandler(int syncId, PlayerInventory playerInventory, PacketByteBuf buf) {
        this(syncId, playerInventory, playerInventory.player.getWorld().getBlockEntity(buf.readBlockPos()), new ArrayPropertyDelegate(2));
    }
    public MilletTableScreenHandler(int syncId, PlayerInventory playerInventory, BlockEntity entity, PropertyDelegate propertyDelegate) {
        super(ModScreenHandlers.MILLER_TABLE_SCREEN_HANDLER, syncId);
        this.inventory = (Inventory) entity;
        this.propertyDelegate = propertyDelegate;
        this.blockEntity = (MilletTableEntity) entity;

        ScreenHandler.checkSize(inventory, 9);

        this.addSlot(new Slot(inventory, 0, 30, 17));
        this.addSlot(new Slot(inventory, 1, 48, 17));
        this.addSlot(new Slot(inventory, 9, 66, 17));
        this.addSlot(new Slot(inventory, 3, 30, 35));
        this.addSlot(new Slot(inventory, 4, 48, 35));
        this.addSlot(new Slot(inventory, 5, 66, 35));
        this.addSlot(new Slot(inventory, 6, 30, 53));
        this.addSlot(new Slot(inventory, 7, 48, 53));
        this.addSlot(new Slot(inventory, 8, 66, 53));
        this.addSlot(new Slot(inventory, 2, 124, 35));

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);
        addProperties(propertyDelegate);
    }

    public boolean isCrafting() {
        return propertyDelegate.get(0) > 0;
    }

    public int getScaledProgress() {
        // 当前进度，或最小进度
        int minProgress = propertyDelegate.get(0);
        int maxProgress = propertyDelegate.get(1);
        // 像素点
        int progressArrowSize = 24;
        return maxProgress != 0 && minProgress != 0 ? progressArrowSize * minProgress / maxProgress : 0;
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int invSlot) {
        ItemStack newItemStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalItemStack = slot.getStack();
            newItemStack = originalItemStack.copy();

            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalItemStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalItemStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalItemStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }
        return newItemStack;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int i = 0; i < 3; i++) {
            for (int l = 0; l < 9; l++) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }


    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; i++) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }
}
