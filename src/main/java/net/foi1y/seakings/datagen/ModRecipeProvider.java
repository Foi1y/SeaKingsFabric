package net.foi1y.seakings.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.foi1y.seakings.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    //private static final List<ItemConvertible> ORENAME_SMELTABLES = List.of(ModItems.RAW_ORE, ModBlocks.ORE_BLOCK);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //offerSmelting(exporter, ORENAME_SMELTABLES, RecipeCategory.MISC, ModItems.RAW_ORE,
        // 0.7f, 200, "group");
        // Experience Cooking Time Group
        //offerBlasting(exporter, ORENAME_SMELTABLES, RecipeCategory.MISC, ModItems.RAW_ORE,
        // 0.7f, 100, "group");

        offerStonecuttingRecipe(exporter,
                RecipeCategory.MISC,
                ModItems.WHITEFABRIC, // Output
                Blocks.WHITE_WOOL,
                4); // Input


        // offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ORE_INGOT, RecipeCategory.DECORATIONS,
            // ModBlocks.INGOT_BLOCK);
    }
}
