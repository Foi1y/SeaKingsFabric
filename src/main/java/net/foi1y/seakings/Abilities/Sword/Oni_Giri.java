package net.foi1y.seakings.Abilities.Sword;

import net.foi1y.seakings.Abilities.Ability;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class Oni_Giri extends Ability {
    public Oni_Giri() {
        super("Oni_Giri", 100, new Identifier("seakings", "textures/gui/icons/OniGiri.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
