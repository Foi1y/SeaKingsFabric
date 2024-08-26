package net.foi1y.seakings.Abilities.Sword;

import net.foi1y.seakings.Abilities.Ability;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class Yaki_Oni_Giri extends Ability {
    public Yaki_Oni_Giri() {
        super("Yaki_Oni_Giri", 100, new Identifier("seakings", "textures/gui/icons/Yaki_oni_giri.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
