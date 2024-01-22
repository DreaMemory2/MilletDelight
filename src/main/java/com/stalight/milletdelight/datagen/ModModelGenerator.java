package com.stalight.milletdelight.datagen;

import com.stalight.milletdelight.block.BlockList;
import com.stalight.milletdelight.block.MilletCrop;
import com.stalight.milletdelight.item.ItemList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelGenerator extends FabricModelProvider {
    public ModModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerTintableCross(BlockList.WILD_MILLET, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerCrop(BlockList.MILLET, MilletCrop.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemList.AppleSauce, Models.GENERATED);
        itemModelGenerator.register(ItemList.BoneMilletNoodles, Models.GENERATED);
        itemModelGenerator.register(ItemList.ChocolateCookie, Models.GENERATED);
        itemModelGenerator.register(ItemList.ChocolateMilletCake, Models.GENERATED);
        itemModelGenerator.register(ItemList.ChorusMilletCake, Models.GENERATED);
        itemModelGenerator.register(ItemList.CookedApple, Models.GENERATED);
        itemModelGenerator.register(ItemList.CookedMarshmallow, Models.GENERATED);
        itemModelGenerator.register(ItemList.CookedMillet, Models.GENERATED);
        itemModelGenerator.register(ItemList.FriedMillet, Models.GENERATED);
        itemModelGenerator.register(ItemList.GlowBerryMilletCake, Models.GENERATED);
        itemModelGenerator.register(ItemList.GlowBerryWine, Models.GENERATED);
        itemModelGenerator.register(ItemList.HoneyCookie, Models.GENERATED);
        itemModelGenerator.register(ItemList.Marshmallow, Models.GENERATED);
        itemModelGenerator.register(ItemList.MilkCookie, Models.GENERATED);
        itemModelGenerator.register(ItemList.MilkMilletCake, Models.GENERATED);
        itemModelGenerator.register(ItemList.MilletBall, Models.GENERATED);
        itemModelGenerator.register(ItemList.MilletBeef, Models.GENERATED);
        itemModelGenerator.register(ItemList.MilletCake, Models.GENERATED);
        itemModelGenerator.register(ItemList.MilletChicken, Models.GENERATED);
        itemModelGenerator.register(ItemList.MilletCookie, Models.GENERATED);
        itemModelGenerator.register(ItemList.MilletDust, Models.GENERATED);
        itemModelGenerator.register(ItemList.MilletGruel, Models.GENERATED);
        itemModelGenerator.register(ItemList.MilletNoodle, Models.GENERATED);
        itemModelGenerator.register(ItemList.MilletNoodles, Models.GENERATED);
        itemModelGenerator.register(ItemList.MilletPanicle, Models.GENERATED);
        itemModelGenerator.register(ItemList.MilletPorkchop, Models.GENERATED);
        itemModelGenerator.register(ItemList.MilletPumpkinSoup, Models.GENERATED);
        itemModelGenerator.register(ItemList.MilletVegetableSoup, Models.GENERATED);
        itemModelGenerator.register(ItemList.MilletWine, Models.GENERATED);
        itemModelGenerator.register(ItemList.PestleMortar, Models.GENERATED);
        itemModelGenerator.register(ItemList.PotatoMilletNoodles, Models.GENERATED);
        itemModelGenerator.register(ItemList.PotatoRolls, Models.GENERATED);
        itemModelGenerator.register(ItemList.SculkCookie, Models.GENERATED);
        itemModelGenerator.register(ItemList.SculkMilletCake, Models.GENERATED);
        itemModelGenerator.register(ItemList.SweetBerryCookie, Models.GENERATED);
        itemModelGenerator.register(ItemList.TomatoMilletNoodles, Models.GENERATED);
        itemModelGenerator.register(ItemList.WheatWine, Models.GENERATED);
        itemModelGenerator.register(ItemList.PotatoSauce, Models.GENERATED);
    }
}
