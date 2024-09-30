package net.foi1y.seakings.Abilities.Sword;

import net.foi1y.seakings.Abilities.Ability;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class Hiryu_Kaen extends Ability {
//    Player Clicks Ability Keybind
//    Launch Player up 2 Blocks in the Air and hold there for 30 Ticks
//    Play Animation
//    Move Player Forward 3 Blocks
//    When on ground deal damage around the area to Entities and move player around for 25 Ticks
//    Simulate Player Right Clicks whilst running around on ground
//    Ignite all players with Soul Flame for 100 Ticks after 25 Ticks
//    Apply 20 Second Cooldown
    public Hiryu_Kaen() {
        super("Hiryu_Kaen", 100, new Identifier("seakings", "textures/gui/icons/Hiryu_Kaeen.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
