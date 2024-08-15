package net.foi1y.seakings.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.LivingEntity;

@Environment(EnvType.CLIENT)
public class sheath1sword extends BipedEntityModel<LivingEntity> {
	public sheath1sword(ModelPart root) {
		super(root);
		this.setVisible(false);
		this.body.visible = true;
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = BipedEntityModel.getModelData(Dilation.NONE, 0f);
		ModelPartData modelPartData = modelData.getRoot();

		ModelPartData bone = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		bone.addChild("cube_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, -1.0F, -11.0F, 1.0F, 2.0F, 22.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 13.4394F, 3.2336F, -0.48F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
}