package net.foi1y.seakings.item;

import com.terraformersmc.modmenu.util.mod.Mod;
import dev.emi.trinkets.TrinketSlot;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.*;

import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.block.ModBlocks;
import net.foi1y.seakings.config.SeaKings;
import net.foi1y.seakings.config.SeaKingsConfigModel;
import net.foi1y.seakings.entity.custom.ModEntities;
import net.foi1y.seakings.item.custom.ArmorItems.*;
import net.foi1y.seakings.item.custom.devilFruits.*;
import net.foi1y.seakings.item.custom.swordslashitem;
import net.foi1y.seakings.item.custom.trinkets.basiccloaks.*;

import net.foi1y.seakings.item.custom.trinkets.sheaths.SheathOneSword;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static net.foi1y.seakings.SeaKingsMod.CONFIG;


public class ModItems {
    public static final Item DONUT = registerItem("donut",
            new swordslashitem(new FabricItemSettings()));
    public static final Item BLUE_DONUT = registerItem("blue_donut",
            new Item(new FabricItemSettings()));
    // Templates
    public static final Item SWORD_TEMPLATE = registerItem("sword_template",
            new Item(new FabricItemSettings()));
    public static final Item CUTLASSBLADETEMPLATE = registerItem("cutlassbladetemplate",
            new Item(new FabricItemSettings()));

    // Entity Eggs
    public static final Item CIVILIAN_SPAWN_EGG = registerItem("civilian_spawn_egg",
            new SpawnEggItem(ModEntities.CIVILIAN, 0xD57536, 0x1D0D00, new FabricItemSettings()));
    // # = 0x
    // Anything past 0x is Hexcode
    // First is Main
    // Second is Extra

    // Ancient Books
    public static final Item ANCIENT_BOOK1 = registerItem("ancient_book1",
            new Item(new FabricItemSettings()));
    public static final Item ANCIENT_BOOK2 = registerItem("ancient_book2",
            new Item(new FabricItemSettings()));
    public static final Item ANCIENT_BOOK3 = registerItem("ancient_book3",
            new Item(new FabricItemSettings()));

    // Fabrics

    public static final Item WHITEFABRIC = registerItem("whitefabric",
            new Item(new FabricItemSettings()));
    public static final Item BLUEFABRIC = registerItem("bluefabric",
            new Item(new FabricItemSettings()));
    public static final Item LIGHTBLUEFABRIC = registerItem("lightbluefabric",
            new Item(new FabricItemSettings()));
    public static final Item CYANFABRIC = registerItem("cyanfabric",
            new Item(new FabricItemSettings()));
    public static final Item PINKFABRIC = registerItem("pinkfabric",
            new Item(new FabricItemSettings()));
    public static final Item PURPLEFABRIC = registerItem("purplefabric",
            new Item(new FabricItemSettings()));
    public static final Item MAGENTAFABRIC = registerItem("magentafabric",
            new Item(new FabricItemSettings()));
    public static final Item YELLOWFABRIC = registerItem("yellowfabric",
            new Item(new FabricItemSettings()));
    public static final Item REDFABRIC = registerItem("redfabric",
            new Item(new FabricItemSettings()));
    public static final Item GREENFABRIC = registerItem("greenfabric",
            new Item(new FabricItemSettings()));
    public static final Item ORANGEFABRIC = registerItem("orangefabric",
            new Item(new FabricItemSettings()));
    public static final Item LIMEFABRIC = registerItem("limefabric",
            new Item(new FabricItemSettings()));
    public static final Item LIGHTGREYFABRIC = registerItem("lightgreyfabric",
            new Item(new FabricItemSettings()));
    public static final Item GREYFABRIC = registerItem("greyfabric",
            new Item(new FabricItemSettings()));
    public static final Item BLACKFABRIC = registerItem("blackfabric",
            new Item(new FabricItemSettings()));
    public static final Item BROWNFABRIC = registerItem("brownfabric",
            new Item(new FabricItemSettings()));


    // Swords

