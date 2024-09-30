package net.foi1y.seakings;

import eu.midnightdust.lib.config.MidnightConfig;

import net.fabricmc.api.ModInitializer;

import net.foi1y.seakings.block.ModBlocks;
import net.foi1y.seakings.config.SeaKingsConfig;
import net.foi1y.seakings.item.*;

import net.foi1y.seakings.util.ModCustomTrades;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.*;

public class SeaKingsMod implements ModInitializer {

	public static final String MOD_ID = "seakings";

	public static final String NAME = "Sea Kings";

    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);



	@Override
	public void onInitialize() {

		/*
		HudRenderCallback.EVENT.register((drawContext, tickDelta) ->{
			assert MinecraftClient.getInstance().player != null;
			PlayerEntity player = MinecraftClient.getInstance().player;
			IPlayerAbilityData playerAbilityData = (IPlayerAbilityData) player;

			int height = MinecraftClient.getInstance().getWindow().getScaledHeight();
			int width = MinecraftClient.getInstance().getWindow().getScaledWidth();


			drawContext.drawTexture(playerAbilityData.getActiveAbility().getIcon(),width/2-528/6,height/2-528/6, 0,0,0,528/3,528/3,528/3,528/3);
		});
		*/

		// Initializing classes.
		SeaKingsMod.LOGGER.info(SeaKingsMod.NAME + " has registered its main class.");
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModCustomTrades.registerCustomTrades();
		ModItemGroup.initialize();



		// Config
		MidnightConfig.init(SeaKingsMod.MOD_ID, SeaKingsConfig.class);

	}
	
}