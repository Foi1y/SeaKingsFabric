package net.foi1y.seakings.entity.client.armor.Models;

import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.item.custom.ArmorItems.PreFAZoroArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class PreZoroFAModel extends GeoModel<PreFAZoroArmorItem> {
    @Override
    public Identifier getModelResource(PreFAZoroArmorItem animatable) {
        return new Identifier(SeaKingsMod.MOD_ID, "geo/item/armor/fazoro.geo.json");
    }

    @Override
    public Identifier getTextureResource(PreFAZoroArmorItem animatable) {
        return new Identifier(SeaKingsMod.MOD_ID, "textures/item/armor/prezorofa.png");
    }
    @Override
    public Identifier getAnimationResource(PreFAZoroArmorItem animatable) {
        return null;
    }
}
