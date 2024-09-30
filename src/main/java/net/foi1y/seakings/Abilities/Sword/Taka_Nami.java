package net.foi1y.seakings.Abilities.Sword;

import net.foi1y.seakings.Abilities.Ability;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class Taka_Nami extends Ability {
//    Player Clicks Ability Keybind
//    Send player up 5 Blocks in the Air
//    Nigate Fall Damage
//    Suspend in air for 20 Ticks
//    Play Animation
//    Create an AOE of Weakness and Slowness with 3 Damage
//    Spawn a Particle Set of Cloud Particles (Or Photon Tornado)
//    Apply 10 Second Cooldown
    public Taka_Nami() {
        super("Taka_Nami", 100, new Identifier("seakings", "textures/gui/icons/Taka_Nami.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
