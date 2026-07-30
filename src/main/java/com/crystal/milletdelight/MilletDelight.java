package com.crystal.milletdelight;

import com.crystal.milletdelight.block.MilletBlocks;
import com.crystal.milletdelight.item.MilletItems;
import com.crystal.milletdelight.item.ModItemGroup;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vectorwing.farmersdelight.common.registry.ModChestLootTables;

public class MilletDelight implements ModInitializer {
	public static final String MOD_ID = "milletdelight";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MilletBlocks.init();
		MilletItems.init();
		ModItemGroup.init();

		lootTable();
	}

	public static ResourceLocation of(String name) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, name);
	}

	public static void lootTable() {
		LootTableEvents.MODIFY.register((id, builder, source, provider) -> {
			if (ModChestLootTables.SIMPLE_DUNGEON.equals(id) && source != LootTableSource.REPLACED) {
				throw new AssertionError("The Simple Dungeon Chest loot table should have LootTableSource.REPLACED");
			}
			if (ModChestLootTables.SIMPLE_DUNGEON.equals(id)) {
				if (source != LootTableSource.MOD) {
					throw new AssertionError("The Simple Dungeon Chest loot table should have LootTableSource.MOD");
				}

				// 给已有的地牢箱子添加小米锻造模板
				LootPool pool = LootPool.lootPool()
						.setRolls(UniformGenerator.between(1.0F, 3.0F))
						.add(LootItem.lootTableItem(MilletItems.MILLET_TEMPLATE).setWeight(15))
						.build();

				builder.pool(pool);
			}
		});

		LootTableEvents.MODIFY.register((id, builder, source, provider) -> {
			if (ModChestLootTables.RUINED_PORTAL.equals(id) && source != LootTableSource.REPLACED) {
				throw new AssertionError("The Ruined Portal Chest loot table should have LootTableSource.REPLACED");
			}
			if (ModChestLootTables.RUINED_PORTAL.equals(id)) {
				if (source != LootTableSource.MOD) {
					throw new AssertionError("The Ruined Portal Chest loot table should have LootTableSource.MOD");
				}

				// 给已有的废弃传送门箱子添加小米锻造模板
				LootPool pool = LootPool.lootPool()
						.setRolls(UniformGenerator.between(1.0F, 3.0F))
						.add(LootItem.lootTableItem(MilletItems.MILLET_TEMPLATE).setWeight(15))
						.build();

				builder.pool(pool);
			}
		});

		LootTableEvents.MODIFY.register((id, builder, source, provider) -> {
			if (ModChestLootTables.ABANDONED_MINESHAFT.equals(id) && source != LootTableSource.REPLACED) {
				throw new AssertionError("The Abandoned Mineshaft Chest loot table should have LootTableSource.REPLACED");
			}
			if (ModChestLootTables.ABANDONED_MINESHAFT.equals(id)) {
				if (source != LootTableSource.MOD) {
					throw new AssertionError("The Abandoned Mineshaft Chest loot table should have LootTableSource.MOD");
				}

				// 给已有的废弃矿井箱子添加小米锻造模板
				LootPool pool = LootPool.lootPool()
						.setRolls(UniformGenerator.between(1.0F, 3.0F))
						.add(LootItem.lootTableItem(MilletItems.MILLET_TEMPLATE).setWeight(15))
						.build();

				builder.pool(pool);
			}
		});

		/*---- 村庄箱子 ----*/
		// 沙漠村庄
		LootTableEvents.MODIFY.register((id, builder, source, provider) -> {
			if (ModChestLootTables.VILLAGE_DESERT_HOUSE.equals(id) && source != LootTableSource.REPLACED) {
				throw new AssertionError("The Village Desert House Chest loot table should have LootTableSource.REPLACED");
			}
			if (ModChestLootTables.VILLAGE_DESERT_HOUSE.equals(id)) {
				if (source != LootTableSource.MOD) {
					throw new AssertionError("The Village Desert House Chest loot table should have LootTableSource.MOD");
				}

				// 给已有的沙漠村庄箱子添加小米锻造模板
				LootPool pool = LootPool.lootPool()
						.setRolls(UniformGenerator.between(1.0F, 3.0F))
						.add(LootItem.lootTableItem(MilletItems.MILLET_TEMPLATE).setWeight(15))
						.build();

				builder.pool(pool);
			}
		});
		// 平原村庄
		LootTableEvents.MODIFY.register((id, builder, source, provider) -> {
			if (ModChestLootTables.VILLAGE_PLAINS_HOUSE.equals(id) && source != LootTableSource.REPLACED) {
				throw new AssertionError("The Village Plains House Chest loot table should have LootTableSource.REPLACED");
			}
			if (ModChestLootTables.VILLAGE_PLAINS_HOUSE.equals(id)) {
				if (source != LootTableSource.MOD) {
					throw new AssertionError("The Village Plains House Chest loot table should have LootTableSource.MOD");
				}

				// 给已有的平原村庄箱子添加小米锻造模板
				LootPool pool = LootPool.lootPool()
						.setRolls(UniformGenerator.between(1.0F, 3.0F))
						.add(LootItem.lootTableItem(MilletItems.MILLET_TEMPLATE).setWeight(15))
						.build();

				builder.pool(pool);
			}
		});
		// 热带村庄
		LootTableEvents.MODIFY.register((id, builder, source, provider) -> {
			if (ModChestLootTables.VILLAGE_SAVANNA_HOUSE.equals(id) && source != LootTableSource.REPLACED) {
				throw new AssertionError("The Village Savanna House Chest loot table should have LootTableSource.REPLACED");
			}
			if (ModChestLootTables.VILLAGE_SAVANNA_HOUSE.equals(id)) {
				if (source != LootTableSource.MOD) {
					throw new AssertionError("The Village Savanna House Chest loot table should have LootTableSource.MOD");
				}

				// 给已有的热带村庄箱子添加小米锻造模板
				LootPool pool = LootPool.lootPool()
						.setRolls(UniformGenerator.between(1.0F, 3.0F))
						.add(LootItem.lootTableItem(MilletItems.MILLET_TEMPLATE).setWeight(15))
						.build();

				builder.pool(pool);
			}
		});
		// 雪原村庄
		LootTableEvents.MODIFY.register((id, builder, source, provider) -> {
			if (ModChestLootTables.VILLAGE_SNOWY_HOUSE.equals(id) && source != LootTableSource.REPLACED) {
				throw new AssertionError("The Village Snowy House Chest loot table should have LootTableSource.REPLACED");
			}
			if (ModChestLootTables.VILLAGE_SNOWY_HOUSE.equals(id)) {
				if (source != LootTableSource.MOD) {
					throw new AssertionError("The Village Snowy House Chest loot table should have LootTableSource.MOD");
				}

				// 给已有的雪原村庄箱子添加小米锻造模板
				LootPool pool = LootPool.lootPool()
						.setRolls(UniformGenerator.between(1.0F, 3.0F))
						.add(LootItem.lootTableItem(MilletItems.MILLET_TEMPLATE).setWeight(15))
						.build();

				builder.pool(pool);
			}
		});
		// 松树林村庄
		LootTableEvents.MODIFY.register((id, builder, source, provider) -> {
			if (ModChestLootTables.VILLAGE_TAIGA_HOUSE.equals(id) && source != LootTableSource.REPLACED) {
				throw new AssertionError("The Village Taiga House Chest loot table should have LootTableSource.REPLACED");
			}
			if (ModChestLootTables.VILLAGE_TAIGA_HOUSE.equals(id)) {
				if (source != LootTableSource.MOD) {
					throw new AssertionError("The Village Taiga House Chest loot table should have LootTableSource.MOD");
				}

				// 给已有的松树林村庄箱子添加小米锻造模板
				LootPool pool = LootPool.lootPool()
						.setRolls(UniformGenerator.between(1.0F, 3.0F))
						.add(LootItem.lootTableItem(MilletItems.MILLET_TEMPLATE).setWeight(15))
						.build();

				builder.pool(pool);
			}
		});
	}
}