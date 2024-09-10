package net.erez.tropicalupdate.world.gen;

import net.erez.tropicalupdate.world.ModPlacedFeatures;
import net.erez.tropicalupdate.world.biome.ModBiomes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModDeepslateOreFix {
    public static void fixDeepslateOres() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MITHRIL_ORE_REPLACE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TOPAZ_ORE_FIX_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TROPICAL_DIAMOND_FIX_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_TROPICAL_GOLD_FIX);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_AMBER_FIX);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_TROPICAL_LAPIS_FIX);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_TROPICAL_COAL_FIX);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TROPICAL_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_TROPICAL_REDSTONE_FIX);

    }
}
