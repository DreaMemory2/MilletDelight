package com.stalight.milletdelight.datagen;

import com.stalight.milletdelight.block.MilletCrop;
import com.stalight.milletdelight.block.ModBlocks;
import com.stalight.milletdelight.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.*;

public class ModModelGenerator extends FabricModelProvider {
    public ModModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator model) {
        model.registerTintableCross(ModBlocks.WILD_MILLET, BlockStateModelGenerator.CrossType.NOT_TINTED);
        model.registerCrop(ModBlocks.MILLET, MilletCrop.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
    }

    @Override
    public void generateItemModels(ItemModelGenerator model) {
        /* 材料 */
        model.register(ModItems.MilletDust, Models.GENERATED);
        model.register(ModItems.MilletNoodle, Models.GENERATED);
        model.register(ModItems.MilletPanicle, Models.GENERATED);
        // 升级工具
        model.register(ModItems.MilletTemplate, Models.GENERATED);
        /* 工具 */
        model.register(ModItems.PESTLE_MORTAR, Models.GENERATED);
        model.register(ModItems.MILLET_KNIFE, Models.HANDHELD);
        /* 食物 */
        model.register(ModItems.APPLE_SAUCE, Models.GENERATED);
        model.register(ModItems.POTATO_SAUCE, Models.GENERATED);
        model.register(ModItems.COOKED_APPLE, Models.GENERATED);
        // 棉花糖
        model.register(ModItems.SPUN_SUGAR, Models.GENERATED);
        model.register(ModItems.COOKED_SPUN_SUGAR, Models.GENERATED);
        /* 小米饼干 */
        model.register(ModItems.MILLET_BISCUIT, Models.GENERATED);
        model.register(ModItems.CHOCOLATE_BISCUIT, Models.GENERATED);
        model.register(ModItems.HONEY_BISCUIT, Models.GENERATED);
        model.register(ModItems.MILK_BISCUIT, Models.GENERATED);
        model.register(ModItems.SCULK_BISCUIT, Models.GENERATED);
        model.register(ModItems.SWEET_BERRY_BISCUIT, Models.GENERATED);
        /* 小米糕*/
        model.register(ModItems.MILLET_PASTRY, Models.GENERATED);
        model.register(ModItems.CHOCOLATE_MILLET_PASTRY, Models.GENERATED);
        model.register(ModItems.CHORUS_MILLET_PASTRY, Models.GENERATED);
        model.register(ModItems.GLOW_BERRY_MILLET_PASTRY, Models.GENERATED);
        model.register(ModItems.MILK_MILLET_PASTRY, Models.GENERATED);
        model.register(ModItems.SCULK_MILLET_PASTRY, Models.GENERATED);
        /* 酒饮 */
        model.register(ModItems.MILLET_WINE, Models.GENERATED);
        model.register(ModItems.WHEAT_WINE, Models.GENERATED);
        model.register(ModItems.GLOW_BERRY_WINE, Models.GENERATED);
        /* -- 小米系列 --  */
        // 小吃
        model.register(ModItems.POTATO_ROLLS, Models.GENERATED);
        /* 主食 */
        // 米饭
        model.register(ModItems.MILLET_RICE, Models.GENERATED);
        model.register(ModItems.FRIED_MILLET_RICE, Models.GENERATED);
        // 搭配套餐
        model.register(ModItems.MILLET_BEEF, Models.GENERATED);
        model.register(ModItems.MILLET_CHICKEN, Models.GENERATED);
        model.register(ModItems.MILLET_PORKCHOP, Models.GENERATED);
        // 小米汤
        model.register(ModItems.MILLET_GRUEL, Models.GENERATED);
        model.register(ModItems.MILLET_PUMPKIN_SOUP, Models.GENERATED);
        model.register(ModItems.MILLET_VEGETABLE_SOUP, Models.GENERATED);
        // 面条汤
        model.register(ModItems.MILLET_NOODLES, Models.GENERATED);
        model.register(ModItems.BONE_MILLET_NOODLES, Models.GENERATED);
        model.register(ModItems.POTATO_MILLET_NOODLES, Models.GENERATED);
        model.register(ModItems.TOMATO_MILLET_NOODLES, Models.GENERATED);
    }
}
