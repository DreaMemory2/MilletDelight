package com.stalight.milletdelight;

import com.stalight.milletdelight.registries.ModBlocksRegistry;
import com.stalight.milletdelight.registries.ModItemGroup;
import com.stalight.milletdelight.registries.ModItemsRegistry;
import com.stalight.milletdelight.registries.ModTags;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MilletDelight implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("milletdelight");

	public static final String MODID = "milletdelight";

	@Override
	public void onInitialize() {

		/* Blocks and Items are Registry */
		ModBlocksRegistry.registerBlock();
		ModItemsRegistry.registerItem();

		/* Item Group */
		ModItemGroup.registerItemGroup();
		/* Tags */
		ModTags.registerTag();

		LOGGER.info("Hello Fabric world!");
	}
}