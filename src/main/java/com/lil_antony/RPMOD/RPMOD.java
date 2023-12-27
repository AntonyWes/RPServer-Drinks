package com.lil_antony.RPMOD;

import com.lil_antony.NewCreativeGroup.CreativeGroup;
import com.lil_antony.block.ModBlocks;
import com.lil_antony.item.ModItems;
import com.lil_antony.datagen.loot.ModLootModifeires;
import com.lil_antony.worldgen.tree.FoliagePlacers;
import com.lil_antony.worldgen.tree.ModTrunkPlacerTypes;
import com.mojang.logging.LogUtils;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RPMOD.MODID)
public class RPMOD
{
    public static final String MODID = "rpmod";
    private static final Logger LOGGER = LogUtils.getLogger();
    public RPMOD()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CreativeGroup.register(modEventBus);

        ModItems.ITEMS.register(modEventBus);
        ModLootModifeires.register(modEventBus);

        ModTrunkPlacerTypes.register(modEventBus);
        FoliagePlacers.register(modEventBus);

        ModBlocks.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == CreativeGroup.DRINKS.get()) {
            event.accept(ModItems.RUM);
            event.accept(ModItems.KONYAK);
            event.accept(ModItems.BEER);
            event.accept(ModItems.VINO);
            event.accept(ModItems.APPLEJUSE);
            event.accept(ModItems.MELONJUSE);
            event.accept(ModItems.BERRIESEJUSE);
            event.accept(ModItems.ROWBERRIESEJUSE);
            event.accept(ModItems.CARROTJUSE);
            event.accept(ModItems.SPIRITMILK);
            event.accept(ModItems.ELFPOTION);
            event.accept(ModItems.HMEL);
            event.accept(ModItems.VINOGRAD);
            event.accept(ModItems.SMALLVINOGRAD);
            event.accept(ModItems.VINOGRADKOLOMBAR);
            event.accept(ModItems.SPIRITELEMENT);
            event.accept(ModBlocks.COFFE_SAPLING);
        }
        if (event.getTab() == CreativeGroup.FUMIGANT.get()) {
            event.accept(ModItems.SMOKINGPIPE);
            event.accept(ModItems.TABACCO);
        }
    }

}
