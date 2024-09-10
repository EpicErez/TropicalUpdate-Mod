package net.erez.tropicalupdate.world.gen;

import net.erez.tropicalupdate.world.ModPlacedFeatures;
import net.erez.tropicalupdate.world.biome.ModBiomes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModBedrockLayerGeneration {
    public static void generatedBedrockLayers() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY, ModBiomes.MANGO_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MOD_BEDROCK_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.MANGO_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.GRASS_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.MANGO_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.GRASS_PLACED_E_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.MANGO_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.GRASS_PLACED_A_KEY);

    }
}
