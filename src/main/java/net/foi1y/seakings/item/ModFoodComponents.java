package net.foi1y.seakings.item;

import net.minecraft.entity.effect.*;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent DEVILFRUIT = new FoodComponent.Builder().hunger(4).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 60), 1f).build();
}