package com.crystal.milletdelight;

import com.crystal.milletdelight.block.MilletBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class MilletDelightClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(MilletBlocks.WILD_MILLET, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MilletBlocks.MILLET, RenderType.cutout());
	}
}