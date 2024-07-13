package net.foi1y.seakings.entity.client.armor.Renders;

import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.entity.client.armor.Models.FARogerArmorModel;
import net.foi1y.seakings.item.custom.ArmorItems.RogerFAArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.example.item.GeckoArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;


public final class RogerFAArmorRenderer extends GeoArmorRenderer<RogerFAArmorItem> {

    public RogerFAArmorRenderer() {
        super(new FARogerArmorModel()); // 'location' as item/armor/example armor in the assets folders.

    }

}

