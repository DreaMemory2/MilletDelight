package com.stalight.milletdelight.block;

import com.stalight.milletdelight.MilletDelight;
import com.stalight.milletdelight.registries.ModItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CakeBlock;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import vectorwing.farmersdelight.common.block.RiceBaleBlock;
import vectorwing.farmersdelight.common.block.WildCropBlock;

import java.util.function.Function;

public class ModBlocks {
    // Crops
    public static final Block WILD_MILLET = register("wild_millet", (properties) -> new WildCropBlock(StatusEffects.FIRE_RESISTANCE, 6, properties),
            Settings.copy(Blocks.SHORT_GRASS));
    public static final Block MILLET = withoutBlockItem("millet", MilletCrop::new, Settings.copy(Blocks.WHEAT));
    // Block
    public static final Block MILLET_BAG = register("millet_bag", Settings.copy(Blocks.WHITE_WOOL));
    public static final Block MILLET_BALE = register("millet_bale", RiceBaleBlock::new, Settings.copy(Blocks.HAY_BLOCK));
    public static final Block MILLET_CAKES = register("millet_cakes", CakeBlock::new, Settings.copy(Blocks.CAKE));

    public static Block register(String name, Settings settings) {
        return register(name, Block::new, settings);
    }

    public static Block register(String name, Function<Settings, Block> factory, Settings settings) {
        Block block = withoutBlockItem(name, factory, settings);
        Item item = Items.register(block);
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.GROUP).register(entries -> entries.add(item));
        return block;
    }

    private static Block withoutBlockItem(String name, Function<Settings, Block> factory, Settings settings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, MilletDelight.of(name));
        return Blocks.register(key, factory, settings);
    }

    public static void init() {

    }
}
