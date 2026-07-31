package com.crystal.milletdelight.datagen;

import com.crystal.milletdelight.item.MilletItems;
import com.crystal.milletdelight.tag.ICommonTags;
import com.crystal.milletdelight.tag.MilletTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGeneration extends FabricTagProvider.ItemTagProvider {

    public ModItemTagGeneration(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.getOrCreateTagBuilder(MilletTags.MILLET_PASTRY)
                .add(MilletItems.MILLET_PASTRY)
                .add(MilletItems.CHOCOLATE_MILLET_PASTRY)
                .add(MilletItems.CHORUS_MILLET_PASTRY)
                .add(MilletItems.GLOW_BERRY_MILLET_PASTRY)
                .add(MilletItems.MILK_MILLET_PASTRY)
                .add(MilletItems.SCULK_MILLET_PASTRY);
        this.getOrCreateTagBuilder(MilletTags.MILLET_BISCUIT)
                .add(MilletItems.MILLET_BISCUIT)
                .add(MilletItems.CHOCOLATE_BISCUIT)
                .add(MilletItems.HONEY_BISCUIT)
                .add(MilletItems.SCULK_BISCUIT)
                .add(MilletItems.SWEET_BERRY_BISCUIT);
        this.getOrCreateTagBuilder(ModTags.KNIVES)
                .add(MilletItems.MILLET_KNIFE);
        this.getOrCreateTagBuilder(ICommonTags.EGG)
                .add(Items.EGG);
    }
}
