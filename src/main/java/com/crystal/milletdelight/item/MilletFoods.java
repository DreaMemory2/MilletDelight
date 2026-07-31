package com.crystal.milletdelight.item;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.registry.ModEffects;

import java.util.List;

public class MilletFoods {
    public static final FoodProperties SAUCE = food(4, 0.6F);
    public static final FoodProperties APPLE = food(6, 0.3F);
    public static final FoodProperties SNACK = food(2, 0.1F);
    public static final FoodProperties MILLET_BALL = food(8, 0.375f);
    public static final FoodProperties POTATO_ROLLS = food(6, 0.5f);
    public static final FoodProperties SPUN_SUGAR = food(2, 0.1f);
    public static final FoodProperties MILLET_MEAT = food(12, 0.8f);
    public static final FoodProperties FRIED_MILLET_RICE = food(14, 0.75f);
    public static final FoodProperties MILLET_RICE = food(6, 0.4f);
    public static final FoodProperties MILLET_GRUEL = food(8, 0.8f);
    public static final FoodProperties MILLET_PUMPKIN_SOUP = food(14, 0.75f);
    public static final FoodProperties MILLET_VEGETABLE_SOUP = food(12, 0.8f);
    public static final FoodProperties MILLET_NOODLES = food(14, 0.75F);
    public static final FoodProperties BONE_MILLET_NOODLES = food(10, 0.7F);
    public static final FoodProperties POTATO_MILLET_NOODLES = food(14, 0.75F);
    public static final FoodProperties TOMATO_MILLET_NOODLES = food(14, 0.75F);

    public static final Consumable BRIEF_COMFORT_DURATION = effect(ModEffects.COMFORT, FoodValues.BRIEF_DURATION);
    public static final Consumable SHORT_COMFORT_DURATION = effect(ModEffects.COMFORT, FoodValues.SHORT_DURATION);
    public static final Consumable MEDIUM_COMFORT_DURATION = effect(ModEffects.COMFORT, FoodValues.MEDIUM_DURATION);
    public static final Consumable LONG_COMFORT_DURATION = effect(ModEffects.COMFORT, FoodValues.LONG_DURATION);

    public static FoodProperties food(int nutrition, float saturation) {
        return new Builder().nutrition(nutrition).saturationModifier(saturation).alwaysEdible().build();
    }

    public static Consumable effect(Holder<MobEffect> effect, int duration) {
        return Consumable.builder().onConsume(new ApplyStatusEffectsConsumeEffect(List.of(new MobEffectInstance(effect, duration, 0)))).build();
    }
}
