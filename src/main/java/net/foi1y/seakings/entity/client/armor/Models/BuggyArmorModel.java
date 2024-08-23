package net.foi1y.seakings.entity.client.armor.Models;

import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.item.custom.ArmorItems.BuggyArmorItem;
import net.foi1y.seakings.item.custom.ArmorItems.RogerFAArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class BuggyArmorModel extends GeoModel<BuggyArmorItem> {
    @Override
    public Identifier getModelResource(BuggyArmorItem animatable) {
        return new Identifier(SeaKingsMod.MOD_ID, "geo/item/armor/fabuggy.geo.json");
    }

    @Override
    public Identifier getTextureResource(BuggyArmorItem animatable) {
        return new Identifier(SeaKingsMod.MOD_ID, "textures/item/armor/fabuggy.png");
    }
    @Override
    public Identifier getAnimationResource(BuggyArmorItem animatable) {
        return null;
    }
}
