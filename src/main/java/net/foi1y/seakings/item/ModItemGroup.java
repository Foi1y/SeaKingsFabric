package net.foi1y.seakings.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MISC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SeaKingsMod.MOD_ID, "misc_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.misc_group"))
                    .icon(() -> new ItemStack(ModItems.DONUT)).entries((displayContext, entries) -> {
                    entries.add(ModItems.BLUE_DONUT);
                    entries.add(ModItems.DONUT);

                    entries.add(ModBlocks.RAWSEAPRISONSTONE);
                    entries.add(ModBlocks.SEAPRISONSTONE);

                    }).build());

    public static final ItemGroup FRUITS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SeaKingsMod.MOD_ID, "fruits_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fruits_group"))
                    .icon(() -> new ItemStack(ModItems.DONUT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BLUE_DONUT);
                        entries.add(ModItems.DONUT);

                    }).build());

    public static final ItemGroup WEAPONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SeaKingsMod.MOD_ID, "weapons_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.weapons_group"))
                    .icon(() -> new ItemStack(ModItems.CUTLASS)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CUTLASS);
                    }).build());

    public static void registerItemGroups(){

    }
}
