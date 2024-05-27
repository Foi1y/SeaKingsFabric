package net.foi1y.seakings.client.screens;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import net.minecraft.client.option.KeyBinding;

public class theWheelOfDoom extends LightweightGuiDescription {

    public theWheelOfDoom(KeyBinding keyBinding) {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(150, 150);
        root.setInsets(Insets.ROOT_PANEL);
    }
}
