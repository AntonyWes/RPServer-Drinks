package com.lil_antony.item.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import org.jetbrains.annotations.NotNull;

public class AlcoholItem extends Item {

    String type = "Alco";

    public AlcoholItem(Properties properties, String type1) {
        super(properties);
        type = type1;
    }

    @Override
    public @NotNull SoundEvent getEatingSound() {
        switch (type) {
            case "Juise":
                return SoundEvents.GENERIC_DRINK;
            default:
                return SoundEvents.HONEY_DRINK;
        }
    }

    public @NotNull SoundEvent getDrinkingSound() {
        switch (type) {
            case "Juise":
                return SoundEvents.GENERIC_DRINK;
            default:
                return SoundEvents.HONEY_DRINK;
        }
    }

    @Override
    public @NotNull UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }


}
