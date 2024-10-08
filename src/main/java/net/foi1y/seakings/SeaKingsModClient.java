package net.foi1y.seakings;

import dev.emi.trinkets.api.client.TrinketRenderer;
import dev.emi.trinkets.api.client.TrinketRendererRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.foi1y.seakings.client.GUI.HUD.abilityIndicator;
import net.foi1y.seakings.client.GUI.screens.wheelOfDoom;
import net.foi1y.seakings.entity.client.CivilianRenderer;
import net.foi1y.seakings.entity.client.PirateRenderer;
import net.foi1y.seakings.entity.custom.ModEntities;
import net.foi1y.seakings.item.ModItems;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.client.util.InputUtil;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.command.CommandManager;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.lwjgl.glfw.GLFW;

public class SeaKingsModClient implements ClientModInitializer {
    private static KeyBinding openMenu;
    private static KeyBinding showWheel;
    private static KeyBinding useAbility;

    @Override
    public void onInitializeClient() {
        TrinketRendererRegistry.registerRenderer(ModItems.WHITE_CLOAK, (TrinketRenderer) ModItems.WHITE_CLOAK);
        TrinketRendererRegistry.registerRenderer(ModItems.BUGGY_CLOAK, (TrinketRenderer) ModItems.BUGGY_CLOAK);
        TrinketRendererRegistry.registerRenderer(ModItems.ONESWORDSHEATH, (TrinketRenderer) ModItems.ONESWORDSHEATH);

        EntityRendererRegistry.register(ModEntities.SWORD_SLASH_GREEN_PROJECTILE, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.CIVILIAN, CivilianRenderer::new);
        EntityRendererRegistry.register(ModEntities.PIRATE, PirateRenderer::new);


        useAbility = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "Activate Ability", // The translation key of the keybinding's name
                InputUtil.Type.KEYSYM, // The type of the keybinding, KEYSYM for keyboard, MOUSE for mouse.
                GLFW.GLFW_KEY_R, // The keycode of the key
                "category.seakings.keys" // The translation key of the keybinding's category.
        ));
        openMenu = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "Wheel Of Doom", // The translation key of the keybinding's name
                InputUtil.Type.KEYSYM, // The type of the keybinding, KEYSYM for keyboard, MOUSE for mouse.
                GLFW.GLFW_KEY_Z, // The keycode of the key
                "category.seakings.keys" // The translation key of the keybinding's category.
        ));
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (openMenu.wasPressed()) {
                MinecraftClient.getInstance().setScreen(new wheelOfDoom(Text.of("wheel of doom")) {

                });
            }
        });


        HudRenderCallback.EVENT.register(new abilityIndicator());
        /*
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (useAbility.wasPressed()) {
                assert MinecraftClient.getInstance().player != null;
                PlayerEntity player = MinecraftClient.getInstance().player;
                IPlayerAbilityData playerAbilityData = (IPlayerAbilityData) player;
                playerAbilityData.getActiveAbility().apply((ServerPlayerEntity) player);
                int[] cooldowns = playerAbilityData.getCooldowns();
                for(int i = 0; i <8; i++){
                    if(cooldowns[i] > 0){
                        playerAbilityData.decrementCooldown(i,1);
                    }
                }


            }
        });
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            assert MinecraftClient.getInstance().player != null;
            PlayerEntity player = MinecraftClient.getInstance().player;
            IPlayerAbilityData playerAbilityData = (IPlayerAbilityData) player;
            int[] cooldowns = playerAbilityData.getCooldowns();
            for(int i = 0; i <8; i++){
                if(cooldowns[i] > 0){
                    playerAbilityData.decrementCooldown(i,1);
                }
            }
        });
        */


    }
}