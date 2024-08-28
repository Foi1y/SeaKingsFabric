package net.foi1y.seakings.entity.client.armor.Models;

import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.item.custom.ArmorItems.ShanksArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class ShanksArmorModel extends GeoModel<ShanksArmorItem> {
    @Override
    public Identifier getModelResource(ShanksArmorItem animatable) {
        return new Identifier(SeaKingsMod.MOD_ID, "geo/item/armor/shanks.geo.json");
    }

    @Override
    public Identifier getTextureResource(ShanksArmorItem animatable) {
        return new Identifier(SeaKingsMod.MOD_ID, "textures/item/armor/shanks.png");
    }

    @Override
    public Identifier getAnimationResource(ShanksArmorItem animatable) {
        return null;
    }
}
