package net.erez.tropicalupdate.block;

import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.*;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class TropicalFarmland extends FarmlandBlock {
    public TropicalFarmland(Settings settings) {
        super(settings);
    }


    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction == Direction.UP && !state.canPlaceAt(world, pos)) {
            world.scheduleBlockTick(pos, this, 1);
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }


    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.canPlaceAt(world, pos)) {
            turnToTropicalDirt(state, world, pos);
        } else {
            int i = state.get(MOISTURE);
            if (!isWaterNearby(world, pos) && !world.hasRain(pos.up())) {
                if (i > 0) {
                    world.setBlockState(pos, state.with(MOISTURE, i - 1), Block.NOTIFY_LISTENERS);
                } else if (!hasCrop(world, pos)) {
                    turnToTropicalDirt(state, world, pos);
                }
            } else if (i < 7) {
                world.setBlockState(pos, state.with(MOISTURE, 7), Block.NOTIFY_LISTENERS);
            }
        }
    }

    private static boolean isWaterNearby(WorldView world, BlockPos pos) {
        for (BlockPos blockpos : BlockPos.iterate(pos.add(-4, 0, -4), pos.add(4, 1, 4))) {
            if (world.getFluidState(blockpos).isIn(FluidTags.WATER)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasCrop(ServerWorld world, BlockPos pos) {
        BlockState state = world.getBlockState(pos.up());
        return state.getBlock() instanceof CropBlock || state.getBlock() instanceof StemBlock;
    }

    public static void turnToTropicalDirt(BlockState state, ServerWorld world, BlockPos pos) {
        // Check if the current state is already TropicalDirt to prevent unnecessary block updates
        if (!state.isOf(ModBlocks.TROPICAL_DIRT)) {
            // Change the block to TropicalDirt without dropping any items
            world.setBlockState(pos, ModBlocks.TROPICAL_DIRT.getDefaultState(), Block.NOTIFY_LISTENERS);
        }
    }

    @Override
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        if (entity instanceof LivingEntity && !(entity instanceof PlayerEntity && entity.isSneaking())) {
            if (fallDistance > 10.0) {  // Only trample if the fall distance is above 10.0
                super.onLandedUpon(world, state, pos, entity, fallDistance);
            }
        }
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (!state.isOf(newState.getBlock())) {
            if (!newState.isAir()) {
                world.setBlockState(pos, ModBlocks.TROPICAL_DIRT.getDefaultState(), Block.NOTIFY_LISTENERS);
            }
        }
    }
    public static void setToTropicalDirt(@Nullable Entity entity, BlockState state, World world, BlockPos pos) {
        BlockState blockState = pushEntitiesUpBeforeBlockChange(state, ModBlocks.TROPICAL_DIRT.getDefaultState(), world, pos);
        world.setBlockState(pos, blockState);
        world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(entity, blockState));
    }
}