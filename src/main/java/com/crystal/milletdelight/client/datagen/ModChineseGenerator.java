package com.crystal.milletdelight.client.datagen;

import com.crystal.milletdelight.MilletDelight;
import com.crystal.milletdelight.block.MilletBlocks;
import com.crystal.milletdelight.item.MilletItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

/**
 * ClassName: ModChineseGenerator<br>
 * Description: <br>
 * Datetime: 2025/7/12 20:02<br>
 * @author Crystal
 * @version 1.0
 * @since 1.0
 */
public class ModChineseGenerator extends LanguageProvider {
    
    public ModChineseGenerator(PackOutput output) {
        super(output, MilletDelight.MODID, "zh_cn");
    }

    @Override
    public void addTranslations() {
        /* 方块 */
        block();
        /* 物品 */
        item();
        /* 进度 */
        advancement();
        /* 其他 */
        this.add("itemGroup.milletdelight.group", "小米乐事");
        this.add("item.milletdelight.millet_template.info", "小米升级组件在地牢、废弃传送门、废弃矿井、村庄找到，概率为19.42%");
    }

    private void block() {
        this.add(MilletBlocks.WILD_MILLET.get(), "野生小米");
        this.add(MilletBlocks.MILLET_BAG.get(), "小米袋");
        this.add(MilletBlocks.MILLET_BALE.get(), "小米捆");
        this.add(MilletBlocks.MILLET_CAKES.get(), "小米蛋糕");
    }

    private void item() {
        /* 材料 */
        this.add(MilletItems.MILLET.get(), "小米");
        this.add(MilletItems.MILLET_DUST.get(), "小米面粉");
        this.add(MilletItems.MILLET_NOODLE.get(), "小米面条");
        this.add(MilletItems.MILLET_PANICLE.get(), "粟子");
        // 升级工具
        this.add(MilletItems.MILLET_TEMPLATE.get(), "小米锻造模板");
        /* 工具 */
        this.add(MilletItems.PESTLE_MORTAR.get(), "杵和臼");
        this.add(MilletItems.MILLET_KNIFE.get(), "小米刀");
        /* 食物 */
        this.add(MilletItems.APPLE_SAUCE.get(), "苹果酱");
        this.add(MilletItems.POTATO_SAUCE.get(), "土豆酱");
        this.add(MilletItems.COOKED_APPLE.get(), "烤苹果");
        // 棉花糖
        this.add(MilletItems.SPUN_SUGAR.get(), "棉花糖");
        this.add(MilletItems.COOKED_SPUN_SUGAR.get(), "烤棉花糖");
        /* 小米饼干 */
        this.add(MilletItems.MILLET_BISCUIT.get(), "原味小米饼干");
        this.add(MilletItems.CHOCOLATE_BISCUIT.get(), "巧克力夹心饼干");
        this.add(MilletItems.HONEY_BISCUIT.get(), "甜蜜夹心饼干");
        this.add(MilletItems.MILK_BISCUIT.get(), "奶香夹心饼干");
        this.add(MilletItems.SCULK_BISCUIT.get(), "幽匿夹心饼干");
        this.add(MilletItems.SWEET_BERRY_BISCUIT.get(), "浆果夹心饼干");
        /* 小米糕*/
        this.add(MilletItems.MILLET_PASTRY.get(), "小米糕点");
        this.add(MilletItems.CHOCOLATE_MILLET_PASTRY.get(), "巧克力小米糕");
        this.add(MilletItems.CHORUS_MILLET_PASTRY.get(), "紫颂小米糕");
        this.add(MilletItems.GLOW_BERRY_MILLET_PASTRY.get(), "发光浆果小米糕");
        this.add(MilletItems.MILK_MILLET_PASTRY.get(), "奶香小米糕");
        this.add(MilletItems.SCULK_MILLET_PASTRY.get(), "幽匿小米糕");
        /* 酒饮 */
        this.add(MilletItems.MILLET_WINE.get(), "小米酒");
        this.add(MilletItems.WHEAT_WINE.get(), "小麦酒");
        this.add(MilletItems.GLOW_BERRY_WINE.get(), "发光浆果酒");
        /* -- 小米系列 --  */
        // 小吃
        this.add(MilletItems.POTATO_ROLLS.get(), "煎饼果子");
        this.add(MilletItems.MILLET_BALL.get(), "小米炸丸");
        /* 主食 */
        // 米饭
        this.add(MilletItems.MILLET_RICE.get(), "小米饭");
        this.add(MilletItems.FRIED_MILLET_RICE.get(), "小米炒饭");
        // 搭配套餐
        this.add(MilletItems.MILLET_BEEF.get(), "小米配牛肉");
        this.add(MilletItems.MILLET_CHICKEN.get(), "小米配鸡肉");
        this.add(MilletItems.MILLET_PORKCHOP.get(), "小米配猪肉");
        // 小米汤
        this.add(MilletItems.MILLET_GRUEL.get(), "小米粥");
        this.add(MilletItems.MILLET_PUMPKIN_SOUP.get(), "小米南瓜汤");
        this.add(MilletItems.MILLET_VEGETABLE_SOUP.get(), "小米时蔬汤");
        // 面条汤
        this.add(MilletItems.MILLET_NOODLES.get(), "汤子");
        this.add(MilletItems.BONE_MILLET_NOODLES.get(), "小米骨汤");
        this.add(MilletItems.POTATO_MILLET_NOODLES.get(), "小米土豆汤");
        this.add(MilletItems.TOMATO_MILLET_NOODLES.get(), "小米西红柿汤");
    }

