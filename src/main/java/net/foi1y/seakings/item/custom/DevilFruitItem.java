package net.foi1y.seakings.item.custom;

import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.impl.util.log.Log;
import net.foi1y.seakings.SeaKingsMod;
import net.minecraft.client.MinecraftClient;
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
            String fruitname = "gomu";

            return user.eatFood(world, stack);
        }
        return stack;
    }
}