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
        // Armour
        itemModelGenerator.register(ModItems.STRAW_HAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PRELUFFYCHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PRELUFFYLEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.PRELUFFYBOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.PREZOROHELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PREZOROCHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PREZOROLEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.PREZOROBOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.PREROGERHELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PREROGERCHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PREROGERLEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.PREROGERBOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.BUGGY_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUGGY_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUGGY_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUGGY_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.SHANKS_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHANKS_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHANKS_BOOTS, Models.GENERATED);

        // Templates
        itemModelGenerator.register(ModItems.SWORD_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUTLASSBLADETEMPLATE, Models.GENERATED);

        // Cloaks
        itemModelGenerator.register(ModItems.BUGGY_CLOAK, Models.GENERATED);
    }
}