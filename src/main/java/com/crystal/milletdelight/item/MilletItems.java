package com.crystal.milletdelight.item;

import com.crystal.milletdelight.MilletDelight;
import com.crystal.milletdelight.block.MilletBlocks;
import com.google.common.collect.Sets;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import vectorwing.farmersdelight.common.item.KnifeItem;
import vectorwing.farmersdelight.common.registry.ModItems;

import java.util.LinkedHashSet;
import java.util.function.Function;

/**
 * @see net.minecraft.world.item.Items
 */
public class MilletItems {
    public static LinkedHashSet<Item> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();
    /*----- 小米 -----*/
    public static final Item MILLET = register("millet", Item::new, new Properties());
    /*----- 小米 -----*/
    // Block
    public static final Item MILLET_BAG = register("millet_bag", properties -> new BlockItem(MilletBlocks.MILLET_BAG, properties), new Properties().useBlockDescriptionPrefix());
    public static final Item MILLET_BALE = register("millet_bale", properties -> new BlockItem(MilletBlocks.MILLET_BALE, properties), new Properties().useBlockDescriptionPrefix());
    public static final Item MILLET_CAKES = register("millet_cakes", properties -> new BlockItem(MilletBlocks.MILLET_CAKES, properties), new Properties().useBlockDescriptionPrefix());
    public static final Item WILD_MILLET = register("wild_millet", properties -> new BlockItem(MilletBlocks.WILD_MILLET, properties), new Properties().useBlockDescriptionPrefix());
    // Item
    public static final Item MILLET_DUST = register("millet_dust", Item::new, new Properties());
    public static final Item MILLET_NOODLE = register("millet_noodle", Item::new, new Properties());
    public static final Item MILLET_TEMPLATE = register("millet_template", Item::new, new Properties());
    public static final Item MILLET_PANICLE = register("millet_panicle", properties -> new BlockItem(MilletBlocks.MILLET, properties), new Properties());
    public static final Item PESTLE_MORTAR = register("pestle_mortar", PestleMortar::new, new Properties().stacksTo(1));
    public static final Item MILLET_KNIFE = register("millet_knife", KnifeItem::new, new Properties());
    // Food
    public static final Item APPLE_SAUCE = register("apple_sauce", Item::new, ModItems.bowlFoodItem(MilletFoods.SAUCE));
    public static final Item POTATO_SAUCE = register("potato_sauce", Item::new, ModItems.bowlFoodItem(MilletFoods.SAUCE));
    public static final Item COOKED_APPLE = register("cooked_apple", Item::new, new Properties().food(MilletFoods.APPLE));
    // 小米饼干
    public static final Item MILLET_BISCUIT = register("millet_biscuit", Item::new, new Properties().food(MilletFoods.SNACK));
    public static final Item CHOCOLATE_BISCUIT = register("chocolate_biscuit", Item::new, new Properties().food(MilletFoods.SNACK));
    public static final Item HONEY_BISCUIT = register("honey_biscuit", Item::new, new Properties().food(MilletFoods.SNACK));
    public static final Item MILK_BISCUIT = register("milk_biscuit", Item::new, new Properties().food(MilletFoods.SNACK));
    public static final Item SCULK_BISCUIT = register("sculk_biscuit", Item::new, new Properties().food(MilletFoods.SNACK));
    public static final Item SWEET_BERRY_BISCUIT = register("sweet_berry_biscuit", Item::new, new Properties().food(MilletFoods.SNACK));
    // 小米糕
    public static final Item MILLET_PASTRY = register("millet_pastry", Item::new, new Properties().food(MilletFoods.SNACK));
    public static final Item CHOCOLATE_MILLET_PASTRY = register("chocolate_millet_pastry", Item::new, new Properties().food(MilletFoods.SNACK));
    public static final Item CHORUS_MILLET_PASTRY = register("chorus_millet_pastry", Item::new, new Properties().food(MilletFoods.SNACK));
    public static final Item GLOW_BERRY_MILLET_PASTRY = register("glow_berry_millet_pastry", Item::new, new Properties().food(MilletFoods.SNACK));
    public static final Item MILK_MILLET_PASTRY = register("milk_millet_pastry", Item::new, new Properties().food(MilletFoods.SNACK));
    public static final Item SCULK_MILLET_PASTRY = register("sculk_millet_pastry", Item::new, new Properties().food(MilletFoods.SNACK));
    // Wine
    public static final Item MILLET_WINE = register("millet_wine", Item::new, ModItems.drinkItem());
    public static final Item WHEAT_WINE = register("wheat_wine", Item::new, ModItems.drinkItem());
    public static final Item GLOW_BERRY_WINE = register("glow_berry_wine", Item::new, ModItems.drinkItem());

