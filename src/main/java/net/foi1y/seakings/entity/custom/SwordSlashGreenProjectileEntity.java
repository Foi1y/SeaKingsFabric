package net.foi1y.seakings.entity.custom;

import net.foi1y.seakings.block.ModBlocks;
import net.foi1y.seakings.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

public class SwordSlashGreenProjectileEntity extends ThrownItemEntity {
    public SwordSlashGreenProjectileEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public SwordSlashGreenProjectileEntity(LivingEntity livingentity, World world) {
        super(ModEntities.SWORD_SLASH_GREEN_PROJECTILE, livingentity, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.BLUE_DONUT;
    }

    @Override
    public Packet<ClientPlayPacketListener> createSpawnPacket() {
        return new EntitySpawnS2CPacket(this);
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        if (!this.getWorld().isClient()) {
            this.getWorld().sendEntityStatus(this, (byte) 3);
        }
        super.onBlockHit(blockHitResult);
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        if (!this.getWorld().isClient()) {
            // Get the entity that was hit
            LivingEntity targetEntity = (LivingEntity) entityHitResult.getEntity();

            // Define the amount of damage you want to deal
            float damageAmount = 5.0f; // Change this value as needed

            // Apply the damage
            DamageSources DamageSource = null;
            targetEntity.damage(DamageSource.thrown(this, this.getOwner()), damageAmount);

            // Optionally, you can add additional effects or status updates here
        }
    }
}
