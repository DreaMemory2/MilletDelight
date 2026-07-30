package com.crystal.milletdelight.client.datagen;

import com.crystal.milletdelight.MilletDelight;
import com.crystal.milletdelight.item.MilletItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelGenerator extends ItemModelProvider {

    public ModItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MilletDelight.MODID, existingFileHelper);
    }

    @Override
    public void registerModels() {
        /* 材料 */
        this.basicItem(MilletItems.MILLET_DUST.get());
        this.basicItem(MilletItems.MILLET_NOODLE.get());
        this.basicItem(MilletItems.MILLET.get());
        this.basicItem(MilletItems.MILLET_PANICLE.get());
        // 升级工具
        this.basicItem(MilletItems.MILLET_TEMPLATE.get());
        /* 工具 */
        this.basicItem(MilletItems.PESTLE_MORTAR.get());
        this.handheldItem(MilletItems.MILLET_KNIFE.get());
        /* 食物 */
        this.basicItem(MilletItems.APPLE_SAUCE.get());
        this.basicItem(MilletItems.POTATO_SAUCE.get());
        this.basicItem(MilletItems.COOKED_APPLE.get());
        // 棉花糖
        this.basicItem(MilletItems.SPUN_SUGAR.get());
        this.basicItem(MilletItems.COOKED_SPUN_SUGAR.get());
        /* 小米饼干 */
        this.basicItem(MilletItems.MILLET_BISCUIT.get());
        this.basicItem(MilletItems.CHOCOLATE_BISCUIT.get());
        this.basicItem(MilletItems.HONEY_BISCUIT.get());
        this.basicItem(MilletItems.MILK_BISCUIT.get());
        this.basicItem(MilletItems.SCULK_BISCUIT.get());
        this.basicItem(MilletItems.SWEET_BERRY_BISCUIT.get());
        /* 小米糕*/
        this.basicItem(MilletItems.MILLET_PASTRY.get());
        this.basicItem(MilletItems.CHOCOLATE_MILLET_PASTRY.get());
        this.basicItem(MilletItems.CHORUS_MILLET_PASTRY.get());
        this.basicItem(MilletItems.GLOW_BERRY_MILLET_PASTRY.get());
        this.basicItem(MilletItems.MILK_MILLET_PASTRY.get());
        this.basicItem(MilletItems.SCULK_MILLET_PASTRY.get());
        /* 酒饮 */
        this.basicItem(MilletItems.MILLET_WINE.get());
        this.basicItem(MilletItems.WHEAT_WINE.get());
        this.basicItem(MilletItems.GLOW_BERRY_WINE.get());
        /* -- 小米系列 --  */
        // 小吃
        this.basicItem(MilletItems.MILLET_BALL.get());
        this.basicItem(MilletItems.POTATO_ROLLS.get());
        /* 主食 */
        // 米饭
        this.basicItem(MilletItems.MILLET_RICE.get());
        this.basicItem(MilletItems.FRIED_MILLET_RICE.get());
        // 搭配套餐
        this.basicItem(MilletItems.MILLET_BEEF.get());
        this.basicItem(MilletItems.MILLET_CHICKEN.get());
        this.basicItem(MilletItems.MILLET_PORKCHOP.get());
        // 小米汤
        this.basicItem(MilletItems.MILLET_GRUEL.get());
        this.basicItem(MilletItems.MILLET_PUMPKIN_SOUP.get());
        this.basicItem(MilletItems.MILLET_VEGETABLE_SOUP.get());
        // 面条汤
        this.basicItem(MilletItems.MILLET_NOODLES.get());
        this.basicItem(MilletItems.BONE_MILLET_NOODLES.get());
        this.basicItem(MilletItems.POTATO_MILLET_NOODLES.get());
        this.basicItem(MilletItems.TOMATO_MILLET_NOODLES.get());
    }
}
