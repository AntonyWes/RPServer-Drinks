package com.lil_antony.NewCreativeGroup;


import com.lil_antony.item.Items;
import com.lil_antony.RPMOD.RPMOD;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RPMOD.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeGroup {

    public static CreativeModeTab DRINKS;

    @SubscribeEvent
    public static void RegisterCreativeTabs(CreativeModeTabEvent.Register event) {
        DRINKS = event.registerCreativeModeTab(new ResourceLocation(RPMOD.MODID, "drinks"),
                builder -> builder.icon(() -> new ItemStack(Items.ROM.get())).title(Component.translatable("creativemodetab.drinks")));

    }
}
