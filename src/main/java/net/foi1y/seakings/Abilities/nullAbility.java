package net.foi1y.seakings.Abilities;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class nullAbility extends Ability{
    public nullAbility() {
        super("NUll", 0, new Identifier("seakings","textures/gui/icons/null.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {

    }
}
