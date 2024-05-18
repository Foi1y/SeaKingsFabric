package net.foi1y.seakings.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.foi1y.seakings.SeaKingsMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block SEAPRISONSTONE = registerBlock("seaprisonstone",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block RAWSEAPRISONSTONE = registerBlock("rawseaprisonstone",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));

    public static final Block MARINEBARREL = registerBlock("marinebarrel",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.BARREL), UniformIntProvider.create(3, 6)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SeaKingsMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SeaKingsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        SeaKingsMod.LOGGER.info("Registering Mod Blocks for" + SeaKingsMod.MOD_ID);
    }
}
