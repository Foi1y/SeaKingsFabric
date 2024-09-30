package net.foi1y.seakings.mixin;

import net.foi1y.seakings.SeaKingsMod;
import net.foi1y.seakings.config.SeaKings;
import net.foi1y.seakings.item.ModItems;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {

    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel gomumodel(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        boolean modledFruits = false;
        if ((stack.isOf(ModItems.GOMU) && modledFruits)) {
            return ((ItemRendererAccessor) this).seakings$getModels().getModelManager().getModel(new ModelIdentifier(SeaKingsMod.MOD_ID, "placeholdergomu", "inventory"));
        }
        return value;
    }
}
