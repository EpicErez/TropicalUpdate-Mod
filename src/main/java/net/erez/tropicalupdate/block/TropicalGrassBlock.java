package net.erez.tropicalupdate.block;

import net.minecraft.block.*;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.tick.TickPriority;

import java.util.List;

public class TropicalGrassBlock extends GrassBlock implements Fertilizable {
    public TropicalGrassBlock(Settings settings) {
        super(settings);
    }


    public void eatenBySheep(World world, BlockPos pos) {
        if (!world.isClient()) {
            world.setBlockState(pos, ModBlocks.TROPICAL_DIRT.getDefaultState(), 3);
        }
    }


    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        BlockPos blockPos = pos.up();
        int flowerCount = 0; // Counter for flowers

        for (int i = 0; i < 10; ++i) {
            BlockPos blockPos2 = blockPos.add(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1);

            if (!world.getBlockState(blockPos2.down()).isOf(ModBlocks.TROPICAL_GRASS_BLOCK) || world.getBlockState(blockPos2).isFullCube(world, blockPos2)) {
                continue;
            }

            BlockState blockState2 = world.getBlockState(blockPos2);
            if (blockState2.isAir()) {
                if (random.nextInt(8) == 0 && flowerCount < 2) { // Adjusted condition for flower generation
                    // Place lime petal
                    world.setBlockState(blockPos2, ModBlocks.CITRUS_PETAL.getDefaultState(), 3);
                    flowerCount++;
                    if (flowerCount >= 2) {
                        break;
                    }
                } else {
                    world.setBlockState(blockPos2, ModBlocks.TROPICAL_GRASS.getDefaultState(), 3);
                }
            }
        }
    }


    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state, boolean isClient) {
        return world.getBlockState(pos.up()).isAir();
    }


    private static boolean canSurvive(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.up();
        BlockState blockState = world.getBlockState(blockPos);
        if (blockState.isOf(Blocks.SNOW) && (Integer)blockState.get(SnowBlock.LAYERS) == 1) {
            return true;
        } else if (blockState.getFluidState().getLevel() == 8) {
            return false;
        } else {
            int i = ChunkLightProvider.getRealisticOpacity(world, state, pos, blockState, blockPos, Direction.UP, blockState.getOpacity(world, blockPos));
            return i < world.getMaxLightLevel();
        }
    }

    private static boolean canSpread(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.up();
        return canSurvive(state, world, pos) && !world.getFluidState(blockPos).isIn(FluidTags.WATER);
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canSurvive(state, world, pos)) {
            world.setBlockState(pos, ModBlocks.TROPICAL_DIRT.getDefaultState());
        } else {
            if (world.getLightLevel(pos.up()) >= 9) {
                BlockState blockState = this.getDefaultState();

                for(int i = 0; i < 4; ++i) {
                    BlockPos blockPos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                    if (world.getBlockState(blockPos).isOf(ModBlocks.TROPICAL_DIRT) && canSpread(blockState, world, blockPos)) {
                        world.setBlockState(blockPos, (BlockState)blockState.with(SNOWY, world.getBlockState(blockPos.up()).isOf(Blocks.SNOW)));
                    }
                }
            }

        }
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        super.neighborUpdate(state, world, pos, block, fromPos, notify);
        if (!world.isClient) {
            BlockPos blockAbovePos = pos.up();
            BlockState blockAboveState = world.getBlockState(blockAbovePos);
            if (blockAboveState.isFullCube(world, blockAbovePos) && blockAboveState.isOpaque()) {
                // Change to Tropical Dirt
                world.setBlockState(pos, ModBlocks.TROPICAL_DIRT.getDefaultState(), 3);
                // If you also want to schedule a delayed change (e.g., after 1 second = 20 ticks)
                if (world instanceof ServerWorld) {
                    ((ServerWorld) world).scheduleBlockTick(pos, this, 20, TickPriority.NORMAL);
                }
            }
        }
    }

    public void eat(WorldAccess world, BlockPos pos, BlockState state, SheepEntity sheep) {
        if (!world.isClient()) {
            world.setBlockState(pos, ModBlocks.TROPICAL_DIRT.getDefaultState(), 3); // Replace with tropical dirt
        }
    }
}