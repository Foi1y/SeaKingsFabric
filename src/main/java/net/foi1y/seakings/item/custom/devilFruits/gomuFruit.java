package net.foi1y.seakings.item.custom.devilFruits;

import net.foi1y.seakings.Abilities.Ability;
import net.foi1y.seakings.Abilities.AbilityManager;
import net.foi1y.seakings.Abilities.Gomu.*;
import net.foi1y.seakings.Abilities.nullAbility;
import net.foi1y.seakings.IPlayerAbilityData;
import net.foi1y.seakings.mixin.PlayerEntityMixin;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import static net.minecraft.entity.damage.DamageTypes.GENERIC;
import static net.minecraft.entity.damage.DamageTypes.IN_WALL;

public class gomuFruit extends Item {
    public gomuFruit(Settings settings) {
        super(settings);
    }
    boolean fruit = false;
    String fruitName = "NULL";

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {

        // Checks if Player Entity
        if (user instanceof PlayerEntity player) {
            IPlayerAbilityData playerAbilityData = (IPlayerAbilityData) player;

            if (!fruit) {
                fruitName = ItemStack.NAME_KEY;
                fruit = true;
                Ability[] abilities = {
                        new Pistol(),
                        new PistolShot(),
                        new Rocket(),
                        new Bazooka(),
                        new Gattling(),
                        new Rifle()
                };
                    for (Ability ability : abilities) {
                        playerAbilityData.setUnlockedAbilities(new Vector<>(Arrays.asList(abilities)));
                        System.out.println("Applying ability: " + ability.getClass().getSimpleName());
                    }
            } else {
                fruit = false;
                fruitName = "";
                Ability[] abilities = {
                        new nullAbility(),
                        new nullAbility(),
                        new nullAbility(),
                        new nullAbility(),
                        new nullAbility(),
                        new nullAbility(),
                        new nullAbility(),
                        new nullAbility(),
                };

                for (Ability ability : abilities) {
                    playerAbilityData.setUnlockedAbilities(new Vector<>(Arrays.asList(abilities)));
                    System.out.println("Removing Abilities");
                }
                DamageSource damageSource = new DamageSource(
                        world.getRegistryManager()
                                .get(RegistryKeys.DAMAGE_TYPE)
                                .entryOf(GENERIC));
                player.damage(damageSource, player.getMaxHealth());
            }
            return user.eatFood(world, stack);
        }
        return stack;
    }
}