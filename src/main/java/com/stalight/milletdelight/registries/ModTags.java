package com.stalight.milletdelight.registries;

import com.stalight.milletdelight.MilletDelight;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static final TagKey<Item> MILLET_COOKIE = TagKey.of(RegistryKeys.ITEM, new Identifier(MilletDelight.MODID, "millet_cookie"));

    public static void registerTag() {
        MilletDelight.LOGGER.info("Mod Tags");
    }
}
