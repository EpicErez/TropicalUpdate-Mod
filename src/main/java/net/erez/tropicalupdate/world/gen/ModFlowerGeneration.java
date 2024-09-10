package net.erez.tropicalupdate.world.gen;

import net.erez.tropicalupdate.world.ModPlacedFeatures;
import net.erez.tropicalupdate.world.biome.ModBiomes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModFlowerGeneration {
    public static void generateFlowers() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PINEAPPLE_BUSH_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TROPICAL_GRASS_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY, ModBiomes.MANGO_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CITRUS_PETAL_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TROPICAL_BLOOM_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.LILY_OF_THE_VALLEY_PLACED_KEY);
    }
}
