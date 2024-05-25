package net.foi1y.seakings.client.screens;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.*;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.text.Text;

public class ExampleGUI extends LightweightGuiDescription {
    public ExampleGUI(KeyBinding keyBinding) {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(256, 240);
        root.setInsets(Insets.ROOT_PANEL);


        WButton button = new WButton(Text.literal("Hello, World!"));
        button.setOnClick(() -> {
            // This code runs on the Client when you click the button.
            // Set up the Custom Abilities
            System.out.println("Button Clicked!");
        });
        // Widget, X, Y, Width, Height
        root.add(button, 0, 3, 4, 1);

        WLabel label = new WLabel(Text.literal("Test"), 0xFFFFFF);
        root.add(label, 0, 4, 2, 1);

        root.validate(this);
    }
}
