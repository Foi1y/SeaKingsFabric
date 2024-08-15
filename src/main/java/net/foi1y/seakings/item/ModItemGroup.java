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
            FabricItemGroup.builder().displayName(Text.translatable("seakings.itemgroup.fruits_group"))
                    .icon(() -> new ItemStack(ModItems.GOMU)).entries((displayContext, entries) -> {
                        entries.add(ModItems.GOMU);

                    }).build());

    public static final ItemGroup WEAPONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SeaKingsMod.MOD_ID, "weapons_group"),
            FabricItemGroup.builder().displayName(Text.translatable("seakings.itemgroup.weapons_group"))
                    .icon(() -> new ItemStack(ModItems.CUTLASS)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CUTLASS);
                        entries.add(ModItems.ACE);
                        entries.add(ModItems.GRYPHON);
                        entries.add(ModItems.KATANABASE);
                        entries.add(ModItems.WADO_ICHIMONJI);
                        entries.add(ModItems.DIAMONDKATANA);
                    }).build());

    public static final ItemGroup ARMOR_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SeaKingsMod.MOD_ID, "armor_group"),
            FabricItemGroup.builder().displayName(Text.translatable("seakings.itemgroup.armor_group"))
                    .icon(() -> new ItemStack(ModItems.STRAW_HAT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ZOROHELMET);
                        entries.add(ModItems.ZOROCHESTPLATE);
                        entries.add(ModItems.ZOROLEGGINGS);
                        entries.add(ModItems.ZOROBOOTS);

                        entries.add(ModItems.WHITE_CLOAK);

                        entries.add(ModItems.ROGERHELMET);
                        entries.add(ModItems.ROGERCHESTPLATE);
                        entries.add(ModItems.ROGERLEGGINGS);
                        entries.add(ModItems.ROGERBOOTS);

                        entries.add(ModItems.STRAW_HAT);
                        entries.add(ModItems.PRELUFFYCHESTPLATE);
                        entries.add(ModItems.PRELUFFYLEGGINGS);
                        entries.add(ModItems.PRELUFFYBOOTS);

                        entries.add(ModItems.BLUE_CLOAK);

                        entries.add(ModItems.MARINEUNIFORM_HELMET);
                        entries.add(ModItems.MARINEUNIFORM_CHESTPLATE);
                        entries.add(ModItems.MARINEUNIFORM_LEGGINGS);
                        entries.add(ModItems.MARINEUNIFORM_BOOTS);
                    }).build());

    public static final ItemGroup TRINKET_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SeaKingsMod.MOD_ID, "trinket_group"),
            FabricItemGroup.builder().displayName(Text.translatable("seakings.itemgroup.armor_group"))
                    .icon(() -> new ItemStack(ModItems.STRAW_HAT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ONESWORDSHEATH);
                    }).build());
    public static void registerItemGroups(){
        SeaKingsMod.LOGGER.info(SeaKingsMod.NAME + " has registered its itemgroups.");
    }
}