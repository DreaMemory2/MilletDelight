package com.crystal.milletdelight.world;

import com.crystal.milletdelight.MilletDelight;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

/**
 * @see PlacementUtils
 */
public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> WILD_MILLET = registerPlacedKey("wild_millet");

    public static ResourceKey<PlacedFeature> registerPlacedKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, MilletDelight.of(name));
    }

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configFeature = context.lookup(Registries.CONFIGURED_FEATURE);

        PlacementUtils.register(context, WILD_MILLET, configFeature.getOrThrow(ModConfiguredFeatures.WILD_MILLET),
                List.of(CountPlacement.of(12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
    }
}
