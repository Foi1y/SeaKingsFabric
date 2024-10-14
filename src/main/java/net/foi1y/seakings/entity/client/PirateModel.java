package net.foi1y.seakings.entity.client;

import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.entity.custom.CivilianEntity;
import net.foi1y.seakings.entity.custom.PirateEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class PirateModel extends GeoModel<PirateEntity> {
    @Override
    public Identifier getModelResource(PirateEntity animatable) {
        return new Identifier(SeaKingsMod.MOD_ID, "geo/entity/pirate.geo.json");
    }

    @Override
    public Identifier getTextureResource(PirateEntity animatable) {
        return new Identifier(SeaKingsMod.MOD_ID, "textures/entity/pirates/male1.png");
    }

    @Override
    public Identifier getAnimationResource(PirateEntity animatable) {
        return new Identifier(SeaKingsMod.MOD_ID, "animations/pirate.animation.json");
    }
}
