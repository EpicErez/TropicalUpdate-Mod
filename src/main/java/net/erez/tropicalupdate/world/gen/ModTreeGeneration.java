package net.erez.tropicalupdate.world.gen;

import net.erez.tropicalupdate.world.ModPlacedFeatures;
import net.erez.tropicalupdate.world.biome.ModBiomes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.AZURE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.MANGO_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MANGO_PLACED_KEY);
    }
}
