package net.foi1y.seakings;

import net.foi1y.seakings.Abilities.Ability;

import java.util.Vector;

public interface IPlayerAbilityData {

    Ability getActiveAbility();

    void setActiveAbility(int i);
    int getActiveAbilityNum();

    int getAbilityCooldown(Ability ability);
    int getCurrentAbilityCooldown();
    void decreaseAbilityCooldown();

    Vector<Ability> getUnlockedAblilities();
    void setUnlockedAbilities(Vector<Ability> abilities);
    void addAblilityUnlock(Ability ability);
    void removeAblilityUnlock(Ability ability);
    Ability[] getAbilities();

    void setAlignment(String alignment);

    String getAlignment();

    void setCooldown(int index, int value);

    int[] getCooldowns();

    void decrementCooldown(int index, int amount);
}
