package net.erez.tropicalupdate.world.gen;

import net.erez.tropicalupdate.world.ModPlacedFeatures;
import net.erez.tropicalupdate.world.biome.ModBiomes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generatedOres() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MITHRIL_ORE_MIDDLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MITHRIL_ORE_UPPER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MITHRIL_SMALL_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TROPICAL_IRON_SMALL_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TROPICAL_IRON_ORE_UPPER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TROPICAL_IRON_ORE_PLACED_KEY_MIDDLE);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_TOPAZ);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_TOPAZ_LARGE);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_TOPAZ_BURIED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_TROPICAL_DIAMOND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_TROPICAL_DIAMOND_LARGE);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_TROPICAL_DIAMOND_BURIED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_TROPICAL_GOLD);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_TROPICAL_GOLD_LOWER);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_TROPICAL_GOLD_EXTRA);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_AMBER);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_AMBER_LAVA);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_TROPICAL_LAPIS);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_TROPICAL_LAPIS_BURIED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_TROPICAL_COAL);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_TROPICAL_COAL_LOWER);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_TROPICAL_REDSTONE);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_TROPICAL_REDSTONE_LOWER);
    }
}
