package net.foi1y.seakings;


import dev.emi.trinkets.api.client.TrinketRenderer;
import dev.emi.trinkets.api.client.TrinketRendererRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.foi1y.seakings.client.screens.MenuScreen;
import net.foi1y.seakings.item.ModItems;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class SeaKingsModClient implements ClientModInitializer {
    private static KeyBinding keyBinding;
    @Override
    public void onInitializeClient() {
        TrinketRendererRegistry.registerRenderer(ModItems.BASIC_CLOAK, (TrinketRenderer) ModItems.BASIC_CLOAK);
        keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.seakings.spook", // The translation key of the keybinding's name
                InputUtil.Type.KEYSYM, // The type of the keybinding, KEYSYM for keyboard, MOUSE for mouse.
                GLFW.GLFW_KEY_R, // The keycode of the key
                "category.seakings.test" // The translation key of the keybinding's category.
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (keyBinding.wasPressed()) {
                assert client.player != null;
                client.player.sendMessage(Text.literal("Key 1 was pressed!"), false);
                client.setScreen(new MenuScreen(keyBinding));
            }
        });
    }
}