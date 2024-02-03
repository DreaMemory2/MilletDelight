package com.stalight.milletdelight.registries;

import com.nhoryzon.mc.farmersdelight.block.RiceBaleBlock;
import com.nhoryzon.mc.farmersdelight.block.WildPatchBlock;
import com.stalight.milletdelight.MilletDelight;
import com.stalight.milletdelight.block.BlockList;
import com.stalight.milletdelight.block.MilletCrop;
import com.stalight.milletdelight.block.MilletTableBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CakeBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocksRegistry {
    // 工作台
    public static final Block MILLER_TABLE = registerBlock("millet_table",new MilletTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
    public static void registerBlock() {
        // Crops
        BlockList.WildMillet = registerBlock("wild_millet", new WildPatchBlock());
        BlockList.Millet = withoutBlockItem("millet", new MilletCrop(FabricBlockSettings.copyOf(Blocks.WHEAT)));
        BlockList.MilletCakes = registerBlock("millet_cakes", new CakeBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));
        // Block
        BlockList.MilletBag = registerBlock("millet_bag", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
        BlockList.MilletBale = registerBlock("millet_bale", new RiceBaleBlock());
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
