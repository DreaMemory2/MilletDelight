package com.stalight.milletdelight;

import com.stalight.milletdelight.block.BlockList;
import com.stalight.milletdelight.registries.ModScreenHandlers;
import com.stalight.milletdelight.screen.MilletTableScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class MilletDelightClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.MILLER_TABLE_SCREEN_HANDLER, MilletTableScreen::new);

        BlockRenderLayerMap.INSTANCE.putBlock(BlockList.WildMillet, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockList.Millet, RenderLayer.getCutout());
    }
}
