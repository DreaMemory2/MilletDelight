package com.crystal.milletdelight.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.Nullable;

public class PestleMortar extends Item {

    public PestleMortar(Properties settings) {
        super(settings);
    }

    @Override
    public @Nullable ItemStackTemplate getCraftingRemainder(@NotNull ItemStack stack) {
        return new ItemStackTemplate(MilletItems.PESTLE_MORTAR);
    }
}
