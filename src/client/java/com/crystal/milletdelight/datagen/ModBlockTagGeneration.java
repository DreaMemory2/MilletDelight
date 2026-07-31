package com.crystal.milletdelight.datagen;

import com.crystal.milletdelight.block.MilletBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGeneration extends FabricTagsProvider.BlockTagsProvider {

    public ModBlockTagGeneration(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.valueLookupBuilder(ModTags.Blocks.WILD_CROPS)
                .add(MilletBlocks.WILD_MILLET);

    }
}
