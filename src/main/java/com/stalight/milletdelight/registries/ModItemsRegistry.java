package com.stalight.milletdelight.registries;

import com.nhoryzon.mc.farmersdelight.registry.EffectsRegistry;
import com.stalight.milletdelight.MilletDelight;
import com.stalight.milletdelight.item.ItemList;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItemsRegistry {

    public static void registerItem() {
        // Item
        ItemList.Millet = registerItem("millet", new Item(new FabricItemSettings()));
        ItemList.MilletDust = registerItem("millet_dust", new Item(new FabricItemSettings()));
        ItemList.MilletNoodle = registerItem("millet_noodle", new Item(new FabricItemSettings()));
        // Food
        ItemList.AppleSauce = registerItem("apple_sauce", new Item(new FabricItemSettings()));
        ItemList.PotatoSauce = registerItem("potato_sauce", new Item(new FabricItemSettings()));
        ItemList.CookedApple = registerItem("cooked_apple", new Item(new FabricItemSettings()));
        // Millet Cookie
        ItemList.MilletCookie = registerItem("millet_cookie", new Item(new FabricItemSettings()));
        ItemList.Marshmallow = registerItem("marshmallow", new Item(new FabricItemSettings()));
        ItemList.CookedMarshmallow = registerItem("cooked_marshmallow", new Item(new FabricItemSettings()));
        ItemList.ChocolateCookie = registerItem("chocolate_cookie", new Item(new FabricItemSettings()));
        ItemList.HoneyCookie = registerItem("honey_cookie", new Item(new FabricItemSettings()));
        ItemList.MilkCookie = registerItem("milk_cookie", new Item(new FabricItemSettings()));
        ItemList.SculkCookie = registerItem("sculk_cookie", new Item(new FabricItemSettings()));
        ItemList.SweetBerryCookie = registerItem("sweet_berry_cookie", new Item(new FabricItemSettings()));
        // Millet Cake
        ItemList.ChocolateMilletCake = registerItem("chocolate_millet_cake", new Item(new FabricItemSettings()));
        ItemList.ChorusMilletCake = registerItem("chorus_millet_cake", new Item(new FabricItemSettings()));
        ItemList.GlowBerryMilletCake = registerItem("glow_berry_millet_cake", new Item(new FabricItemSettings()));
        ItemList.MilkMilletCake = registerItem("milk_millet_cake", new Item(new FabricItemSettings()));
        ItemList.SculkMilletCake = registerItem("sculk_millet_cake", new Item(new FabricItemSettings()));
        // Wine
        ItemList.MilletWine = registerItem("millet_wine", new Item(new FabricItemSettings()));
        ItemList.WheatWine = registerItem("wheat_wine", new Item(new FabricItemSettings()));
        ItemList.GlowBerryWine = registerItem("glow_berry_wine", new Item(new FabricItemSettings()));

        /* -- 小米系列 --  */
        // 小吃
        ItemList.MilletCake = registerItem("millet_cake", new Item(new FabricItemSettings()));
        ItemList.MilletBall = registerItem("millet_ball", new Item(new FabricItemSettings()));
        ItemList.PotatoRolls = registerItem("potato_rolls", new Item(new FabricItemSettings()));
        // 组合配餐
        ItemList.MilletBeef = registerItem("millet_beef", new Item(new FabricItemSettings()));
        ItemList.MilletChicken = registerItem("millet_chicken", new Item(new FabricItemSettings()));
        ItemList.MilletPorkchop = registerItem("millet_porkchop", new Item(new FabricItemSettings()));
        // Rice
        ItemList.FriedMillet = registerItem("fried_millet", new Item(new FabricItemSettings()));
        ItemList.CookedMillet = registerItem("cooked_millet", new Item(new FabricItemSettings()));
        // Soup
        ItemList.MilletGruel = registerItem("millet_gruel",
                new Item(ModItemsRegistry.stew(8, 0.8f)));
        ItemList.MilletPumpkinSoup = registerItem("millet_pumpkin_soup",
                new Item(ModItemsRegistry.stew(7, 0.7f)));
        ItemList.MilletVegetableSoup = registerItem("millet_vegetable_soup",
                new Item(ModItemsRegistry.stew(6, 0.6f)));
        // Noodles
        ItemList.MilletNoodles = registerItem("millet_noodles", new Item(new FabricItemSettings()));
        ItemList.BoneMilletNoodles = registerItem("bone_millet_noodles", new Item(new FabricItemSettings()));
        ItemList.PotatoMilletNoodles = registerItem("potato_millet_noodles", new Item(new FabricItemSettings()));
        ItemList.TomatoMilletNoodles = registerItem("tomato_millet_noodles", new Item(new FabricItemSettings()));

    }

    private static Item registerItem(String name, Item item) {
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.GROUP).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(MilletDelight.MODID, name), item);
    }

    /**
     * <p>各种各样的粥和汤的食物</p>
     */
    private static FabricItemSettings stew(int hunger, float saturation) {
        // 使用，返回[碗]，且最大堆积为16
        return new FabricItemSettings().recipeRemainder(Items.BOWL).maxCount(16)
                .food(new FoodComponent.Builder().hunger(hunger)
                        .saturationModifier(saturation).statusEffect(
                                // 使用后效果：饱和感I 时长2分钟
                                new StatusEffectInstance(EffectsRegistry.COMFORT.get(),
                                        2400, 0), 1.0f).build());
    }
}
