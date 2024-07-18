package net.foi1y.seakings.client.screens;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public abstract class wheelOfDoom extends Screen {
    private final static Identifier wheel1 = new Identifier("wheel1","assets/seakings/textures/Gui/wheelofdoom/selection1.png");
    private final static Identifier wheel2 = new Identifier("wheel1","assets/seakings/textures/Gui/wheelofdoom/selection2.png");
    private final static Identifier wheel3 = new Identifier("wheel1","assets/seakings/textures/Gui/wheelofdoom/selection3.png");
    private final static Identifier wheel4 = new Identifier("wheel1","assets/seakings/textures/Gui/wheelofdoom/selection4.png");
    private final static Identifier wheel5 = new Identifier("wheel1","assets/seakings/textures/Gui/wheelofdoom/selection5.png");
    private final static Identifier wheel6 = new Identifier("wheel1","assets/seakings/textures/Gui/wheelofdoom/selection6.png");
    private final static Identifier wheel7 = new Identifier("wheel1","assets/seakings/textures/Gui/wheelofdoom/selection7.png");
    private final static Identifier wheel8 = new Identifier("wheel1","assets/seakings/textures/Gui/wheelofdoom/selection8.png");
    private final static Identifier wheel9 = new Identifier("wheel1","assets/seakings/textures/Gui/wheelofdoom/selection9.png");
    private final static Identifier wheel10 = new Identifier("wheel1","assets/seakings/textures/Gui/wheelofdoom/selection10.png");
    private final static Identifier wheel11 = new Identifier("wheel1","assets/seakings/textures/Gui/wheelofdoom/selection11.png");
    private final static Identifier wheel12 = new Identifier("wheel1","assets/seakings/textures/Gui/wheelofdoom/selection12.png");
    private final static Identifier wheel0 = new Identifier("wheel1","assets/seakings/textures/Gui/wheelofdoom/wheel.png");

    private final int imageWidth = 256; // Width of the image
    private final int imageHeight = 256; // Height of the image

    protected wheelOfDoom(Text title) {
        super(title);
    }
    public void releaseMouse(MinecraftClient client) {
        if (client != null) {
            client.mouse.unlockCursor();
        }
    }


    public void init(){
        releaseMouse(client);
        
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {

        // Bind the texture
        assert this.client != null;
        this.client.getTextureManager().bindTexture(wheel0);
        this.client.getTextureManager().bindTexture(wheel1);
        this.client.getTextureManager().bindTexture(wheel2);
        this.client.getTextureManager().bindTexture(wheel3);
        this.client.getTextureManager().bindTexture(wheel4);
        this.client.getTextureManager().bindTexture(wheel5);
        this.client.getTextureManager().bindTexture(wheel6);
        this.client.getTextureManager().bindTexture(wheel7);
        this.client.getTextureManager().bindTexture(wheel8);
        this.client.getTextureManager().bindTexture(wheel9);
        this.client.getTextureManager().bindTexture(wheel10);
        this.client.getTextureManager().bindTexture(wheel11);
        this.client.getTextureManager().bindTexture(wheel12);


        // Calculate the position to center the image
        int scale = 4;
        int imageWidth = 64; // Replace with your image width
        int imageHeight = 64; // Replace with your image height
        int x = (this.width - imageWidth) / 2;
        int y = (this.height - imageHeight) / 2;

        // Draw the texture
        if(mouseX >= 100 && mouseX <= 200 && mouseY >= 100 && mouseY <= 200){

        } else if(mouseX >= 100 && mouseX <= 2000 && mouseY >= 100 && mouseY <= 200){

        }else if(mouseX >= 100 && mouseX <= 2000 && mouseY >= 100 && mouseY <= 200){

        }else if(mouseX >= 100 && mouseX <= 2000 && mouseY >= 100 && mouseY <= 200){

        }else if(mouseX >= 100 && mouseX <= 2000 && mouseY >= 100 && mouseY <= 200){

        }else if(mouseX >= 100 && mouseX <= 2000 && mouseY >= 100 && mouseY <= 200){

        }else if(mouseX >= 100 && mouseX <= 2000 && mouseY >= 100 && mouseY <= 200){

        }else if(mouseX >= 100 && mouseX <= 2000 && mouseY >= 100 && mouseY <= 200){

        }else if(mouseX >= 100 && mouseX <= 2000 && mouseY >= 100 && mouseY <= 200){

        }else if(mouseX >= 100 && mouseX <= 2000 && mouseY >= 100 && mouseY <= 200){

        }else if(mouseX >= 100 && mouseX <= 2000 && mouseY >= 100 && mouseY <= 200){

        }else if(mouseX >= 100 && mouseX <= 2000 && mouseY >= 100 && mouseY <= 200){

        } else {

        }
    }




}
