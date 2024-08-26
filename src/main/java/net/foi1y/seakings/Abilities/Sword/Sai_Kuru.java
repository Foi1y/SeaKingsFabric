package net.foi1y.seakings.Abilities.Sword;

import net.foi1y.seakings.Abilities.Ability;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class Sai_Kuru extends Ability {
    public Sai_Kuru() {
        super("Sai_Kuru", 100, new Identifier("seakings", "textures/gui/icons/Sai_Kuru.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
