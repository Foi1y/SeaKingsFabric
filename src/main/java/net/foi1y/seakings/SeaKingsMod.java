package net.foi1y.seakings;

import eu.midnightdust.lib.config.MidnightConfig;

import net.fabricmc.api.ModInitializer;

import net.foi1y.seakings.block.ModBlocks;
import net.foi1y.seakings.config.SeaKingsConfig;
import net.foi1y.seakings.item.*;

import net.minecraft.item.Item;
import org.slf4j.*;

public class SeaKingsMod implements ModInitializer {

	public static final String MOD_ID = "seakings";

	public static final String NAME = "Sea Kings";

    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
	public static Item  CLOAK;


	@Override
	public void onInitialize() {

		// Initializing classes.
		SeaKingsMod.LOGGER.info(SeaKingsMod.NAME + " has registered its main class.");
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		// Config
		MidnightConfig.init(SeaKingsMod.MOD_ID, SeaKingsConfig.class);
	}
}