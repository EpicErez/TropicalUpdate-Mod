package net.erez.tropicalupdate.block.custom;

import net.erez.tropicalupdate.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.CarrotsBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class TropicalCarrotBlock extends ModCropBlock {
    public TropicalCarrotBlock(Settings settings) {
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
        return Items.CARROT;
    }
}
