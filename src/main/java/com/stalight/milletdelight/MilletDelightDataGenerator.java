package com.stalight.milletdelight;

import com.stalight.milletdelight.datagen.ModBlockTagGeneration;
import com.stalight.milletdelight.datagen.ModLanguageGenerator;
import com.stalight.milletdelight.datagen.ModModelGenerator;
import com.stalight.milletdelight.datagen.ModWorldGenerator;
import com.stalight.milletdelight.world.feature.ModConfiguredFeatures;
import com.stalight.milletdelight.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class MilletDelightDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModModelGenerator::new);
		pack.addProvider(ModBlockTagGeneration::new);
		pack.addProvider(ModLanguageGenerator::new);
		pack.addProvider(ModWorldGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
