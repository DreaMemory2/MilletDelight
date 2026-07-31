package com.crystal.milletdelight.datagen;

import com.crystal.milletdelight.block.MilletBlocks;
import com.crystal.milletdelight.item.MilletItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

/**
 * ClassName: ModChineseGenerator<br>
 * Description: <br>
 * Datetime: 2025/7/12 20:02<br>
 * @author Crystal
 * @version 1.0
 * @since 1.0
 */
public class ModChineseGenerator extends FabricLanguageProvider {

    public ModChineseGenerator(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder builder) {
        /* 方块 */
        block(builder);
        /* 物品 */
        item(builder);
        /* 进度 */
        advancement(builder);
        /* 其他 */
        builder.add("itemGroup.milletdelight.group", "小米乐事");
        builder.add("item.milletdelight.millet_template.info", "小米升级组件在地牢、废弃传送门、废弃矿井、村庄找到，概率为19.42%");
    }

    private void block(TranslationBuilder builder) {
        builder.add(MilletBlocks.WILD_MILLET, "野生小米");
        builder.add(MilletBlocks.MILLET_BAG, "小米袋");
        builder.add(MilletBlocks.MILLET_BALE, "小米捆");
        builder.add(MilletBlocks.MILLET_CAKES, "小米蛋糕");
    }

    private void item(TranslationBuilder builder) {
        /* 材料 */
        builder.add(MilletItems.MILLET, "小米");
        builder.add(MilletItems.MILLET_DUST, "小米面粉");
        builder.add(MilletItems.MILLET_NOODLE, "小米面条");
        builder.add(MilletItems.MILLET_PANICLE, "粟子");
        // 升级工具
        builder.add(MilletItems.MILLET_TEMPLATE, "小米锻造模板");
        /* 工具 */
        builder.add(MilletItems.PESTLE_MORTAR, "杵和臼");
        builder.add(MilletItems.MILLET_KNIFE, "小米刀");
        /* 食物 */
        builder.add(MilletItems.APPLE_SAUCE, "苹果酱");
        builder.add(MilletItems.POTATO_SAUCE, "土豆酱");
        builder.add(MilletItems.COOKED_APPLE, "烤苹果");
        // 棉花糖
        builder.add(MilletItems.SPUN_SUGAR, "棉花糖");
        builder.add(MilletItems.COOKED_SPUN_SUGAR, "烤棉花糖");
        /* 小米饼干 */
        builder.add(MilletItems.MILLET_BISCUIT, "原味小米饼干");
        builder.add(MilletItems.CHOCOLATE_BISCUIT, "巧克力夹心饼干");
        builder.add(MilletItems.HONEY_BISCUIT, "甜蜜夹心饼干");
        builder.add(MilletItems.MILK_BISCUIT, "奶香夹心饼干");
        builder.add(MilletItems.SCULK_BISCUIT, "幽匿夹心饼干");
        builder.add(MilletItems.SWEET_BERRY_BISCUIT, "浆果夹心饼干");
        /* 小米糕*/
        builder.add(MilletItems.MILLET_PASTRY, "小米糕点");
        builder.add(MilletItems.CHOCOLATE_MILLET_PASTRY, "巧克力小米糕");
        builder.add(MilletItems.CHORUS_MILLET_PASTRY, "紫颂小米糕");
        builder.add(MilletItems.GLOW_BERRY_MILLET_PASTRY, "发光浆果小米糕");
        builder.add(MilletItems.MILK_MILLET_PASTRY, "奶香小米糕");
        builder.add(MilletItems.SCULK_MILLET_PASTRY, "幽匿小米糕");
        /* 酒饮 */
        builder.add(MilletItems.MILLET_WINE, "小米酒");
        builder.add(MilletItems.WHEAT_WINE, "小麦酒");
        builder.add(MilletItems.GLOW_BERRY_WINE, "发光浆果酒");
        /* -- 小米系列 --  */
        // 小吃
        builder.add(MilletItems.POTATO_ROLLS, "煎饼果子");
        builder.add(MilletItems.MILLET_BALL, "小米炸丸");
        /* 主食 */
        // 米饭
        builder.add(MilletItems.MILLET_RICE, "小米饭");
        builder.add(MilletItems.FRIED_MILLET_RICE, "小米炒饭");
        // 搭配套餐
        builder.add(MilletItems.MILLET_BEEF, "小米配牛肉");
        builder.add(MilletItems.MILLET_CHICKEN, "小米配鸡肉");
        builder.add(MilletItems.MILLET_PORKCHOP, "小米配猪肉");
        // 小米汤
        builder.add(MilletItems.MILLET_GRUEL, "小米粥");
        builder.add(MilletItems.MILLET_PUMPKIN_SOUP, "小米南瓜汤");
        builder.add(MilletItems.MILLET_VEGETABLE_SOUP, "小米时蔬汤");
        // 面条汤
        builder.add(MilletItems.MILLET_NOODLES, "汤子");
        builder.add(MilletItems.BONE_MILLET_NOODLES, "小米骨汤");
        builder.add(MilletItems.POTATO_MILLET_NOODLES, "小米土豆汤");
        builder.add(MilletItems.TOMATO_MILLET_NOODLES, "小米西红柿汤");
    }

    public void advancement(TranslationBuilder builder) {
         builder.add("milletdelight.advancement.root", "小米乐事");
         builder.add("milletdelight.advancement.root.desc", "小米，启动");
         builder.add("milletdelight.advancement.millet_knife", "小米飞刀");
         builder.add("milletdelight.advancement.millet_knife.desc", "获得一把小米刀");
         builder.add("milletdelight.advancement.plant_millet","粟果累累");
         builder.add("milletdelight.advancement.plant_millet.desc", "在耕地里种一些小米");
         builder.add("milletdelight.advancement.material_food", "提前准备");
         builder.add("milletdelight.advancement.material_food.desc", "制作小米粉和小米面条");
         builder.add("milletdelight.advancement.meat", "顿顿有肉");
         builder.add("milletdelight.advancement.meat.desc", "小米和肉类灵魂组合");
         builder.add("milletdelight.advancement.eat_meat", "再来一碗");
         builder.add("milletdelight.advancement.eat_meat.desc", "吃掉所有肉类配米饭");
         builder.add("milletdelight.advancement.millet_biscuit", "扭一扭，泡一泡");
         builder.add("milletdelight.advancement.millet_biscuit.desc", "制作任意一个小米饼干");
         builder.add("milletdelight.advancement.millet_pastry", "香甜软糯");
         builder.add("milletdelight.advancement.millet_pastry.desc", "制作任意一个小米糕点");
         builder.add("milletdelight.advancement.cakes", "蛋糕是个谎言");
         builder.add("milletdelight.advancement.cakes.desc", "制作蛋糕");
         builder.add("milletdelight.advancement.all_food", "吃遍天下");
         builder.add("milletdelight.advancement.all_food.desc", "吃掉所有的小米乐事中的食物");
         builder.add("milletdelight.advancement.spun_sugar", "云朵上的食物");
         builder.add("milletdelight.advancement.spun_sugar.desc", "制作棉花糖");
         builder.add("milletdelight.advancement.cooked_spun_sugar", "烧烤时间到！");
         builder.add("milletdelight.advancement.cooked_spun_sugar.desc", "烤制棉花糖");
         builder.add("milletdelight.advancement.drink", "干杯！");
         builder.add("milletdelight.advancement.drink,desc", "制作饮酒系列");
         builder.add("milletdelight.advancement.fried_millet", "下饭！");
         builder.add("milletdelight.advancement.fried_millet.desc", "吃掉炒饭");
    }
}
