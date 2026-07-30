package com.crystal.milletdelight;

import com.crystal.milletdelight.block.MilletBlocks;
import com.crystal.milletdelight.item.MilletItems;
import com.crystal.milletdelight.item.ModItemGroup;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(MilletDelight.MODID)
public class MilletDelight {
    public static final String MODID = "milletdelight";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MilletDelight(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        MilletBlocks.BLOCKS.register(modEventBus);
        MilletItems.ITEMS.register(modEventBus);
        ModItemGroup.CREATIVE_MODE_TABS.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    public static ResourceLocation of(String name) {
        return ResourceLocation.fromNamespaceAndPath(MODID, name);
    }
}
