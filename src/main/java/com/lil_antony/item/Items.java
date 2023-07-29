package com.lil_antony.item;

import com.lil_antony.RPMOD.RPMOD;
import com.lil_antony.item.custom.SmokeItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RPMOD.MODID);

    public static final RegistryObject<Item> ROM = ITEMS.register("rom",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder().effect(
                            new MobEffectInstance(MobEffects.DAMAGE_BOOST, 900), 1.0f).effect(
                            new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 900), 1.0f).build())));

    public static final RegistryObject<Item> KONYAK = ITEMS.register("konyak",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder().effect(
                            new MobEffectInstance(MobEffects.DAMAGE_BOOST, 900), 1.0f).effect(
                            new MobEffectInstance(MobEffects.CONFUSION, 900), 1.0f).build())));


    public static final RegistryObject<Item> BEER = ITEMS.register("beer",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder().effect(
                            new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 900), 1.0f).effect(
                            new MobEffectInstance(MobEffects.CONFUSION, 900), 1.0f).build())));

    public static final RegistryObject<Item> VINO = ITEMS.register("vino",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder().effect(
                            new MobEffectInstance(MobEffects.HEAL, 100), 1.0f).build())));

    public static final RegistryObject<Item> APPLEJUSE = ITEMS.register("applejuice",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder().build())));

    public static final RegistryObject<Item> MELONJUSE = ITEMS.register("melonjuice",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder().build())));

    public static final RegistryObject<Item> BERRIESEJUSE = ITEMS.register("berriesjuice",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder().build())));

    public static final RegistryObject<Item> ROWBERRIESEJUSE = ITEMS.register("rowberriesjuice",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder().effect(
                            new MobEffectInstance(MobEffects.NIGHT_VISION, 600), 1.0f).build())));

    public static final RegistryObject<Item> CARROTJUSE = ITEMS.register("carrotjuice",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder().build())));

    public static final RegistryObject<Item> SPIRITMILK = ITEMS.register("spiritmilk",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder().effect(
                            new MobEffectInstance(MobEffects.SATURATION, 100), 1.0f).effect(
                            new MobEffectInstance(MobEffects.WITHER, 100), 1.0f).build())));
    public static final RegistryObject<Item> ELFPOTION = ITEMS.register("elfpotion",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder().effect(
                            new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600), 1.0f).effect(
                            new MobEffectInstance(MobEffects.REGENERATION, 2400), 1.0f).build())));

    public static final RegistryObject<Item> VINOGRAD = ITEMS.register("vinograd",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SMALLVINOGRAD = ITEMS.register("smallvinograd",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> VINOGRADKOLOMBAR = ITEMS.register("vinogradkolombar",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> HMEL = ITEMS.register("hmel",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> SPIRITELEMENT = ITEMS.register("spiritelement",
            () -> new Item(new Item.Properties()));

    public static  final RegistryObject<Item> TABACCO = ITEMS.register("tobacco",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> SMOKINGPIPE = ITEMS.register("pipe",
            () -> new SmokeItem(new Item.Properties().stacksTo(1).durability(20).setNoRepair()));




}
