package net.erez.tropicalupdate.block.custom;

import com.mojang.serialization.Codec;
import net.erez.tropicalupdate.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.util.FeatureContext;

import java.util.Random;

public class PineappleBushFeature extends Feature<FeatureConfig> {
    public PineappleBushFeature(Codec<FeatureConfig> configCodec) {
        super(configCodec);
    }

    @Override
    public boolean generate(FeatureContext<FeatureConfig> context) {
        StructureWorldAccess world = context.getWorld();
        BlockPos pos = context.getOrigin();
        Random random = (Random) context.getRandom();

        // Check if the position is suitable for your feature
        if (world.getBlockState(pos.down()).getBlock() == ModBlocks.TROPICAL_GRASS_BLOCK) {
            // Set your block at the position
            world.setBlockState(pos, ModBlocks.PINEAPPLE_BUSH.getDefaultState(), 3);
            return true;
        }

        return false;
    }
}