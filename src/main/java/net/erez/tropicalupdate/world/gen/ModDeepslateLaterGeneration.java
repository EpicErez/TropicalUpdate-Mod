package net.erez.tropicalupdate.world.gen;

import net.erez.tropicalupdate.block.ModBlocks;
import net.erez.tropicalupdate.item.ModItems;
import net.erez.tropicalupdate.world.ModPlacedFeatures;
import net.erez.tropicalupdate.world.biome.ModBiomes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModDeepslateLaterGeneration {
    public static void generatedLayers() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TROPICAL_DEEPSLATE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TROPICAL_DEEPSLATE_LAYER_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TROPICAL_DEEPSLATE_E_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.MANGO_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DEEPSLATE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.MANGO_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DEEPSLATE_PLACED_E_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.MANGO_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.STONE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.MANGO_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.STONE_PLACED_E_KEY);

    }
}
