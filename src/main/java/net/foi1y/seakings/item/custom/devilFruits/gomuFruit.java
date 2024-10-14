package net.foi1y.seakings.item.custom.devilFruits;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.World;

import static net.minecraft.entity.damage.DamageTypes.IN_WALL;

public class gomuFruit extends Item {
    public gomuFruit(Settings settings) {
        super(settings);
    }
    boolean fruit = true;

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (this.isFood() && !fruit) {
            String fruitname = "gomu";

            return user.eatFood(world, stack);
        } else {
            // Deal damage to player Killing them.
        }
        return stack;
    }
}