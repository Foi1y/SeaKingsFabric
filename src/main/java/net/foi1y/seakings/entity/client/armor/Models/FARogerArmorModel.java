package net.foi1y.seakings.entity.client.armor.Models;

import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.item.custom.ArmorItems.PreFAZoroArmorItem;
import net.foi1y.seakings.item.custom.ArmorItems.RogerFAArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class FARogerArmorModel extends GeoModel<RogerFAArmorItem> {
    @Override
    public Identifier getModelResource(RogerFAArmorItem animatable) {
        return new Identifier(SeaKingsMod.MOD_ID, "geo/item/armor/prerogerfa.geo.json");
    }

    @Override
    public Identifier getTextureResource(RogerFAArmorItem animatable) {
        return new Identifier(SeaKingsMod.MOD_ID, "textures/item/armor/prerogerfa.png");
    }
    @Override
    public Identifier getAnimationResource(RogerFAArmorItem animatable) {
        return null;
    }
}
