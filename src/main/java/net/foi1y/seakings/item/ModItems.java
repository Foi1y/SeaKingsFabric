package net.foi1y.seakings.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.*;

import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.block.ModBlocks;
import net.foi1y.seakings.item.custom.ArmorItems.MarineUniformArmorItem;
import net.foi1y.seakings.item.custom.ArmorItems.PreLuffyArmorItem;
import net.foi1y.seakings.item.custom.ArmorItems.RogerFAArmorItem;
import net.foi1y.seakings.item.custom.ArmorItems.PreFAZoroArmorItem;
import net.foi1y.seakings.item.custom.trinkets.basiccloaks.BlueCloak;
import net.foi1y.seakings.item.custom.trinkets.basiccloaks.WhiteCloak;
import net.foi1y.seakings.item.custom.DevilFruitItem;

import net.foi1y.seakings.item.custom.trinkets.sheaths.SheathOneSword;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DONUT = registerItem("donut",
            new Item(new FabricItemSettings()));
    public static final Item BLUE_DONUT = registerItem("blue_donut",
            new Item(new FabricItemSettings()));
    // Templates
    public static final Item SWORD_TEMPLATE = registerItem("sword_template",
            new Item(new FabricItemSettings()));
    public static final Item CUTLASSBLADETEMPLATE = registerItem("cutlassbladetemplate",
            new Item(new FabricItemSettings()));

    public static final Item CUTLASS = registerItem("cutlass",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.5f, new FabricItemSettings().maxCount(1)));
    public static final Item ACE = registerItem("ace",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.5f, new FabricItemSettings().maxCount(1)));
    public static final Item GRYPHON = registerItem("gryphon",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.5f, new FabricItemSettings().maxCount(1)));
    public static final Item KATANABASE = registerItem("katanabase",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.5f, new FabricItemSettings().maxCount(1)));
    public static final Item DIAMONDKATANA = registerItem("diamondkatana",
            new SwordItem(ModToolMaterial.KATANA, 3, -2.5f, new FabricItemSettings().maxCount(1)));
    public static final Item WADO_ICHIMONJI = registerItem("wado_ichimonji",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.5f, new FabricItemSettings().maxCount(1)));
    public static final Item SCYTHE = registerItem("scythe",
            new SwordItem(ModToolMaterial.KATANA, 3, -3f, new FabricItemSettings().maxCount(1)));

    public static final Item ZOROHELMET = registerItem("prezorohelmet",
            new PreFAZoroArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.HELMET, new FabricItemSettings().maxCount(1)));
    public static final Item ZOROCHESTPLATE = registerItem("prezorochestplate",
            new PreFAZoroArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxCount(1)));
    public static final Item ZOROLEGGINGS = registerItem("prezoroleggings",
            new PreFAZoroArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxCount(1)));
    public static final Item ZOROBOOTS = registerItem("prezoroboots",
            new PreFAZoroArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.BOOTS, new FabricItemSettings().maxCount(1)));
    public static final Item ROGERHELMET = registerItem("rogerhelmet",
            new RogerFAArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.HELMET, new FabricItemSettings().maxCount(1)));
    public static final Item ROGERCHESTPLATE = registerItem("rogerchestplate",
            new RogerFAArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxCount(1)));
    public static final Item ROGERLEGGINGS = registerItem("rogerleggings",
            new RogerFAArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxCount(1)));
    public static final Item ROGERBOOTS = registerItem("rogerboots",
            new RogerFAArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.BOOTS, new FabricItemSettings().maxCount(1)));
    public static final Item STRAW_HAT = registerItem("straw_hat",
            new PreLuffyArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.HELMET, new FabricItemSettings().maxCount(1)));
    public static final Item PRELUFFYCHESTPLATE = registerItem("preluffychestplate",
            new PreLuffyArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxCount(1)));
    public static final Item PRELUFFYLEGGINGS = registerItem("preluffyleggings",
            new PreLuffyArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxCount(1)));
    public static final Item PRELUFFYBOOTS = registerItem("preluffyboots",
            new PreLuffyArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.BOOTS, new FabricItemSettings().maxCount(1)));
    public static final Item MARINEUNIFORM_HELMET = registerItem("marineuniform_helmet",
            new MarineUniformArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.HELMET, new FabricItemSettings().maxCount(1)));
    public static final Item MARINEUNIFORM_CHESTPLATE = registerItem("marineuniform_chestplate",
            new MarineUniformArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxCount(1)));
    public static final Item MARINEUNIFORM_LEGGINGS = registerItem("marineuniform_leggings",
            new MarineUniformArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxCount(1)));
    public static final Item MARINEUNIFORM_BOOTS = registerItem("marineuniform_boots",
            new MarineUniformArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.BOOTS, new FabricItemSettings().maxCount(1)));

    // Cloaks
    public static final Item WHITE_CLOAK = registerItem("whitecloak",
            new WhiteCloak(new Item.Settings().maxCount(1)));
    public static final Item BLUE_CLOAK = registerItem("bluecloak",
            new BlueCloak(new Item.Settings().maxCount(1)));

    // Sheaths
    public static final Item ONESWORDSHEATH = registerItem("oneswordsheath",
            new SheathOneSword(new Item.Settings().maxCount(1)));
    // Devil Fruits
    public static final Item GOMU = registerItem("gomu",
            new DevilFruitItem(new FabricItemSettings().food(ModFoodComponents.DEVILFRUIT).maxCount(1)));



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
        entries.add(KATANABASE);
        entries.add(WADO_ICHIMONJI);
    }

    public static void registerModItems(){
        SeaKingsMod.LOGGER.info(SeaKingsMod.NAME + " has registered its items.");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::itemGroupIngredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::naturalGroupIngredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::combatGroupIngredients);
    }
}