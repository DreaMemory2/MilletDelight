package com.stalight.milletdelight;

import com.stalight.milletdelight.block.ModBlocks;
import com.stalight.milletdelight.item.ModItems;
import com.stalight.milletdelight.registries.*;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MilletDelight implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("milletdelight");

	public static final String MODID = "milletdelight";

	@Override
	public void onInitialize() {

		/* Blocks and Items are Registry */
		ModBlocks.init();
		ModItems.init();

		/* Item Group */
		ModItemGroup.init();
		/* Tags */
		ModTags.registerTag();
		/* Features */
		ModFeatureGeneration.registerFeature();
		/* Villager Register */
		ModVillager.registerTrades();
		ModVillager.init();

		LOGGER.info("Hello Fabric world!");
	}

	public static Identifier of(String path) {
		return Identifier.of(MODID, path);
	}
}