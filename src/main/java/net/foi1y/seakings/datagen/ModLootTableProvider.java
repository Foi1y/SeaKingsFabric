package net.foi1y.seakings.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //addDrop(Items);

        //addDrop(ModBlocks.ORE_BLOCK, copperLikeOreDrops(ModBlocks.ORE_BLOCK, ModItems.RAW_ORE);
    }

    //public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
    //return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
    //((LeafEntry.Builder) ItemEntry.builder(item).apply(SetCountLookFunction.builder(UniformLootNumberProvider.create(2.0f, 5.0f))))
    //.apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    // }
}
