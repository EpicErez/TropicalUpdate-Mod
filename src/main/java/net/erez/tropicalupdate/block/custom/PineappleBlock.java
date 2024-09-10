package net.erez.tropicalupdate.block.custom;

import net.erez.tropicalupdate.block.ModBlocks;
import net.erez.tropicalupdate.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class PineappleBlock extends ModCropBlock {
    public PineappleBlock(Settings settings) {
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
    protected ItemConvertible getSeedsItem() {
        return ModItems.PINEAPPLE_SEEDS;
    }
}
