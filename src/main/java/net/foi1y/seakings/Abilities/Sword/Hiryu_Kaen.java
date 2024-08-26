package net.foi1y.seakings.Abilities.Sword;

import net.foi1y.seakings.Abilities.Ability;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class Hiryu_Kaen extends Ability {
    public Hiryu_Kaen() {
        super("Hiryu_Kaen", 100, new Identifier("seakings", "textures/gui/icons/Hiryu_Kaeen.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
