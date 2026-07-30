package com.crystal.milletdelight;

import com.crystal.milletdelight.client.datagen.*;
import com.crystal.milletdelight.item.MilletItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.LootTableLoadEvent;
import vectorwing.farmersdelight.common.registry.ModChestLootTables;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = MilletDelight.MODID)
public class MilletDelightDataGenerator {
    @SubscribeEvent
    public static void onInitializeDataGenerator(GatherDataEvent event){
        PackOutput output = event.getGenerator().getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // 语言文件
        event.getGenerator().addProvider(event.includeClient(), new ModChineseGenerator(output));

        // 物品和方块标签
        BlockTagsProvider blockTag = new ModBlockTagGeneration(output, lookupProvider, existingFileHelper);
        event.getGenerator().addProvider(event.includeServer(), blockTag);
        event.getGenerator().addProvider(event.includeServer(), new ModItemTagGeneration(output, lookupProvider, blockTag.contentsGetter(), existingFileHelper));
        // 物品模型及方块状态
        event.getGenerator().addProvider(event.includeClient(), new ModItemModelGenerator(output, existingFileHelper));
        event.getGenerator().addProvider(event.includeClient(), new ModBlockStateGenerator(output, existingFileHelper));
        // 地物配置及世界生成
        event.getGenerator().addProvider(event.includeClient(), new ModDatapackGenerator(output, lookupProvider));
        // 食谱配方
        event.getGenerator().addProvider(event.includeClient(), new ModRecipeGeneration(output, lookupProvider));
    }

    @SubscribeEvent
    public static void onLootTableLoad(LootTableLoadEvent event) {
        ResourceLocation tableId = event.getName();
        LootTable lootTable = event.getTable();

        if (tableId.equals(ModChestLootTables.SIMPLE_DUNGEON.location())) {
            // 给已有的地牢箱子添加小米锻造模板
            LootPool pool = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1.0F, 3.0F))
                    .add(LootItem.lootTableItem(MilletItems.MILLET_TEMPLATE).setWeight(15))
                    .build();

            lootTable.addPool(pool);
        }

        if (tableId.equals(ModChestLootTables.RUINED_PORTAL.location())) {
            // 给已有的地牢箱子添加小米锻造模板
            LootPool pool = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1.0F, 3.0F))
                    .add(LootItem.lootTableItem(MilletItems.MILLET_TEMPLATE).setWeight(15))
                    .build();

            lootTable.addPool(pool);
        }

        if (tableId.equals(ModChestLootTables.ABANDONED_MINESHAFT.location())) {
            // 给已有的废弃矿井箱子添加小米锻造模板
            LootPool pool = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1.0F, 3.0F))
                    .add(LootItem.lootTableItem(MilletItems.MILLET_TEMPLATE).setWeight(15))
                    .build();

            lootTable.addPool(pool);
        }

        if (tableId.equals(ModChestLootTables.VILLAGE_DESERT_HOUSE.location())) {
            // 给已有的沙漠村庄箱子添加小米锻造模板
            LootPool pool = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1.0F, 3.0F))
                    .add(LootItem.lootTableItem(MilletItems.MILLET_TEMPLATE).setWeight(15))
                    .build();

            lootTable.addPool(pool);
        }

        if (tableId.equals(ModChestLootTables.VILLAGE_PLAINS_HOUSE.location())) {
            // 给已有的平原村庄箱子添加小米锻造模板
            LootPool pool = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1.0F, 3.0F))
                    .add(LootItem.lootTableItem(MilletItems.MILLET_TEMPLATE).setWeight(15))
                    .build();

            lootTable.addPool(pool);
        }

        if (tableId.equals(ModChestLootTables.VILLAGE_SAVANNA_HOUSE.location())) {
            // 给已有的热带村庄箱子添加小米锻造模板
            LootPool pool = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1.0F, 3.0F))
                    .add(LootItem.lootTableItem(MilletItems.MILLET_TEMPLATE).setWeight(15))
                    .build();

            lootTable.addPool(pool);
        }

        if (tableId.equals(ModChestLootTables.VILLAGE_SNOWY_HOUSE.location())) {
            // 给已有的雪原村庄箱子添加小米锻造模板
            LootPool pool = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1.0F, 3.0F))
                    .add(LootItem.lootTableItem(MilletItems.MILLET_TEMPLATE).setWeight(15))
                    .build();

            lootTable.addPool(pool);
        }

        if (tableId.equals(ModChestLootTables.VILLAGE_TAIGA_HOUSE.location())) {
            // 给已有的松树林村庄箱子添加小米锻造模板
            LootPool pool = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1.0F, 3.0F))
                    .add(LootItem.lootTableItem(MilletItems.MILLET_TEMPLATE).setWeight(15))
                    .build();

            lootTable.addPool(pool);
        }
    }
}
