package net.foi1y.seakings.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<SwordStandBlockEntity> SWORD_STAND_BLOCK_ENTITY_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(SeaKingsMod.MOD_ID, "swordstand"),
                    FabricBlockEntityTypeBuilder.create(SwordStandBlockEntity::new,
                            ModBlocks.SWORDSTANDBLOCK).build());

    public static void registerBlockEntities() {
        SeaKingsMod.LOGGER.info("Registering Block Entities for " + SeaKingsMod.MOD_ID);
    }
}
