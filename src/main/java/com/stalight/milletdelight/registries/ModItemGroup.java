package com.stalight.milletdelight.registries;

import com.stalight.milletdelight.MilletDelight;
import com.stalight.milletdelight.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;

public class ModItemGroup {
    public static final RegistryKey<ItemGroup> GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP,
            MilletDelight.of("group"));

    public static void init() {
        Registry.register(Registries.ITEM_GROUP, GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("itemGroup.milletdelight.group"))
                .icon(() -> new ItemStack(ModItems.MilletDust))
                .build());
    }

    private static ItemGroup.EntryCollector group() {
        return (context, list) -> {};
    }
}
