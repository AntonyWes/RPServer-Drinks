package com.lil_antony.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemCooldowns;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.Objects;
import java.util.Random;

public class SmokeItem extends Item {
    Random rand;

    public SmokeItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        if(level.isClientSide() && interactionHand == InteractionHand.MAIN_HAND) {
            Vec3 positionClicked = player.getEyePosition();
            Vec3 LookAngle = player.getLookAngle();

            for(int i = 0; i <= positionClicked.y + 64; i++) {
                SpawnSmoke(level, positionClicked, LookAngle);
                player.getCooldowns().addCooldown(this, 40);
                break;
            }

        }

        player.getItemInHand(InteractionHand.MAIN_HAND).hurtAndBreak(1, player,
                player1 -> player1.broadcastBreakEvent(player1.getUsedItemHand()));


        return super.use(level, player, interactionHand);
    }

    private void SpawnSmoke(Level level, Vec3 positionClicked, Vec3 Look) {
        for(int i = 0; i < 40; i++) {
                level.addParticle(ParticleTypes.SMOKE,
                        positionClicked.x - 0.1d, positionClicked.y - 0.1, positionClicked.z,
                        Look.x / 10, Look.y / 10, Look.z / 10);
        }
    }
}
