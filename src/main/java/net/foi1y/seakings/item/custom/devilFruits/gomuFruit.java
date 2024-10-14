package net.foi1y.seakings.item.custom.devilFruits;

import net.foi1y.seakings.Abilities.Ability;
import net.foi1y.seakings.Abilities.AbilityManager;
import net.foi1y.seakings.Abilities.Gomu.*;
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
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;

import static net.minecraft.entity.damage.DamageTypes.IN_WALL;

public class gomuFruit extends Item {
    public gomuFruit(Settings settings) {
        super(settings);
    }
    boolean fruit = true;
    String fruitName = "NULL";

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {

        // Checks if Player Entity
        if (user instanceof PlayerEntity player) {
            IPlayerAbilityData playerAbilityData = (IPlayerAbilityData) player;

            if (this.isFood() && !fruit) {
                fruitName = "Gomu Gomu no Mi";
                fruit = true;

                // Applys Abilities
                playerAbilityData.addAblilityUnlock(new Pistol());
                playerAbilityData.addAblilityUnlock(new PistolShot());
                playerAbilityData.addAblilityUnlock(new Rocket());
                playerAbilityData.addAblilityUnlock(new Bazooka());
                playerAbilityData.addAblilityUnlock(new Gattling());
                playerAbilityData.addAblilityUnlock(new Rifle());

                return user.eatFood(world, stack);
            } else {
                // Deal damage to player Killing them.
                fruit = false;
                fruitName = "";
            }
        }
        return stack;
    }
}