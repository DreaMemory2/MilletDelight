package com.crystal.milletdelight.datagen;

import com.crystal.milletdelight.item.MilletItems;
import com.crystal.milletdelight.tag.ICommonTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.recipe.v1.ingredient.DefaultCustomIngredients;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.common.crafting.CookingPotBookCategory;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeGeneration extends FabricRecipeProvider {

    public ModRecipeGeneration(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NotNull Provider provider, @NotNull RecipeOutput recipeOutput) {
        return new Builder(provider, recipeOutput);
    }

    private static class Builder extends ModRecipeProvider {

        private Builder(HolderLookup.Provider registries, RecipeOutput output) {
            super(registries, output);
        }

        @Override
        public void buildRecipes() {
            cutting(output);
            potting(output);
            crafting(output);
            cooking(output);
            smithing(output);
        }

        public void smithing(RecipeOutput output) {
            SmithingTransformRecipeBuilder.smithing(
                            Ingredient.of(MilletItems.MILLET_TEMPLATE),
                            Ingredient.of(ModItems.GOLDEN_KNIFE.get()),
                            Ingredient.of(MilletItems.MILLET),
                            RecipeCategory.TOOLS,
                            MilletItems.MILLET_KNIFE)
                    .unlocks("has_millet_template", has(MilletItems.MILLET_TEMPLATE))
                    .save(output, "millet_knife");
        }

        public void cutting(RecipeOutput output) {
            CuttingBoardRecipeBuilder.cuttingRecipe(
                            Ingredient.of(MilletItems.MILLET_PANICLE),
                            Ingredient.of(MilletItems.MILLET_PANICLE),
                            MilletItems.MILLET)
                    .addResult(ModItems.STRAW.get())
                    .save(output);
        }

        public void potting(RecipeOutput output) {
            // 苹果酱
            this.cooking(MilletItems.APPLE_SAUCE, 1, 200, 1.0F, Items.BOWL)
                    .addIngredient(Items.APPLE)
                    .addIngredient(Items.APPLE)
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("has_apple", has(Items.APPLE))
                    .save(output);
            // 骨头面条汤
            this.cooking(MilletItems.BONE_MILLET_NOODLES, 1, 200, 1.0F, Items.BOWL)
                    .addIngredient(MilletItems.MILLET_NOODLE)
                    .addIngredient(ModItems.BONE_BROTH.get())
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("bone_broth", has(ModItems.BONE_BROTH.get()))
                    .save(output);
            // 小米饭
            this.cooking(MilletItems.MILLET_RICE, 1, 200, 1.0F, Items.BOWL)
                    .addIngredient(MilletItems.MILLET)
                    .addIngredient(DefaultCustomIngredients.components(Ingredient.of(Items.POTION),
                            builder -> builder.set(DataComponents.POTION_CONTENTS, new PotionContents(Potions.WATER))))
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("has_millet", has(MilletItems.MILLET))
                    .save(output);
            // 炒饭
            this.cooking(MilletItems.FRIED_MILLET_RICE, 1, 200, 1.0F, Items.BOWL)
                    .addIngredient(MilletItems.MILLET_RICE)
                    .addIngredient(ICommonTags.EGG)
                    .addIngredient(CommonTags.Items.FOODS_ONION)
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("has_millet_rice", has(MilletItems.MILLET_RICE))
                    .save(output);
            // 发光浆果酒
            this.cooking(MilletItems.GLOW_BERRY_WINE, 1, 200, 0, Items.GLASS_BOTTLE)
                    .addIngredient(Items.GLOW_BERRIES)
                    .addIngredient(DefaultCustomIngredients.components(Ingredient.of(Items.POTION),
                            builder -> builder.set(DataComponents.POTION_CONTENTS, new PotionContents(Potions.WATER))))
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("has_glow_berries", has(Items.GLOW_BERRIES))
                    .save(output);
            // 棉花糖
            this.cooking(MilletItems.SPUN_SUGAR, 1, 200, 0)
                    .addIngredient(Items.SUGAR)
                    .addIngredient(Items.SUGAR)
                    .addIngredient(DefaultCustomIngredients.components(Ingredient.of(Items.POTION),
                            builder -> builder.set(DataComponents.POTION_CONTENTS, new PotionContents(Potions.WATER))))
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("has_sugar", has(Items.SUGAR))
                    .save(output);
            // 小米丸子
            this.cooking(MilletItems.MILLET_BALL, 1, 200, 0, Items.BOWL)
                    .addIngredient(MilletItems.MILLET_DUST)
                    .addIngredient(MilletItems.MILLET_DUST)
                    .addIngredient(Items.SUGAR)
                    .addIngredient(Items.SUGAR)
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("has_millet_dust", has(MilletItems.MILLET_DUST))
                    .unlockedBy("has_sugar", has(Items.SUGAR))
                    .save(output);
            // 小米配牛肉
            this.cooking(MilletItems.MILLET_BEEF, 1, 200, 0, Items.BOWL)
                    .addIngredient(MilletItems.MILLET)
                    .addIngredient(Items.COOKED_BEEF)
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("has_cooked_beef", has(Items.COOKED_BEEF))
                    .save(output);
            // 小米糕
            this.cooking(MilletItems.MILLET_PASTRY, 1, 200, 0, Items.BOWL)
                    .addIngredient(MilletItems.MILLET)
                    .addIngredient(MilletItems.MILLET)
                    .addIngredient(Items.SUGAR)
                    .addIngredient(Items.SUGAR)
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("has_millet", has(MilletItems.MILLET))
                    .save(output);
            // 小米配鸡肉
            this.cooking(MilletItems.MILLET_CHICKEN, 1, 200, 0, Items.BOWL)
                    .addIngredient(MilletItems.MILLET)
                    .addIngredient(CommonTags.Items.FOODS_RAW_CHICKEN)
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("has_millet_rice", has(MilletItems.MILLET_RICE))
                    .save(output);
            // 小米粥
            this.cooking(MilletItems.MILLET_GRUEL, 1, 200, 0, Items.BOWL)
                    .addIngredient(MilletItems.MILLET)
                    .addIngredient(Items.WATER_BUCKET)
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("has_water_bucket", has(MilletItems.MILLET_RICE))
                    .save(output);
            // 汤子
            this.cooking(MilletItems.MILLET_NOODLES, 1, 200, 0, Items.BOWL)
                    .addIngredient(MilletItems.MILLET_NOODLE)
                    .addIngredient(ICommonTags.EGG)
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("has_millet_noodles", has(MilletItems.MILLET_NOODLE))
                    .save(output);
            // 小米配猪肉
            this.cooking(MilletItems.MILLET_PORKCHOP, 1, 200, 0, Items.BOWL)
                    .addIngredient(MilletItems.MILLET)
                    .addIngredient(CommonTags.Items.FOODS_RAW_PORK)
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("has_millet", has(MilletItems.MILLET))
                    .save(output);
            // 南瓜汤
            this.cooking(MilletItems.MILLET_PUMPKIN_SOUP, 1, 200, 0, Items.BOWL)
                    .addIngredient(MilletItems.MILLET)
                    .addIngredient(ModItems.PUMPKIN_SLICE.get())
                    .addIngredient(CommonTags.Items.FOODS_CABBAGE)
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("has_pumpkin_slice", has(ModItems.PUMPKIN_SLICE.get()))
                    .save(output);
            // 蔬菜汤
            this.cooking(MilletItems.MILLET_VEGETABLE_SOUP, 1, 200, 0, Items.BOWL)
                    .addIngredient(MilletItems.MILLET)
                    .addIngredient(Items.CARROT)
                    .addIngredient(CommonTags.Items.FOODS_CABBAGE)
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("has_carrot", has(Items.CARROT))
                    .save(output);
            // 小米酒
            this.cooking(MilletItems.MILLET_WINE, 1, 200, 0, Items.GLASS_BOTTLE)
                    .addIngredient(MilletItems.MILLET)
                    .addIngredient(DefaultCustomIngredients.components(Ingredient.of(Items.POTION),
                            builder -> builder.set(DataComponents.POTION_CONTENTS, new PotionContents(Potions.WATER))))
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("has_millet", has(MilletItems.MILLET))
                    .save(output);
            // 土豆面条汤
            this.cooking(MilletItems.POTATO_MILLET_NOODLES, 1, 200, 0, Items.BOWL)
                    .addIngredient(MilletItems.MILLET)
                    .addIngredient(MilletItems.POTATO_SAUCE)
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("has_potato_sauce", has(MilletItems.MILLET))
                    .save(output);
            // 煎饼果子
            this.cooking(MilletItems.POTATO_ROLLS, 1, 200, 0)
                    .addIngredient(MilletItems.MILLET)
                    .addIngredient(Items.POTATO)
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("has_potato", has(Items.POTATO))
                    .save(output);
            // 土豆酱
            this.cooking(MilletItems.POTATO_SAUCE, 1, 200, 0, Items.BOWL)
                    .addIngredient(Items.POTATO)
                    .addIngredient(Items.POTATO)
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("has_potato", has(Items.POTATO))
                    .save(output);
            // 西红柿面条汤
            this.cooking(MilletItems.TOMATO_MILLET_NOODLES, 1, 200, 0, Items.BOWL)
                    .addIngredient(MilletItems.MILLET)
                    .addIngredient(ModItems.TOMATO_SAUCE.get())
                    .setRecipeBookCategory(CookingPotBookCategory.MEALS)
                    .unlockedBy("has_tomato_sauce", has(ModItems.TOMATO_SAUCE.get()))
                    .save(output);
        }

        public void crafting(RecipeOutput output) {
            // 巧克力饼干
            this.shapeless(RecipeCategory.MISC, MilletItems.CHOCOLATE_BISCUIT)
                    .requires(Items.COCOA_BEANS)
                    .requires(MilletItems.MILLET_BISCUIT)
                    .unlockedBy("has_cocoa_beans", has(MilletItems.MILLET_BISCUIT))
                    .save(output);
            // 巧克力糕点
            this.shapeless(RecipeCategory.MISC, MilletItems.CHOCOLATE_MILLET_PASTRY)
                    .requires(MilletItems.MILLET_DUST)
                    .requires(Items.SUGAR)
                    .requires(Items.COCOA_BEANS)
                    .unlockedBy("has_cocoa_beans", has(Items.COCOA_BEANS))
                    .save(output);
            // 紫颂糕点
            this.shapeless(RecipeCategory.MISC, MilletItems.CHORUS_MILLET_PASTRY)
                    .requires(MilletItems.MILLET_DUST)
                    .requires(Items.SUGAR)
                    .requires(Items.CHORUS_FRUIT)
                    .unlockedBy("has_chorus_fruit", has(Items.CHORUS_FRUIT))
                    .save(output);
            // 发光浆果糕点
            this.shapeless(RecipeCategory.MISC, MilletItems.GLOW_BERRY_MILLET_PASTRY)
                    .requires(MilletItems.MILLET_DUST)
                    .requires(Items.SUGAR)
                    .requires(Items.GLOW_BERRIES)
                    .unlockedBy("has_glow_berries", has(Items.GLOW_BERRIES))
                    .save(output);
            // 蜂蜜饼干
            this.shapeless(RecipeCategory.MISC, MilletItems.HONEY_BISCUIT)
                    .requires(MilletItems.MILLET_BISCUIT)
                    .requires(Items.HONEY_BOTTLE)
                    .unlockedBy("has_glow_bottle", has(Items.HONEY_BOTTLE))
                    .save(output);
            // 牛奶饼干
            this.shapeless(RecipeCategory.MISC, MilletItems.MILK_BISCUIT)
                    .requires(MilletItems.MILLET_BISCUIT)
                    .requires(ModItems.MILK_BOTTLE.get())
                    .unlockedBy("has_milk_bottle", has(ModItems.MILK_BOTTLE.get()))
                    .save(output);
            // 牛奶糕点
            this.shapeless(RecipeCategory.MISC, MilletItems.MILK_MILLET_PASTRY)
                    .requires(MilletItems.MILLET_DUST)
                    .requires(Items.SUGAR)
                    .requires(ModItems.MILK_BOTTLE.get())
                    .unlockedBy("has_milk_bottle", has(ModItems.MILK_BOTTLE.get()))
                    .save(output);
            // 小米袋
            this.shaped(RecipeCategory.MISC, MilletItems.MILLET_BAG)
                    .pattern("AAA")
                    .pattern("AAA")
                    .pattern("AAA")
                    .define('A', MilletItems.MILLET)
                    .unlockedBy("has_millet", has(MilletItems.MILLET))
                    .save(output);
            // 小米
            this.shapeless(RecipeCategory.MISC, MilletItems.MILLET, 9)
                    .requires(MilletItems.MILLET_BAG)
                    .unlockedBy("has_millet_bag", has(MilletItems.MILLET_BAG))
                    .save(output);
            // 小米捆
            this.shaped(RecipeCategory.MISC, MilletItems.MILLET_BALE)
                    .pattern("AAA")
                    .pattern("AAA")
                    .pattern("AAA")
                    .define('A', MilletItems.MILLET_PANICLE)
                    .unlockedBy("has_millet_panicle", has(MilletItems.MILLET_PANICLE))
                    .save(output);
            // 粟
            this.shapeless(RecipeCategory.MISC, MilletItems.MILLET_PANICLE, 9)
                    .requires(MilletItems.MILLET_BALE)
                    .unlockedBy("has_millet_bale", has(MilletItems.MILLET_BALE))
                    .save(output);
            // 小米蛋糕
            this.shaped(RecipeCategory.MISC, MilletItems.MILLET_CAKES)
                    .pattern("ABA")
                    .pattern("CDC")
                    .pattern("EEE")
                    .define('A', Items.MILK_BUCKET)
                    .define('B', MilletItems.MILLET)
                    .define('C', Items.SUGAR)
                    .define('D', ICommonTags.EGG)
                    .define('E', Items.WHEAT)
                    .unlockedBy("has_millet_cakes", has(MilletItems.MILLET_CAKES))
                    .save(output);
            // 小米面粉
            this.shapeless(RecipeCategory.MISC, MilletItems.MILLET_DUST)
                    .requires(MilletItems.PESTLE_MORTAR)
                    .requires(MilletItems.MILLET)
                    .unlockedBy("has_millet", has(MilletItems.MILLET))
                    .save(output);
            // 小米面条
            this.shapeless(RecipeCategory.MISC, MilletItems.MILLET_NOODLE)
                    .requires(MilletItems.MILLET_DUST)
                    .requires(MilletItems.MILLET_DUST)
                    .requires(Items.WATER_BUCKET)
                    .unlockedBy("has_millet_dust", has(MilletItems.MILLET_DUST))
                    .save(output);
            // 碾磨物品
            this.shaped(RecipeCategory.MISC, MilletItems.PESTLE_MORTAR)
                    .pattern(" A ")
                    .pattern("B  ")
                    .pattern("C  ")
                    .define('A', Items.STICK)
                    .define('B', Items.OAK_PLANKS)
                    .define('C', Items.BOWL)
                    .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                    .save(output);
            // 幽匿饼干
            this.shapeless(RecipeCategory.MISC, MilletItems.SCULK_BISCUIT)
                    .requires(MilletItems.MILLET_BISCUIT)
                    .requires(Items.SCULK)
                    .unlockedBy("has_sculk", has(Items.SCULK))
                    .save(output);
            // 幽匿糕点
            this.shapeless(RecipeCategory.MISC, MilletItems.SCULK_MILLET_PASTRY)
                    .requires(MilletItems.MILLET_DUST)
                    .requires(Items.SUGAR)
                    .requires(Items.SCULK)
                    .unlockedBy("has_sculk", has(Items.SCULK))
                    .save(output);
            // 甜浆果糕点
            this.shapeless(RecipeCategory.MISC, MilletItems.SWEET_BERRY_BISCUIT)
                    .requires(MilletItems.MILLET_DUST)
                    .requires(Items.SUGAR)
                    .requires(Items.SWEET_BERRIES)
                    .unlockedBy("has_sweet_berries", has(Items.SWEET_BERRIES))
                    .save(output);
            // 小麦酒
            this.shapeless(RecipeCategory.MISC, MilletItems.WHEAT_WINE)
                    .requires(Items.WHEAT)
                    .requires(DefaultCustomIngredients.components(Ingredient.of(Items.POTION),
                            builder -> builder.set(DataComponents.POTION_CONTENTS, new PotionContents(Potions.WATER))))
                    .unlockedBy("has_wheat", has(Items.WHEAT))
                    .save(output);
            // 小米升级模板
            this.shaped(RecipeCategory.MISC, MilletItems.MILLET_TEMPLATE, 2)
                    .pattern("ABA")
                    .pattern("ACA")
                    .pattern("AAA")
                    .define('A', MilletItems.MILLET)
                    .define('B', MilletItems.MILLET_TEMPLATE)
                    .define('C', Items.DIAMOND)
                    .unlockedBy("has_millet_template", has(MilletItems.MILLET_TEMPLATE))
                    .save(output);
        }

        public void cooking(RecipeOutput output) {
            // 烤棉花糖
            SimpleCookingRecipeBuilder.smelting(
                            Ingredient.of(MilletItems.SPUN_SUGAR),
                            RecipeCategory.FOOD,
                            CookingBookCategory.FOOD,
                            MilletItems.COOKED_SPUN_SUGAR,
                            0.15F,
                             200)
                    .unlockedBy("has_spun_sugar", has(MilletItems.SPUN_SUGAR))
                    .save(output);
            // 烤苹果
            SimpleCookingRecipeBuilder.smelting(
                            Ingredient.of(Items.APPLE),
                            RecipeCategory.FOOD,
                            CookingBookCategory.FOOD,
                            MilletItems.COOKED_APPLE,
                            0.15F,
                            250)
                    .unlockedBy("has_apple", has(Items.APPLE))
                    .save(output);
        }
    }

    @Override
    public @NotNull String getName() {
        return "";
    }
}
