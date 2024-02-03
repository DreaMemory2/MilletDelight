package com.stalight.milletdelight.registries;

import com.stalight.milletdelight.MilletDelight;
import com.stalight.milletdelight.screen.handler.MilletTableScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static ScreenHandlerType<MilletTableScreenHandler> MILLER_TABLE_SCREEN_HANDLER = new ExtendedScreenHandlerType<>(MilletTableScreenHandler::new);
    public static void registerAllScreenHandles() {
        Registry.register(Registries.SCREEN_HANDLER,
                new Identifier(MilletDelight.MODID, "drink_machine_screen_handler"),
                MILLER_TABLE_SCREEN_HANDLER);
    }
}
