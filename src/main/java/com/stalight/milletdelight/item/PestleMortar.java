package com.stalight.milletdelight.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PestleMortar extends Item {
    public PestleMortar(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("临时借用植物魔法的杵和臼"));
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        return ItemList.PestleMortar.getDefaultStack();
    }
}
