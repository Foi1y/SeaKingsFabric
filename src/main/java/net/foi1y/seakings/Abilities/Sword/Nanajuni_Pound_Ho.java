package net.foi1y.seakings.Abilities.Sword;

import net.foi1y.seakings.Abilities.Ability;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class Nanajuni_Pound_Ho extends Ability {
    public Nanajuni_Pound_Ho() {
        super("Nanajuni_Pound_Ho", 100, new Identifier("seakings", "textures/gui/icons/Nanjuni_Pound_Ho.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
