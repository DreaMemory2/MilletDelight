package com.stalight.milletdelight.registries;

import com.nhoryzon.mc.farmersdelight.block.WildPatchBlock;
import com.stalight.milletdelight.MilletDelight;
import com.stalight.milletdelight.block.BlockList;
import com.stalight.milletdelight.block.MilletCrop;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocksRegistry {
    public static void registerBlock() {
        // Crops
        BlockList.WILD_MILLET = registerBlock("wild_millet", new WildPatchBlock());
        BlockList.MILLET = withoutBlockItem("millet", new MilletCrop(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    }
    private static Block registerBlock(String name, Block block) {
        ModBlocksRegistry.registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MilletDelight.MODID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(MilletDelight.MODID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.GROUP).register(entries -> entries.add(item));
    }

    private static Block withoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(MilletDelight.MODID, name), block);
    }
}
