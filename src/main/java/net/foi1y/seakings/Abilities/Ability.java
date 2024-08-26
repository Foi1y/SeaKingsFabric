package net.foi1y.seakings.Abilities;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public abstract class Ability {
    private final String name;
    private final int cooldown;
    private final Identifier icon;

    public Ability(String name, int cooldown, Identifier icon) {
        this.name = name;
        this.cooldown = cooldown;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }
    public Identifier getIcon(){return icon;}
    public int getCooldown() {
        return cooldown;
    }

    public abstract void apply(ServerPlayerEntity player);
}



