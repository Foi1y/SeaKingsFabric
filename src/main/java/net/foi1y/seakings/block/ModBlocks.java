package net.foi1y.seakings.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.foi1y.seakings.SeaKingsMod;

import net.foi1y.seakings.block.Custom.SwordStandBlock;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block SEAPRISONSTONE = registerBlock("seaprisonstone",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block RAWSEAPRISONSTONE = registerBlock("rawseaprisonstone",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block PONEGLYPH = registerBlock("poneglyph",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK)));

    public static final Block MARINEBARREL = registerBlock("marinebarrel",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.BARREL), UniformIntProvider.create(3, 6)));
    public static final Block SWORDSTANDBLOCK = registerBlock("swordstand",
            new SwordStandBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SeaKingsMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SeaKingsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        SeaKingsMod.LOGGER.info(SeaKingsMod.NAME + " has registered its blocks.");
    }
}