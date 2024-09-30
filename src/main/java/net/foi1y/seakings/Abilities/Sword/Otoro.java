package net.foi1y.seakings.Abilities.Sword;

import net.foi1y.seakings.Abilities.Ability;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class Otoro extends Ability {
//    Player Clicks Ability Keybind
//    Play Animation
//    Launch Player up 10 Blocks
//    Apply Fall Resistance
//    Shoot 2 Sword Slashes downwards dealing damage to anything in its path
//    Deal 10 Damage for both Slashes
//    Apply 60 Second Cooldown
    public Otoro() {
        super("Otoro", 100, new Identifier("seakings", "change this"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
