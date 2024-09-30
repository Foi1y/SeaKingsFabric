package net.foi1y.seakings.Abilities.Sword;

import net.foi1y.seakings.Abilities.Ability;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class Daishinkan extends Ability {
//    Player Clicks Ability Keybind
//    Play Animation
//    Send Slash from player damaging anything in its path for 30 seconds
//    Deal 20 Damage
//    Apply 60 Second Cooldown
    public Daishinkan() {
        super("Daishinkan", 100, new Identifier("seakings", "textures/gui/icons/daishinkan.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
