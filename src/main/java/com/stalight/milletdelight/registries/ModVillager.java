package com.stalight.milletdelight.registries;

import com.google.common.collect.ImmutableSet;
import com.stalight.milletdelight.MilletDelight;
import com.stalight.milletdelight.block.ModBlocks;
import com.stalight.milletdelight.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillager {
    public static final RegistryKey<VillagerProfession> MILLET_FARMER = RegistryKey.of(RegistryKeys.VILLAGER_PROFESSION, MilletDelight.of("millet_farmer"));
    public static final RegistryKey<PointOfInterestType> MILLET_FARMER_TYPE = RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, MilletDelight.of("millet_farmer"));

    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(MILLET_FARMER, 1, factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModItems.MilletPanicle, 25),
                            new ItemStack(Items.EMERALD, 1),
                            10, 2, 0.02F));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModBlocks.MILLET, 15),
                            new ItemStack(Items.EMERALD, 1),
                            10, 2, 0.02F));
        });
        TradeOfferHelper.registerVillagerOffers(MILLET_FARMER, 2, factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(ModItems.MilletDust, 15),
                        5, 5, 0.02F));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(ModItems.MilletNoodle, 4),
                    5, 5, 0.02F));
        });
        TradeOfferHelper.registerVillagerOffers(MILLET_FARMER, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 18),
                    new ItemStack(ModItems.APPLE_SAUCE, 1),
                    4, 10, 0.02F));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 18),
                    new ItemStack(ModItems.POTATO_SAUCE, 1),
                    4, 10, 0.02F));
        });
        TradeOfferHelper.registerVillagerOffers(MILLET_FARMER, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 20),
                    new ItemStack(ModItems.POTATO_ROLLS, 1),
                    4, 15, 0.02F));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 20),
                    new ItemStack(ModItems.MILLET_WINE, 1),
                    4, 15, 0.02F));
        });
        TradeOfferHelper.registerVillagerOffers(MILLET_FARMER, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 25),
                    new ItemStack(ModItems.MilletTemplate, 1),
                    3, 30, 0.02F));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 64),
                    new ItemStack(vectorwing.farmersdelight.common.registry.ModItems.NETHERITE_KNIFE.get(), 1),
                    3, 30, 0.02F));
        });
    }

    private static VillagerProfession register(Registry<VillagerProfession> registry,
                                               RegistryKey<VillagerProfession> key,
                                               RegistryKey<PointOfInterestType> heldWorkstation,
                                               ImmutableSet<Item> gatherableItems) {
        SoundEvent sound = SoundEvents.ENTITY_VILLAGER_WORK_FARMER;
        return Registry.register(
                registry,
                key,
                new VillagerProfession(
                        Text.translatable("entity.milletdelight.villager." + key.getValue().getPath()),
                        entry -> entry.matchesKey(heldWorkstation),
                        entry -> entry.matchesKey(heldWorkstation),
                        gatherableItems,
                        ImmutableSet.of(ModBlocks.MILLET),
                        sound
                )
        );
    }

    public static void init() {

    }
}
