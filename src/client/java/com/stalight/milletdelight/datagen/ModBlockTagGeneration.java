package com.stalight.milletdelight.datagen;

import com.stalight.milletdelight.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGeneration extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagGeneration(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        this.getOrCreateTagBuilder(ModTags.WILD_CROPS)
                .add(ModBlocks.WILD_MILLET);
    }
}
