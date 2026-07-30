package com.crystal.milletdelight.client.datagen;

import com.crystal.milletdelight.MilletDelight;
import com.crystal.milletdelight.item.MilletItems;
import com.crystal.milletdelight.tag.ICommonTags;
import com.crystal.milletdelight.tag.MilletTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGeneration extends ItemTagsProvider {

    public ModItemTagGeneration(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                CompletableFuture<TagLookup<Block>> blockTags, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, MilletDelight.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(MilletTags.MILLET_PASTRY)
                .add(MilletItems.MILLET_PASTRY.get())
                .add(MilletItems.CHOCOLATE_MILLET_PASTRY.get())
                .add(MilletItems.CHORUS_MILLET_PASTRY.get())
                .add(MilletItems.GLOW_BERRY_MILLET_PASTRY.get())
                .add(MilletItems.MILK_MILLET_PASTRY.get())
                .add(MilletItems.SCULK_MILLET_PASTRY.get());
        tag(MilletTags.MILLET_BISCUIT)
                .add(MilletItems.MILLET_BISCUIT.get())
                .add(MilletItems.CHOCOLATE_BISCUIT.get())
                .add(MilletItems.HONEY_BISCUIT.get())
                .add(MilletItems.SCULK_BISCUIT.get())
                .add(MilletItems.SWEET_BERRY_BISCUIT.get());
        tag(ModTags.Items.KNIVES)
                .add(MilletItems.MILLET_KNIFE.get());
        tag(ICommonTags.EGG)
                .add(Items.EGG);
    }
}