    public static final Item CUTLASS = registerItem("cutlass",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item ACE = registerItem("ace",
            new SwordItem(ModToolMaterial.KATANA, 3, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§5§l§oThe Weapon of the King of the Pirates."));
                    tooltip.add(Text.literal("§c§lSupreme Grade Blade"));
                    tooltip.add(Text.literal("§8§l§oBlack Blade"));
                }
    });
    // Supreme
    public static final Item GRYPHON = registerItem("gryphon",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§5§l§oThe Weapon of the Captain of the Red Hair Pirates."));
                    tooltip.add(Text.literal("§c§lSupreme Grade Blade"));
                }
            });
    public static final Item HADES = registerItem("hades",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§5§l§oThe Weapon of the Dark Prince Rayleigh."));
                    tooltip.add(Text.literal("§c§lSupreme Grade Blade"));
                }
            });
    public static final Item SHODAI_KITETSU = registerItem("shodai_kitetsu",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§5§l§oOne of the Famed Kitetsu Blades."));
                    tooltip.add(Text.literal("§c§lSupreme Grade Blade"));
                }
            });
    public static final Item YORU = registerItem("yoru",
            new SwordItem(ModToolMaterial.KATANA, 3, -3.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§5§l§oMihawk's Great Sword"));
                    tooltip.add(Text.literal("§c§lSupreme Grade Blade"));
                    tooltip.add(Text.literal("§8§l§oBlack Blade"));
                }
            });
    public static final Item NAPOLEAN = registerItem("napolean_blade",
            new SwordItem(ModToolMaterial.KATANA, 3, -3.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§5§l§oBig Mom's Cutlass Sword"));
                    tooltip.add(Text.literal("§c§lSupreme Grade Blade"));
                    tooltip.add(Text.literal("§8§l§oCursed Blade"));
                }
            });
    public static final Item MURAKUMOGIRI = registerItem("murakumogiri",
            new SwordItem(ModToolMaterial.KATANA, 3, -3.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§5§l§oWhitebeards Naginata"));
                    tooltip.add(Text.literal("§c§lSupreme Grade Blade"));
                }
            });

    // Great Grade Blades
    public static final Item AMENOHABAKIRI = registerItem("amenohabakiri",
            new SwordItem(ModToolMaterial.KATANA, 2, -2f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§5§l§oLord Odens Legendary Sword"));
                    tooltip.add(Text.literal("§3§lGreat Grade Blade"));
                }
            });
    public static final Item ENMA = registerItem("enma",
            new SwordItem(ModToolMaterial.KATANA, 2, -2f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§5§l§oLord Odens Legendary Sword"));
                    tooltip.add(Text.literal("§3§lGreat Grade Blade"));
                }
            });
    public static final Item SOULCANE = registerItem("soulcane",
            new SwordItem(ModToolMaterial.KATANA, 2, -2f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§5§l§oBrooks Cane Blade"));
                    tooltip.add(Text.literal("§3§lGreat Grade Blade"));
                }
            });
    public static final Item SHUSUI = registerItem("shusui",
            new SwordItem(ModToolMaterial.KATANA, 3, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§6§l§oThe Treasure of Wano"));
                    tooltip.add(Text.literal("§3§lGreat Grade Blade"));
                    tooltip.add(Text.literal("§8§l§oBlack Blade"));
                }
            });
    public static final Item MOGURA = registerItem("mogura",
            new SwordItem(ModToolMaterial.KATANA, 3, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§d§l§oKatakuri's Trident"));
                    tooltip.add(Text.literal("§3§lGreat Grade Blade"));
                }
            });
    public static final Item WADO_ICHIMONJI = registerItem("wado_ichimonji",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§5§l§oA Weapon of Roronoa Zoro"));
                    tooltip.add(Text.literal("§3§lGreat Grade Blade"));
                }
            });
    public static final Item RAIU = registerItem("raiu",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§4§l§oShiryus Sword"));
                    tooltip.add(Text.literal("§3§lGreat Grade Blade"));
                }
            });
    public static final Item MINAKANUSHI = registerItem("minakanushi",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§5§l§oGravity Blade"));
                    tooltip.add(Text.literal("§3§lGreat Grade Blade"));
                }
            });
    public static final Item PUNISHERS = registerItem("punishers",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§f§l§oKillers Scythes"));
                    tooltip.add(Text.literal("§3§lGreat Grade Blade"));
                }
            });
    public static final Item DURANDAL = registerItem("durandal",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§e§l§oRapier of Cavendish"));
                    tooltip.add(Text.literal("§3§lGreat Grade Blade"));
                }
            });
    public static final Item SHIRAUO = registerItem("shirauo",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§d§l§o``Fish Sword`` - Foi1y"));
                    tooltip.add(Text.literal("§3§lGreat Grade Blade"));
                }
            });
    public static final Item PRETZEL = registerItem("pretzel",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§a§l§oI wonder if its Edible."));
                    tooltip.add(Text.literal("§3§lGreat Grade Blade"));
                }
            });
    public static final Item ATHENA = registerItem("athena",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§5§l§oThe Weapon of the Dark Prince Rayleigh"));
                    tooltip.add(Text.literal("§3§lGreat Grade Blade"));
                }
            });
    public static final Item FLOWERSWORDS = registerItem("flowerswords",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§3§lGreat Grade Blade"));
                }
            });
    public static final Item SUKESAN = registerItem("sukesan",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§c§l§oWeapon/s of Kin'emon."));
                    tooltip.add(Text.literal("§3§lGreat Grade Blade"));
                }
            });
    public static final Item NINDAI_KITETSU = registerItem("nindai_kitetsu",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§5§l§oOne of the Famed Kitetsu Blades."));
                    tooltip.add(Text.literal("§3§lGreat Grade Blade"));
                }
            });

    // Skillful Grade Blades
    public static final Item YUBASHIRI = registerItem("yubashiri",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§5§l§oA Weapon of Roronoa Zoro"));
                    tooltip.add(Text.literal("§9§lSkillful Grade Blade"));
                }
            });
    // Grade Blades
    public static final Item SANDAI_KITETSU = registerItem("sandai_kitetsu",
            new SwordItem(ModToolMaterial.KATANA, 3, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.literal("§5§l§oA Weapon of Roronoa Zoro"));
                    tooltip.add(Text.literal("§7§lGrade Blade"));
                    tooltip.add(Text.literal("§8§l§oCursed Blade"));
                }
            });
    public static final Item IRONKATANA = registerItem("ironkatana",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item GOLDKATANA = registerItem("goldkatana",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item DIAMONDKATANA = registerItem("diamondkatana",
            new SwordItem(ModToolMaterial.KATANA, 3, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item NETHERITEKATANA = registerItem("netheritekatana",
            new SwordItem(ModToolMaterial.KATANA, 2, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item BUGGYDAGGER = registerItem("buggydagger",
            new SwordItem(ModToolMaterial.KATANA, 1, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item SCYTHE = registerItem("scythe",
            new SwordItem(ModToolMaterial.KATANA, 3, -3f, new FabricItemSettings().maxCount(1)));

    // Armours

    public static final Item PREZOROHELMET = registerItem("prezorohelmet",
            new PreFAZoroArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.HELMET, new FabricItemSettings().maxCount(1)));
    public static final Item PREZOROCHESTPLATE = registerItem("prezorochestplate",
            new PreFAZoroArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxCount(1)));
    public static final Item PREZOROLEGGINGS = registerItem("prezoroleggings",
            new PreFAZoroArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxCount(1)));
    public static final Item PREZOROBOOTS = registerItem("prezoroboots",
            new PreFAZoroArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.BOOTS, new FabricItemSettings().maxCount(1)));
    public static final Item PREROGERHELMET = registerItem("prerogerhelmet",
            new RogerFAArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.HELMET, new FabricItemSettings().maxCount(1)));
    public static final Item PREROGERCHESTPLATE = registerItem("prerogerchestplate",
            new RogerFAArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxCount(1)));
    public static final Item PREROGERLEGGINGS = registerItem("prerogerleggings",
            new RogerFAArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxCount(1)));
    public static final Item PREROGERBOOTS = registerItem("prerogerboots",
            new RogerFAArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.BOOTS, new FabricItemSettings().maxCount(1)));
    public static final Item STRAW_HAT = registerItem("straw_hat",
            new PreLuffyArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.HELMET, new FabricItemSettings().maxCount(1)));
    public static final Item PRELUFFYCHESTPLATE = registerItem("preluffychestplate",
            new PreLuffyArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxCount(1)));
    public static final Item PRELUFFYLEGGINGS = registerItem("preluffyleggings",
            new PreLuffyArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxCount(1)));
    public static final Item PRELUFFYBOOTS = registerItem("preluffyboots",
            new PreLuffyArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.BOOTS, new FabricItemSettings().maxCount(1)));
    public static final Item SHANKS_CHESTPLATE = registerItem("shanks_chestplate",
            new ShanksArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxCount(1)));
    public static final Item SHANKS_LEGGINGS = registerItem("shanks_leggings",
            new ShanksArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxCount(1)));
    public static final Item SHANKS_BOOTS = registerItem("shanks_boots",
            new ShanksArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.BOOTS, new FabricItemSettings().maxCount(1)));
    public static final Item BUGGY_HELMET = registerItem("buggy_helmet",
            new BuggyArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.HELMET, new FabricItemSettings().maxCount(1)));
    public static final Item BUGGY_CHESTPLATE = registerItem("buggy_chestplate",
            new BuggyArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxCount(1)));
    public static final Item BUGGY_LEGGINGS = registerItem("buggy_leggings",
            new BuggyArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxCount(1)));
    public static final Item BUGGY_BOOTS = registerItem("buggy_boots",
            new BuggyArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.BOOTS, new FabricItemSettings().maxCount(1)));

    // Cloaks
    public static final Item WHITE_CLOAK = registerItem("whitecloak",
            new WhiteCloak(new Item.Settings().maxCount(1)));
    public static final Item BLUE_CLOAK = registerItem("bluecloak",
            new BlueCloakArmorItem(ModArmorMaterials.SK_ARMOR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxCount(1)));
    public static final Item BUGGY_CLOAK = registerItem("buggycloak",
            new BuggyCloak(new Item.Settings().maxCount(1)));

    // Sheaths
    public static final Item ONESWORDSHEATH = registerItem("oneswordsheath",
            new SheathOneSword(new Item.Settings().maxCount(1)));
    // Devil Fruits
    public static final Item GOMU = registerItem("gomu",
            new gomuFruit(new FabricItemSettings().food(ModFoodComponents.DEVILFRUIT).maxCount(1)) {
                @Override
                public Text getName(ItemStack stack) {
                    if (localizedNames) {
                        return Text.translatable("gum.english");
                    }
                    return Text.translatable("gum.japanese");
                }
            });
    static boolean localizedNames = CONFIG.localizedNames();


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
        entries.add(WADO_ICHIMONJI);
    }

    public static void registerModItems(){
        SeaKingsMod.LOGGER.info(SeaKingsMod.NAME + " has registered its items.");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::itemGroupIngredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::naturalGroupIngredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::combatGroupIngredients);
    }
}