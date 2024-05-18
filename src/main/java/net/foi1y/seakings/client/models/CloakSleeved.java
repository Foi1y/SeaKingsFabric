package net.foi1y.seakings.client.models;

import net.fabricmc.api.*;

import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.LivingEntity;

@Environment(EnvType.CLIENT)
public class CloakSleeved extends BipedEntityModel<LivingEntity> {

	public CloakSleeved(ModelPart root) {
		super(root);
		this.setVisible(false);
		this.body.visible = true;
		this.rightArm.visible = true;
		this.leftArm.visible = true;
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = BipedEntityModel.getModelData(Dilation.NONE, 0f);
		ModelPartData modelPartData = modelData.getRoot();

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(0, 18).cuboid(-9.0F, -0.3F, -3.0F, 18.0F, 9.0F, 6.0F, new Dilation(0.0F))
		.uv(44, 28).cuboid(-8.5F, 0.0F, -2.5F, 17.0F, 9.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.3F, 0.0F));

		body.addChild("torso_r1", ModelPartBuilder.create().uv(20, 49).mirrored().cuboid(-2.5F, -1.5F, -2.0F, 5.0F, 3.0F, 4.0F, new Dilation(0.15F)).mirrored(false), ModelTransform.of(6.4042F, 1.2045F, 0.0F, 0.0F, 0.0F, -0.0873F));
		body.addChild("torso_r2", ModelPartBuilder.create().uv(0, 56).mirrored().cuboid(-2.5F, -1.5F, -2.0F, 5.0F, 3.0F, 4.0F, new Dilation(0.1F)).mirrored(false), ModelTransform.of(6.3958F, 1.2955F, 0.0F, 0.0F, 0.0F, -0.0873F));
		body.addChild("torso_r3", ModelPartBuilder.create().uv(20, 49).cuboid(-2.5F, -1.5F, -2.0F, 5.0F, 3.0F, 4.0F, new Dilation(0.15F)), ModelTransform.of(-6.4042F, 1.2045F, 0.0F, 0.0F, 0.0F, 0.0873F));
		body.addChild("torso_r4", ModelPartBuilder.create().uv(0, 56).cuboid(-2.5F, -1.5F, -2.0F, 5.0F, 3.0F, 4.0F, new Dilation(0.1F)), ModelTransform.of(-6.3958F, 1.2955F, 0.0F, 0.0F, 0.0F, 0.0873F));
		body.addChild("torso_r5", ModelPartBuilder.create().uv(18, 56).cuboid(-2.45F, -1.55F, -2.0F, 5.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(6.85F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0873F));

		ModelPartData leftArm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(8.9222F, 3.03F, 0.0F));

		leftArm.addChild("left_arm_r1", ModelPartBuilder.create().uv(48, 22).cuboid(-4.5F, -1.0F, 0.0F, 9.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.8959F, 2.3238F, 0.3054F, 0.0F, 0.0F));
		leftArm.addChild("left_arm_r2", ModelPartBuilder.create().uv(33, 52).cuboid(0.0F, -1.0F, -2.5F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(4.3238F, -0.8959F, 0.0F, 0.0F, 0.0F, -0.3054F));
		leftArm.addChild("left_arm_r3", ModelPartBuilder.create().uv(60, 42).cuboid(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		leftArm.addChild("left_arm_r4", ModelPartBuilder.create().uv(43, 15).mirrored().cuboid(0.0F, 6.5F, -3.0F, 5.0F, 2.0F, 5.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-1.5778F, 0.97F, 0.5F, 0.0F, 0.0F, 0.4363F));
		leftArm.addChild("left_arm_r5", ModelPartBuilder.create().uv(48, 0).mirrored().cuboid(0.0F, -2.5F, -2.0F, 4.0F, 11.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-1.0778F, 0.97F, 0.0F, 0.0F, 0.0F, 0.4363F));

		ModelPartData rightArm = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-8.9222F, 3.03F, 0.0F));

		rightArm.addChild("right_arm_r1", ModelPartBuilder.create().uv(40, 57).cuboid(-1.0F, -1.0F, -2.5F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-4.3238F, -0.8959F, 0.0F, 0.0F, 0.0F, 0.3054F));
		rightArm.addChild("right_arm_r2", ModelPartBuilder.create().uv(52, 60).cuboid(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 7.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		rightArm.addChild("right_arm_r3", ModelPartBuilder.create().uv(43, 15).cuboid(-2.5234F, 1.3557F, -2.5F, 5.0F, 2.0F, 5.0F, new Dilation(0.0F))
				.uv(48, 0).cuboid(-1.9766F, -7.8557F, -2.0F, 4.0F, 11.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(1.5074F, 6.679F, 0.0F, 0.0F, 0.0F, -0.4363F));

		ModelPartData lowerTorso = body.addChild("lowerTorso", ModelPartBuilder.create().uv(0, 33).cuboid(-8.5F, -1.0F, -2.5F, 17.0F, 11.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-9.0F, -1.3F, -3.0F, 18.0F, 12.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 10.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
}