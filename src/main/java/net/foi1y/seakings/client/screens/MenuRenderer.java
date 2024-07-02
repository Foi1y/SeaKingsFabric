package net.foi1y.seakings.client.screens;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public abstract class MenuRenderer extends Screen {
    private final int imageWidth = 256; // Width of the image
    private final int imageHeight = 256; // Height of the image

    protected MenuRenderer(Text title) {
        super(title);
    }

    public abstract void render(MatrixStack matrices, int mouseX, int mouseY, float delta);
}
