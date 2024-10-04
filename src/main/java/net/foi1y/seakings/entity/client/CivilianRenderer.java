package net.foi1y.seakings.entity.client;

import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.entity.custom.CivilianEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class CivilianRenderer extends GeoEntityRenderer<CivilianEntity> {
    public CivilianRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new CivilianModel());
    }

    @Override
    public Identifier getTextureLocation(CivilianEntity animatable) {return new Identifier(SeaKingsMod.MOD_ID,"textures/entity/civilian.png");
    }

    @Override
    public void render(CivilianEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
