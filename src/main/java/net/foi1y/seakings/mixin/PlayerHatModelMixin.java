package net.foi1y.seakings.mixin;

import net.foi1y.seakings.util.ModTags;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BipedEntityModel.class)
public class PlayerHatModelMixin<T extends LivingEntity> {

    @Shadow @Final public ModelPart hat;


    @Inject(at = @At("TAIL"), method = "setAngles*")
    private void modifyModelScale(T livingEntity, float f, float g, float h, float i, float j, CallbackInfo info) {
        if (livingEntity != null && livingEntity.getEquippedStack(EquipmentSlot.HEAD).isIn(ModTags.Items.SEAKING_ARMOR_TAG) ) {
            this.hat.xScale = 0.9F;
            this.hat.yScale = 0.9F;
            this.hat.zScale = 0.9F;
        }

    }
}