package net.foi1y.seakings.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.block.ModBlocks;

import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MISC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SeaKingsMod.MOD_ID, "misc_group"),
            FabricItemGroup.builder().displayName(Text.translatable("seakings.itemgroup.misc_group"))
                    .icon(() -> new ItemStack(ModItems.DONUT)).entries((displayContext, entries) -> {
                    entries.add(ModItems.BLUE_DONUT);
                    entries.add(ModItems.DONUT);

                    entries.add(ModBlocks.RAWSEAPRISONSTONE);
                    entries.add(ModBlocks.SEAPRISONSTONE);
                    entries.add(ModBlocks.MARINEBARREL);

                    }).build());

    public static final ItemGroup FRUITS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SeaKingsMod.MOD_ID, "foods_group"),
            FabricItemGroup.builder().displayName(Text.translatable("seakings.itemgroup.foods_group"))
                    .icon(() -> new ItemStack(ModItems.DONUT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BLUE_DONUT);
                        entries.add(ModItems.DONUT);

                    }).build());

    public static final ItemGroup WEAPONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SeaKingsMod.MOD_ID, "weapons_group"),
            FabricItemGroup.builder().displayName(Text.translatable("seakings.itemgroup.weapons_group"))
                    .icon(() -> new ItemStack(ModItems.CUTLASS)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CUTLASS);
                    }).build());

    public static final ItemGroup ARMOR_GROUO = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SeaKingsMod.MOD_ID, "armor_group"),
            FabricItemGroup.builder().displayName(Text.translatable("seakings.itemgroup.armor_group"))
                    .icon(() -> new ItemStack(ModItems.MARINEHELMET)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MARINEHELMET);
                        entries.add(ModItems.MARINECHESTPLATE);
                        entries.add(ModItems.MARINELEGGINGS);
                        entries.add(ModItems.MARINEBOOTS);
                    }).build());

    public static void registerItemGroups(){
        SeaKingsMod.LOGGER.info(SeaKingsMod.NAME + " has registered its itemgroups.");
    }
}