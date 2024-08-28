package net.foi1y.seakings.entity.client.armor.Renders;

import net.foi1y.seakings.entity.client.armor.Models.ShanksArmorModel;
import net.foi1y.seakings.item.custom.ArmorItems.ShanksArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;


public final class ShanksArmorRenderer extends GeoArmorRenderer<ShanksArmorItem> {

    public ShanksArmorRenderer() {
        super(new ShanksArmorModel()); // 'location' as item/armor/example armor in the assets folders.

    }
}

