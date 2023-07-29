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
import static com.lil_antony.item.Items.SMOKINGPIPE;

public class SmokeItem extends Item {
    Random rand;

    public SmokeItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        if(level.isClientSide() && interactionHand == InteractionHand.MAIN_HAND) {
            Vec3 positionClicked = player.getEyePosition();
            Vec3 LookAngle = player.getLookAngle();

            for(int i = 0; i <= positionClicked.y + 64; i++) {
                SpawnSmoke(level, positionClicked, LookAngle, player);
                player.getCooldowns().addCooldown(this, 40);
                break;
            }

        }

        player.getItemInHand(InteractionHand.MAIN_HAND).hurtAndBreak(1, player,
                player1 -> player1.broadcastBreakEvent(player1.getUsedItemHand()));


        return super.use(level, player, interactionHand);
    }

    private void SpawnSmoke(Level level, Vec3 positionClicked, Vec3 Look, Player player) {
        if (player.getItemInHand(InteractionHand.MAIN_HAND).getDamageValue() >= 16 && player.getItemInHand(InteractionHand.MAIN_HAND).getDamageValue() <= 20){
            for(int i = 0; i < 1; i++) {
                level.addParticle(ParticleTypes.SMOKE,
                        positionClicked.x - 0.1d, positionClicked.y - 0.1, positionClicked.z,
                        Look.x / 10, Look.y / 10, Look.z / 10);
            }
            System.out.println("1");
        }
        else if (player.getItemInHand(InteractionHand.MAIN_HAND).getDamageValue() >= 6 && player.getItemInHand(InteractionHand.MAIN_HAND).getDamageValue() <= 15){
            for(int i = 0; i < 10; i++) {
                level.addParticle(ParticleTypes.SMOKE,
                        positionClicked.x - 0.1d, positionClicked.y - 0.1, positionClicked.z,
                        Look.x / 5, Look.y / 5, Look.z / 5);
            }
            System.out.println("2");
        }
        else {
            for(int i = 0; i < 35; i++) {
                level.addParticle(ParticleTypes.SMOKE,
                        positionClicked.x - 0.1d, positionClicked.y - 0.1, positionClicked.z,
                        Look.x / 5, Look.y / 5, Look.z / 5);
            }
            System.out.println("3");
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
