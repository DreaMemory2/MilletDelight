package com.crystal.milletdelight.tag;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ICommonTags {
    public static final TagKey<Item> EGG = bindItem("egg");

    private static TagKey<Item> bindItem(String name) {
        return TagKey.create(Registries.ITEM, new ResourceLocation("c", name));
    }
}
