package com.stalight.milletdelight;

import com.stalight.milletdelight.registries.*;
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
		/* Features */
		ModFeatureGeneration.registerFeature();
		/* BlockEntity */
		ModBlockEntities.registerBlockEntities();
		/* ScreenHandler */
		ModScreenHandlers.registerAllScreenHandles();
		/* Villager Register */
		ModVillager.registerVillager();
		ModVillager.registerTrades();

		LOGGER.info("Hello Fabric world!");
	}
}