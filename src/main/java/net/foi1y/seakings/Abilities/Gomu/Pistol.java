package net.foi1y.seakings.Abilities.Gomu;

import net.foi1y.seakings.Abilities.Ability;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class Pistol extends Ability {
    public Pistol(){
        super("Gomu_Pistol", 100, new Identifier("seakings", "textures/item/placeholdergomu.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Ability Effect Here
    }
}
