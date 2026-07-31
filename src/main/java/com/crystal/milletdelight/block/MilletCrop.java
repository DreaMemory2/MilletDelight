package com.crystal.milletdelight.block;

import com.crystal.milletdelight.item.MilletItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import org.jetbrains.annotations.NotNull;

public class MilletCrop extends CropBlock {

    public MilletCrop(Properties settings) {
        super(settings);
    }

    @Override
    protected @NotNull ItemLike getBaseSeedId() {
        return MilletItems.MILLET_PANICLE;
    }
}
