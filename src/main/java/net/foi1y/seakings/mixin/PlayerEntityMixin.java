package net.foi1y.seakings.mixin;
import net.foi1y.seakings.Abilities.Ability;
import net.foi1y.seakings.Abilities.nullAbility;
import net.foi1y.seakings.IPlayerAbilityData;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin implements IPlayerAbilityData {

    @Unique
    private int activeAbilityNum = 0;
    @Unique
    private int[] cooldowns = new int[]{0,0,0,0,0,0,0,0};
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