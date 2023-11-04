package com.lil_antony.item.custom;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class SmokeItem extends Item {
    Random rand;
    float num = 1.0F;

    public SmokeItem(Properties properties, float mun) {
        super(properties);
        num = mun;
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level level, @NotNull Player player, @NotNull InteractionHand interactionHand) {
        if(level.isClientSide() && interactionHand == InteractionHand.MAIN_HAND) {
            Vec3 positionClicked = player.getEyePosition();
            Vec3 LookAngle = player.getLookAngle();
            for(int i = 0; i <= positionClicked.y + 64; i++) {
                SpawnSmoke(level, player);
                player.getCooldowns().addCooldown(this, 40);
                break;
            }
        }
        player.getItemInHand(InteractionHand.MAIN_HAND).hurtAndBreak(1, player,
                player1 -> player1.broadcastBreakEvent(player1.getUsedItemHand()));
        return super.use(level, player, interactionHand);
    }

    void SpawnSmoke(Level level, Player player) {
        Vec3 MousePosition = player.getEyePosition();
        Vec3 LookAngle = player.getLookAngle();
        if (player.getItemInHand(InteractionHand.MAIN_HAND).getDamageValue() >= 16 && player.getItemInHand(InteractionHand.MAIN_HAND).getDamageValue() <= 20) {
            for (int i = 0; i < 1 * num; i++) {
                level.addParticle(ParticleTypes.SMOKE,
                        MousePosition.x - 0.1d, MousePosition.y - 0.1, MousePosition.z,
                        LookAngle.x / 10, LookAngle.y / 10, LookAngle.z / 10);
            }
        } else if (player.getItemInHand(InteractionHand.MAIN_HAND).getDamageValue() >= 6 && player.getItemInHand(InteractionHand.MAIN_HAND).getDamageValue() <= 15) {
            for (int i = 0; i < 10 * num; i++) {
                level.addParticle(ParticleTypes.SMOKE,
                        MousePosition.x - 0.1d, MousePosition.y - 0.1, MousePosition.z,
                        LookAngle.x / 5, LookAngle.y / 5, LookAngle.z / 5);
            }
        } else {
            for (int i = 0; i < 35 * num; i++) {
                level.addParticle(ParticleTypes.SMOKE,
                        MousePosition.x - 0.1d, MousePosition.y - 0.1, MousePosition.z,
                        LookAngle.x / 4, LookAngle.y / 4, LookAngle.z / 4);
            }
        }
    }

    @Override
    public boolean isValidRepairItem(@NotNull ItemStack itemStack1, @NotNull ItemStack itemStack2) {
        if (itemStack2.getItem().toString().equals("tobacco"))
        {
            return true;
        }
        return super.isValidRepairItem(itemStack1, itemStack2);
    }
}
