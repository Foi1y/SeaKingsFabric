package net.foi1y.seakings.mixin;

import com.mojang.datafixers.types.templates.Tag;
import net.foi1y.seakings.item.custom.ArmorItems.PreLuffyArmorItem;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagFile;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BipedEntityModel.class)
public class PlayerHatModelMixin<T extends LivingEntity> {

    @Shadow @Final public ModelPart hat;


    private static final TagKey<Item> SEAKING_ARMOR_TAG = TagKey.of(Registries.ITEM.getKey(), new Identifier("seakings", "seakingarmortag"));


    @Inject(at = @At("TAIL"), method = "setAngles*")
    private void modifyModelScale(T livingEntity, float f, float g, float h, float i, float j, CallbackInfo info) {
        if (livingEntity != null && livingEntity.getEquippedStack(EquipmentSlot.HEAD).isIn(SEAKING_ARMOR_TAG) ) {
            this.hat.xScale = 0.55F;
            this.hat.yScale = 0.55F;
            this.hat.zScale = 0.55F;
        }

    }
}