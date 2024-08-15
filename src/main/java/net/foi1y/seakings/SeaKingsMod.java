package net.foi1y.seakings;

import eu.midnightdust.lib.config.MidnightConfig;

import net.fabricmc.api.ModInitializer;

import net.foi1y.seakings.block.ModBlocks;
import net.foi1y.seakings.config.SeaKingsConfig;
import net.foi1y.seakings.item.*;

import net.foi1y.seakings.util.ModCustomTrades;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import org.slf4j.*;

public class SeaKingsMod implements ModInitializer {

	public static final String MOD_ID = "seakings";

	public static final String NAME = "Sea Kings";

    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
	//private static final Identifier INITIAL_SYNC = new Identifier("INITIAL_SYNC");
	public static Item  CLOAK;
	public static final Identifier hasFruit = new Identifier(MOD_ID,"has_fruit");
	public static final Identifier abilityLayout = new Identifier(MOD_ID,"ability_layout");


	@Override
	public void onInitialize() {

		// Initializing classes.
		SeaKingsMod.LOGGER.info(SeaKingsMod.NAME + " has registered its main class.");
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModCustomTrades.registerCustomTrades();

		// Config
		MidnightConfig.init(SeaKingsMod.MOD_ID, SeaKingsConfig.class);

	}
}