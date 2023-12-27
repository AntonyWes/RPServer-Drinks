package com.lil_antony.worldgen.tree;

import com.lil_antony.RPMOD.RPMOD;
import com.lil_antony.worldgen.tree.custom.CoffeTrunkPlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTrunkPlacerTypes {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, RPMOD.MODID);

    public static final RegistryObject<TrunkPlacerType<CoffeTrunkPlacer>> COFFE_TRUNK_PLACER =
            TRUNK_PLACER.register("coffe_trunk_placer", () -> new TrunkPlacerType<>(CoffeTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus) {
        TRUNK_PLACER.register(eventBus);
    }
}
