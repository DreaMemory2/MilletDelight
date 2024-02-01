package com.stalight.milletdelight;

import com.stalight.milletdelight.block.BlockList;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class MilletDelightClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(BlockList.WildMillet, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockList.Millet, RenderLayer.getCutout());
    }
}
