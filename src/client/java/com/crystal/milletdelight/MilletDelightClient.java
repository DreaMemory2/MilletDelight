package com.crystal.milletdelight;

import com.crystal.milletdelight.block.MilletBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import vectorwing.farmersdelight.common.registry.ModChestLootTables;

public class MilletDelightClient implements ClientModInitializer {
	public static final ResourceLocation SIMPLE_DUNGEON = ModChestLootTables.SIMPLE_DUNGEON.location();

	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(MilletBlocks.WILD_MILLET, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MilletBlocks.MILLET, RenderType.cutout());
	}
}