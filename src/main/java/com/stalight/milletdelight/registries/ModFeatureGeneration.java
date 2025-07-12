package com.stalight.milletdelight.registries;

import com.stalight.milletdelight.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.minecraft.world.gen.GenerationStep;
import vectorwing.farmersdelight.common.registry.ModBiomeModifiers;
import vectorwing.farmersdelight.common.tag.ModTags;

public class ModFeatureGeneration {
    public static void registerFeature() {
        BiomeModifications.addFeature(new ModBiomeModifiers.FDBiomeSelector(0.4f, 0.9f,
                ModTags.WILD_RICE_WHITELIST, ModTags.WILD_RICE_BLACKLIST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WILD_MILLET);
    }
}
