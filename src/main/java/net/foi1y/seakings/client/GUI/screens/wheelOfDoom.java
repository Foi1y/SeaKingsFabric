package net.foi1y.seakings.client.GUI.screens;

import java.lang.Math;

import net.foi1y.seakings.Abilities.Ability;
import net.foi1y.seakings.IPlayerAbilityData;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.narration.NarrationMessageBuilder;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;


public abstract class wheelOfDoom extends Screen {



    public static void setupIcons(DrawContext drawContext,int width, int height){
        assert MinecraftClient.getInstance().player != null;
         PlayerEntity player = MinecraftClient.getInstance().player;
        IPlayerAbilityData playerAbilityData = (IPlayerAbilityData) player;

        Ability[] abilities = playerAbilityData.getAbilities();

        int[][] iconPos = {
                {59,24},
                {24,59},
                {-25,59},
                {-59,24},
                {-59,-24},
                {-24,-59},
                {24,-59},
                {59,-24}
        };
        Identifier[] images = new Identifier[8];
        ClickableWidget[] icons = new ClickableWidget[8];
        for (int i = 0; i < 8; i++) {
            icons[i] = new ClickableWidget(0, 0, 64, 64, Text.of("thisisaicon")) {
                @Override
                protected void renderButton(DrawContext context, int mouseX, int mouseY, float delta) {

                }

                @Override
                protected void appendClickableNarrations(NarrationMessageBuilder builder) {

                }

                @Override
                public void onClick(double mouseX, double mouseY) {
                    double[] polarQurds= getRad((long) mouseX,(long)mouseY);
                    double mouseTheda = polarQurds[0];
                    double mouseRaidius = polarQurds[1];
                    if(mouseTheda>0 && mouseTheda<=45){
                        playerAbilityData.setActiveAbility(0);
                    }else if(mouseTheda>45 && mouseTheda<=90){
                        playerAbilityData.setActiveAbility(1);
                    }else if(mouseTheda>90 && mouseTheda<=135){
                        playerAbilityData.setActiveAbility(2);
                    }else if(mouseTheda>135 && mouseTheda<=180){
                        playerAbilityData.setActiveAbility(3);
                    }else if(mouseTheda>180 && mouseTheda<=225){
                        playerAbilityData.setActiveAbility(4);
                    }else if(mouseTheda>225 && mouseTheda<=270){
                        playerAbilityData.setActiveAbility(5);
                    }else if(mouseTheda>270 && mouseTheda<=315){
                        playerAbilityData.setActiveAbility(6);
                    }else if(mouseTheda>315 && mouseTheda<=360){
                        playerAbilityData.setActiveAbility(7);
                    }
                    MinecraftClient.getInstance().setScreen((Screen)null);

                }
            };
        }

        for (int i = 0; i < 8; i++) {
            images[i] = abilities[i].getIcon();
        }
        for (int i = 0; i < 8; i++) {
            icons[i].drawTexture(drawContext, images[i],iconPos[i][0]+width/2-28/2,iconPos[i][1]+height/2-28/2,0,0,0, (int) (48*0.6), (int) (48*0.6), (int) (48*0.6), (int) (48*0.6));
        }
        //iconPos[i][0]/2-width/2,iconPos[i][1]/2-height/2,

    }


    protected wheelOfDoom(Text title) {
        super(title);
    }

    @Contract("_, _ -> new")
    public static double @NotNull [] getRad(long posX , long posY){
        return new double[] {Math.sqrt(posX*posX+posY*posY),Math.atan((double) posX /posY)};
    }


    private final static Identifier wheel = new Identifier("seakings","wheel.png");


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
        // Width of the image
        int imageWidth = 64;
        int x = (this.width - imageWidth) / 2;
        // Height of the image
        int imageHeight = 64;
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

        setupIcons(context, width,height);
    }




}
