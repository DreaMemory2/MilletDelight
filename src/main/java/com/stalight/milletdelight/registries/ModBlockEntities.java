package com.stalight.milletdelight.registries;

import com.stalight.milletdelight.MilletDelight;
import com.stalight.milletdelight.block.entity.MilletTableEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static BlockEntityType<MilletTableEntity> MILLET_TABLE_ENTITY;
    public static void registerBlockEntities() {
        MILLET_TABLE_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(MilletDelight.MODID, "drink_machine"),
                FabricBlockEntityTypeBuilder.create(MilletTableEntity::new, ModBlocksRegistry.MILLER_TABLE).build(null));
    }
}
