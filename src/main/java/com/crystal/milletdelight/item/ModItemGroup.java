package com.crystal.milletdelight.item;

import com.crystal.milletdelight.MilletDelight;
import com.crystal.milletdelight.block.MilletBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItemGroup {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MilletDelight.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> GROUP = CREATIVE_MODE_TABS.register("group", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.milletdelight.group"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> new ItemStack(MilletItems.MILLET_DUST.get()))
            .displayItems((parameters, output) -> {
                output.accept(MilletItems.MILLET);
                output.accept(MilletItems.MILLET_DUST);
                output.accept(MilletItems.MILLET_NOODLE);
                output.accept(MilletItems.MILLET_TEMPLATE);
                output.accept(MilletItems.MILLET_PANICLE);
                output.accept(MilletItems.PESTLE_MORTAR);
                output.accept(MilletItems.MILLET_KNIFE);
                output.accept(MilletItems.APPLE_SAUCE);
                output.accept(MilletItems.POTATO_SAUCE);
                output.accept(MilletItems.COOKED_APPLE);
                output.accept(MilletItems.MILLET_BISCUIT);
                output.accept(MilletItems.CHOCOLATE_BISCUIT);
                output.accept(MilletItems.HONEY_BISCUIT);
                output.accept(MilletItems.MILK_BISCUIT);
                output.accept(MilletItems.SCULK_BISCUIT);
                output.accept(MilletItems.SWEET_BERRY_BISCUIT);
                output.accept(MilletItems.MILLET_PASTRY);
                output.accept(MilletItems.CHOCOLATE_MILLET_PASTRY);
                output.accept(MilletItems.CHORUS_MILLET_PASTRY);
                output.accept(MilletItems.GLOW_BERRY_MILLET_PASTRY);
                output.accept(MilletItems.MILK_MILLET_PASTRY);
                output.accept(MilletItems.SCULK_MILLET_PASTRY);
                output.accept(MilletItems.MILLET_WINE);
                output.accept(MilletItems.WHEAT_WINE);
                output.accept(MilletItems.GLOW_BERRY_WINE);
                output.accept(MilletItems.MILLET_BALL);
                output.accept(MilletItems.POTATO_ROLLS);
                output.accept(MilletItems.SPUN_SUGAR);
                output.accept(MilletItems.COOKED_SPUN_SUGAR);
                output.accept(MilletItems.MILLET_BEEF);
                output.accept(MilletItems.MILLET_CHICKEN);
                output.accept(MilletItems.MILLET_PORKCHOP);
                output.accept(MilletItems.FRIED_MILLET_RICE);
                output.accept(MilletItems.MILLET_RICE);
                output.accept(MilletItems.MILLET_GRUEL);
                output.accept(MilletItems.MILLET_PUMPKIN_SOUP);
                output.accept(MilletItems.MILLET_VEGETABLE_SOUP);
                output.accept(MilletItems.MILLET_NOODLES);
                output.accept(MilletItems.BONE_MILLET_NOODLES);
                output.accept(MilletItems.POTATO_MILLET_NOODLES);
                output.accept(MilletItems.TOMATO_MILLET_NOODLES);
                output.accept(MilletBlocks.MILLET_BAG);
                output.accept(MilletBlocks.MILLET_BALE);
                output.accept(MilletBlocks.MILLET_CAKES);
            }).build());
}
