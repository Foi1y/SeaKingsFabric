package net.foi1y.seakings;

import net.foi1y.seakings.Abilities.Ability;

public interface IPlayerAbilityData {

    Ability getActiveAbility();

    void setActiveAbility(int i);
    int getActiveAbilityNum();

    int getAbilityCooldown(Ability ability);
    int getCurrentAbilityCooldown();
    void decreaseAbilityCooldown();


    Ability[] getAbilities();

    void setAlignment(String alignment);

    String getAlignment();

    void setCooldown(int index, int value);

    int[] getCooldowns();

    void decrementCooldown(int index, int amount);
}
