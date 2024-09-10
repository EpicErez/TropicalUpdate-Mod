package net.erez.tropicalupdate.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class AmberItem extends Item {
    public AmberItem(Settings settings) {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;
            // Check if the player is not in Creative mode, doesn't have fire resistance, and is not in water
            if (!player.isCreative() && !player.hasStatusEffect(StatusEffects.FIRE_RESISTANCE) && !player.isSubmergedInWater()) {
                // Check if the item is in the player's main hand or offhand
                if (player.getMainHandStack() == stack || player.getOffHandStack() == stack) {
                    // Set the player on fire (adjust duration and strength as needed)
                    player.setOnFireFor(5);
                }
            }
        }
    }
}
