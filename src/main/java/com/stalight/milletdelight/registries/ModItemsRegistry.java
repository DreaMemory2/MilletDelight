package com.stalight.milletdelight.registries;

import com.nhoryzon.mc.farmersdelight.item.ConsumableItem;
import com.nhoryzon.mc.farmersdelight.item.DrinkableItem;
import com.nhoryzon.mc.farmersdelight.item.KnifeItem;
import com.nhoryzon.mc.farmersdelight.registry.EffectsRegistry;
import com.stalight.milletdelight.MilletDelight;
import com.stalight.milletdelight.block.BlockList;
import com.stalight.milletdelight.item.ItemList;
import com.stalight.milletdelight.item.PestleMortar;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItemsRegistry {

    public static void registerItem() {
        // Item
        ItemList.Millet = registerItem("millet", new BlockItem(BlockList.Millet, new FabricItemSettings()));
        ItemList.MilletDust = registerItem("millet_dust", new Item(new FabricItemSettings()));
        ItemList.MilletNoodle = registerItem("millet_noodle", new Item(new FabricItemSettings()));
        ItemList.PestleMortar = registerItem("pestle_mortar", new PestleMortar(new FabricItemSettings().maxCount(1)));
        ItemList.MilletPanicle = registerItem("millet_panicle", new Item(new FabricItemSettings()));
        ItemList.MilletKnife = registerItem("millet_knife", new KnifeItem(net.minecraft.item.ToolMaterials.DIAMOND));
        ItemList.MilletTemplate = registerItem("millet_template", new Item(new FabricItemSettings()));
        // Food
        ItemList.AppleSauce = registerItem("apple_sauce",
                new ConsumableItem(ModItemsRegistry.food(4, 0.3f, 0)));
        ItemList.PotatoSauce = registerItem("potato_sauce",
                new ConsumableItem(ModItemsRegistry.food(5, 0.6f, 0)));
        ItemList.CookedApple = registerItem("cooked_apple",
                new Item(ModItemsRegistry.dessert(6, 0.3f)));
        // Millet Cookie
        ItemList.MilletCookie = registerItem("millet_cookie",
                new Item(ModItemsRegistry.dessert(2, 0.1f)));
        ItemList.Marshmallow = registerItem("marshmallow",
                new Item(ModItemsRegistry.dessert(2, 0.1f)));
        ItemList.CookedMarshmallow = registerItem("cooked_marshmallow",
                new Item(ModItemsRegistry.dessert(2, 0.1f)));
        ItemList.ChocolateCookie = registerItem("chocolate_cookie",
                new Item(ModItemsRegistry.dessert(2, 0.1f)));
        ItemList.HoneyCookie = registerItem("honey_cookie",
                new Item(ModItemsRegistry.dessert(2, 0.1f)));
        ItemList.MilkCookie = registerItem("milk_cookie",
                new Item(ModItemsRegistry.dessert(2, 0.1f)));
        ItemList.SculkCookie = registerItem("sculk_cookie",
                new Item(ModItemsRegistry.dessert(2, 0.1f)));
        ItemList.SweetBerryCookie = registerItem("sweet_berry_cookie",
                new Item(ModItemsRegistry.dessert(2, 0.1f)));
        // Millet Cake
        ItemList.ChocolateMilletCake = registerItem("chocolate_millet_cake",
                new Item(ModItemsRegistry.dessert(2, 0.1f)));
        ItemList.ChorusMilletCake = registerItem("chorus_millet_cake",
                new Item(ModItemsRegistry.dessert(2, 0.1f)));
        ItemList.GlowBerryMilletCake = registerItem("glow_berry_millet_cake",
                new Item(ModItemsRegistry.dessert(2, 0.1f)));
        ItemList.MilkMilletCake = registerItem("milk_millet_cake",
                new Item(ModItemsRegistry.dessert(2, 0.1f)));
        ItemList.SculkMilletCake = registerItem("sculk_millet_cake",
                new Item(ModItemsRegistry.dessert(2, 0.1f)));
        // Wine
        ItemList.MilletWine = registerItem("millet_wine",
                new DrinkableItem(ModItemsRegistry.drink()));
        ItemList.WheatWine = registerItem("wheat_wine",
                new DrinkableItem(ModItemsRegistry.drink()));
        ItemList.GlowBerryWine = registerItem("glow_berry_wine",
                new DrinkableItem(ModItemsRegistry.drink()));

        /* -- 小米系列 --  */
        // 小吃
        ItemList.MilletCake = registerItem("millet_cake",
                new ConsumableItem(ModItemsRegistry.food(4, 0.2f, ConsumableItem.BRIEF_DURATION))); // 30 seconds
        ItemList.MilletBall = registerItem("millet_ball",
                new ConsumableItem(ModItemsRegistry.food(8, 0.375f, ConsumableItem.SHORT_DURATION)));
        ItemList.PotatoRolls = registerItem("potato_rolls",
                new Item(ModItemsRegistry.food(6, 0.5f, ConsumableItem.SHORT_DURATION))); // 1 minutes
        // 组合配餐
        ItemList.MilletBeef = registerItem("millet_beef",
                new ConsumableItem(ModItemsRegistry.food(12, 0.8f, ConsumableItem.MEDIUM_DURATION))); // 3 minutes
        ItemList.MilletChicken = registerItem("millet_chicken",
                new ConsumableItem(ModItemsRegistry.food(12, 0.8f, ConsumableItem.MEDIUM_DURATION)));
        ItemList.MilletPorkchop = registerItem("millet_porkchop",
                new ConsumableItem(ModItemsRegistry.food(12, 0.8f, ConsumableItem.MEDIUM_DURATION)));
        // Rice
        ItemList.FriedMillet = registerItem("fried_millet",
                new ConsumableItem(ModItemsRegistry.food(14, 0.75f, ConsumableItem.LONG_DURATION))); // 5 minutes
        ItemList.CookedMillet = registerItem("cooked_millet",
                new ConsumableItem(ModItemsRegistry.food(6, 0.4f, ConsumableItem.LONG_DURATION)));
        // Soup
        ItemList.MilletGruel = registerItem("millet_gruel",
                new ConsumableItem(ModItemsRegistry.food(8, 0.8f, ConsumableItem.LONG_DURATION)));
        ItemList.MilletPumpkinSoup = registerItem("millet_pumpkin_soup",
                new ConsumableItem(ModItemsRegistry.food(14, 0.75f, ConsumableItem.LONG_DURATION)));
        ItemList.MilletVegetableSoup = registerItem("millet_vegetable_soup",
                new ConsumableItem(ModItemsRegistry.food(12, 0.8f, ConsumableItem.MEDIUM_DURATION)));
        // Noodles
        ItemList.MilletNoodles = registerItem("millet_noodles",
                new ConsumableItem(ModItemsRegistry.food(14, 0.75F, ConsumableItem.LONG_DURATION)));
        ItemList.BoneMilletNoodles = registerItem("bone_millet_noodles",
                new ConsumableItem(ModItemsRegistry.food(10, 0.7F, ConsumableItem.SHORT_DURATION)));
        ItemList.PotatoMilletNoodles = registerItem("potato_millet_noodles",
                new ConsumableItem(ModItemsRegistry.food(14, 0.75F, ConsumableItem.LONG_DURATION)));
        ItemList.TomatoMilletNoodles = registerItem("tomato_millet_noodles",
                new ConsumableItem(ModItemsRegistry.food(14, 0.75F, ConsumableItem.LONG_DURATION)));

    }

    private static Item registerItem(String name, Item item) {
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.GROUP).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(MilletDelight.MODID, name), item);
    }

    /**
     * <p>各种各样的食物</p>
     */
    private static FabricItemSettings food(int hunger, float saturation, int duration) {
        // 使用，返回[碗]，且最大堆积为16
        return new FabricItemSettings().recipeRemainder(Items.BOWL).maxCount(16)
                .food(new FoodComponent.Builder().hunger(hunger)
                        .saturationModifier(saturation).statusEffect(
                                // 使用后效果：饱和感I
                                new StatusEffectInstance(EffectsRegistry.COMFORT.get(),
                                        duration, 0), 1.0F).build());
    }
    private static FabricItemSettings dessert(int huger, float saturation) {
        return new FabricItemSettings().food(new FoodComponent.Builder().hunger(huger)
                .saturationModifier(saturation).build());
    }

    private static FabricItemSettings drink() {
        return new FabricItemSettings().recipeRemainder(Items.GLASS_BOTTLE).maxCount(16)
                .food(new FoodComponent.Builder().hunger(2)
                        .saturationModifier(0).build());
    }
}
