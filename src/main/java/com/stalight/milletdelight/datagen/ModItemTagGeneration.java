package com.stalight.milletdelight.datagen;

import com.nhoryzon.mc.farmersdelight.registry.TagsRegistry;
import com.stalight.milletdelight.block.BlockList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.item.Item.BLOCK_ITEMS;

public class ModItemTagGeneration extends FabricTagProvider.ItemTagProvider {
    public ModItemTagGeneration(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        this.getOrCreateTagBuilder(TagsRegistry.WILD_CROPS_ITEM)
                .add(BLOCK_ITEMS.getOrDefault(BlockList.WILD_MILLET, Items.AIR));
    }
}
