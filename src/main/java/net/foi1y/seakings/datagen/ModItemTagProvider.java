package net.foi1y.seakings.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.foi1y.seakings.item.ModItems;
import net.foi1y.seakings.util.ModTags;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Items.SEAKING_ARMOR_TAG)
                // Rogers Stuff
                .add(ModItems.PREROGERHELMET)
                .add(ModItems.PREROGERCHESTPLATE)
                .add(ModItems.PREROGERLEGGINGS)
                .add(ModItems.PREROGERBOOTS)
                // Luffys Stuff
                .add(ModItems.STRAW_HAT)
                .add(ModItems.PRELUFFYCHESTPLATE)
                .add(ModItems.PRELUFFYLEGGINGS)
                .add(ModItems.PRELUFFYBOOTS)
                // Zoros Stuff
                .add(ModItems.PREZOROHELMET)
                .add(ModItems.PREZOROCHESTPLATE)
                .add(ModItems.PREZOROLEGGINGS)
                .add(ModItems.PREZOROBOOTS);

        getOrCreateTagBuilder(ModTags.Items.ONE_SWORD_STYLE)
                .add(ModItems.IRONKATANA)
                .add(ModItems.CUTLASS)
                .add(ModItems.WADO_ICHIMONJI);

        getOrCreateTagBuilder(ModTags.Items.TWO_SWORD_STYLE)
                .add(ModItems.IRONKATANA)
                .add(ModItems.CUTLASS)
                .add(ModItems.WADO_ICHIMONJI);
        getOrCreateTagBuilder(ModTags.Items.THREE_SWORD_STYLE)
                .add(ModItems.IRONKATANA)
                .add(ModItems.WADO_ICHIMONJI);
    }
}