    public void advancement() {
         this.add("milletdelight.advancement.root", "小米乐事");
         this.add("milletdelight.advancement.root.desc", "小米，启动");
         this.add("milletdelight.advancement.millet_knife", "小米飞刀");
         this.add("milletdelight.advancement.millet_knife.desc", "获得一把小米刀");
         this.add("milletdelight.advancement.plant_millet","粟果累累");
         this.add("milletdelight.advancement.plant_millet.desc", "在耕地里种一些小米");
         this.add("milletdelight.advancement.material_food", "提前准备");
         this.add("milletdelight.advancement.material_food.desc", "制作小米粉和小米面条");
         this.add("milletdelight.advancement.meat", "顿顿有肉");
         this.add("milletdelight.advancement.meat.desc", "小米和肉类灵魂组合");
         this.add("milletdelight.advancement.eat_meat", "再来一碗");
         this.add("milletdelight.advancement.eat_meat.desc", "吃掉所有肉类配米饭");
         this.add("milletdelight.advancement.millet_biscuit", "扭一扭，泡一泡");
         this.add("milletdelight.advancement.millet_biscuit.desc", "制作任意一个小米饼干");
         this.add("milletdelight.advancement.millet_pastry", "香甜软糯");
         this.add("milletdelight.advancement.millet_pastry.desc", "制作任意一个小米糕点");
         this.add("milletdelight.advancement.cakes", "蛋糕是个谎言");
         this.add("milletdelight.advancement.cakes.desc", "制作蛋糕");
         this.add("milletdelight.advancement.all_food", "吃遍天下");
         this.add("milletdelight.advancement.all_food.desc", "吃掉所有的小米乐事中的食物");
         this.add("milletdelight.advancement.spun_sugar", "云朵上的食物");
         this.add("milletdelight.advancement.spun_sugar.desc", "制作棉花糖");
         this.add("milletdelight.advancement.cooked_spun_sugar", "烧烤时间到！");
         this.add("milletdelight.advancement.cooked_spun_sugar.desc", "烤制棉花糖");
         this.add("milletdelight.advancement.drink", "干杯！");
         this.add("milletdelight.advancement.drink,desc", "制作饮酒系列");
         this.add("milletdelight.advancement.fried_millet", "下饭！");
         this.add("milletdelight.advancement.fried_millet.desc", "吃掉炒饭");
    }
}
