package net.foi1y.seakings.client.screens;

import io.github.cottonmc.cotton.gui.widget.WButton;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import com.mojang.blaze3d.systems.RenderSystem;

public class CustomButton extends WButton {
    private static final Identifier BUTTON_TEXTURE = new Identifier("modid", "textures/gui/custom_button.png");

    public CustomButton(Text label) {
        super(label);
    }


    public void paint(MatrixStack matrices, int x, int y, int mouseX, int mouseY) {
        MinecraftClient client = MinecraftClient.getInstance();
        RenderSystem.setShaderTexture(0, BUTTON_TEXTURE);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableDepthTest();
        drawTexture(matrices, x, y, 0, 0, this.getWidth(), this.getHeight(), this.getWidth(), this.getHeight());

        // Draw the text centered on the button
        drawCenteredText(matrices, client.textRenderer, this.getLabel(), x + this.getWidth() / 2, y + (this.getHeight() - 8) / 2, 0xFFFFFF);
    }

    private void drawTexture(MatrixStack matrices, int x, int y, int u, int v, int width, int height, int textureWidth, int textureHeight) {
        // Directly drawing texture
        drawTexture(matrices, x, y, u, v, width, height, textureWidth, textureHeight);
    }

    private void drawCenteredText(MatrixStack matrices, TextRenderer textRenderer, Text text, int centerX, int y, int color) {
        int textWidth = textRenderer.getWidth(text);
        //textRenderer.draw(matrices, text.asOrderedText(), centerX - textWidth / 2, y, color);
    }
}

