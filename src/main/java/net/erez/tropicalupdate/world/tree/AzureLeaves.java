package net.erez.tropicalupdate.world.tree;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class AzureLeaves extends LeavesBlock {
    public AzureLeaves(Settings settings) {
        super(settings);
    }

    protected boolean shouldDecay(BlockState state) {
        return !state.get(PERSISTENT) && state.get(DISTANCE) == 20;
    }
}
