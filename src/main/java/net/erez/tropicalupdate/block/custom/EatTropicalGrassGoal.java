package net.erez.tropicalupdate.block.custom;

import net.erez.tropicalupdate.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.predicate.block.BlockStatePredicate;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

import java.util.EnumSet;
import java.util.function.Predicate;

public class EatTropicalGrassGoal extends Goal {
    private static final Predicate<BlockState> TROPICAL_GRASS_PREDICATE = (blockState) -> blockState.isOf(ModBlocks.TROPICAL_GRASS_BLOCK);
    private final SheepEntity sheep;
    private final World world;
    private int timer;

    public EatTropicalGrassGoal(SheepEntity sheep) {
        this.sheep = sheep;
        this.world = sheep.getWorld();
        this.setControls(EnumSet.of(Control.MOVE, Control.LOOK, Control.JUMP));
    }

    @Override
    public boolean canStart() {
        BlockPos blockPos = this.sheep.getBlockPos();
        BlockPos aboveBlockPos = blockPos.up();
        boolean isTropicalGrassAbove = this.world.getBlockState(aboveBlockPos).isOf(ModBlocks.TROPICAL_GRASS);
        return !isTropicalGrassAbove &&
                (this.sheep.getRandom().nextInt(this.sheep.isBaby() ? 40 : 500) == 0 &&
                        (TROPICAL_GRASS_PREDICATE.test(this.world.getBlockState(blockPos)) ||
                                this.world.getBlockState(blockPos.down()).isOf(ModBlocks.TROPICAL_GRASS_BLOCK)));
    }

    @Override
    public void start() {
        this.timer = this.getTickCount(20);
        this.world.sendEntityStatus(this.sheep, (byte)10);
        this.sheep.getNavigation().stop();
    }

    public void stop() {
        this.timer = 0;
    }

    public boolean shouldContinue() {
        return this.timer > 0;
    }

    public int getTimer() {
        return this.timer;
    }

    public void tick() {
        this.timer = Math.max(0, this.timer - 1);
        if (this.timer == this.getTickCount(4)) {
            BlockPos blockPos = this.sheep.getBlockPos();
            if (TROPICAL_GRASS_PREDICATE.test(this.world.getBlockState(blockPos))) {
                if (this.world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING)) {
                    this.world.breakBlock(blockPos, false);
                    this.world.setBlockState(blockPos, ModBlocks.TROPICAL_DIRT.getDefaultState(), 2);
                }
                this.sheep.onEatingGrass();
            } else {
                BlockPos blockPos2 = blockPos.down();
                if (this.world.getBlockState(blockPos2).isOf(ModBlocks.TROPICAL_GRASS_BLOCK)) {
                    if (this.world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING)) {
                        this.world.syncWorldEvent(2001, blockPos2, Block.getRawIdFromState(ModBlocks.TROPICAL_GRASS_BLOCK.getDefaultState()));
                        this.world.setBlockState(blockPos2, ModBlocks.TROPICAL_DIRT.getDefaultState(), 2);
                    }
                    this.sheep.onEatingGrass();
                }
            }
        }
    }
}
