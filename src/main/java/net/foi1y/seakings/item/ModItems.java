package net.foi1y.seakings.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DONUT = registerItem("donut",
            new Item(new FabricItemSettings()));
    public static final Item BLUE_DONUT = registerItem("blue_donut",
            new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SeaKingsMod.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(DONUT);
        entries.add(BLUE_DONUT);

    }

    private static void naturalGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.SEAPRISONSTONE);
        entries.add(ModBlocks.RAWSEAPRISONSTONE);

    }

    public static void registerModItems(){
        SeaKingsMod.LOGGER.info("Registering Mod Items for " + SeaKingsMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::itemGroupIngredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::naturalGroupIngredients);
    }
}
