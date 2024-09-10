package net.erez.tropicalupdate.world.gen;

import net.erez.tropicalupdate.world.biome.ModBiomes;

public class ModWorldGeneration {
    public static void generatedModWorldGen() {
        ModBedrockLayerGeneration.generatedBedrockLayers();

        ModDeepslateLaterGeneration.generatedLayers();

        ModOreGeneration.generatedOres();

        ModDeepslateOreFix.fixDeepslateOres();

        ModTreeGeneration.generateTrees();

        ModFlowerGeneration.generateFlowers();
    }
}
