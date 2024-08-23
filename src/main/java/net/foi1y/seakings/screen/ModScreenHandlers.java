package net.foi1y.seakings.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.foi1y.seakings.SeaKingsMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<SwordStandScreenHandler> SWORD_STAND_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(SeaKingsMod.MOD_ID, "sword_stand"),
                    new ExtendedScreenHandlerType<>(SwordStandScreenHandler::new));

    public static void registerScreenHandlers() {
        SeaKingsMod.LOGGER.info("Registering Screen Handlers for " + SeaKingsMod.MOD_ID);
    }
}
