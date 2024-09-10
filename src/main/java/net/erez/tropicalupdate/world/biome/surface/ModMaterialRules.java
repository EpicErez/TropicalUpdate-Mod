package net.erez.tropicalupdate.world.biome.surface;

import net.erez.tropicalupdate.block.ModBlocks;
import net.erez.tropicalupdate.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.minecraft.util.math.VerticalSurfaceType;

import javax.swing.plaf.nimbus.State;

public class ModMaterialRules {
    private static final MaterialRules.MaterialRule TROPICAL_DIRT = makeStateRule(ModBlocks.TROPICAL_DIRT);
    private static final MaterialRules.MaterialRule TROPICAL_GRASS_BLOCK = makeStateRule(ModBlocks.TROPICAL_GRASS_BLOCK);
    private static final MaterialRules.MaterialRule DEEPSLATE_TOPAZ = makeStateRule(ModBlocks.TROPICAL_GRASS_BLOCK);
    private static final MaterialRules.MaterialRule TROPICAL_STONE = makeStateRule(ModBlocks.TROPICAL_STONE);
        private static final MaterialRules.MaterialRule TROPICAL_DEEPSLATE = makeStateRule(ModBlocks.TROPICAL_DEEPSLATE);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(70, 0);
        MaterialRules.MaterialCondition isBelowWaterLevel = MaterialRules.water(63, 0);
        MaterialRules.MaterialCondition isBelowStoneLevel = MaterialRules.water(49, 0);
        MaterialRules.MaterialCondition isAlwaysBedrock = MaterialRules.water(150, -20);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(
                MaterialRules.condition(isAtOrAboveWaterLevel, TROPICAL_GRASS_BLOCK),
                MaterialRules.condition(isBelowWaterLevel, TROPICAL_DIRT)
        );


        MaterialRules.MaterialRule stoneSurface = MaterialRules.sequence(
                MaterialRules.condition(isBelowStoneLevel, TROPICAL_STONE)
        );

        MaterialRules.MaterialRule BedrockBottom = MaterialRules.sequence(
                MaterialRules.condition(isAlwaysBedrock, TROPICAL_DEEPSLATE)
        );

        return MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.surface(), grassSurface),
                MaterialRules.condition(MaterialRules.stoneDepth(60, false, VerticalSurfaceType.FLOOR), stoneSurface),
                MaterialRules.condition(MaterialRules.waterWithStoneDepth(60, 0), stoneSurface),
                MaterialRules.condition(MaterialRules.stoneDepth(150, false, VerticalSurfaceType.FLOOR), BedrockBottom)
        );


    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
