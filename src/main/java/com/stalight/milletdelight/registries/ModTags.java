package com.stalight.milletdelight.registries;

import com.stalight.milletdelight.MilletDelight;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class ModTags {
    public static TagKey<Item> milletCookie;
    public static TagKey<Item> milletCake;
    public static void registerTag() {
        milletCookie = TagKey.of(RegistryKeys.ITEM, MilletDelight.of("millet_cookie"));
        milletCake = TagKey.of(RegistryKeys.ITEM, MilletDelight.of("millet_cake"));

        MilletDelight.LOGGER.info("Mod Tags");
    }
}
