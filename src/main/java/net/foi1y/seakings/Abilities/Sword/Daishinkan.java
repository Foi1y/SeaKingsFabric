package net.foi1y.seakings.Abilities.Sword;

import net.foi1y.seakings.Abilities.Ability;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class Daishinkan extends Ability {
    public Daishinkan() {
        super("Daishinkan", 100, new Identifier("seakings", "textures/gui/icons/daishinkan.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
