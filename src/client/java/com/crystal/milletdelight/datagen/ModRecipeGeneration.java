package com.crystal.milletdelight.datagen;

import com.crystal.milletdelight.item.MilletItems;
import com.crystal.milletdelight.tag.ICommonTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.recipe.v1.ingredient.DefaultCustomIngredients;
import net.minecraft.data.recipes.*;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import vectorwing.farmersdelight.common.registry.ModItems;

import java.util.function.Consumer;

public class ModRecipeGeneration extends FabricRecipeProvider {

    public ModRecipeGeneration(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> output) {
        crafting(output);
        cooking(output);
        smithing(output);
    }

    public void smithing(Consumer<FinishedRecipe> output) {
        SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(MilletItems.MILLET_TEMPLATE),
                Ingredient.of(ModItems.GOLDEN_KNIFE.get()),
                Ingredient.of(MilletItems.MILLET),
                RecipeCategory.TOOLS,
                MilletItems.MILLET_KNIFE)
                .unlocks("has_millet_template", has(MilletItems.MILLET_TEMPLATE))
                .save(output, "millet_knife");
    }

    public void crafting(Consumer<FinishedRecipe> output) {
        // 巧克力饼干
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MilletItems.CHOCOLATE_BISCUIT)
                .requires(Items.COCOA_BEANS)
                .requires(MilletItems.MILLET_BISCUIT)
                .unlockedBy("has_cocoa_beans", has(MilletItems.MILLET_BISCUIT))
                .save(output);
        // 巧克力糕点
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MilletItems.CHOCOLATE_MILLET_PASTRY)
                .requires(MilletItems.MILLET_DUST)
                .requires(Items.SUGAR)
                .requires(Items.COCOA_BEANS)
                .unlockedBy("has_cocoa_beans", has(Items.COCOA_BEANS))
                .save(output);
        // 紫颂糕点
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MilletItems.CHORUS_MILLET_PASTRY)
                .requires(MilletItems.MILLET_DUST)
                .requires(Items.SUGAR)
                .requires(Items.CHORUS_FRUIT)
                .unlockedBy("has_chorus_fruit", has(Items.CHORUS_FRUIT))
                .save(output);
        // 发光浆果糕点
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MilletItems.GLOW_BERRY_MILLET_PASTRY)
                .requires(MilletItems.MILLET_DUST)
                .requires(Items.SUGAR)
                .requires(Items.GLOW_BERRIES)
                .unlockedBy("has_glow_berries", has(Items.GLOW_BERRIES))
                .save(output);
        // 蜂蜜饼干
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MilletItems.HONEY_BISCUIT)
                .requires(MilletItems.MILLET_BISCUIT)
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_glow_bottle", has(Items.HONEY_BOTTLE))
                .save(output);
        // 牛奶饼干
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MilletItems.MILK_BISCUIT)
                .requires(MilletItems.MILLET_BISCUIT)
                .requires(ModItems.MILK_BOTTLE.get())
                .unlockedBy("has_milk_bottle", has(ModItems.MILK_BOTTLE.get()))
                .save(output);
        // 牛奶糕点
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MilletItems.MILK_MILLET_PASTRY)
                .requires(MilletItems.MILLET_DUST)
                .requires(Items.SUGAR)
                .requires(ModItems.MILK_BOTTLE.get())
                .unlockedBy("has_milk_bottle", has(ModItems.MILK_BOTTLE.get()))
                .save(output);
        // 小米袋
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MilletItems.MILLET_BAG)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MilletItems.MILLET)
                .unlockedBy("has_millet", has(MilletItems.MILLET))
                .save(output);
        // 小米
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MilletItems.MILLET, 9)
                .requires(MilletItems.MILLET_BAG)
                .unlockedBy("has_millet_bag", has(MilletItems.MILLET_BAG))
                .save(output);
        // 小米捆
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MilletItems.MILLET_BALE)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MilletItems.MILLET_PANICLE)
                .unlockedBy("has_millet_panicle", has(MilletItems.MILLET_PANICLE))
                .save(output);
        // 粟
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MilletItems.MILLET_PANICLE, 9)
                .requires(MilletItems.MILLET_BALE)
                .unlockedBy("has_millet_bale", has(MilletItems.MILLET_BALE))
                .save(output);
        // 小米蛋糕
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MilletItems.MILLET_CAKES)
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
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MilletItems.MILLET_DUST)
                .requires(MilletItems.PESTLE_MORTAR)
                .requires(MilletItems.MILLET)
                .unlockedBy("has_millet", has(MilletItems.MILLET))
                .save(output);
        // 小米面条
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MilletItems.MILLET_NOODLE)
                .requires(MilletItems.MILLET_DUST)
                .requires(MilletItems.MILLET_DUST)
                .requires(Items.WATER_BUCKET)
                .unlockedBy("has_millet_dust", has(MilletItems.MILLET_DUST))
                .save(output);
        // 碾磨物品
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MilletItems.PESTLE_MORTAR)
                .pattern(" A ")
                .pattern("B  ")
                .pattern("C  ")
                .define('A', Items.STICK)
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.BOWL)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(output);
        // 幽匿饼干
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MilletItems.SCULK_BISCUIT)
                .requires(MilletItems.MILLET_BISCUIT)
                .requires(Items.SCULK)
                .unlockedBy("has_sculk", has(Items.SCULK))
                .save(output);
        // 幽匿糕点
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MilletItems.SCULK_MILLET_PASTRY)
                .requires(MilletItems.MILLET_DUST)
                .requires(Items.SUGAR)
                .requires(Items.SCULK)
                .unlockedBy("has_sculk", has(Items.SCULK))
                .save(output);
        // 甜浆果糕点
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MilletItems.SWEET_BERRY_BISCUIT)
                .requires(MilletItems.MILLET_DUST)
                .requires(Items.SUGAR)
                .requires(Items.SWEET_BERRIES)
                .unlockedBy("has_sweet_berries", has(Items.SWEET_BERRIES))
                .save(output);
        // 小麦酒
        /*ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MilletItems.WHEAT_WINE)
                .requires(Items.WHEAT)
                .requires(DefaultCustomIngredients.nbt(Ingredient.of(Items.POTION), new CompoundTag().getCompound("Potion"), true))
                .unlockedBy("has_wheat", has(Items.WHEAT))
                .save(output);*/
        // 小米升级模板
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MilletItems.MILLET_TEMPLATE, 2)
                .pattern("ABA")
                .pattern("ACA")
                .pattern("AAA")
                .define('A', MilletItems.MILLET)
                .define('B', MilletItems.MILLET_TEMPLATE)
                .define('C', Items.DIAMOND)
                .unlockedBy("has_millet_template", has(MilletItems.MILLET_TEMPLATE))
                .save(output);
    }

    public static void cooking(Consumer<FinishedRecipe> output) {
        // 烤棉花糖
        SimpleCookingRecipeBuilder.smelting(
                Ingredient.of(MilletItems.SPUN_SUGAR),
                RecipeCategory.FOOD,
                MilletItems.COOKED_SPUN_SUGAR,
                0.15F,
                250)
                .unlockedBy("has_spun_sugar", has(MilletItems.SPUN_SUGAR))
                .save(output);
        // 烤苹果
        SimpleCookingRecipeBuilder.smelting(
                Ingredient.of(Items.APPLE),
                RecipeCategory.FOOD,
                MilletItems.COOKED_APPLE,
                0.15F,
                250)
                .unlockedBy("has_apple", has(Items.APPLE))
                .save(output);
    }
}