    /* -- 小米系列 --  */
    // 小吃
    public static final Item MILLET_BALL = register("millet_ball", Item::new, ModItems.bowlFoodItem(MilletFoods.MILLET_BALL, MilletFoods.SHORT_COMFORT_DURATION));
    public static final Item POTATO_ROLLS = register("potato_rolls", Item::new, ModItems.bowlFoodItem(MilletFoods.POTATO_ROLLS, MilletFoods.SHORT_COMFORT_DURATION)); // 1 minutes
    public static final Item SPUN_SUGAR = register("spun_sugar", Item::new, ModItems.bowlFoodItem(MilletFoods.SPUN_SUGAR));
    public static final Item COOKED_SPUN_SUGAR = register("cooked_spun_sugar", Item::new, ModItems.bowlFoodItem(MilletFoods.SPUN_SUGAR));
    // 搭配配餐
    public static final Item MILLET_BEEF = register("millet_beef", Item::new, ModItems.bowlFoodItem(MilletFoods.MILLET_MEAT, MilletFoods.MEDIUM_COMFORT_DURATION)); // 3 minutes
    public static final Item MILLET_CHICKEN = register("millet_chicken", Item::new, ModItems.bowlFoodItem(MilletFoods.MILLET_MEAT, MilletFoods.MEDIUM_COMFORT_DURATION));
    public static final Item MILLET_PORKCHOP = register("millet_porkchop", Item::new, ModItems.bowlFoodItem(MilletFoods.MILLET_MEAT, MilletFoods.MEDIUM_COMFORT_DURATION));
    // Rice
    public static final Item FRIED_MILLET_RICE = register("fried_millet_rice", Item::new, ModItems.bowlFoodItem(MilletFoods.FRIED_MILLET_RICE, MilletFoods.LONG_COMFORT_DURATION)); // 5 minutes
    public static final Item MILLET_RICE = register("millet_rice", Item::new, ModItems.bowlFoodItem(MilletFoods.MILLET_RICE, MilletFoods.LONG_COMFORT_DURATION));
    // Soup
    public static final Item MILLET_GRUEL = register("millet_gruel", Item::new, ModItems.bowlFoodItem(MilletFoods.MILLET_GRUEL, MilletFoods.LONG_COMFORT_DURATION));
    public static final Item MILLET_PUMPKIN_SOUP = register("millet_pumpkin_soup", Item::new, ModItems.bowlFoodItem(MilletFoods.MILLET_PUMPKIN_SOUP, MilletFoods.LONG_COMFORT_DURATION));
    public static final Item MILLET_VEGETABLE_SOUP = register("millet_vegetable_soup", Item::new, ModItems.bowlFoodItem(MilletFoods.MILLET_VEGETABLE_SOUP, MilletFoods.LONG_COMFORT_DURATION));
    // Noodles
    public static final Item MILLET_NOODLES = register("millet_noodles", Item::new, ModItems.bowlFoodItem(MilletFoods.MILLET_NOODLES, MilletFoods.LONG_COMFORT_DURATION));
    public static final Item BONE_MILLET_NOODLES = register("bone_millet_noodles", Item::new, ModItems.bowlFoodItem(MilletFoods.BONE_MILLET_NOODLES, MilletFoods.SHORT_COMFORT_DURATION));
    public static final Item POTATO_MILLET_NOODLES = register("potato_millet_noodles", Item::new, ModItems.bowlFoodItem(MilletFoods.POTATO_MILLET_NOODLES, MilletFoods.LONG_COMFORT_DURATION));
    public static final Item TOMATO_MILLET_NOODLES = register("tomato_millet_noodles", Item::new, ModItems.bowlFoodItem(MilletFoods.TOMATO_MILLET_NOODLES, MilletFoods.LONG_COMFORT_DURATION));

    private static Item register(String name, Function<Item.Properties, Item> factory, Item.Properties settings) {
        ResourceKey<Item> item = ResourceKey.create(Registries.ITEM, MilletDelight.of(name));
        return Registry.register(BuiltInRegistries.ITEM, MilletDelight.of(name), factory.apply(settings.setId(item)));
    }

    public static void init() {

    }
}
