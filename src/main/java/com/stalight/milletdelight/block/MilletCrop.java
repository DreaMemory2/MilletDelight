package com.stalight.milletdelight.block;

import com.stalight.milletdelight.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;

public class MilletCrop extends CropBlock {
    public static final IntProperty AGE = Properties.AGE_7;
    public MilletCrop(Settings settings) {
        super(settings);
    }

    @Override
    public ItemConvertible getSeedsItem() {
        return ModItems.MilletPanicle;
    }

    @Override
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
