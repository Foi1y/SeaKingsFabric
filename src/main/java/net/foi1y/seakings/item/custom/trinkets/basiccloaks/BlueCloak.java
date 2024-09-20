package net.foi1y.seakings.item.custom.trinkets.basiccloaks;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.item.custom.ArmorItems.BlueCloakArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class BlueCloak extends GeoModel<BlueCloakArmorItem> {
    @Override
    public Identifier getModelResource(BlueCloakArmorItem animatable) {
        return new Identifier(SeaKingsMod.MOD_ID, "geo/item/armor/cloaksleeved.geo.json");
    }

    @Override
    public Identifier getTextureResource(BlueCloakArmorItem animatable) {
        return new Identifier(SeaKingsMod.MOD_ID, "textures/entity/trinket/bluecloak.png");
    }

    @Override
    public Identifier getAnimationResource(BlueCloakArmorItem animatable) {
        return null;
    }

    // You can add any additional logic if necessary
}
