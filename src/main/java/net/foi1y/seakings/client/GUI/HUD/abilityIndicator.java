package net.foi1y.seakings.client.GUI.HUD;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.foi1y.seakings.Abilities.Ability;
import net.foi1y.seakings.IPlayerAbilityData;
import net.foi1y.seakings.SeaKingsMod;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.Drawable;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

import static net.foi1y.seakings.client.GUI.screens.wheelOfDoom.setupIcons;

public class abilityIndicator implements HudRenderCallback {
    private static final Identifier ABILITY_SELECTED = new Identifier(SeaKingsMod.MOD_ID,
            "textures/gui/abilityhotbar.png" );

    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {
        int x = 0;
        int y = 0;
        MinecraftClient client = MinecraftClient.getInstance();
        int width = 0;
        int height = 0;
        if (client != null) {
            width = client.getWindow().getScaledWidth();
            height = client.getWindow().getScaledHeight();

            x = width / 2;
            y = height;
        }

        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, ABILITY_SELECTED);

        drawContext.drawTexture(ABILITY_SELECTED, x + 100, y - 23, 0, 0, 60, 25, 60, 25);

        setupIcons(drawContext);
    }

    private void setupIcons(DrawContext drawContext) {
        PlayerEntity player = MinecraftClient.getInstance().player;

        int x = 0;
        int y = 0;
        MinecraftClient client = MinecraftClient.getInstance();
        int width = 0;
        int height = 0;
        if (client != null) {
            width = client.getWindow().getScaledWidth();
            height = client.getWindow().getScaledHeight();

            x = width / 2;
            y = height;
        }

        // Check if player is null
        if (player == null) {
            return; // Early exit if no player is found
        }

        IPlayerAbilityData playerAbilityData = (IPlayerAbilityData) player;
        Ability[] abilities = playerAbilityData.getAbilities();


        // Define positions for the 3 icons
        int[][] iconPos = {
                {150, 115},
                {160, 115},
                {59, 59}
        };

        // Only display the first 3 abilities
        if (playerAbilityData.getActiveAbilityNum() != 7 && playerAbilityData.getActiveAbilityNum() != 0) {
            for (int i = 0; i < 3; i++) {
                x+=19;
                Identifier iconTexture = abilities[i + playerAbilityData.getActiveAbilityNum()].getIcon();
                drawContext.drawTexture(iconTexture, x + 83, y - 19, 0, 0, 17, 17, 17, 17); // Also Moves Middle X & Y
            }
        } else if (playerAbilityData.getActiveAbilityNum() == 7) {
            for (int i = 0; i < 2; i++) {

                Identifier iconTexture = abilities[i + playerAbilityData.getActiveAbilityNum()-1].getIcon();
                drawContext.drawTexture(iconTexture, x + 5, y - 19, 0, 0, 17, 17, 17, 17);
                x+=5;
            }

            Identifier iconTexture = abilities[0].getIcon();
            drawContext.drawTexture(iconTexture, x + 5, y - 19, 0, 0, 17, 17, 17, 17);
        } else if (playerAbilityData.getActiveAbilityNum() == 0) {

            Identifier iconTexture = abilities[7].getIcon();
            drawContext.drawTexture(iconTexture, x + 5, y - 19, 0, 0, 17, 17, 17, 17);
            x+=5; // Moves Middle Texture on X & Y?
            for(int i = 0; i <2; i++){
                iconTexture = abilities[i + playerAbilityData.getActiveAbilityNum() - 1].getIcon();
                drawContext.drawTexture(iconTexture, x + 5, y - 10, 0, 0, 17, 17, 17, 17);
                x+=5;
            }
        }
    }
}

