package com.crystal.milletdelight.client.datagen;

import com.crystal.milletdelight.MilletDelight;
import com.crystal.milletdelight.block.MilletBlocks;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.data.PackOutput;
import net.minecraft.data.models.blockstates.PropertyDispatch;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.Property;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelProvider;
import net.neoforged.neoforge.client.model.generators.VariantBlockStateBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateGenerator extends BlockStateProvider {

    public ModBlockStateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MilletDelight.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // model.createCrossBlock(MilletBlocks.WILD_MILLET, BlockModelGenerators.TintState.NOT_TINTED);
        createCropBlock(MilletBlocks.MILLET.get(), CropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
    }

    public void createCropBlock(Block cropBlock, Property<Integer> ageProperty, int... ageToVisualStageMapping) {
        VariantBlockStateBuilder builder = getVariantBuilder(cropBlock);
        for (int i = 0; i < ageToVisualStageMapping.length; i++) {
            builder.partialState().with(ageProperty, i).modelForState().modelFile(models().crop(
                    cropBlock.getDescriptionId().split("\\.")[2] + "_stage" + i,
                    cropTextureSuffix(cropBlock, "_stage" + i)).renderType("cutout"))
                    .addModel();
        }
    }

    public ResourceLocation cropTextureSuffix(Block cropBlock, String suffix){
        return MilletDelight.of(ModelProvider.BLOCK_FOLDER + "/" + cropBlock.getDescriptionId().split("\\.")[2] + suffix);
    }
}
