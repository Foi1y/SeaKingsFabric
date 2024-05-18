package net.foi1y.seakings.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.world.World;

public class DevilFruitItem extends Item {
    public DevilFruitItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (this.isFood()) {
            boolean fruit = true;
            return user.eatFood(world, stack);
        }
        return stack;
    }
}