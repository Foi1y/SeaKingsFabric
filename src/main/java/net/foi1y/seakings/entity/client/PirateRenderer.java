package net.foi1y.seakings.entity.client;

import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.entity.custom.PirateEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class PirateRenderer extends GeoEntityRenderer<PirateEntity> {
    public PirateRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new PirateModel());
    }

    @Override
    public Identifier getTextureLocation(PirateEntity animatable) {
        return new Identifier(SeaKingsMod.MOD_ID, "textures/entity/pirates/male1.png");
    }

    @Override
    public void render(PirateEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
