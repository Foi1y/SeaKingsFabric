package net.foi1y.seakings.client.screens;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.narration.NarrationMessageBuilder;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.ElementListWidget;
import net.minecraft.client.gui.widget.ScrollableWidget;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.text.Text;


    @Environment(EnvType.CLIENT)
public class MenuScreen extends Screen {
    public MenuScreen(KeyBinding keyBinding){
        // The parameter is the title of the screen,
        // which will be narrated when you enter the screen.
        super(Text.literal("My tutorial screen"));
    }

    public ButtonWidget button1;
    public ButtonWidget button2;
    public ScrollableWidget scrollableWidget;


    @Override
    protected void init() {
        button1 = ButtonWidget.builder(Text.literal("Button 1"), button -> {
                    System.out.println("You clicked button1!");
                })
                .dimensions(width / 2 - 205, 20, 200, 20)
                .tooltip(Tooltip.of(Text.literal("Tooltip of button1")))
                .build();
        button2 = ButtonWidget.builder(Text.literal("Button 2"), button -> {
                    System.out.println("You clicked button2!");
                })
                .dimensions(width / 2 + 5, 20, 200, 20)
                .tooltip(Tooltip.of(Text.literal("Tooltip of button2")))
                .build();
        scrollableWidget = new ScrollableWidget(5, 5, width - 200, height - 100, Text.literal("Your Text Here")) {
            @Override
            protected int getContentsHeight() {
                return 1;
            }

            @Override
            protected double getDeltaYPerScroll() {
                return 1;
            }

            @Override
            protected void renderContents(DrawContext context, int mouseX, int mouseY, float delta) {
            }

            @Override
            protected void appendClickableNarrations(NarrationMessageBuilder builder) {
            }
        };
        this.addDrawableChild(scrollableWidget);

        addDrawableChild(button1);
        addDrawableChild(button2);
    }
}
