package net.foi1y.seakings.mixin;

import net.foi1y.seakings.util.ModTags;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntityModel.class)
public class PlayerModelMixin<T extends LivingEntity> {

    @Shadow @Final public ModelPart jacket;

    @Shadow @Final public ModelPart leftSleeve;

    @Shadow @Final public ModelPart rightSleeve;

    @Shadow @Final public ModelPart leftPants;

    @Shadow @Final public ModelPart rightPants;

    @Inject(at = @At("TAIL"), method = "setAngles*")
    private void modifyModelScale(T livingEntity, float f, float g, float h, float i, float j, CallbackInfo info) {
        // Checks to see if the Item in the Equipment Slot is A part of the Sea Kings tag
        if (livingEntity != null && livingEntity.getEquippedStack(EquipmentSlot.CHEST).isIn(ModTags.Items.SEAKING_ARMOR_TAG) ) {
            this.jacket.xScale = 0.55F;
            this.jacket.yScale = 0.55F;
            this.jacket.zScale = 0.55F;

            this.leftSleeve.xScale = 0.55F;
            this.leftSleeve.yScale = 0.55F;
            this.leftSleeve.zScale = 0.55F;

            this.rightSleeve.xScale = 0.55F;
            this.rightSleeve.yScale = 0.55F;
            this.rightSleeve.zScale = 0.55F;
        }
            if (livingEntity != null && livingEntity.getEquippedStack(EquipmentSlot.LEGS).isIn(ModTags.Items.SEAKING_ARMOR_TAG)
                    || livingEntity != null && livingEntity.getEquippedStack(EquipmentSlot.FEET).isIn(ModTags.Items.SEAKING_ARMOR_TAG))   {
                this.leftPants.xScale = 0.55F;
                this.leftPants.yScale = 0.55F;
                this.leftPants.zScale = 0.55F;

                this.rightPants.xScale = 0.55F;
                this.rightPants.yScale = 0.55F;
                this.rightPants.zScale = 0.55F;
            }
        }
    }