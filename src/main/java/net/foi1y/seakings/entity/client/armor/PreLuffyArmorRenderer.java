package net.foi1y.seakings.entity.client.armor;

import net.foi1y.seakings.SeaKingsMod;
import net.minecraft.util.Identifier;
import software.bernie.example.item.GeckoArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;


public final class PreLuffyArmorRenderer extends GeoArmorRenderer<GeckoArmorItem> {

    public PreLuffyArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(SeaKingsMod.MOD_ID, "armor/preluffy"))); // 'location' as item/armor/example armor in the assets folders.

    }

}

