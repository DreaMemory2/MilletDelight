package com.crystal.milletdelight;

import com.crystal.milletdelight.datagen.*;
import com.crystal.milletdelight.world.ModConfiguredFeatures;
import com.crystal.milletdelight.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class MilletDelightDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator output) {
		FabricDataGenerator.Pack pack = output.createPack();
		pack.addProvider(ModBlockTagGeneration::new);
		pack.addProvider(ModChineseGenerator::new);
		pack.addProvider(ModModelGenerator::new);
		pack.addProvider(ModWorldGenerator::new);
		pack.addProvider(ModItemTagGeneration::new);
		pack.addProvider(ModRecipeGeneration::new);
	}

	@Override
	public void buildRegistry(RegistrySetBuilder registryBuilder) {
		registryBuilder.add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
