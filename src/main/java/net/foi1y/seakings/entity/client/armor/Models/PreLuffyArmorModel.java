package net.foi1y.seakings.entity.client.armor.Models;

import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.item.custom.ArmorItems.PreLuffyArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class PreLuffyArmorModel extends GeoModel<PreLuffyArmorItem> {
    @Override
    public Identifier getModelResource(PreLuffyArmorItem animatable) {
        return new Identifier(SeaKingsMod.MOD_ID, "geo/item/armor/luffy.geo.json");
    }

    @Override
    public Identifier getTextureResource(PreLuffyArmorItem animatable) {
        return new Identifier(SeaKingsMod.MOD_ID, "textures/item/armor/preluffy.png");
    }
    @Override
    public Identifier getAnimationResource(PreLuffyArmorItem animatable) {
        return null;
    }
}
