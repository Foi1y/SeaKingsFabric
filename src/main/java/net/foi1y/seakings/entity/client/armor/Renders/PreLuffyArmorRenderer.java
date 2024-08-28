package net.foi1y.seakings.entity.client.armor.Renders;

import net.foi1y.seakings.entity.client.armor.Models.PreLuffyArmorModel;
import net.foi1y.seakings.item.custom.ArmorItems.PreLuffyArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;


public final class PreLuffyArmorRenderer extends GeoArmorRenderer<PreLuffyArmorItem> {

    public PreLuffyArmorRenderer() {
        super(new PreLuffyArmorModel()); // 'location' as item/armor/example armor in the assets folders.

    }
}

