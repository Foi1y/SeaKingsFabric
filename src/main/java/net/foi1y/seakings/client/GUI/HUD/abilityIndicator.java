package net.foi1y.seakings.client.GUI.HUD;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.foi1y.seakings.IPlayerAbilityData;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.Drawable;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.entity.player.PlayerAbilities;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;


public class abilityIndicator implements HudRenderCallback {


    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {
        assert MinecraftClient.getInstance().player != null;
        PlayerEntity player = MinecraftClient.getInstance().player;
        IPlayerAbilityData playerAbilityData = (IPlayerAbilityData) player;
        RenderSystem.setShaderTexture(0,playerAbilityData.getActiveAbility().getIcon());
        MinecraftClient.getInstance().inGameHud.render(drawContext,tickDelta);
    }
}
