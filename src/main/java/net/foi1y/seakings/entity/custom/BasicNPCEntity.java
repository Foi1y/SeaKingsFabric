package net.foi1y.seakings.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

public class BasicNPCEntity extends MobEntity {
    private final DefaultedList<ItemStack> armorItems;

    protected BasicNPCEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
        this.armorItems = DefaultedList.ofSize(4, ItemStack.EMPTY);
    }

    public boolean canTarget(EntityType<?> type) {
        if (getScoreboardTeam("Marine")) {
            return type != EntityType.PLAYER;
        } else {
            return type == EntityType.PLAYER;
        }
    }

    private boolean getScoreboardTeam(String marine) {
        return false;
    }
}

