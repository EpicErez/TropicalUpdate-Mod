package net.erez.tropicalupdate.block.custom;

import net.erez.tropicalupdate.block.ModBlocks;
import net.erez.tropicalupdate.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents; // Import the SoundEvents class
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class BlueRaspberryCrop extends ModCropBlock {
    public static final IntProperty AGE = IntProperty.of("age", 0, 7);

    public BlueRaspberryCrop(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        int age = state.get(AGE);
        if (age == getMaxAge()) {
            dropStack(world, pos, new ItemStack(ModItems.BLUE_RASPBERRY, 2)); // Drops 2 raspberries
            world.setBlockState(pos, state.with(AGE, 4), 2); // Resets to age 4

            // Play the sweet berry bush harvest sound
            world.playSound(player, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1.0f, 1.0f);

            return ActionResult.SUCCESS;
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(ModBlocks.TROPICAL_GRASS_BLOCK) || floor.isOf(ModBlocks.TROPICAL_DIRT); // Can plant on tropical grass or dirt
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return 7;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.BLUE_RASPBERRY_SEEDS; // Returns the seeds item
    }
}
