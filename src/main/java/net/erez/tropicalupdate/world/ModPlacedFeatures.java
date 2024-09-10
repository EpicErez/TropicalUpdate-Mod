package net.erez.tropicalupdate.world;

import net.erez.tropicalupdate.TropicalUpdate;
import net.erez.tropicalupdate.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> AZURE_PLACED_KEY = registerKey("azure_placed");

    public static final RegistryKey<PlacedFeature> MITHRIL_ORE_MIDDLE_PLACED_KEY = registerKey("mithril_ore_middle");

    public static final RegistryKey<PlacedFeature> GRASS_PLACED_KEY = registerKey("grass_placed");

    public static final RegistryKey<PlacedFeature> GRASS_PLACED_A_KEY = registerKey("grass_placed_a");

    public static final RegistryKey<PlacedFeature> ORE_TOPAZ = registerKey("ore_topaz");

    public static final RegistryKey<PlacedFeature> ORE_TOPAZ_LARGE = registerKey("ore_topaz_large");

    public static final RegistryKey<PlacedFeature> ORE_TOPAZ_BURIED = registerKey("ore_topaz_buried");

    public static final RegistryKey<PlacedFeature> ORE_AMBER = registerKey("ore_amber");

    public static final RegistryKey<PlacedFeature> ORE_AMBER_LAVA = registerKey("ore_amber_lava");

    public static final RegistryKey<PlacedFeature> ORE_TROPICAL_GOLD_LOWER = registerKey("ore_tropical_gold_lower");

    public static final RegistryKey<PlacedFeature> ORE_TROPICAL_GOLD = registerKey("ore_tropical_gold");

    public static final RegistryKey<PlacedFeature> ORE_TROPICAL_REDSTONE = registerKey("ore_tropical_redstone");

    public static final RegistryKey<PlacedFeature> ORE_TROPICAL_REDSTONE_LOWER = registerKey("ore_tropical_redstone_lower");

    public static final RegistryKey<PlacedFeature> ORE_TROPICAL_GOLD_EXTRA = registerKey("ore_tropical_gold_extra");

    public static final RegistryKey<PlacedFeature> ORE_TROPICAL_DIAMOND = registerKey("ore_tropical_diamond");

    public static final RegistryKey<PlacedFeature> ORE_TROPICAL_DIAMOND_LARGE = registerKey("ore_tropical_diamond_large");

    public static final RegistryKey<PlacedFeature> ORE_TROPICAL_DIAMOND_BURIED = registerKey("ore_tropical_diamond_buried");

    public static final RegistryKey<PlacedFeature> ORE_TROPICAL_LAPIS = registerKey("ore_tropical_lapis");

    public static final RegistryKey<PlacedFeature> ORE_TROPICAL_LAPIS_BURIED = registerKey("ore_tropical_lapis_buried");

    public static final RegistryKey<PlacedFeature> DEEPSLATE_PLACED_KEY = registerKey("deepslate_placed");

    public static final RegistryKey<PlacedFeature> TROPICAL_DEEPSLATE_E_PLACED_KEY = registerKey("tropical_deepslate_e_layer_placed");

    public static final RegistryKey<PlacedFeature> STONE_PLACED_KEY = registerKey("stone_placed");

    public static final RegistryKey<PlacedFeature> STONE_PLACED_E_KEY = registerKey("stone_placed_e");

    public static final RegistryKey<PlacedFeature> DEEPSLATE_PLACED_E_KEY = registerKey("deepslate_e_placed");

    public static final RegistryKey<PlacedFeature> GRASS_PLACED_E_KEY = registerKey("grass_placed_e");

    public static final RegistryKey<PlacedFeature> ORE_AMBER_FIX = registerKey("ore_amber_fix");

    public static final RegistryKey<PlacedFeature> MITHRIL_SMALL_PLACED_KEY = registerKey("mithril_ore_small");

    public static final RegistryKey<PlacedFeature> MITHRIL_ORE_UPPER_PLACED_KEY = registerKey("mithril_ore_upper");

    public static final RegistryKey<PlacedFeature> TROPICAL_IRON_ORE_PLACED_KEY_MIDDLE = registerKey("tropical_iron_ore_middle");

    public static final RegistryKey<PlacedFeature> TOPAZ_ORE_FIX_PLACED = registerKey("topaz_fix_placed");

    public static final RegistryKey<PlacedFeature> TROPICAL_IRON_SMALL_PLACED_KEY = registerKey("tropical_iron_ore_small");

    public static final RegistryKey<PlacedFeature> TROPICAL_IRON_ORE_UPPER_PLACED_KEY = registerKey("tropical_iron_ore_upper");

    public static final RegistryKey<PlacedFeature> MITHRIL_ORE_REPLACE_PLACED_KEY = registerKey("mithril_ore_replace_placed");

    public static final RegistryKey<PlacedFeature> ORE_TROPICAL_COAL_LOWER = registerKey("ore_tropical_coal_lower");

    public static final RegistryKey<PlacedFeature> ORE_TROPICAL_COAL = registerKey("ore_tropical_coal");

    public static final RegistryKey<PlacedFeature> ORE_TROPICAL_COAL_FIX = registerKey("ore_tropical_coal_fix");

    public static final RegistryKey<PlacedFeature> ORE_TROPICAL_REDSTONE_FIX = registerKey("ore_tropical_redstone_fix");

    public static final RegistryKey<PlacedFeature> MANGO_PLACED_KEY = registerKey("mango_placed");

    public static final RegistryKey<PlacedFeature> ORE_TROPICAL_GOLD_FIX = registerKey("ore_tropical_gold_fix");

    public static final RegistryKey<PlacedFeature> TROPICAL_DIAMOND_FIX_PLACED = registerKey("tropical_diamond_fix");

    public static final RegistryKey<PlacedFeature> ORE_TROPICAL_LAPIS_FIX = registerKey("ore_tropical_lapis_fix");

    public static final RegistryKey<PlacedFeature> LILY_OF_THE_VALLEY_PLACED_KEY = registerKey("lily_of_the_valley_placed");

    public static final RegistryKey<PlacedFeature> PINEAPPLE_BUSH_PLACED_KEY = registerKey("pineapple_bush_placed");

    public static final RegistryKey<PlacedFeature> TROPICAL_GRASS_PLACED_KEY = registerKey("tropical_grass_placed");

    public static final RegistryKey<PlacedFeature> CITRUS_PETAL_PLACED_KEY = registerKey("citrus_petal_placed");

    public static final RegistryKey<PlacedFeature> TROPICAL_BLOOM_PLACED_KEY = registerKey("tropical_bloom_placed");

    public static final RegistryKey<PlacedFeature> MOD_BEDROCK_PLACED_KEY = registerKey("mod_bedrock_placed");

    public static final RegistryKey<PlacedFeature> TROPICAL_DEEPSLATE_PLACED_KEY = registerKey("tropical_deepslate_placed");

    public static final RegistryKey<PlacedFeature> TROPICAL_DEEPSLATE_LAYER_PLACED_KEY = registerKey("tropical_deepslate_layer_placed");




    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, MOD_BEDROCK_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MOD_BEDROCK_KEY),
                ModOrePlacement.modifiersWithCount(500,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-64))));

        register(context, ORE_TROPICAL_REDSTONE_FIX, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_TROPICAL_REDSTONE_FIX),
                ModOrePlacement.modifiersWithCount(500,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-64))));

        register(context, ORE_AMBER, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_AMBER),
                ModOrePlacement.modifiersWithCount(3,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(10))));

        register(context, ORE_TROPICAL_REDSTONE, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_TROPICAL_REDSTONE),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.fixed(15))));

        register(context, ORE_TROPICAL_REDSTONE_LOWER, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_TROPICAL_REDSTONE),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-32), YOffset.aboveBottom(32))));

        register(context, ORE_TROPICAL_COAL_LOWER, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_TROPICAL_COAL_BURIED),
                ModOrePlacement.modifiersWithCount(20,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(192))));

        register(context, ORE_TROPICAL_COAL, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_TROPICAL_COAL),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(40), YOffset.fixed(80))));

        register(context, ORE_TROPICAL_LAPIS, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_TROPICAL_LAPIS),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-32), YOffset.fixed(32))));

        register(context, ORE_TROPICAL_LAPIS_BURIED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_TROPICAL_LAPIS_BURIED),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(64))));

        register(context, ORE_AMBER_LAVA, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_AMBER_LAVA),
                ModOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-58), YOffset.fixed(-53))));

        register(context, ORE_TROPICAL_GOLD_FIX, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_TROPICAL_GOLD_FIX),
                ModOrePlacement.modifiersWithCount(500,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-64))));

        register(context, ORE_AMBER_FIX, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_AMBER_FIX),
                ModOrePlacement.modifiersWithCount(500,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-64))));

        register(context, ORE_TROPICAL_LAPIS_FIX, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_AMBER_FIX),
                ModOrePlacement.modifiersWithCount(500,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-64))));

        register(context, ORE_TROPICAL_COAL_FIX, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_AMBER_FIX),
                ModOrePlacement.modifiersWithCount(500,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-64))));

        register(context, ORE_TOPAZ_LARGE, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_TOPAZ_LARGE),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

        register(context, ORE_TROPICAL_GOLD, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TROPICAL_GOLD_ORE_BURIED_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-64), YOffset.aboveBottom(32))));

        register(context, ORE_TROPICAL_GOLD_EXTRA, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TROPICAL_GOLD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(50,
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(32), YOffset.aboveBottom(256))));

        register(context, ORE_TROPICAL_GOLD_LOWER, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TROPICAL_GOLD_ORE_BURIED_KEY),
                ModOrePlacement.modifiersWithCount(50,
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-64), YOffset.aboveBottom(-48))));

        register(context, ORE_TROPICAL_DIAMOND, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_TROPICAL_DIAMOND_SMALL),
                ModOrePlacement.modifiersWithCount(7,
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

        register(context, ORE_TROPICAL_DIAMOND_LARGE, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_TROPICAL_DIAMOND_LARGE),
                ModOrePlacement.modifiersWithCount(9,
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

        register(context, ORE_TROPICAL_DIAMOND_BURIED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_TROPICAL_DIAMOND_BURIED),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

        register(context, ORE_TOPAZ_BURIED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_TOPAZ_BURIED),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

        register(context, MITHRIL_ORE_REPLACE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MITHRIL_ORE_REPLACE_KEY),
                ModOrePlacement.modifiersWithCount(500,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-64))));

        register(context, TROPICAL_DIAMOND_FIX_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_TROPICAL_DIAMOND_FIX),
                ModOrePlacement.modifiersWithCount(500,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-64))));

        register(context, TOPAZ_ORE_FIX_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TOPAZ_ORE_FIX),
                ModOrePlacement.modifiersWithCount(500,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-64))));

        register(context, ORE_TOPAZ, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_TOPAZ_SMALL),
                ModOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

        register(context, TROPICAL_DEEPSLATE_E_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TROPICAL_DEEPSLATE_KEY),
                ModOrePlacement.modifiersWithCount(500,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-64))));

        register(context, STONE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.STONE_KEY),
                ModOrePlacement.modifiersWithCount(500,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-64))));

        register(context, STONE_PLACED_E_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.STONE_KEY),
                ModOrePlacement.modifiersWithCount(500,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-64))));

        register(context, GRASS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GRASS_KEY),
                ModOrePlacement.modifiersWithCount(500,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(215))));

        register(context, GRASS_PLACED_A_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GRASS_KEY),
                ModOrePlacement.modifiersWithCount(500,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(215))));

        register(context, DEEPSLATE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NORMAL_DEEPSLATE_LAYER_KEY),
                ModOrePlacement.modifiersWithCount(500,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(215))));

        register(context, DEEPSLATE_PLACED_E_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NORMAL_DEEPSLATE_LAYER_KEY),
                ModOrePlacement.modifiersWithCount(500,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(215))));

        register(context, GRASS_PLACED_E_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GRASS_KEY),
                ModOrePlacement.modifiersWithCount(500,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(215))));

        register(context, MITHRIL_ORE_MIDDLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MITHRIL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-24), YOffset.fixed(56))));

        register(context, TROPICAL_IRON_ORE_PLACED_KEY_MIDDLE, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.IRON_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-24), YOffset.fixed(56))));

        register(context, MITHRIL_SMALL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MITHRIL_SMALL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(72))));

        register(context, TROPICAL_IRON_SMALL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.IRON_ORE_KEY_SMALL),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(72))));

        register(context, MITHRIL_ORE_UPPER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MITHRIL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(52,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(35), YOffset.fixed(384))));

        register(context, TROPICAL_IRON_ORE_UPPER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.IRON_ORE_KEY),
                ModOrePlacement.modifiersWithCount(52,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(35), YOffset.fixed(384))));

        register(context, TROPICAL_DEEPSLATE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TROPICAL_DEEPSLATE_KEY),
                ModOrePlacement.modifiersWithCount(500,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(0))));

        register(context, TROPICAL_DEEPSLATE_LAYER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_LAYER_KEY),
                ModOrePlacement.modifiersWithCount(500,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(0))));

        register(context, PINEAPPLE_BUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINEAPPLE_BUSH_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, AZURE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.AZURE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(0, 0f, 2),
                        ModBlocks.AZURE_SAPLING));

        register(context, MANGO_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MANGO_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(0, 0f, 2),
                        ModBlocks.MANGO_SAPLING));

        register(context, TROPICAL_GRASS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TROPICAL_GRASS_KEY),
                RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, CITRUS_PETAL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CITRUS_PETAL_KEY),
                RarityFilterPlacementModifier.of(6), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, LILY_OF_THE_VALLEY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LILY_OF_THE_VALLEY_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, TROPICAL_BLOOM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TROPICAL_BLOOM_KEY),
                RarityFilterPlacementModifier.of(9), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> pineappleBushPlacedKey, RegistryEntry.Reference<ConfiguredFeature<?,?>> orThrow, RarityFilterPlacementModifier of, SquarePlacementModifier of1, PlacementModifier motionBlockingHeightmap, BiomePlacementModifier of2) {
    }


    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TropicalUpdate.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}