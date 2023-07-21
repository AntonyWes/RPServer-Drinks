package com.lil_antony.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SmokeItem extends Item {

    public SmokeItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        if (!level.isClientSide() && interactionHand == InteractionHand.MAIN_HAND)
        {
            CreateSmoke(player);
            player.getCooldowns().addCooldown(this, 60);
        }

        return super.use(level, player, interactionHand);
    }

    private void CreateSmoke(Player player)
    {
        player.sendSystemMessage(Component.literal("use"));
    }
}
