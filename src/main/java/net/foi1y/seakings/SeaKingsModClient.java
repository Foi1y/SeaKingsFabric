package net.foi1y.seakings;


import dev.emi.trinkets.api.client.TrinketRenderer;
import dev.emi.trinkets.api.client.TrinketRendererRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.foi1y.seakings.item.ModItems;

public class SeaKingsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TrinketRendererRegistry.registerRenderer(ModItems.BASIC_CLOAK, (TrinketRenderer) ModItems.BASIC_CLOAK);
    }
}