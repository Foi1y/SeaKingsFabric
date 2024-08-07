package net.foi1y.seakings;

public interface IPlayerAbilityData {
    Ability getActiveAbility();
    void setActiveAbility(Ability ability);

    int getAbilityCooldown();
    void setAbilityCooldown(int cooldown);
    void decreaseAbilityCooldown();

    void addAbility(Ability ability);
    void removeAbility(Ability ability);
    Ability[] getAbilities();
    Ability getAbilityByNum(int number);
    void setAlignment(String alignment);
    String getAlignment();
}
