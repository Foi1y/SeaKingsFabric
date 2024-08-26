package net.foi1y.seakings;

import eu.midnightdust.lib.config.MidnightConfig;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.foi1y.seakings.Abilities.Ability;
import net.foi1y.seakings.block.ModBlocks;
import net.foi1y.seakings.config.SeaKingsConfig;
import net.foi1y.seakings.item.*;

import net.foi1y.seakings.util.ModCustomTrades;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.server.network.ServerPlayerEntity;
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

//		ClientTickEvents.START_WORLD_TICK.register((world) ->{
//			assert MinecraftClient.getInstance().player != null;
//			PlayerEntity player = MinecraftClient.getInstance().player;
//			IPlayerAbilityData playerAbilityData = (IPlayerAbilityData) player;
//
//			for (int i = 0; i < 8; i++) {
//
//				playerAbilityData.addAbility(new Ability("null", 0, new Identifier("seakings", "textures/gui/icons/null.png")) {
//					@Override
//					public void apply(ServerPlayerEntity player) {
//
//					}
//				});
//			}
//
//		});

//		HudRenderCallback.EVENT.register((drawContext, tickDelta) ->{
//			assert MinecraftClient.getInstance().player != null;
//			PlayerEntity player = MinecraftClient.getInstance().player;
//			IPlayerAbilityData playerAbilityData = (IPlayerAbilityData) player;
//
//			int height = MinecraftClient.getInstance().getWindow().getScaledHeight();
//			int width = MinecraftClient.getInstance().getWindow().getScaledWidth();
//
//
//			drawContext.drawTexture(playerAbilityData.getActiveAbility().getIcon(),width/2-528/6,height/2-528/6, 0,0,0,528/3,528/3,528/3,528/3);
//		});

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