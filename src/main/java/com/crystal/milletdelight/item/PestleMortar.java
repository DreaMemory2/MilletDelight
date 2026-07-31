package com.crystal.milletdelight.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class PestleMortar extends Item {

    public PestleMortar(Properties settings) {
        super(settings);
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        return MilletItems.PESTLE_MORTAR.getDefaultInstance();
    }
}
