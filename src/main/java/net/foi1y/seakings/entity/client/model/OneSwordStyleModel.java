package net.foi1y.seakings.entity.client.model;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class OneSwordStyleModel extends EntityModel<Entity> {
	private final ModelPart bone;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart Body;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart Head;
	public OneSwordStyleModel (ModelPart root) {
		this.bone = root.getChild("bone");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Head = root.getChild("Head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 12.0F, 0.0F));

		ModelPartData LeftLeg = bone.addChild("LeftLeg", ModelPartBuilder.create().uv(60, 52).cuboid(-2.0F, 0.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(60, 28).cuboid(-2.0F, 0.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F))
		.uv(66, 20).cuboid(-2.0F, 5.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.1F))
		.uv(32, 68).cuboid(-2.0F, 3.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.1F)), ModelTransform.pivot(2.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = LeftLeg.addChild("cube_r1", ModelPartBuilder.create().uv(0, 80).cuboid(-0.5F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F, new Dilation(0.3F))
		.uv(0, 70).cuboid(-0.5F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F, new Dilation(0.15F)), ModelTransform.of(2.3F, 3.8F, 1.0F, 0.0F, 0.0F, -0.1309F));

		ModelPartData RightLeg = bone.addChild("RightLeg", ModelPartBuilder.create().uv(48, 40).cuboid(-2.0F, 0.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(44, 56).cuboid(-2.0F, 0.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F))
		.uv(66, 20).mirrored().cuboid(-2.0F, 5.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.1F)).mirrored(false)
		.uv(32, 68).mirrored().cuboid(-2.0F, 3.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.1F)).mirrored(false), ModelTransform.pivot(-2.0F, 0.0F, 0.0F));

		ModelPartData cube_r2 = RightLeg.addChild("cube_r2", ModelPartBuilder.create().uv(0, 80).mirrored().cuboid(-0.5F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F, new Dilation(0.3F)).mirrored(false)
		.uv(0, 70).mirrored().cuboid(-0.5F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F, new Dilation(0.15F)).mirrored(false), ModelTransform.of(-2.3F, 3.8F, 1.0F, 0.0F, 0.0F, 0.1309F));

		ModelPartData Body = bone.addChild("Body", ModelPartBuilder.create().uv(24, 44).cuboid(-4.0F, 0.0F, -1.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 38).cuboid(-4.0F, 0.0F, -1.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, -12.0F, 0.0F));

		ModelPartData cube_r3 = Body.addChild("cube_r3", ModelPartBuilder.create().uv(0, 106).cuboid(-0.5F, -1.0F, -5.5F, 1.0F, 2.0F, 20.0F, new Dilation(0.25F))
		.uv(0, 0).cuboid(-0.5F, -1.0F, -5.5F, 1.0F, 2.0F, 20.0F, new Dilation(0.0F)), ModelTransform.of(-4.2F, 13.0F, 1.5F, -0.2618F, -0.0436F, 0.0F));

		ModelPartData LeftArm = bone.addChild("LeftArm", ModelPartBuilder.create().uv(0, 54).cuboid(-1.0F, -2.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(32, 68).cuboid(-1.0F, 0.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.1F))
		.uv(66, 20).cuboid(-1.0F, 2.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.1F))
		.uv(50, 12).cuboid(-1.0F, -2.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(5.0F, -10.0F, 0.0F));

		ModelPartData cube_r4 = LeftArm.addChild("cube_r4", ModelPartBuilder.create().uv(0, 80).cuboid(-0.5F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F, new Dilation(0.3F))
		.uv(0, 70).cuboid(-0.5F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F, new Dilation(0.15F)), ModelTransform.of(3.3F, 0.8F, 1.0F, 0.0F, 0.0F, -0.1309F));

		ModelPartData RightArm = bone.addChild("RightArm", ModelPartBuilder.create().uv(16, 60).mirrored().cuboid(-3.0F, -2.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false)
		.uv(0, 0).mirrored().cuboid(-3.0F, -2.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F)).mirrored(false)
		.uv(32, 68).mirrored().cuboid(-3.0F, 0.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.1F)).mirrored(false)
		.uv(66, 20).mirrored().cuboid(-3.0F, 2.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.1F)).mirrored(false), ModelTransform.pivot(-5.0F, -10.0F, 0.0F));

		ModelPartData cube_r5 = RightArm.addChild("cube_r5", ModelPartBuilder.create().uv(0, 80).mirrored().cuboid(-0.5F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F, new Dilation(0.3F)).mirrored(false)
		.uv(0, 70).mirrored().cuboid(-0.5F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F, new Dilation(0.15F)).mirrored(false), ModelTransform.of(-3.3F, 0.8F, 1.0F, 0.0F, 0.0F, 0.1309F));

		ModelPartData Head = bone.addChild("Head", ModelPartBuilder.create().uv(22, 0).cuboid(-4.0F, -8.0F, -3.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 22).cuboid(-4.0F, -8.0F, -3.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, -12.0F, 0.0F));

		ModelPartData cube_r6 = Head.addChild("cube_r6", ModelPartBuilder.create().uv(116, 0).cuboid(-0.5F, -8.5F, -2.5F, 1.0F, 17.0F, 5.0F, new Dilation(0.1F))
		.uv(32, 22).cuboid(-0.5F, -8.5F, -2.5F, 1.0F, 17.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -2.9F, 9.5F, 0.48F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bone.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}