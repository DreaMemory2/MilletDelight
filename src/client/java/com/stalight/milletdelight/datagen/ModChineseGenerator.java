package com.stalight.milletdelight.datagen;

import com.stalight.milletdelight.block.ModBlocks;
import com.stalight.milletdelight.item.ModItems;
import com.stalight.milletdelight.registries.ModItemGroup;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

/**
 * ClassName: ModChineseGenerator<br>
 * Description: <br>
 * Datetime: 2025/7/12 20:02<br>
 * @author Crystal
 * @version 1.0
 * @since 1.0
 */
public class ModChineseGenerator extends FabricLanguageProvider {
    public ModChineseGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder builder) {
        /* 方块 */
        block(builder);
        /* 物品 */
        item(builder);
        /* 进度 */
        advancement(builder);
        /* 其他 */
        builder.add(ModItemGroup.GROUP, "小米乐事");
        builder.add("entity.minecraft.villager.millet_farmer", "小米农民");
    }

    private void block(TranslationBuilder builder) {
        builder.add(ModBlocks.WILD_MILLET, "野生小米");
        builder.add(ModBlocks.MILLET_BAG, "小米袋");
        builder.add(ModBlocks.MILLET_BALE, "小米捆");
        builder.add(ModBlocks.MILLET_CAKES, "小米蛋糕");
    }

    private void item(TranslationBuilder builder) {
        /* 材料 */
        builder.add(ModItems.MilletDust, "小米面粉");
        builder.add(ModItems.MilletNoodle, "小米面条");
        builder.add(ModItems.MilletPanicle, "粟子");
        // 升级工具
        builder.add(ModItems.MilletTemplate, "小米锻造模板");
        /* 工具 */
        builder.add(ModItems.PESTLE_MORTAR, "杵和臼");
        builder.add(ModItems.MILLET_KNIFE, "小米刀");
        /* 食物 */
        builder.add(ModItems.APPLE_SAUCE, "苹果酱");
        builder.add(ModItems.POTATO_SAUCE, "土豆酱");
        builder.add(ModItems.COOKED_APPLE, "烤苹果");
        // 棉花糖
        builder.add(ModItems.SPUN_SUGAR, "棉花糖");
        builder.add(ModItems.COOKED_SPUN_SUGAR, "烤棉花糖");
        /* 小米饼干 */
        builder.add(ModItems.MILLET_BISCUIT, "原味小米饼干");
        builder.add(ModItems.CHOCOLATE_BISCUIT, "巧克力夹心饼干");
        builder.add(ModItems.HONEY_BISCUIT, "甜蜜夹心饼干");
        builder.add(ModItems.MILK_BISCUIT, "奶香夹心饼干");
        builder.add(ModItems.SCULK_BISCUIT, "幽匿夹心饼干");
        builder.add(ModItems.SWEET_BERRY_BISCUIT, "浆果夹心饼干");
        /* 小米糕*/
        builder.add(ModItems.MILLET_PASTRY, "小米糕点");
        builder.add(ModItems.CHOCOLATE_MILLET_PASTRY, "巧克力小米糕");
        builder.add(ModItems.CHORUS_MILLET_PASTRY, "紫颂小米糕");
        builder.add(ModItems.GLOW_BERRY_MILLET_PASTRY, "发光浆果小米糕");
        builder.add(ModItems.MILK_MILLET_PASTRY, "奶香小米糕");
        builder.add(ModItems.SCULK_MILLET_PASTRY, "幽匿小米糕");
        /* 酒饮 */
        builder.add(ModItems.MILLET_WINE, "小米酒");
        builder.add(ModItems.WHEAT_WINE, "小麦酒");
        builder.add(ModItems.GLOW_BERRY_WINE, "发光浆果酒");
        /* -- 小米系列 --  */
        // 小吃
        builder.add(ModItems.POTATO_ROLLS, "煎饼果子");
        builder.add(ModItems.MilletBall, "小米炸丸");
        /* 主食 */
        // 米饭
        builder.add(ModItems.MILLET_RICE, "小米饭");
        builder.add(ModItems.FRIED_MILLET_RICE, "小米炒饭");
        // 搭配套餐
        builder.add(ModItems.MILLET_BEEF, "小米配牛肉");
        builder.add(ModItems.MILLET_CHICKEN, "小米配鸡肉");
        builder.add(ModItems.MILLET_PORKCHOP, "小米配猪肉");
        // 小米汤
        builder.add(ModItems.MILLET_GRUEL, "小米粥");
        builder.add(ModItems.MILLET_PUMPKIN_SOUP, "小米南瓜汤");
        builder.add(ModItems.MILLET_VEGETABLE_SOUP, "小米时蔬汤");
        // 面条汤
        builder.add(ModItems.MILLET_NOODLES, "汤子");
        builder.add(ModItems.BONE_MILLET_NOODLES, "小米骨汤");
        builder.add(ModItems.POTATO_MILLET_NOODLES, "小米土豆汤");
        builder.add(ModItems.TOMATO_MILLET_NOODLES, "小米西红柿汤");
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
