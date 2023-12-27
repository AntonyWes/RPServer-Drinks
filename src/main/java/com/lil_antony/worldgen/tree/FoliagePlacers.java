package com.lil_antony.worldgen.tree;

import com.lil_antony.RPMOD.RPMOD;
import com.lil_antony.worldgen.tree.custom.CoffeFoliagePlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraft.world.level.levelgen.feature.foliageplacers.PineFoliagePlacer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class FoliagePlacers {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS =
            DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, RPMOD.MODID);

    public static final RegistryObject<FoliagePlacerType<CoffeFoliagePlacer>> COFFE_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("coffe_foliage_placer", () -> new FoliagePlacerType<>(CoffeFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}
