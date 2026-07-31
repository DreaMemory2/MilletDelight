package com.crystal.milletdelight.datagen;

import com.crystal.milletdelight.block.MilletBlocks;
import com.crystal.milletdelight.item.MilletItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.level.block.CropBlock;

public class ModModelGenerator extends FabricModelProvider {

    public ModModelGenerator(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators model) {
        // model.createCrossBlock(MilletBlocks.WILD_MILLET, BlockModelGenerators.TintState.NOT_TINTED);
        model.createCropBlock(MilletBlocks.MILLET, CropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
    }

    @Override
    public void generateItemModels(ItemModelGenerators model) {
        /* 材料 */
        model.generateFlatItem(MilletItems.MILLET_DUST, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.MILLET_NOODLE, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.MILLET, ModelTemplates.FLAT_ITEM);
        // model.generateFlatItem(MilletItems.MILLET_PANICLE, ModelTemplates.FLAT_ITEM);
        // 升级工具
        model.generateFlatItem(MilletItems.MILLET_TEMPLATE, ModelTemplates.FLAT_ITEM);
        /* 工具 */
        model.generateFlatItem(MilletItems.PESTLE_MORTAR, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.MILLET_KNIFE, ModelTemplates.FLAT_HANDHELD_ITEM);
        /* 食物 */
        model.generateFlatItem(MilletItems.APPLE_SAUCE, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.POTATO_SAUCE, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.COOKED_APPLE, ModelTemplates.FLAT_ITEM);
        // 棉花糖
        model.generateFlatItem(MilletItems.SPUN_SUGAR, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.COOKED_SPUN_SUGAR, ModelTemplates.FLAT_ITEM);
        /* 小米饼干 */
        model.generateFlatItem(MilletItems.MILLET_BISCUIT, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.CHOCOLATE_BISCUIT, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.HONEY_BISCUIT, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.MILK_BISCUIT, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.SCULK_BISCUIT, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.SWEET_BERRY_BISCUIT, ModelTemplates.FLAT_ITEM);
        /* 小米糕*/
        model.generateFlatItem(MilletItems.MILLET_PASTRY, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.CHOCOLATE_MILLET_PASTRY, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.CHORUS_MILLET_PASTRY, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.GLOW_BERRY_MILLET_PASTRY, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.MILK_MILLET_PASTRY, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.SCULK_MILLET_PASTRY, ModelTemplates.FLAT_ITEM);
        /* 酒饮 */
        model.generateFlatItem(MilletItems.MILLET_WINE, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.WHEAT_WINE, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.GLOW_BERRY_WINE, ModelTemplates.FLAT_ITEM);
        /* -- 小米系列 --  */
        // 小吃
        model.generateFlatItem(MilletItems.MILLET_BALL, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.POTATO_ROLLS, ModelTemplates.FLAT_ITEM);
        /* 主食 */
        // 米饭
        model.generateFlatItem(MilletItems.MILLET_RICE, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.FRIED_MILLET_RICE, ModelTemplates.FLAT_ITEM);
        // 搭配套餐
        model.generateFlatItem(MilletItems.MILLET_BEEF, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.MILLET_CHICKEN, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.MILLET_PORKCHOP, ModelTemplates.FLAT_ITEM);
        // 小米汤
        model.generateFlatItem(MilletItems.MILLET_GRUEL, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.MILLET_PUMPKIN_SOUP, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.MILLET_VEGETABLE_SOUP, ModelTemplates.FLAT_ITEM);
        // 面条汤
        model.generateFlatItem(MilletItems.MILLET_NOODLES, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.BONE_MILLET_NOODLES, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.POTATO_MILLET_NOODLES, ModelTemplates.FLAT_ITEM);
        model.generateFlatItem(MilletItems.TOMATO_MILLET_NOODLES, ModelTemplates.FLAT_ITEM);
    }
}
