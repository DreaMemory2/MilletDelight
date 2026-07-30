package com.crystal.milletdelight.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.FoodProperties.Builder;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class MilletFoods {
    public static final FoodProperties SAUCE = food(4, 0.6F).fast().alwaysEdible().build();
    public static final FoodProperties APPLE = food(6, 0.3F).build();
    public static final FoodProperties SNACK = food(2, 0.1F).fast().alwaysEdible().build();
    public static final FoodProperties MILLET_BALL = food(8, 0.375f).effect(new MobEffectInstance(ModEffects.COMFORT, FoodValues.SHORT_DURATION, 0), 1.0F).build();
    public static final FoodProperties POTATO_ROLLS = food(6, 0.5f).effect(new MobEffectInstance(ModEffects.COMFORT, FoodValues.SHORT_DURATION, 0), 1.0F).build();
    public static final FoodProperties SPUN_SUGAR = food(2, 0.1f).build();
    public static final FoodProperties MILLET_MEAT = food(12, 0.8f).effect(new MobEffectInstance(ModEffects.COMFORT, FoodValues.MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties FRIED_MILLET_RICE = food(14, 0.75f).effect(new MobEffectInstance(ModEffects.COMFORT, FoodValues.LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties MILLET_RICE = food(6, 0.4f).effect(new MobEffectInstance(ModEffects.COMFORT, FoodValues.LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties MILLET_GRUEL = food(8, 0.8f).effect(new MobEffectInstance(ModEffects.COMFORT, FoodValues.LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties MILLET_PUMPKIN_SOUP = food(14, 0.75f).effect(new MobEffectInstance(ModEffects.COMFORT, FoodValues.LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties MILLET_VEGETABLE_SOUP = food(12, 0.8f).effect(new MobEffectInstance(ModEffects.COMFORT, FoodValues.LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties MILLET_NOODLES = food(14, 0.75F).effect(new MobEffectInstance(ModEffects.COMFORT, FoodValues.LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties BONE_MILLET_NOODLES = food(10, 0.7F).effect(new MobEffectInstance(ModEffects.COMFORT, FoodValues.SHORT_DURATION, 0), 1.0F).build();
    public static final FoodProperties POTATO_MILLET_NOODLES = food(14, 0.75F).effect(new MobEffectInstance(ModEffects.COMFORT, FoodValues.LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties TOMATO_MILLET_NOODLES = food(14, 0.75F).effect(new MobEffectInstance(ModEffects.COMFORT, FoodValues.LONG_DURATION, 0), 1.0F).build();

    public static Builder food(int nutrition, float saturation) {
        return new Builder().nutrition(nutrition).saturationModifier(saturation);
    }
}
