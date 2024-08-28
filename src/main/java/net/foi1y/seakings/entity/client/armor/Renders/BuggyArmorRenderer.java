package net.foi1y.seakings.entity.client.armor.Renders;

import net.foi1y.seakings.entity.client.armor.Models.BuggyArmorModel;
import net.foi1y.seakings.item.custom.ArmorItems.BuggyArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;


public final class BuggyArmorRenderer extends GeoArmorRenderer<BuggyArmorItem> {

    public BuggyArmorRenderer() {
        super(new BuggyArmorModel()); // 'location' as item/armor/example armor in the assets folders.

    }
}

