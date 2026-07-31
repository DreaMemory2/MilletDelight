package com.crystal.milletdelight.datagen;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;

public abstract class ModRecipeProvider extends RecipeProvider {
    private final HolderGetter<Item> items;

    protected ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
        this.items = registries.lookupOrThrow(Registries.ITEM);
    }

    public CookingPotRecipeBuilder cooking(ItemLike mainResult, int count, int cookingTime, float experience) {
        return CookingPotRecipeBuilder.cookingPotRecipe(items, mainResult, count, cookingTime, experience);
    }

    public CookingPotRecipeBuilder cooking(ItemLike mainResult, int count, int cookingTime, float experience, ItemLike container) {
        return CookingPotRecipeBuilder.cookingPotRecipe(items, mainResult, count, cookingTime, experience, container);
    }
}
