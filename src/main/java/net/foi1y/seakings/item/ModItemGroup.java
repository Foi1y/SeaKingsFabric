package net.foi1y.seakings.item;

import com.terraformersmc.modmenu.util.mod.Mod;
import io.wispforest.owo.itemgroup.Icon;
import io.wispforest.owo.itemgroup.OwoItemGroup;

import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.block.ModBlocks;

import net.minecraft.data.client.Models;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final OwoItemGroup DEVILFRUITS = OwoItemGroup
            .builder(new Identifier(SeaKingsMod.MOD_ID, "devilfruits"), () -> Icon.of(ModItems.GOMU))
            .initializer(owoItemGroup -> {
                // Sub-tab 1: Mythical Zoans
                owoItemGroup.addCustomTab(Icon.of(ModItems.GOMU), "Mythical Zoan", (context, entries) -> {
                    entries.add(ModItems.GOMU); // Add Gomu item
                    // Add more items to this sub-tab if needed
                }, true); // Change to your actual icon path

                // Sub-tab 2: Paramecia
                owoItemGroup.addCustomTab(Icon.of(ModItems.DONUT), "Paramecia", (context, entries) -> {
                    entries.add(ModItems.DONUT); // Add Gomu item
                    // Add more items to this sub-tab if needed
                }, true); // Change to your actual icon path
            })
            .customTexture(new Identifier(SeaKingsMod.MOD_ID, "textures/gui/tabs/group.png")) // Custom texture for the item group
            .tabStackHeight(4) // Set the tab stacking height
            .buttonStackHeight(4) // Set the button stacking height
            .disableDynamicTitle() // Make the title static
            .build();

 /*   public static final ItemGroup MISC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SeaKingsMod.MOD_ID, "misc_group"),
            FabricItemGroup.builder().displayName(Text.translatable("seakings.itemgroup.misc_group"))
                    .icon(() -> new ItemStack(ModItems.DONUT)).entries((displayContext, entries) -> {
                    entries.add(ModItems.BLUE_DONUT);
                    entries.add(ModItems.DONUT);
                    entries.add(ModBlocks.PONEGLYPH);

                    entries.add(ModBlocks.RAWSEAPRISONSTONE);
                    entries.add(ModBlocks.SEAPRISONSTONE);
                    entries.add(ModBlocks.MARINEBARREL);
                    entries.add(ModItems.WHITEFABRIC);
                    entries.add(ModItems.BLUEFABRIC);
                    entries.add(ModItems.LIGHTBLUEFABRIC);
                    entries.add(ModItems.MAGENTAFABRIC);
                    entries.add(ModItems.PURPLEFABRIC);
                    entries.add(ModItems.PINKFABRIC);
                    entries.add(ModItems.REDFABRIC);
                    entries.add(ModItems.BLACKFABRIC);
                    entries.add(ModItems.GREENFABRIC);
                    entries.add(ModItems.LIMEFABRIC);
                    entries.add(ModItems.GREYFABRIC);
                    entries.add(ModItems.LIGHTGREYFABRIC);
                    entries.add(ModItems.ORANGEFABRIC);
                    entries.add(ModItems.BROWNFABRIC);
                    entries.add(ModItems.YELLOWFABRIC);
                    entries.add(ModItems.CYANFABRIC);

                    }).build());

    public static final ItemGroup FRUITS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SeaKingsMod.MOD_ID, "foods_group"),
            FabricItemGroup.builder().displayName(Text.translatable("seakings.itemgroup.fruits_group"))
                    .icon(() -> new ItemStack(GOMU)).entries((displayContext, entries) -> {
                        entries.add(GOMU);

                    }).build());

    public static final ItemGroup WEAPONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SeaKingsMod.MOD_ID, "weapons_group"),
            FabricItemGroup.builder().displayName(Text.translatable("seakings.itemgroup.weapons_group"))
                    .icon(() -> new ItemStack(ModItems.CUTLASS)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CUTLASS);
                        entries.add(ModItems.ACE);
                        entries.add(ModItems.GRYPHON);
                        entries.add(ModItems.YORU);
                        entries.add(ModItems.WADO_ICHIMONJI);
                        entries.add(ModItems.SANDAI_KITETSU);
                        entries.add(ModItems.YUBASHIRI);
                        entries.add(ModItems.IRONKATANA);
                        entries.add(ModItems.GOLDKATANA);
                        entries.add(ModItems.DIAMONDKATANA);
                        entries.add(ModItems.NETHERITEKATANA);
                        entries.add(ModItems.BUGGYDAGGER);
                    }).build());

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
  */

    public static void initialize() {
        DEVILFRUITS.initialize();
    }

    public static void registerItemGroups(){
        SeaKingsMod.LOGGER.info(SeaKingsMod.NAME + " has registered its itemgroups.");
    }
}