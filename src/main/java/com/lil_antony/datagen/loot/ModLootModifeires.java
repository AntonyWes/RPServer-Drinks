package com.lil_antony.datagen.loot;

import com.lil_antony.RPMOD.RPMOD;
import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifeires {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFEIR_SERIALIZED =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, RPMOD.MODID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_ITEM =
            LOOT_MODIFEIR_SERIALIZED.register("add_item", AddItemModifer.CODEC);


    public static void register(IEventBus bus){
        LOOT_MODIFEIR_SERIALIZED.register(bus);
    }


}
