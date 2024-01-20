package com.stalight.milletdelight.registries;

import com.stalight.milletdelight.MilletDelight;
import com.stalight.milletdelight.item.ItemList;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final RegistryKey<ItemGroup> GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP,
            new Identifier(MilletDelight.MODID, "group"));

    public static void registerItemGroup() {
        Registry.register(Registries.ITEM_GROUP, GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("itemGroup.milletdelight.group"))
                .icon(() -> new ItemStack(ItemList.MilletGruel))
                .build());
    }
}
