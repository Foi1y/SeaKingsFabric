package net.foi1y.seakings.mixin;
import net.foi1y.seakings.Abilities.Ability;
import net.foi1y.seakings.Abilities.nullAbility;
import net.foi1y.seakings.IPlayerAbilityData;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

import java.util.Collection;
import java.util.Vector;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin implements IPlayerAbilityData {
    @Shadow public abstract void unlockRecipes(Identifier[] ids);

    @Unique
    private Ability nullAbility = new nullAbility();
    @Unique
    private Vector<Ability> unlockedAbilities = new Vector<Ability>();
    @Unique
    private int activeAbilityNum = 4;
    @Unique
    private int[] cooldowns = new int[]{0,0,0,0,0,0,0,0};


    @Unique
    private final Ability[] abilities =  new Ability[]{nullAbility, nullAbility, nullAbility, nullAbility, nullAbility, nullAbility, nullAbility, nullAbility};
    @Unique
    private Ability activeAbility = new nullAbility();
    @Unique
    private int abilityCooldown;
    @Unique
    private String playerAlignment;

    @Override
    public Ability getActiveAbility() {
        return activeAbility;
    }

    @Override
    public void setActiveAbility(int abilityNum) {
        this.activeAbility = abilities[abilityNum];
        this.activeAbilityNum = abilityNum;
    }
    public int getActiveAbilityNum(){
        return activeAbilityNum;
    }

    @Override
    public int getAbilityCooldown(Ability ability) {
        return ability.getCooldown();
    }

    @Override
    public void decreaseAbilityCooldown() {
        if (abilityCooldown > 0) {
            abilityCooldown--;
        }
    }

    @Override
    public Vector<Ability> getUnlockedAblilities() {
        return unlockedAbilities;
    }

    @Override
    public void setUnlockedAbilities(Vector<Ability> abilities) {
        unlockedAbilities = abilities;
    }

    @Override
    public void addAblilityUnlock(Ability ability) {
        unlockedAbilities.addElement(ability);
    }

    @Override
    public void removeAblilityUnlock(Ability ability) {
        unlockedAbilities.remove(ability);
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


    @Override
    public int[] getCooldowns() {
        return cooldowns;
    }
    @Override
    public void setCooldown(int index, int value){
        cooldowns[index] = value;
    }
    @Override
    public void decrementCooldown(int index, int amount){
        cooldowns[index] -= amount;
    }
    @Override
    public int getCurrentAbilityCooldown(){
        return activeAbility.getCooldown();
    }
}