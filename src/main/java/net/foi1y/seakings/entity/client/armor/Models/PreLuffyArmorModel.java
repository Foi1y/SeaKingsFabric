package net.foi1y.seakings.entity.client.armor.Models;

import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.item.custom.ArmorItems.PreLuffyArmorItem;
import net.foi1y.seakings.util.ModTags;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class PreLuffyArmorModel extends GeoModel<PreLuffyArmorItem> {
    @Override
    public Identifier getModelResource(PreLuffyArmorItem animatable) {
        return new Identifier(SeaKingsMod.MOD_ID, "geo/item/armor/preluffy.geo.json");
    }

    @Override
    public Identifier getTextureResource(PreLuffyArmorItem animatable) {
        if (animatable.isIn(ModTags.Items.POST_TIME_SKIP)) {
            return new Identifier(SeaKingsMod.MOD_ID, "textures/item/armor/preluffy.png");
        } else {
            return new Identifier(SeaKingsMod.MOD_ID, "textures/item/armor/postluffy.png");
        }
    }
    @Override
    public Identifier getAnimationResource(PreLuffyArmorItem animatable) {
        return null;
    }
}
