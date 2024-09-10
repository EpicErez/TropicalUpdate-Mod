package net.erez.tropicalupdate.block.custom;

import net.erez.tropicalupdate.block.ModBlocks;
import net.erez.tropicalupdate.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.Items;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class TropicalBloomPlant extends ModCropBlock {
    public static final int MAX_AGE = 4;
    public static final IntProperty AGE =IntProperty.of("age", 0, 4);
    public TropicalBloomPlant(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canReplace(BlockState state, ItemPlacementContext context) {
        return false;
    }


    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(ModBlocks.TROPICAL_FARMLAND);
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }




    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.TROPICAL_BLOOM_SEEDS;
    }
}
