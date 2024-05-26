package net.foi1y.seakings.entity.client.armor;

import net.foi1y.seakings.SeaKingsMod;
import net.minecraft.util.Identifier;
import software.bernie.example.item.GeckoArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;


public final class MarineUniformArmorRenderer extends GeoArmorRenderer<GeckoArmorItem> {

    public MarineUniformArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(SeaKingsMod.MOD_ID, "armor/marineuniform"))); // 'location' as item/armor/example armor in the assets folders.

    }

}

