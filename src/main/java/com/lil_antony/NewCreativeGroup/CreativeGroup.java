package com.lil_antony.NewCreativeGroup;


import com.lil_antony.item.Items;
import com.lil_antony.RPMOD.RPMOD;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = RPMOD.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeGroup {

    public static final DeferredRegister<CreativeModeTab> CREATIVEMODETABS = DeferredRegister.create(
            Registries.CREATIVE_MODE_TAB,
            RPMOD.MODID);

    public static RegistryObject<CreativeModeTab> DRINKS = CREATIVEMODETABS.register("drinks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.RUM.get())).title(Component.translatable("creativemodetab.drinks")).build());
    public static RegistryObject<CreativeModeTab> FUMIGANT = CREATIVEMODETABS.register("fumigant",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.SMOKINGPIPE.get())).title(Component.translatable("creativemodetab.fumigant")).build());


    public static void register(IEventBus eventBus){
        CREATIVEMODETABS.register(eventBus);
    }
}
