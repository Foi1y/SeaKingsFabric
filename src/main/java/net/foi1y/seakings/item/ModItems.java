package net.foi1y.seakings.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.*;

import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.block.ModBlocks;
import net.foi1y.seakings.item.custom.DevilFruitItem;

import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DONUT = registerItem("donut",
            new Item(new FabricItemSettings()));
    public static final Item BLUE_DONUT = registerItem("blue_donut",
            new Item(new FabricItemSettings()));
    public static final Item CUTLASS = registerItem("cutlass",
            new Item(new FabricItemSettings()));
    public static final Item MARINEHELMET = registerItem("marinehelmet",
            new ArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item MARINECHESTPLATE = registerItem("marinechestplate",
            new ArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item MARINELEGGINGS = registerItem("marineleggings",
            new ArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item MARINEBOOTS = registerItem("marineboots",
            new ArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item GOMU = registerItem("gomu",
            new DevilFruitItem(new FabricItemSettings().food(ModFoodComponents.DEVILFRUIT)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SeaKingsMod.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        // Food & Drinks
        entries.add(DONUT);
        entries.add(BLUE_DONUT);

    }

    private static void naturalGroupIngredients(FabricItemGroupEntries entries) {
        // Dirt Stone Etc
        entries.add(ModBlocks.SEAPRISONSTONE);
        entries.add(ModBlocks.RAWSEAPRISONSTONE);

    }

    private static void combatGroupIngredients(FabricItemGroupEntries entries) {
        // Combat Tab
        entries.add(CUTLASS);

    }

    public static void registerModItems(){
        SeaKingsMod.LOGGER.info(SeaKingsMod.NAME + " has registered its items.");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::itemGroupIngredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::naturalGroupIngredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::combatGroupIngredients);
    }
}