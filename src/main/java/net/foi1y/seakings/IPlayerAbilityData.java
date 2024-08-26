package net.foi1y.seakings;

import net.foi1y.seakings.Abilities.Ability;

public interface IPlayerAbilityData {
    Ability getActiveAbility();
    void setActiveAbility(Ability ability);

    int getAbilityCooldown();
    void setAbilityCooldown(int cooldown);
    void decreaseAbilityCooldown();


    Ability[] getAbilities();

    void setAlignment(String alignment);
    String getAlignment();
}
