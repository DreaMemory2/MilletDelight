package com.stalight.milletdelight.datagen;

import com.stalight.milletdelight.item.ModItems;
import com.stalight.milletdelight.block.ModBlocks;
import com.stalight.milletdelight.registries.ModItemGroup;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLanguageGenerator extends FabricLanguageProvider {
    public ModLanguageGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder builder) {
        /* Block */
        block(builder);
        /* Item */
        item(builder);
        /* Other */
        builder.add(ModItemGroup.GROUP, "Millet Delight");
    }

    private void block(TranslationBuilder builder) {
        builder.add(ModBlocks.WILD_MILLET, "Wild Millet");
        builder.add(ModBlocks.MILLET_BAG, "Millet Bag");
        builder.add(ModBlocks.MILLET_BALE, "Millet Bale");
        builder.add(ModBlocks.MILLET_CAKES, "Millet Cake");
    }

    private void item(TranslationBuilder builder) {
        /* Material */
        builder.add(ModItems.MilletDust, "Millet Dust");
        builder.add(ModItems.MilletNoodle, "Millet Noodle");
        builder.add(ModItems.MilletPanicle, "Millet Panicle");
        // Update Tool
        builder.add(ModItems.MilletTemplate, "Millet Template");
        /* Tools */
        builder.add(ModItems.PESTLE_MORTAR, "Pestle Mortar");
        builder.add(ModItems.MILLET_KNIFE, "Millet Knife");
        /* Food */
        builder.add(ModItems.APPLE_SAUCE, "Apple Sauce");
        builder.add(ModItems.POTATO_SAUCE, "Potato Sauce");
        builder.add(ModItems.COOKED_APPLE, "Cooked Apple");
        // Spun Sugar
        builder.add(ModItems.SPUN_SUGAR, "Spun Sugar");
        builder.add(ModItems.COOKED_SPUN_SUGAR, "Cooked Spun Sugar");
        /* Millet Biscuit */
        builder.add(ModItems.MILLET_BISCUIT, "Millet Biscuit");
        builder.add(ModItems.CHOCOLATE_BISCUIT, "Chocolate Biscuit");
        builder.add(ModItems.HONEY_BISCUIT, "Honey Biscuit");
        builder.add(ModItems.MILK_BISCUIT, "Milk Biscuit");
        builder.add(ModItems.SCULK_BISCUIT, "Sculk Biscuit");
        builder.add(ModItems.SWEET_BERRY_BISCUIT, "Sweet Berry Biscuit");
        /* Millet Pastry */
        builder.add(ModItems.MILLET_PASTRY, "Millet Pastry");
        builder.add(ModItems.CHOCOLATE_MILLET_PASTRY, "Chocolate Millet Pastry");
        builder.add(ModItems.CHORUS_MILLET_PASTRY, "Chorus Millet Pastry");
        builder.add(ModItems.GLOW_BERRY_MILLET_PASTRY, "Glow Berry Millet Pastry");
        builder.add(ModItems.MILK_MILLET_PASTRY, "Milk Millet Pastry");
        builder.add(ModItems.SCULK_MILLET_PASTRY, "Sculk Millet Pastry");
        /* Wine */
        builder.add(ModItems.MILLET_WINE, "Millet Wine");
        builder.add(ModItems.WHEAT_WINE, "Wheat Wine");
        builder.add(ModItems.GLOW_BERRY_WINE, "Glow Berry Wine");
        /* -- 小米系列 --  */
        // Snake
        builder.add(ModItems.POTATO_ROLLS, "Potato Silk Rolls");
        /* Main Food */
        // Rice
        builder.add(ModItems.MILLET_RICE, "Millet Rice");
        builder.add(ModItems.FRIED_MILLET_RICE, "Fried Millet Rice");
        // Pair with Meals
        builder.add(ModItems.MILLET_BEEF, "Beef Millet Rice");
        builder.add(ModItems.MILLET_CHICKEN, "Chicken Millet Rice");
        builder.add(ModItems.MILLET_PORKCHOP, "Porkchop Millet Rice");
        // Soup
        builder.add(ModItems.MILLET_GRUEL, "Millet Gruel");
        builder.add(ModItems.MILLET_PUMPKIN_SOUP, "Millet Pumpkin Soup");
        builder.add(ModItems.MILLET_VEGETABLE_SOUP, "Millet Vegetable Soup");
        // Noodles
        builder.add(ModItems.MILLET_NOODLES, "Millet Noodle");
        builder.add(ModItems.BONE_MILLET_NOODLES, "Bone Millet Noodles");
        builder.add(ModItems.POTATO_MILLET_NOODLES, "Potato Millet Noodles");
        builder.add(ModItems.TOMATO_MILLET_NOODLES, "Tomato Millet Noodles");
    }
}
