package net.foi1y.seakings.Abilities.Sword;

import net.foi1y.seakings.Abilities.Ability;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

// Example of specific ability classes
public class TatsuMaki extends Ability {
    public TatsuMaki() {
        super("Tatsu Maki", 100, new Identifier("seakings", "this must be changed"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
