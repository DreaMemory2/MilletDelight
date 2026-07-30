package com.crystal.milletdelight.block;

import com.crystal.milletdelight.MilletDelight;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import vectorwing.farmersdelight.common.block.RiceBaleBlock;
import vectorwing.farmersdelight.common.block.WildCropBlock;
import vectorwing.farmersdelight.common.registry.ModBlocks;

import java.util.function.Supplier;

public class MilletBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MilletDelight.MODID);
    // Crops
    public static final DeferredBlock<Block> WILD_MILLET = register("wild_millet", () -> new WildCropBlock(MobEffects.FIRE_RESISTANCE, 6, BlockBehaviour.Properties.ofFullCopy(Blocks.SHORT_GRASS)));
    public static final DeferredBlock<Block> MILLET = register("millet_crop", () -> new MilletCrop(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));
    // Block
    public static final DeferredBlock<Block> MILLET_BAG = register("millet_bag", () -> new Block(BlockBehaviour.Properties.ofFullCopy(ModBlocks.RICE_BAG.get())));
    public static final DeferredBlock<Block> MILLET_BALE = register("millet_bale", () -> new RiceBaleBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.RICE_BALE.get())));
    public static final DeferredBlock<Block> MILLET_CAKES = register("millet_cakes", () -> new CakeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE)));

    public static DeferredBlock<Block> register(String name, Supplier<Block> block) {
        return BLOCKS.register(name, block);
    }
}
