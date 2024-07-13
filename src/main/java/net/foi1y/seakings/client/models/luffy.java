package net.foi1y.seakings.client.models;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public class luffy extends BipedEntityModel<LivingEntity> {
    private final ModelPart armorHead;
    private final ModelPart armorLeftArm;
    private final ModelPart armorRightArm;
    private final ModelPart armorBody;
    private final ModelPart armorLeftLeg;
    private final ModelPart armorLeftBoot;
    private final ModelPart armorRightBoot;

    public luffy(ModelPart root) {
        super(root);
        this.armorHead = root.getChild("armorHead");
        this.armorLeftArm = root.getChild("armorLeftArm");
        this.armorRightArm = root.getChild("armorRightArm");
        this.armorBody = root.getChild("armorBody");
        this.armorLeftLeg = root.getChild("armorLeftLeg");
        this.armorLeftBoot = root.getChild("armorLeftBoot");
        this.armorRightBoot = root.getChild("armorRightBoot");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData HEAD = modelPartData.addChild("HEAD", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData armorHead = HEAD.addChild("armorHead", ModelPartBuilder.create().uv(0, 96).cuboid(-4.0F, -7.875F, -4.0F, 8.0F, 3.0F, 8.0F, new Dilation(0.1F))
                .uv(83, 95).cuboid(-4.0F, -8.075F, -4.0F, 8.0F, 3.0F, 8.0F, new Dilation(0.25F))
                .uv(77, 79).mirrored().cuboid(-7.0F, -4.775F, -7.0F, 14.0F, 1.0F, 14.0F, new Dilation(0.1F)).mirrored(false)
                .uv(72, 64).mirrored().cuboid(-7.0F, -4.475F, -7.0F, 14.0F, 1.0F, 14.0F, new Dilation(0.25F)).mirrored(false), ModelTransform.pivot(0.0F, -24.2F, 0.0F));

        ModelPartData CHEST = modelPartData.addChild("CHEST", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData armorLeftArm = CHEST.addChild("armorLeftArm", ModelPartBuilder.create().uv(64, 97).cuboid(0.0F, -2.0F, -2.0F, 3.0F, 10.0F, 4.0F, new Dilation(0.1F))
                .uv(114, 88).cuboid(0.0F, -2.0F, -2.0F, 3.0F, 10.0F, 4.0F, new Dilation(0.15F))
                .uv(96, 114).cuboid(0.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, new Dilation(0.1F))
                .uv(112, 114).cuboid(0.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(4.0F, -22.0F, 0.0F));

        ModelPartData armorRightArm = CHEST.addChild("armorRightArm", ModelPartBuilder.create().uv(64, 97).mirrored().cuboid(-3.0F, -2.0F, -2.0F, 3.0F, 10.0F, 4.0F, new Dilation(0.1F)).mirrored(false)
                .uv(114, 88).mirrored().cuboid(-3.0F, -2.0F, -2.0F, 3.0F, 10.0F, 4.0F, new Dilation(0.15F)).mirrored(false)
                .uv(96, 114).mirrored().cuboid(-4.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, new Dilation(0.1F)).mirrored(false)
                .uv(112, 114).mirrored().cuboid(-4.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, new Dilation(0.25F)).mirrored(false), ModelTransform.pivot(-4.0F, -22.0F, 0.0F));

        ModelPartData armorBody = CHEST.addChild("armorBody", ModelPartBuilder.create().uv(28, 113).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 11.0F, 4.0F, new Dilation(0.15F))
                .uv(44, 107).cuboid(-4.0F, 10.5F, -2.0F, 8.0F, 1.0F, 4.0F, new Dilation(0.13F))
                .uv(52, 89).cuboid(-4.0F, 11.0F, -2.0F, 8.0F, 1.0F, 4.0F, new Dilation(0.12F))
                .uv(52, 113).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 11.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

        ModelPartData cube_r1 = armorBody.addChild("cube_r1", ModelPartBuilder.create().uv(48, 94).cuboid(-0.5F, -4.0F, -2.0F, 1.0F, 8.0F, 4.0F, new Dilation(0.32F)), ModelTransform.of(5.2778F, 14.0534F, -0.4F, -0.0873F, 0.1745F, -0.3927F));

        ModelPartData LEGS = modelPartData.addChild("LEGS", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData armorRightLeg = LEGS.addChild("armorRightLeg", ModelPartBuilder.create().uv(32, 96).mirrored().cuboid(-6.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new Dilation(0.1F)).mirrored(false)
                .uv(56, 78).cuboid(-6.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(2.0F, -12.0F, 0.0F));

        ModelPartData armorLeftLeg = LEGS.addChild("armorLeftLeg", ModelPartBuilder.create().uv(32, 96).cuboid(2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new Dilation(0.1F))
                .uv(56, 78).mirrored().cuboid(2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new Dilation(0.25F)).mirrored(false), ModelTransform.pivot(-2.0F, -12.0F, 0.0F));

        ModelPartData FEET = modelPartData.addChild("FEET", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData armorLeftBoot = FEET.addChild("armorLeftBoot", ModelPartBuilder.create().uv(36, 89).cuboid(2.0F, 11.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.1F))
                .uv(0, 83).cuboid(2.0F, 10.0F, -2.0F, 4.0F, 1.0F, 2.0F, new Dilation(0.05F)), ModelTransform.pivot(-2.0F, -12.0F, 0.0F));

        ModelPartData armorRightBoot = FEET.addChild("armorRightBoot", ModelPartBuilder.create().uv(12, 122).cuboid(-6.0F, 11.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.1F))
                .uv(0, 86).cuboid(-6.0F, 10.0F, -2.0F, 4.0F, 1.0F, 2.0F, new Dilation(0.05F)), ModelTransform.pivot(2.0F, -12.0F, 0.0F));
        return TexturedModelData.of(modelData, 128, 128);
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        armorHead.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        armorRightArm.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        armorLeftArm.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        armorBody.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        armorLeftBoot.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        armorRightBoot.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        armorLeftLeg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }
}
