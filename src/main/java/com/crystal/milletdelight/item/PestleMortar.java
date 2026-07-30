package com.crystal.milletdelight.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class PestleMortar extends Item {

    public PestleMortar() {
        super(new Properties().stacksTo(1));
    }

    @Override
    public @NotNull ItemStack getCraftingRemainingItem(@NotNull ItemStack itemStack) {
        return MilletItems.PESTLE_MORTAR.get().getDefaultInstance();
    }
}
