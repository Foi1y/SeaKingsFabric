package net.foi1y.seakings.client.screens;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.client.gui.Drawable;


public class wheelOfDoom extends MenuRenderer {
    private static final Identifier wheelSprite = new Identifier("seakings","change this");
    private final int imageWidth = 256; // Width of the image
    private final int imageHeight = 256; // Height of the image
    protected wheelOfDoom(Text title) {
        super(Text.of("WheelOfDoom"));
    }


    protected void init(){
        super.init();
    }
    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices); // Render the background

        int x = (this.width - imageWidth) / 2;
        int y = (this.height - imageHeight) / 2;

        RenderSystem.setShaderTexture(0, wheelSprite);
        (matrices, x, y, 0, 0, imageWidth, imageHeight, imageWidth, imageHeight);
    }
    @Override
    public boolean shouldPause() {
        return false; // Pause the game when this screen is open
    }

}
