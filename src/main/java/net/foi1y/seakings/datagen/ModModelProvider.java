package net.foi1y.seakings.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.foi1y.seakings.item.ModItems;
import net.minecraft.data.client.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Luffy Armour
        itemModelGenerator.register(ModItems.STRAW_HAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PRELUFFYCHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PRELUFFYLEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.PRELUFFYBOOTS, Models.GENERATED);

        // Templates
        itemModelGenerator.register(ModItems.SWORD_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUTLASSBLADETEMPLATE, Models.GENERATED);
    }
}