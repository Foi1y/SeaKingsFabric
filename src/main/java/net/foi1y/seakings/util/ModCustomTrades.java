package net.foi1y.seakings.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.foi1y.seakings.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(Items.GOLD_INGOT, 1),
                            new ItemStack(ModItems.SWORD_TEMPLATE, 1),
                            6, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(Items.GOLD_INGOT, 1),
                            new ItemStack(ModItems.CUTLASSBLADETEMPLATE, 1),
                            6, 5, 0.05f));
                });
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModItems.WADO_ICHIMONJI, 1),
                    6, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 16),
                            new ItemStack(ModItems.SCYTHE, 1),
                            6, 5, 0.05f));
                });
    }
}
