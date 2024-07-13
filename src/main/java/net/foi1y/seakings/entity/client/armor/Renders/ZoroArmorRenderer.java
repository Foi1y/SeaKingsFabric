package net.foi1y.seakings.entity.client.armor.Renders;

import net.foi1y.seakings.entity.client.armor.Models.PreZoroFAModel;
import net.foi1y.seakings.item.custom.ArmorItems.PreFAZoroArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;


public final class ZoroArmorRenderer extends GeoArmorRenderer<PreFAZoroArmorItem> {

    public ZoroArmorRenderer() {
        super(new PreZoroFAModel()); // 'location' as item/armor/example armor in the assets folders.

    }

}

