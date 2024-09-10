package net.erez.tropicalupdate.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemEffect extends Item {
    public ItemEffect(Settings settings) {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (selected && entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;
            if (player.getMainHandStack() == stack) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1, 0));
            }
        }
    }
}
