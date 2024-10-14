package net.foi1y.seakings.entity.client;

import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.entity.custom.CivilianEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class CivilianModel extends GeoModel<CivilianEntity> {
    @Override
    public Identifier getModelResource(CivilianEntity animatable) {
        return new Identifier(SeaKingsMod.MOD_ID,"geo/entity/npc.geo.json");
    }

    @Override
    public Identifier getTextureResource(CivilianEntity animatable) {
        return new Identifier(SeaKingsMod.MOD_ID,"textures/entity/civilian/male1.png");
    }

    @Override
    public Identifier getAnimationResource(CivilianEntity animatable) {
        return new Identifier(SeaKingsMod.MOD_ID,"animations/npc.animation.json");
    }


    @Override
    public void setCustomAnimations(CivilianEntity animatable, long instanceId, AnimationState<CivilianEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}
