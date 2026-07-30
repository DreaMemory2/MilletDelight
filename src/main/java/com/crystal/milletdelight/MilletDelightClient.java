package com.crystal.milletdelight;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = MilletDelight.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = MilletDelight.MODID, value = Dist.CLIENT)
public class MilletDelightClient {

    public MilletDelightClient(ModContainer container) {
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
    }
}
