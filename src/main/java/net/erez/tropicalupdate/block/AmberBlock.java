package net.erez.tropicalupdate.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AmberBlock extends Block {
    public AmberBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!world.isClient && entity instanceof LivingEntity) {
            LivingEntity livingEntity = (LivingEntity) entity;
            // Check if the entity has the fire resistance effect
            if (!livingEntity.hasStatusEffect(StatusEffects.FIRE_RESISTANCE)) {
                // Set the entity on fire (you can adjust the duration as needed)
                entity.setOnFireFor(5); // 5 ticks (1 second)
            }
        }
        super.onSteppedOn(world, pos, state, entity);
    }
}
