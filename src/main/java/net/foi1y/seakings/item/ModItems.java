package net.foi1y.seakings.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.*;

import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.block.ModBlocks;
import net.foi1y.seakings.item.custom.ArmorItems.PreLuffyArmorItem;
import net.foi1y.seakings.item.custom.ArmorItems.RogerFAArmorItem;
import net.foi1y.seakings.item.custom.ArmorItems.ZoroArmorItem;
import net.foi1y.seakings.item.custom.BasicCloak;
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
    public static final Item ZOROHELMET = registerItem("zorohelmet",
            new ZoroArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ZOROCHESTPLATE = registerItem("zorochestplate",
            new ZoroArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ZOROLEGGINGS = registerItem("zoroleggings",
            new ZoroArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ZOROBOOTS = registerItem("zoroboots",
            new ZoroArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item ROGERHELMET = registerItem("rogerhelmet",
            new RogerFAArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ROGERCHESTPLATE = registerItem("rogerchestplate",
            new RogerFAArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ROGERLEGGINGS = registerItem("rogerleggings",
            new RogerFAArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ROGERBOOTS = registerItem("rogerboots",
            new RogerFAArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item PRELUFFYHELMET = registerItem("preluffyhelmet",
            new PreLuffyArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PRELUFFYCHESTPLATE = registerItem("preluffychestplate",
            new PreLuffyArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item PRELUFFYLEGGINGS = registerItem("preluffyleggings",
            new PreLuffyArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item PRELUFFYBOOTS = registerItem("preluffyboots",
            new PreLuffyArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item BASIC_CLOAK = registerItem("basiccloak",
            new BasicCloak(new Item.Settings().maxCount(1)));

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
        entries.add(BASIC_CLOAK);
    }

    public static void registerModItems(){
        SeaKingsMod.LOGGER.info(SeaKingsMod.NAME + " has registered its items.");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::itemGroupIngredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::naturalGroupIngredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::combatGroupIngredients);
    }
}