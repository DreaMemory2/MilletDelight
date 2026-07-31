package com.crystal.milletdelight.block;

import com.crystal.milletdelight.MilletDelight;
import com.google.common.collect.Sets;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import vectorwing.farmersdelight.common.block.RiceBaleBlock;
import vectorwing.farmersdelight.common.block.WildCropBlock;
import vectorwing.farmersdelight.common.registry.ModBlocks;

import java.util.LinkedHashSet;
import java.util.function.Function;

public class MilletBlocks {
    public static LinkedHashSet<Block> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();
    // Crops
    public static final Block WILD_MILLET = register("wild_millet", properties -> new WildCropBlock(MobEffects.FIRE_RESISTANCE, 6, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.SHORT_GRASS));
    public static final Block MILLET = register("millet_crop", MilletCrop::new, BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT));
    // Block
    public static final Block MILLET_BAG = register("millet_bag", Block::new, BlockBehaviour.Properties.ofFullCopy(ModBlocks.RICE_BAG.get()));
    public static final Block MILLET_BALE = register("millet_bale", RiceBaleBlock::new, BlockBehaviour.Properties.ofFullCopy(ModBlocks.RICE_BALE.get()));
    public static final Block MILLET_CAKES = register("millet_cakes", CakeBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));

    private static Block register(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        ResourceKey<Block> block = ResourceKey.create(Registries.BLOCK, MilletDelight.of(name));
        return Registry.register(BuiltInRegistries.BLOCK, MilletDelight.of(name), factory.apply(settings.setId(block)));
    }

    public static void init() {

    }
}
