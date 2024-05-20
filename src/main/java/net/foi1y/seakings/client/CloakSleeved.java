package net.foi1y.seakings.client;

import com.terraformersmc.modmenu.util.mod.Mod;
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

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(0, 18).cuboid(-9.0F, -0.3F, -3.0F, 18.0F, 9.0F, 6.0F, new Dilation(0.0F))
		.uv(44, 28).cuboid(-8.5F, 0.0F, -2.5F, 17.0F, 9.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.3F, 0.0F));

		body.addChild("leftsleeve_r1", ModelPartBuilder.create().uv(52, 60).cuboid(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(12.9222F, 10.03F, 0.0F, 0.0F, 0.0F, -0.5236F));
		body.addChild("leftsleeve_r2", ModelPartBuilder.create().uv(43, 15).cuboid(-2.5234F, 1.3557F, -2.5F, 5.0F, 2.0F, 5.0F, new Dilation(0.0F))
				.uv(48, 0).cuboid(-1.9766F, -7.8557F, -2.0F, 4.0F, 11.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(10.4296F, 9.709F, 0.0F, 0.0F, 0.0F, -0.4363F));
		body.addChild("rightsleeve_r1", ModelPartBuilder.create().uv(48, 0).mirrored().cuboid(0.0F, -2.5F, -2.0F, 4.0F, 11.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-10.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.4363F));
		body.addChild("rightsleeve_r2", ModelPartBuilder.create().uv(43, 15).mirrored().cuboid(0.0F, 6.5F, -3.0F, 5.0F, 2.0F, 5.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-10.5F, 4.0F, 0.5F, 0.0F, 0.0F, 0.4363F));
		body.addChild("rightsleeve_r3", ModelPartBuilder.create().uv(60, 42).cuboid(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-12.9222F, 10.03F, 0.0F, 0.0F, 0.0F, 0.5236F));
		body.addChild("torso_r1", ModelPartBuilder.create().uv(20, 49).mirrored().cuboid(-2.5F, -1.5F, -2.0F, 5.0F, 3.0F, 4.0F, new Dilation(0.15F)).mirrored(false), ModelTransform.of(6.4042F, 1.2045F, 0.0F, 0.0F, 0.0F, -0.0873F));
		body.addChild("torso_r2", ModelPartBuilder.create().uv(0, 56).mirrored().cuboid(-2.5F, -1.5F, -2.0F, 5.0F, 3.0F, 4.0F, new Dilation(0.1F)).mirrored(false), ModelTransform.of(6.3958F, 1.2955F, 0.0F, 0.0F, 0.0F, -0.0873F));
		body.addChild("torso_r3", ModelPartBuilder.create().uv(20, 49).cuboid(-2.5F, -1.5F, -2.0F, 5.0F, 3.0F, 4.0F, new Dilation(0.15F)), ModelTransform.of(-6.4042F, 1.2045F, 0.0F, 0.0F, 0.0F, 0.0873F));
		body.addChild("torso_r4", ModelPartBuilder.create().uv(0, 56).cuboid(-2.5F, -1.5F, -2.0F, 5.0F, 3.0F, 4.0F, new Dilation(0.1F)), ModelTransform.of(-6.3958F, 1.2955F, 0.0F, 0.0F, 0.0F, 0.0873F));
		body.addChild("torso_r5", ModelPartBuilder.create().uv(40, 57).cuboid(-1.0F, -1.0F, -2.5F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-4.3238F, -0.8959F, 0.0F, 0.0F, 0.0F, 0.3054F));
		body.addChild("torso_r6", ModelPartBuilder.create().uv(48, 22).cuboid(-4.5F, -1.0F, 0.0F, 9.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.8959F, 2.3238F, 0.3054F, 0.0F, 0.0F));
		body.addChild("torso_r7", ModelPartBuilder.create().uv(33, 52).cuboid(0.0F, -1.0F, -2.5F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(4.3238F, -0.8959F, 0.0F, 0.0F, 0.0F, -0.3054F));

		ModelPartData lowerTorso = body.addChild("lowerTorso", ModelPartBuilder.create().uv(0, 33).cuboid(-8.5F, -1.0F, -2.5F, 17.0F, 11.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-9.0F, -1.3F, -3.0F, 18.0F, 12.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 10.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
}