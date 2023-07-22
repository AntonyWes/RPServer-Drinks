package com.lil_antony.RPMOD;

import com.lil_antony.NewCreativeGroup.CreativeGroup;
import com.lil_antony.item.Items;
import com.lil_antony.loot.ModLootModifeires;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
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

        Items.ITEMS.register(modEventBus);

        ModLootModifeires.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeGroup.DRINKS) {
            event.accept(Items.ROM);
            event.accept(Items.KONYAK);
            event.accept(Items.BEER);
            event.accept(Items.VINO);
            event.accept(Items.APPLEJUSE);
            event.accept(Items.MELONJUSE);
            event.accept(Items.BERRIESEJUSE);
            event.accept(Items.ROWBERRIESEJUSE);
            event.accept(Items.CARROTJUSE);
            event.accept(Items.SPIRITMILK);
            event.accept(Items.ELFPOTION);
            event.accept(Items.HMEL);
            event.accept(Items.VINOGRAD);
            event.accept(Items.SMALLVINOGRAD);
            event.accept(Items.VINOGRADKOLOMBAR);
            event.accept(Items.SPIRITELEMENT);
        }
        if (event.getTab() == CreativeGroup.FUMIGANT) {
            event.accept(Items.SMOKINGPIPE);
        }
    }

}
