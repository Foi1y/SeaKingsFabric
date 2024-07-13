package net.foi1y.seakings.entity.client.armor.Renders;

import net.foi1y.seakings.entity.client.armor.Models.PreLuffyArmorModel;
import net.foi1y.seakings.item.custom.ArmorItems.PreLuffyArmorItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.w3c.dom.Text;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.List;


public final class PreLuffyArmorRenderer extends GeoArmorRenderer<PreLuffyArmorItem> {

    public PreLuffyArmorRenderer() {
        super(new PreLuffyArmorModel()); // 'location' as item/armor/example armor in the assets folders.

    }
}

