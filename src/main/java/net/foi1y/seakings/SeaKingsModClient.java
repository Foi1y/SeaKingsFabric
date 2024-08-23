package net.foi1y.seakings;

import dev.emi.trinkets.api.client.TrinketRenderer;
import dev.emi.trinkets.api.client.TrinketRendererRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.foi1y.seakings.client.GUI.screens.wheelOfDoom;
import net.foi1y.seakings.item.ModItems;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class SeaKingsModClient implements ClientModInitializer {
    private static KeyBinding openMenu;
    private static KeyBinding showWheel;

    @Override
    public void onInitializeClient() {
        TrinketRendererRegistry.registerRenderer(ModItems.WHITE_CLOAK, (TrinketRenderer) ModItems.WHITE_CLOAK);
        TrinketRendererRegistry.registerRenderer(ModItems.BLUE_CLOAK, (TrinketRenderer) ModItems.BLUE_CLOAK);
        TrinketRendererRegistry.registerRenderer(ModItems.BUGGY_CLOAK, (TrinketRenderer) ModItems.BUGGY_CLOAK);
        TrinketRendererRegistry.registerRenderer(ModItems.ONESWORDSHEATH, (TrinketRenderer) ModItems.ONESWORDSHEATH);



        openMenu = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "Wheel Of Doom", // The translation key of the keybinding's name
                InputUtil.Type.KEYSYM, // The type of the keybinding, KEYSYM for keyboard, MOUSE for mouse.
                GLFW.GLFW_KEY_R, // The keycode of the key
                "category.seakings.keys" // The translation key of the keybinding's category.
        ));
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (openMenu.wasPressed()) {
                MinecraftClient.getInstance().setScreen(new wheelOfDoom(Text.of("wheel of doom")) {

                });
            }
        });



    }
}