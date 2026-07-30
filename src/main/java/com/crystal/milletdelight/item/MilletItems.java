package com.crystal.milletdelight.item;

import com.crystal.milletdelight.MilletDelight;
import com.crystal.milletdelight.block.MilletBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import vectorwing.farmersdelight.common.item.KnifeItem;
import vectorwing.farmersdelight.common.registry.ModItems;

import java.util.function.Supplier;

public class MilletItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MilletDelight.MODID);

    /*----- 小米 -----*/
    public static final DeferredItem<Item> MILLET = register("millet", () -> new Item(new Properties()));
    /*----- 小米 -----*/
    // Block
    public static final DeferredItem<Item> MILLET_BAG = register("millet_bag", () -> new BlockItem(MilletBlocks.MILLET_BAG.get(), new Properties()));
    public static final DeferredItem<Item> MILLET_BALE = register("millet_bale", () -> new BlockItem(MilletBlocks.MILLET_BALE.get(), new Properties()));
    public static final DeferredItem<Item> MILLET_CAKES = register("millet_cakes", () -> new BlockItem(MilletBlocks.MILLET_CAKES.get(), new Properties()));
    public static final DeferredItem<Item> WILD_MILLET = register("wild_millet", () -> new BlockItem(MilletBlocks.WILD_MILLET.get(), new Properties()));
    // Item
    public static final DeferredItem<Item> MILLET_DUST = register("millet_dust", () -> new Item(new Properties()));
    public static final DeferredItem<Item> MILLET_NOODLE = register("millet_noodle", () -> new Item(new Properties()));
    public static final DeferredItem<Item> MILLET_TEMPLATE = register("millet_template", () -> new Item(new Properties()));
    public static final DeferredItem<Item> MILLET_PANICLE = register("millet_panicle", () -> new BlockItem(MilletBlocks.MILLET.get(), new Properties()));
    public static final DeferredItem<Item> PESTLE_MORTAR = register("pestle_mortar", PestleMortar::new);
    public static final DeferredItem<Item> MILLET_KNIFE = register("millet_knife", () -> new KnifeItem(Tiers.IRON, new Properties()));
    // Food
    public static final DeferredItem<Item> APPLE_SAUCE = register("apple_sauce", () -> new Item(ModItems.bowlFoodItem(MilletFoods.SAUCE)));
    public static final DeferredItem<Item> POTATO_SAUCE = register("potato_sauce", () -> new Item(ModItems.bowlFoodItem(MilletFoods.SAUCE)));
    public static final DeferredItem<Item> COOKED_APPLE = register("cooked_apple", () -> new Item(new Properties().food(MilletFoods.APPLE)));
    // 小米饼干
    public static final DeferredItem<Item> MILLET_BISCUIT = register("millet_biscuit", () -> new Item(new Properties().food(MilletFoods.SNACK)));
    public static final DeferredItem<Item> CHOCOLATE_BISCUIT = register("chocolate_biscuit", () -> new Item(new Properties().food(MilletFoods.SNACK)));
    public static final DeferredItem<Item> HONEY_BISCUIT = register("honey_biscuit", () -> new Item(new Properties().food(MilletFoods.SNACK)));
    public static final DeferredItem<Item> MILK_BISCUIT = register("milk_biscuit", () -> new Item(new Properties().food(MilletFoods.SNACK)));
    public static final DeferredItem<Item> SCULK_BISCUIT = register("sculk_biscuit", () -> new Item(new Properties().food(MilletFoods.SNACK)));
    public static final DeferredItem<Item> SWEET_BERRY_BISCUIT = register("sweet_berry_biscuit", () -> new Item(new Properties().food(MilletFoods.SNACK)));
    // 小米糕
    public static final DeferredItem<Item> MILLET_PASTRY = register("millet_pastry", () -> new Item(new Properties().food(MilletFoods.SNACK)));
    public static final DeferredItem<Item> CHOCOLATE_MILLET_PASTRY = register("chocolate_millet_pastry", () -> new Item(new Properties().food(MilletFoods.SNACK)));
    public static final DeferredItem<Item> CHORUS_MILLET_PASTRY = register("chorus_millet_pastry", () -> new Item(new Properties().food(MilletFoods.SNACK)));
    public static final DeferredItem<Item> GLOW_BERRY_MILLET_PASTRY = register("glow_berry_millet_pastry", () -> new Item(new Properties().food(MilletFoods.SNACK)));
    public static final DeferredItem<Item> MILK_MILLET_PASTRY = register("milk_millet_pastry", () -> new Item(new Properties().food(MilletFoods.SNACK)));
    public static final DeferredItem<Item> SCULK_MILLET_PASTRY = register("sculk_millet_pastry", () -> new Item(new Properties().food(MilletFoods.SNACK)));
    // Wine
    public static final DeferredItem<Item> MILLET_WINE = register("millet_wine", () -> new Item(ModItems.drinkItem()));
    public static final DeferredItem<Item> WHEAT_WINE = register("wheat_wine", () -> new Item(ModItems.drinkItem()));
    public static final DeferredItem<Item> GLOW_BERRY_WINE = register("glow_berry_wine", () -> new Item(ModItems.drinkItem()));

    /* -- 小米系列 --  */
    // 小吃
    public static final DeferredItem<Item> MILLET_BALL = register("millet_ball", () -> new Item(ModItems.bowlFoodItem(MilletFoods.MILLET_BALL)));
    public static final DeferredItem<Item> POTATO_ROLLS = register("potato_rolls", () -> new Item(ModItems.bowlFoodItem(MilletFoods.POTATO_ROLLS))); // 1 minutes
    public static final DeferredItem<Item> SPUN_SUGAR = register("spun_sugar", () -> new Item(new Properties().food(MilletFoods.SPUN_SUGAR)));
    public static final DeferredItem<Item> COOKED_SPUN_SUGAR = register("cooked_spun_sugar", () -> new Item(new Properties().food(MilletFoods.SPUN_SUGAR)));
    // 搭配配餐
    public static final DeferredItem<Item> MILLET_BEEF = register("millet_beef", () -> new Item(ModItems.bowlFoodItem(MilletFoods.MILLET_MEAT))); // 3 minutes
    public static final DeferredItem<Item> MILLET_CHICKEN = register("millet_chicken", () -> new Item(ModItems.bowlFoodItem(MilletFoods.MILLET_MEAT)));
    public static final DeferredItem<Item> MILLET_PORKCHOP = register("millet_porkchop", () -> new Item(ModItems.bowlFoodItem(MilletFoods.MILLET_MEAT)));
    // Rice
    public static final DeferredItem<Item> FRIED_MILLET_RICE = register("fried_millet_rice", () -> new Item(ModItems.bowlFoodItem(MilletFoods.FRIED_MILLET_RICE))); // 5 minutes
    public static final DeferredItem<Item> MILLET_RICE = register("millet_rice", () -> new Item(ModItems.bowlFoodItem(MilletFoods.MILLET_RICE)));
    // Soup
    public static final DeferredItem<Item> MILLET_GRUEL = register("millet_gruel", () -> new Item(ModItems.bowlFoodItem(MilletFoods.MILLET_GRUEL)));
    public static final DeferredItem<Item> MILLET_PUMPKIN_SOUP = register("millet_pumpkin_soup", () -> new Item(ModItems.bowlFoodItem(MilletFoods.MILLET_PUMPKIN_SOUP)));
    public static final DeferredItem<Item> MILLET_VEGETABLE_SOUP = register("millet_vegetable_soup",() -> new Item(ModItems.bowlFoodItem(MilletFoods.MILLET_VEGETABLE_SOUP)));
    // Noodles
    public static final DeferredItem<Item> MILLET_NOODLES = register("millet_noodles", () -> new Item(ModItems.bowlFoodItem(MilletFoods.MILLET_NOODLES)));
    public static final DeferredItem<Item> BONE_MILLET_NOODLES = register("bone_millet_noodles", () -> new Item(ModItems.bowlFoodItem(MilletFoods.BONE_MILLET_NOODLES)));
    public static final DeferredItem<Item> POTATO_MILLET_NOODLES = register("potato_millet_noodles", () -> new Item(ModItems.bowlFoodItem(MilletFoods.POTATO_MILLET_NOODLES)));
    public static final DeferredItem<Item> TOMATO_MILLET_NOODLES = register("tomato_millet_noodles", () -> new Item(ModItems.bowlFoodItem(MilletFoods.TOMATO_MILLET_NOODLES)));

    public static DeferredItem<Item> register(String name, Supplier<Item> factory) {
        return ITEMS.register(name, factory);
    }
}
