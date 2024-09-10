package net.erez.tropicalupdate.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class PineappleStewItem extends Item {
    public PineappleStewItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient) {
            if (user instanceof PlayerEntity) {
                PlayerEntity player = (PlayerEntity) user;
                if (!player.isCreative()) {
                    if (player.getInventory().insertStack(new ItemStack(Items.BOWL))) {
                        stack.decrement(0);
                    } else {
                        player.dropItem(new ItemStack(Items.BOWL), false);
                    }
                }
            }
        }
        return super.finishUsing(stack, world, user);
    }
}