package com.crystal.milletdelight.compat;

import com.crystal.milletdelight.MilletDelight;
import com.crystal.milletdelight.item.MilletItems;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

@JeiPlugin
public class MilletJeiPlugin implements IModPlugin {
    @Override
    public @NotNull ResourceLocation getPluginUid() {
        return MilletDelight.of("jei_plugin");
    }

    @Override
    public void registerRecipes(IRecipeRegistration register) {
        register.addIngredientInfo(MilletItems.MILLET_TEMPLATE, Component.translatable("item.milletdelight.millet_template.info"));
    }
}
