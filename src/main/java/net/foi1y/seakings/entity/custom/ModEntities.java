package net.foi1y.seakings.entity.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.foi1y.seakings.SeaKingsMod;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<SwordSlashGreenProjectileEntity> SWORD_SLASH_GREEN_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(SeaKingsMod.MOD_ID, "sword_slash_green_projectile"),
            FabricEntityTypeBuilder.<SwordSlashGreenProjectileEntity>create(SpawnGroup.MISC, SwordSlashGreenProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
}