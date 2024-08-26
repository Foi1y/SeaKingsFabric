package net.foi1y.seakings.Abilities.Sword;

import net.foi1y.seakings.Abilities.Ability;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class Sanjuroku_Pound_Ho extends Ability {
    public Sanjuroku_Pound_Ho() {
        super("Sanjuroku_Pound_Ho", 100, new Identifier("seakings", "textures/gui/icons/Sanjuroku_Pound_HO.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
