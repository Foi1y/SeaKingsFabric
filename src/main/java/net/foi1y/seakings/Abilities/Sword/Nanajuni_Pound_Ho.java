package net.foi1y.seakings.Abilities.Sword;

import net.foi1y.seakings.Abilities.Ability;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class Nanajuni_Pound_Ho extends Ability {
//    Player Clicks Ability Keybind
//    Play Animation
//    Shoot 2 Sword Slash Sideways Projectile (Or how ever you want to do the Slash)
//    Deal 10 Damage to Entity when Hit
//    Apply 25 Second Cooldown
    public Nanajuni_Pound_Ho() {
        super("Nanajuni_Pound_Ho", 100, new Identifier("seakings", "textures/gui/icons/Nanjuni_Pound_Ho.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
