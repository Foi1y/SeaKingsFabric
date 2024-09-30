package net.foi1y.seakings.Abilities.Sword;

import net.foi1y.seakings.Abilities.Ability;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class IttoryuIai extends Ability {
//    Player Clicks Ability Keybind
//    Teleport the Player 3 Blocks in the Direction they are looking
//    Wait 10 Ticks
//    Play Animation
//    Wait 20 Ticks
//    Deal 3 Damage to Entity if in path of player when starting ability
//    Apply 10 Second Cooldown
    public IttoryuIai() {
        super("Ittoryu Iai", 100, new Identifier("seakings", "change this"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
