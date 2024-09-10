/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.erez.tropicalupdate.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.World;

public class AmberOreBlock
        extends Block {
    private final IntProvider experienceDropped;

    public AmberOreBlock(AbstractBlock.Settings settings) {
        this(settings, ConstantIntProvider.create(0));
    }

    public AmberOreBlock(AbstractBlock.Settings settings, IntProvider experience) {
        super(settings);
        this.experienceDropped = experience;
    }

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack tool, boolean dropExperience) {
        super.onStacksDropped(state, world, pos, tool, dropExperience);
        if (dropExperience) {
            this.dropExperienceWhenMined(world, pos, tool, this.experienceDropped);
        }
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
