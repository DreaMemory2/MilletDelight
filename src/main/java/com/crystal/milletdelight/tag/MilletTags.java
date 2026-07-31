package com.crystal.milletdelight.tag;

import com.crystal.milletdelight.MilletDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class MilletTags {
    public static final TagKey<Item> MILLET_PASTRY = bindItem("millet_pastry");
    public static final TagKey<Item> MILLET_BISCUIT = bindItem("millet_biscuit");

    public static TagKey<Item> bindItem(String name) {
        return TagKey.create(Registries.ITEM, MilletDelight.of(name));
    }

    public static TagKey<Block> bindBlock(String name) {
        return TagKey.create(Registries.BLOCK, MilletDelight.of(name));
    }
}
