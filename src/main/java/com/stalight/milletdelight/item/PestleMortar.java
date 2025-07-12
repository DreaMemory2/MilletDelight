package com.stalight.milletdelight.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PestleMortar extends Item {

    public PestleMortar(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        return ModItems.PESTLE_MORTAR.getDefaultStack();
    }
}
