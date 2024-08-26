package net.foi1y.seakings.Abilities.Sword;

import net.foi1y.seakings.Abilities.Ability;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class Taka_Nami extends Ability {
    public Taka_Nami() {
        super("Taka_Nami", 100, new Identifier("seakings", "textures/gui/icons/Taka_Nami.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
