package net.foi1y.seakings.item;

import com.terraformersmc.modmenu.util.mod.Mod;
import io.wispforest.owo.itemgroup.Icon;
import io.wispforest.owo.itemgroup.OwoItemGroup;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.block.ModBlocks;

import net.minecraft.data.client.Models;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.foi1y.seakings.block.ModBlocks.*;
import static net.foi1y.seakings.item.ModItems.*;

public class ModItemGroup {

    public static final OwoItemGroup DEVILFRUITS = OwoItemGroup
            .builder(new Identifier(SeaKingsMod.MOD_ID, "devilfruits"), () -> Icon.of(GOMU))
            .initializer(owoItemGroup -> {
                // Sub-tab 1: Mythical Zoans
                owoItemGroup.addCustomTab(Icon.of(GOMU), "Mythical Zoan", (context, entries) -> {
                    entries.add(GOMU); // Add Gomu item
                    // Add more items to this sub-tab if needed
                }, true); // Change to your actual icon path

                // Sub-tab 2: Paramecia
                owoItemGroup.addCustomTab(Icon.of(DONUT), "Paramecia", (context, entries) -> {
                    entries.add(DONUT); // Add Gomu item
                    // Add more items to this sub-tab if needed
                }, true); // Change to your actual icon path
            })
            .customTexture(new Identifier(SeaKingsMod.MOD_ID, "textures/gui/tabs/group.png")) // Custom texture for the item group
            .tabStackHeight(4) // Set the tab stacking height
            .buttonStackHeight(4) // Set the button stacking height
            .disableDynamicTitle() // Make the title static
            .build();

    public static final OwoItemGroup MISC = OwoItemGroup
            .builder(new Identifier(SeaKingsMod.MOD_ID, "misc"), () -> Icon.of(PONEGLYPH))
            .initializer(owoItemGroup -> {
                owoItemGroup.addCustomTab(Icon.of(PONEGLYPH), "generalmisc", (context, entries) -> {
                    entries.add(BLUE_DONUT);
                    entries.add(DONUT);
                    entries.add(PONEGLYPH);

                    entries.add(RAWSEAPRISONSTONE);
                    entries.add(SEAPRISONSTONE);
                    entries.add(MARINEBARREL);
                    // Add more items to this sub-tab if needed
                }, true); // Change to your actual icon path

                owoItemGroup.addCustomTab(Icon.of(WHITEFABRIC), "fabrics", (context, entries) -> {
                    entries.add(WHITEFABRIC);
                    entries.add(BLUEFABRIC);
                    entries.add(LIGHTBLUEFABRIC);
                    entries.add(MAGENTAFABRIC);
                    entries.add(PURPLEFABRIC);
                    entries.add(PINKFABRIC);
                    entries.add(REDFABRIC);
                    entries.add(BLACKFABRIC);
                    entries.add(GREENFABRIC);
                    entries.add(LIMEFABRIC);
                    entries.add(GREYFABRIC);
                    entries.add(LIGHTGREYFABRIC);
                    entries.add(ORANGEFABRIC);
                    entries.add(BROWNFABRIC);
                    entries.add(YELLOWFABRIC);
                    entries.add(CYANFABRIC);
                    // Add more items to this sub-tab if needed
                }, true); // Change to your actual icon path
            })
            .customTexture(new Identifier(SeaKingsMod.MOD_ID, "textures/gui/tabs/group.png")) // Custom texture for the item group
            .tabStackHeight(4) // Set the tab stacking height
            .buttonStackHeight(4) // Set the button stacking height
            .disableDynamicTitle() // Make the title static
            .build();

    public static final OwoItemGroup WEAPONS = OwoItemGroup
            .builder(new Identifier(SeaKingsMod.MOD_ID, "weapons"), () -> Icon.of(GOMU))
            .initializer(owoItemGroup -> {
                owoItemGroup.addCustomTab(Icon.of(SCYTHE), "ungraded", (context, entries) -> {
                    entries.add(SCYTHE);
                    entries.add(CUTLASS);
                    entries.add(IRONKATANA);
                    entries.add(GOLDKATANA);
                    entries.add(DIAMONDKATANA);
                    entries.add(NETHERITEKATANA);
                }, true); // Change to your actual icon path
                owoItemGroup.addCustomTab(Icon.of(YORU), "supreme", (context, entries) -> {
                    entries.add(YORU);
                    entries.add(MURAKUMOGIRI);
                    entries.add(ACE);
                    entries.add(GRYPHON);
                    entries.add(NAPOLEAN);
                }, true); // Change to your actual icon path
                owoItemGroup.addCustomTab(Icon.of(WADO_ICHIMONJI), "great", (context, entries) -> {
                    entries.add(WADO_ICHIMONJI);
                    entries.add(SHUSUI);
                    entries.add(SOULCANE);
                    entries.add(MOGURA);
                }, true); // Change to your actual icon path
                owoItemGroup.addCustomTab(Icon.of(YUBASHIRI), "skillful", (context, entries) -> {
                    entries.add(YUBASHIRI);
                }, true); // Change to your actual icon path
                owoItemGroup.addCustomTab(Icon.of(SANDAI_KITETSU), "grade", (context, entries) -> {
                    entries.add(SANDAI_KITETSU);
                }, true); // Change to your actual icon path
            })
            .customTexture(new Identifier(SeaKingsMod.MOD_ID, "textures/gui/tabs/group.png")) // Custom texture for the item group
            .tabStackHeight(4) // Set the tab stacking height
            .buttonStackHeight(4) // Set the button stacking height
            .disableDynamicTitle() // Make the title static
            .build();
    public static final ItemGroup ARMOR_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SeaKingsMod.MOD_ID, "armor_group"),
            FabricItemGroup.builder().displayName(Text.translatable("seakings.itemgroup.armor_group"))
                    .icon(() -> new ItemStack(ModItems.STRAW_HAT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PREZOROHELMET);
                        entries.add(ModItems.PREZOROCHESTPLATE);
                        entries.add(ModItems.PREZOROLEGGINGS);
                        entries.add(ModItems.PREZOROBOOTS);

                        entries.add(ModItems.WHITE_CLOAK);

                        entries.add(ModItems.PREROGERHELMET);
                        entries.add(ModItems.PREROGERCHESTPLATE);
                        entries.add(ModItems.PREROGERLEGGINGS);
                        entries.add(ModItems.PREROGERBOOTS);

                        entries.add(ModItems.STRAW_HAT);
                        entries.add(ModItems.PRELUFFYCHESTPLATE);
                        entries.add(ModItems.PRELUFFYLEGGINGS);
                        entries.add(ModItems.PRELUFFYBOOTS);

                        entries.add(ModItems.BLUE_CLOAK);

                        entries.add(ModItems.SHANKS_CHESTPLATE);
                        entries.add(ModItems.SHANKS_LEGGINGS);
                        entries.add(ModItems.SHANKS_BOOTS);

                        entries.add(ModItems.BUGGY_HELMET);
                        entries.add(ModItems.BUGGY_CHESTPLATE);
                        entries.add(ModItems.BUGGY_LEGGINGS);
                        entries.add(ModItems.BUGGY_BOOTS);
                        entries.add(ModItems.BUGGY_CLOAK);


                    }).build());

    public static void initialize() {
        DEVILFRUITS.initialize();
        MISC.initialize();
        WEAPONS.initialize();
    }

    public static void registerItemGroups(){
        SeaKingsMod.LOGGER.info(SeaKingsMod.NAME + " has registered its itemgroups.");
    }
}