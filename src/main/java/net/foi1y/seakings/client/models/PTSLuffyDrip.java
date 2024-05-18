package net.foi1y.seakings.client.models;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public class PTSLuffyDrip extends EntityModel<Entity> {
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightFoot;
	private final ModelPart LeftFoot;
	public PTSLuffyDrip(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightFoot = root.getChild("RightFoot");
		this.LeftFoot = root.getChild("LeftFoot");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData LeftLeg = modelPartData.addChild("LeftLeg", ModelPartBuilder.create().uv(28, 23).cuboid(-0.1F, -7.0F, -2.0F, 4.0F, 2.0F, 4.0F, new Dilation(0.15F))
		.uv(32, 13).cuboid(-0.1F, -12.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.1F)), ModelTransform.pivot(0.1F, 24.0F, 0.0F));

		ModelPartData RightLeg = modelPartData.addChild("RightLeg", ModelPartBuilder.create().uv(36, 0).cuboid(-3.9F, -7.0F, -2.0F, 4.0F, 2.0F, 4.0F, new Dilation(0.15F))
		.uv(0, 33).cuboid(-3.9F, -12.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.1F)), ModelTransform.pivot(-0.1F, 24.0F, 0.0F));

		ModelPartData Head = modelPartData.addChild("Head", ModelPartBuilder.create().uv(0, 0).cuboid(-6.0F, -30.0F, -6.0F, 12.0F, 1.0F, 12.0F, new Dilation(0.1F))
		.uv(0, 24).cuboid(-4.0F, -31.0F, -4.0F, 8.0F, 1.0F, 8.0F, new Dilation(0.2F))
		.uv(0, 13).cuboid(-4.0F, -33.0F, -4.0F, 8.0F, 3.0F, 8.0F, new Dilation(0.1F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData Body = modelPartData.addChild("Body", ModelPartBuilder.create().uv(28, 29).cuboid(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.15F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData RightFoot = modelPartData.addChild("RightFoot", ModelPartBuilder.create().uv(0, 3).cuboid(-3.9F, -2.0F, -2.0F, 4.0F, 1.0F, 2.0F, new Dilation(0.05F))
		.uv(12, 39).cuboid(-3.9F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.1F)), ModelTransform.pivot(-0.1F, 24.0F, 0.0F));

		ModelPartData LeftFoot = modelPartData.addChild("LeftFoot", ModelPartBuilder.create().uv(36, 6).cuboid(-0.1F, 11.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.1F))
		.uv(0, 0).cuboid(-0.1F, 10.0F, -2.0F, 4.0F, 1.0F, 2.0F, new Dilation(0.05F)), ModelTransform.pivot(0.1F, 12.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}


	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		LeftLeg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		RightLeg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Head.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		RightFoot.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		LeftFoot.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	public void renderModelPart(ModelPart modelPart, MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		modelPart.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	public ModelPart[] getVertebrae() {
		return new ModelPart[]{LeftLeg, RightLeg, Head, Body, RightFoot, LeftFoot};
	}

	@Override
	public void setAngles(Entity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}
}