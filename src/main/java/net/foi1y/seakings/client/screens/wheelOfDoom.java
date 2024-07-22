package net.foi1y.seakings.client.screens;

import java.lang.Math;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.navigation.GuiNavigation;
import net.minecraft.client.gui.navigation.GuiNavigationPath;
import net.minecraft.client.gui.navigation.NavigationDirection;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.narration.NarrationMessageBuilder;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import org.lwjgl.glfw.GLFW;


public abstract class wheelOfDoom extends Screen {


    protected wheelOfDoom(Text title) {
        super(title);
    }

    @Contract("_, _ -> new")
    public static double @NotNull [] getRad(long posX , long posY){
        return new double[] {Math.sqrt(posX*posX+posY*posY),Math.atan((double) posX /posY)};
    }


    private final static Identifier wheel = new Identifier("seakings","textures/image.png");


    private final int imageWidth = 64; // Width of the image
    private final int imageHeight = 64; // Height of the image



    @Override
    public boolean shouldPause(){
        return false;
    }
    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        // Allow movement keys to be passed to the game
        if (MinecraftClient.getInstance().options.forwardKey.matchesKey(keyCode, scanCode) ||
                MinecraftClient.getInstance().options.leftKey.matchesKey(keyCode, scanCode) ||
                MinecraftClient.getInstance().options.backKey.matchesKey(keyCode, scanCode) ||
                MinecraftClient.getInstance().options.rightKey.matchesKey(keyCode, scanCode) ||
                MinecraftClient.getInstance().options.jumpKey.matchesKey(keyCode, scanCode) ||
                MinecraftClient.getInstance().options.sneakKey.matchesKey(keyCode, scanCode)) {
            return false;
        }
        return super.keyPressed(keyCode, scanCode, modifiers);
    }

    @Override
    public boolean keyReleased(int keyCode, int scanCode, int modifiers) {
        // Allow movement keys to be passed to the game
        if (MinecraftClient.getInstance().options.forwardKey.matchesKey(keyCode, scanCode) ||
                MinecraftClient.getInstance().options.leftKey.matchesKey(keyCode, scanCode) ||
                MinecraftClient.getInstance().options.backKey.matchesKey(keyCode, scanCode) ||
                MinecraftClient.getInstance().options.rightKey.matchesKey(keyCode, scanCode) ||
                MinecraftClient.getInstance().options.jumpKey.matchesKey(keyCode, scanCode) ||
                MinecraftClient.getInstance().options.sneakKey.matchesKey(keyCode, scanCode)) {
            return false;
        }
        return super.keyReleased(keyCode, scanCode, modifiers);
    }

    public void init(){

        
    }

    @Override
    public void tick() {
        super.tick();

    }


    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {

        // Bind the texture
        assert this.client != null;
        this.client.getTextureManager().bindTexture(wheel);




        // Calculate the position to center the image
        double clientScale =  client.getWindow().getScaleFactor();
        int scale = 4;
        int x = (this.width - imageWidth) / 2;
        int y = (this.height - imageHeight) / 2;
        double[] radQurds = getRad(mouseX,mouseY);
        double radius = radQurds[0];
        double theda = radQurds[1];
        int height = client.getWindow().getScaledHeight();
        int width = client.getWindow().getScaledWidth();
        // Draw the texture
        ClickableWidget wheel = new ClickableWidget(0,0,320,320,Text.of("itisawheel")) {
            @Override
            protected void renderButton(DrawContext context, int mouseX, int mouseY, float delta) {

            }

            @Override
            protected void appendClickableNarrations(NarrationMessageBuilder builder) {

            }
        };
        wheel.drawTexture(context, wheelOfDoom.wheel, width/2-528/6,height/2-528/6, 0,0,0,528/3,528/3,528/3,528/3);

    }




}
