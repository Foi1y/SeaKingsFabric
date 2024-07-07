package net.foi1y.seakings.mixin;
import net.foi1y.seakings.Ability;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

import java.util.ArrayList;
import java.util.List;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin implements IPlayerAbilityData {
    @Unique
    private final List<Ability> abilities = new ArrayList<>();
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
    public void addAbility(Ability ability) {
        if (abilities.size() < 10 && !abilities.contains(ability)) {
            abilities.add(ability);
        }
    }

    @Override
    public void removeAbility(Ability ability) {
        abilities.remove(ability);
    }

    @Override
    public Ability[] getAbilities() {
        return abilities.toArray(new Ability[0]);
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