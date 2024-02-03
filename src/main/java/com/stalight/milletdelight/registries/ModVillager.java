package com.stalight.milletdelight.registries;

import com.google.common.collect.ImmutableList;
import com.nhoryzon.mc.farmersdelight.registry.ItemsRegistry;
import com.stalight.milletdelight.MilletDelight;
import com.stalight.milletdelight.item.ItemList;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillager {
    public static final PointOfInterestType MILLET_TABLE = registerBlock("millet_table", ModBlocksRegistry.MILLER_TABLE);
    public static final VillagerProfession MILLET_FARMER = registerProfession("millet_farmer",
            RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(MilletDelight.MODID, "millet_table")));

    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        SoundEvent sound = SoundEvents.ENTITY_VILLAGER_WORK_FARMER;
        return Registry.register(Registries.VILLAGER_PROFESSION, setId(name),
                VillagerProfessionBuilder.create().id(setId(name)).workstation(type).workSound(sound).build());
    }
    private static PointOfInterestType registerBlock(String name, Block block) {
        return PointOfInterestHelper.register(setId(name), 1, 10,
                ImmutableList.copyOf(block.getStateManager().getStates()));
    }
    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(MILLET_FARMER, 1, factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ItemList.MilletPanicle, 25),
                            new ItemStack(Items.EMERALD, 1),
                            10, 2, 0.02F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ItemList.Millet, 15),
                            new ItemStack(Items.EMERALD, 1),
                            10, 2, 0.02F));
        });
        TradeOfferHelper.registerVillagerOffers(MILLET_FARMER, 2, factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(ItemList.MilletDust, 15),
                        5, 5, 0.02F));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ItemList.MilletNoodle, 4),
                    5, 5, 0.02F));
        });
        TradeOfferHelper.registerVillagerOffers(MILLET_FARMER, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 18),
                    new ItemStack(ItemList.AppleSauce, 1),
                    4, 10, 0.02F));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 18),
                    new ItemStack(ItemList.PotatoSauce, 1),
                    4, 10, 0.02F));
        });
        TradeOfferHelper.registerVillagerOffers(MILLET_FARMER, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 20),
                    new ItemStack(ItemList.PotatoRolls, 1),
                    4, 15, 0.02F));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 20),
                    new ItemStack(ItemList.MilletWine, 1),
                    4, 15, 0.02F));
        });
        TradeOfferHelper.registerVillagerOffers(MILLET_FARMER, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 25),
                    new ItemStack(ItemList.MilletTemplate, 1),
                    3, 30, 0.02F));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 64),
                    new ItemStack(ItemsRegistry.NETHERITE_KNIFE.get(), 1),
                    3, 30, 0.02F));
        });
    }
    public static Identifier setId(String name) {
        return new Identifier(MilletDelight.MODID, name);
    }

    public static void registerVillager() {
        MilletDelight.LOGGER.debug("Registering villagers for" + MilletDelight.MODID);
    }
}
