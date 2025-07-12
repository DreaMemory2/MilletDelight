package com.stalight.milletdelight.item;

import com.stalight.milletdelight.MilletDelight;
import com.stalight.milletdelight.registries.ModItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.item.KnifeItem;

import java.util.function.Function;

public class ModItems {

    // Item
    public static final Item MilletDust = registerItem("millet_dust");
    public static final Item MilletNoodle = registerItem("millet_noodle");
    public static final Item MilletTemplate = registerItem("millet_template");
    public static final Item MilletPanicle = registerItem("millet_panicle");
    public static final Item PESTLE_MORTAR = registerItem("pestle_mortar", PestleMortar::new, new Settings().maxCount(1));
    public static final Item MILLET_KNIFE = registerItem("millet_knife", KnifeItem::new, new Settings());
    // Food
    public static final Item APPLE_SAUCE = registerItem("apple_sauce", food(4, 0.3f));
    public static final Item POTATO_SAUCE = registerItem("potato_sauce", food(5, 0.6f));
    public static final Item COOKED_APPLE = registerItem("cooked_apple", dessert(6, 0.3f));
    // Millet Cookie
    public static final Item MILLET_BISCUIT = registerItem("millet_biscuit", dessert(2, 0.1f));
    public static final Item CHOCOLATE_BISCUIT = registerItem("chocolate_biscuit", dessert(2, 0.1f));
    public static final Item HONEY_BISCUIT = registerItem("honey_biscuit", dessert(2, 0.1f));
    public static final Item MILK_BISCUIT = registerItem("milk_biscuit", dessert(2, 0.1f));
    public static final Item SCULK_BISCUIT = registerItem("sculk_biscuit", dessert(2, 0.1f));
    public static final Item SWEET_BERRY_BISCUIT = registerItem("sweet_berry_biscuit", dessert(2, 0.1f));
    // Millet Pastry
    public static final Item MILLET_PASTRY = registerItem("millet_pastry", food(4, 0.2f, FoodValues.ConsumableValues.COMFORT_BRIEF_DURATION)); // 30 seconds
    public static final Item CHOCOLATE_MILLET_PASTRY = registerItem("chocolate_millet_pastry", dessert(2, 0.1f));
    public static final Item CHORUS_MILLET_PASTRY = registerItem("chorus_millet_pastry", dessert(2, 0.1f));
    public static final Item GLOW_BERRY_MILLET_PASTRY = registerItem("glow_berry_millet_pastry", dessert(2, 0.1f));
    public static final Item MILK_MILLET_PASTRY = registerItem("milk_millet_pastry", dessert(2, 0.1f));
    public static final Item SCULK_MILLET_PASTRY = registerItem("sculk_millet_pastry", dessert(2, 0.1f));
    // Wine
    public static final Item MILLET_WINE = registerItem("millet_wine", vectorwing.farmersdelight.common.registry.ModItems.drinkItem());
    public static final Item WHEAT_WINE = registerItem("wheat_wine", vectorwing.farmersdelight.common.registry.ModItems.drinkItem());
    public static final Item GLOW_BERRY_WINE = registerItem("glow_berry_wine", vectorwing.farmersdelight.common.registry.ModItems.drinkItem());

    /* -- 小米系列 --  */
    // 小吃
    public static final Item MilletBall = registerItem("millet_ball", food(8, 0.375f, FoodValues.ConsumableValues.COMFORT_SHORT_DURATION));
    public static final Item POTATO_ROLLS = registerItem("potato_rolls", food(6, 0.5f, FoodValues.ConsumableValues.COMFORT_SHORT_DURATION)); // 1 minutes
    public static final Item SPUN_SUGAR = registerItem("spun_sugar", dessert(2, 0.1f));
    public static final Item COOKED_SPUN_SUGAR = registerItem("cooked_spun_sugar", dessert(2, 0.1f));
    // 搭配配餐
    public static final Item MILLET_BEEF = registerItem("millet_beef", food(12, 0.8f, FoodValues.ConsumableValues.COMFORT_MEDIUM_DURATION)); // 3 minutes
    public static final Item MILLET_CHICKEN = registerItem("millet_chicken", food(12, 0.8f, FoodValues.ConsumableValues.COMFORT_MEDIUM_DURATION));
    public static final Item MILLET_PORKCHOP = registerItem("millet_porkchop", food(12, 0.8f, FoodValues.ConsumableValues.COMFORT_MEDIUM_DURATION));
    // Rice
    public static final Item FRIED_MILLET_RICE = registerItem("fried_millet_rice", food(14, 0.75f, FoodValues.ConsumableValues.COMFORT_LONG_DURATION)); // 5 minutes
    public static final Item MILLET_RICE = registerItem("millet_rice", food(6, 0.4f, FoodValues.ConsumableValues.COMFORT_LONG_DURATION));
    // Soup
    public static final Item MILLET_GRUEL = registerItem("millet_gruel", food(8, 0.8f, FoodValues.ConsumableValues.COMFORT_LONG_DURATION));
    public static final Item MILLET_PUMPKIN_SOUP = registerItem("millet_pumpkin_soup", food(14, 0.75f, FoodValues.ConsumableValues.COMFORT_LONG_DURATION));
    public static final Item MILLET_VEGETABLE_SOUP = registerItem("millet_vegetable_soup", food(12, 0.8f, FoodValues.ConsumableValues.COMFORT_MEDIUM_DURATION));
    // Noodles
    public static final Item MILLET_NOODLES = registerItem("millet_noodles", food(14, 0.75F, FoodValues.ConsumableValues.COMFORT_LONG_DURATION));
    public static final Item BONE_MILLET_NOODLES = registerItem("bone_millet_noodles", food(10, 0.7F, FoodValues.ConsumableValues.COMFORT_SHORT_DURATION));
    public static final Item POTATO_MILLET_NOODLES = registerItem("potato_millet_noodles", food(14, 0.75F, FoodValues.ConsumableValues.COMFORT_LONG_DURATION));
    public static final Item TOMATO_MILLET_NOODLES = registerItem("tomato_millet_noodles", food(14, 0.75F, FoodValues.ConsumableValues.COMFORT_LONG_DURATION));

    private static Item registerItem(String name) {
        return registerItem(name, Item::new, new Settings());
    }

    private static Item registerItem(String name, Settings settings) {
        return registerItem(name, Item::new, settings);
    }

    private static Item registerItem(String name, Function<Settings, Item> factory, Settings settings) {
        RegistryKey<Item> registry = RegistryKey.of(RegistryKeys.ITEM, MilletDelight.of(name));
        Item item = Items.register(registry, factory, settings);
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.GROUP).register(entries -> entries.add(item));
        return item;
    }

    /**
     * <p>各种各样的食物</p>
     * 使用后返回碗，且最大堆积为16
     */
    private static Settings food(int hunger, float saturation) {
        return food(hunger, saturation, null);
    }

    private static Settings food(int hunger, float saturation, @Nullable ConsumableComponent component) {
        return vectorwing.farmersdelight.common.registry.ModItems.bowlFoodItem(new FoodComponent.Builder()
                        .nutrition(hunger)
                        .saturationModifier(saturation)
                        .build(),
                component
        );
    }

    private static Settings dessert(int huger, float saturation) {
        return new Settings().food(new FoodComponent.Builder()
                .nutrition(huger)
                .saturationModifier(saturation)
                .build()
        );
    }

    public static void init() {}
}
