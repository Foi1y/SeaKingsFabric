package net.foi1y.seakings.mixin;
import net.foi1y.seakings.Abilities.Ability;
import net.foi1y.seakings.Abilities.nullAbility;
import net.foi1y.seakings.IPlayerAbilityData;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin implements IPlayerAbilityData {

    @Unique
    private Ability nullAbility = new nullAbility();
    @Unique
    private final Ability[] abilities =  new Ability[]{nullAbility, nullAbility, nullAbility, nullAbility, nullAbility, nullAbility, nullAbility, nullAbility};
    @Unique
    private Ability activeAbility;
    @Unique
    private int abilityCooldown;
    @Unique
    private String playerAlignment;

    @Override
    public Ability getActiveAbility() {
        return activeAbility;
    }

    @Override
    public void setActiveAbility(Ability ability) {
        this.activeAbility = ability;
    }

    @Override
    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    @Override
    public void setAbilityCooldown(int cooldown) {
        this.abilityCooldown = cooldown;
    }

    @Override
    public void decreaseAbilityCooldown() {
        if (abilityCooldown > 0) {
            abilityCooldown--;
        }
    }

    @Override
    public Ability[] getAbilities() {
        return abilities;
    }


    @Override
    public void setAlignment(String alignment) {
        playerAlignment = alignment;
    }

    @Override
    public String getAlignment() {
        return playerAlignment;
    }
}