package net.foi1y.seakings.client;

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
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = BipedEntityModel.getModelData(Dilation.NONE, 0f);
		ModelPartData modelPartData = modelData.getRoot();

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.3F, 0.0F));

		body.addChild("torso_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-8.3238F, 9.5959F, -3.0F, 18.0F, 12.0F, 6.0F, new Dilation(0.0F))
				.uv(0, 33).cuboid(-7.8238F, 9.8959F, -2.5F, 17.0F, 11.0F, 5.0F, new Dilation(0.0F))
				.uv(44, 28).cuboid(-7.8238F, 0.8959F, -2.5F, 17.0F, 9.0F, 5.0F, new Dilation(0.0F))
				.uv(0, 18).cuboid(-8.3238F, 0.5959F, -3.0F, 18.0F, 9.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-0.6762F, -0.8959F, -1.0F, 0.4363F, 0.0F, 0.0F));

		body.addChild("leftsleeve_r1", ModelPartBuilder.create().uv(52, 60).cuboid(5.8135F, 14.7613F, -1.5F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-0.6762F, -0.8959F, -1.0F, 0.4363F, 0.0F, -0.5236F));
		body.addChild("leftsleeve_r2", ModelPartBuilder.create().uv(43, 15).cuboid(3.0599F, 15.6605F, -2.5F, 5.0F, 2.0F, 5.0F, new Dilation(0.0F))
				.uv(48, 0).cuboid(3.6068F, 6.4492F, -2.0F, 4.0F, 11.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-0.6762F, -0.8959F, -1.0F, 0.4363F, 0.0F, -0.4363F));

		body.addChild("rightsleeve_r1", ModelPartBuilder.create().uv(48, 0).mirrored().cuboid(-6.3812F, 5.8776F, -2.0F, 4.0F, 11.0F, 4.0F, new Dilation(0.0F)).mirrored(false)
				.uv(43, 15).mirrored().cuboid(-6.8343F, 15.089F, -2.5F, 5.0F, 2.0F, 5.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-0.6762F, -0.8959F, -1.0F, 0.4363F, 0.0F, 0.4363F));
		body.addChild("rightsleeve_r2", ModelPartBuilder.create().uv(60, 42).cuboid(-5.6424F, 14.0851F, -1.5F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-0.6762F, -0.8959F, -1.0F, 0.4363F, 0.0F, 0.5236F));

		body.addChild("torso_r2", ModelPartBuilder.create().uv(20, 49).mirrored().cuboid(4.3703F, 1.2096F, -2.0F, 5.0F, 3.0F, 4.0F, new Dilation(0.15F)).mirrored(false)
				.uv(0, 56).mirrored().cuboid(4.3541F, 1.2994F, -2.0F, 5.0F, 3.0F, 4.0F, new Dilation(0.1F)).mirrored(false), ModelTransform.of(-0.6762F, -0.8959F, -1.0F, 0.4363F, 0.0F, -0.0873F));
		body.addChild("torso_r3", ModelPartBuilder.create().uv(20, 49).cuboid(-8.0231F, 1.0917F, -2.0F, 5.0F, 3.0F, 4.0F, new Dilation(0.15F))
				.uv(0, 56).cuboid(-8.0069F, 1.1815F, -2.0F, 5.0F, 3.0F, 4.0F, new Dilation(0.1F)), ModelTransform.of(-0.6762F, -0.8959F, -1.0F, 0.4363F, 0.0F, 0.0873F));
		body.addChild("torso_r4", ModelPartBuilder.create().uv(40, 57).cuboid(-4.4789F, 0.0969F, -2.5F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-0.6762F, -0.8959F, -1.0F, 0.4363F, 0.0F, 0.3054F));
		body.addChild("torso_r5", ModelPartBuilder.create().uv(48, 22).cuboid(-3.8238F, -0.3012F, 2.2163F, 9.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.6762F, -0.8959F, -1.0F, 0.7418F, 0.0F, 0.0F));
		body.addChild("torso_r6", ModelPartBuilder.create().uv(33, 52).cuboid(4.7686F, 0.5035F, -2.5F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-0.6762F, -0.8959F, -1.0F, 0.4363F, 0.0F, -0.3054F));
		return TexturedModelData.of(modelData, 128, 128);
	}
}