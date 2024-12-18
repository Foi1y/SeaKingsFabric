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
                .add(ModItems.PREROGERCHESTPLATE)
                .add(ModItems.PREROGERLEGGINGS)
                .add(ModItems.PREROGERBOOTS)
                // Luffys Stuff
                .add(ModItems.STRAW_HAT)
                .add(ModItems.PRELUFFYCHESTPLATE)
                .add(ModItems.PRELUFFYLEGGINGS)
                .add(ModItems.PRELUFFYBOOTS)
                // Zoros Stuff
                .add(ModItems.PREZOROCHESTPLATE)
                .add(ModItems.PREZOROLEGGINGS)
                .add(ModItems.PREZOROBOOTS)
                // Shanks Stuff
                .add(ModItems.SHANKS_CHESTPLATE)
                .add(ModItems.SHANKS_LEGGINGS)
                .add(ModItems.SHANKS_BOOTS)
                // Buggy Stuff
                .add(ModItems.BUGGY_HELMET)
                .add(ModItems.BUGGY_CHESTPLATE)
                .add(ModItems.BUGGY_LEGGINGS)
                .add(ModItems.BUGGY_BOOTS);

        getOrCreateTagBuilder(ModTags.Items.POST_TIME_SKIP)
                .add(ModItems.STRAW_HAT)
                .add(ModItems.PRELUFFYCHESTPLATE)
                .add(ModItems.PRELUFFYLEGGINGS)
                .add(ModItems.PRELUFFYBOOTS);

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
        getOrCreateTagBuilder(ModTags.Items.FABRICS)
                .add(ModItems.WHITEFABRIC)
                .add(ModItems.BLUEFABRIC)
                .add(ModItems.LIGHTBLUEFABRIC)
                .add(ModItems.CYANFABRIC)
                .add(ModItems.BROWNFABRIC)
                .add(ModItems.ORANGEFABRIC)
                .add(ModItems.YELLOWFABRIC)
                .add(ModItems.GREENFABRIC)
                .add(ModItems.LIMEFABRIC)
                .add(ModItems.PINKFABRIC)
                .add(ModItems.MAGENTAFABRIC)
                .add(ModItems.PURPLEFABRIC)
                .add(ModItems.BLACKFABRIC)
                .add(ModItems.LIGHTGREYFABRIC)
                .add(ModItems.GREYFABRIC);
    }
}
