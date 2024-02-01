package com.stalight.milletdelight.datagen;

import com.stalight.milletdelight.block.BlockList;
import com.stalight.milletdelight.item.ItemList;
import com.stalight.milletdelight.registries.ModItemGroup;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModLanguageGenerator extends FabricLanguageProvider {
    public ModLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        // Block
        translationBuilder.add(BlockList.WildMillet, "Wild Millet");
        // Item
        translationBuilder.add(ItemList.ChocolateCookie, "Chocolate Cookie");
        translationBuilder.add(ItemList.ChocolateMilletCake, "Chocolate Millet Cake");
        translationBuilder.add(ItemList.ChorusMilletCake, "Chorus Millet Cake");
        translationBuilder.add(ItemList.CookedMillet, "Cooked Millet");
        translationBuilder.add(ItemList.FriedMillet, "Fried Millet");
        translationBuilder.add(ItemList.MilkCookie, "Milk Cookie");
        translationBuilder.add(ItemList.MilkMilletCake, "Milk Millet Cake");
        translationBuilder.add(ItemList.Millet, "Millet");
        translationBuilder.add(ItemList.MilletCake, "Millet Cake");
        translationBuilder.add(ItemList.MilletDust, "Millet Dust");
        translationBuilder.add(ItemList.MilletGruel, "Millet Gruel");
        translationBuilder.add(ItemList.MilletPumpkinSoup, "Millet Pumpkin Soup");
        translationBuilder.add(ItemList.MilletVegetableSoup, "Millet Vegetable Soup");
        translationBuilder.add(ItemList.SculkMilletCake, "Sculk Millet Cake");
        translationBuilder.add(ItemList.MilletBeef, "Millet Beef");
        translationBuilder.add(ItemList.MilletChicken, "Millet Chicken");
        translationBuilder.add(ItemList.MilletPorkchop, "Millet Porkchop");
        translationBuilder.add(ItemList.MilletNoodle, "Millet Noodle");
        translationBuilder.add(ItemList.TomatoMilletNoodles, "Tomato Millet Noodles");
        translationBuilder.add(ItemList.SweetBerryCookie, "Sweet Berry Cookie");
        translationBuilder.add(ItemList.HoneyCookie, "Honey Cookie");
        translationBuilder.add(ItemList.MilletCookie, "Millet Cookie");
        translationBuilder.add(ItemList.MilletBall, "Millet Ball");
        translationBuilder.add(ItemList.MilletNoodles, "Millet Noodles");
        translationBuilder.add(ItemList.SculkCookie, "Sculk Cookie");
        translationBuilder.add(ItemList.GlowBerryMilletCake, "Glow Berry Millet Cake");
        translationBuilder.add(ItemList.MilletWine, "Millet Wine");
        translationBuilder.add(ItemList.GlowBerryWine, "Glow Berry Wine");
        translationBuilder.add(ItemList.WheatWine, "Wheat Wine");
        translationBuilder.add(ItemList.CookedApple, "Cooked Apple");
        translationBuilder.add(ItemList.CookedMarshmallow, "Cooked Marshmallow");
        translationBuilder.add(ItemList.Marshmallow, "Marshmallow");
        translationBuilder.add(ItemList.AppleSauce, "Apple Sauce");
        translationBuilder.add(ItemList.BoneMilletNoodles, "Bone Millet Noodles");
        translationBuilder.add(ItemList.PotatoMilletNoodles, "Potato Millet Noodles");
        translationBuilder.add(ItemList.PotatoRolls, "Potato Rolls");
        translationBuilder.add(ItemList.PotatoSauce, "Potato Sauce");
        translationBuilder.add(ItemList.PestleMortar, "Pestle and Mortar");
        translationBuilder.add(ItemList.MilletPanicle, "Millet Panicle");
        // ItemGroup
        translationBuilder.add(ModItemGroup.GROUP, "Millet Delight");
    }
}
