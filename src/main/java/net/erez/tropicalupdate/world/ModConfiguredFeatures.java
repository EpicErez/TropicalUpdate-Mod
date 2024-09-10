package net.erez.tropicalupdate.world;


import net.erez.tropicalupdate.TropicalUpdate;
import net.erez.tropicalupdate.block.ModBlocks;
import net.erez.tropicalupdate.tag.ModBlockTags;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOD_BEDROCK_KEY = registerKey("mod_bedrock");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TROPICAL_DEEPSLATE_KEY = registerKey("tropical_deepslate");

    public static final RegistryKey<ConfiguredFeature<?, ?>> MITHRIL_ORE_REPLACE_KEY = registerKey("mithril_ore_replace");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_TOPAZ_SMALL = registerKey("ore_topaz_small");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_TOPAZ_LARGE = registerKey("ore_topaz_large");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_TOPAZ_BURIED = registerKey("ore_topaz_buried");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_TROPICAL_DIAMOND_FIX = registerKey("tropical_diamond_fix");

    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_LAYER_KEY = registerKey("tropical_deepslate_layer");

    public static final RegistryKey<ConfiguredFeature<?, ?>> NORMAL_DEEPSLATE_LAYER_KEY = registerKey("deepslate");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TOPAZ_ORE_FIX = registerKey("topaz_fix");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_TROPICAL_GOLD_FIX = registerKey("ore_tropical_gold_fix");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_AMBER = registerKey("ore_amber");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_TROPICAL_LAPIS = registerKey("ore_tropical_lapis");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_TROPICAL_LAPIS_BURIED = registerKey("ore_tropical_lapis_buried");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_AMBER_FIX = registerKey("ore_amber_fix");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_AMBER_LAVA = registerKey("ore_amber_lava");

    public static final RegistryKey<ConfiguredFeature<?, ?>> STONE_KEY = registerKey("stone");

    public static final RegistryKey<ConfiguredFeature<?, ?>> MITHRIL_ORE_KEY = registerKey("mithril_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TROPICAL_GOLD_ORE_KEY = registerKey("ore_tropical_gold");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TROPICAL_GOLD_ORE_BURIED_KEY = registerKey("ore_tropical_gold_buried");

    public static final RegistryKey<ConfiguredFeature<?, ?>> IRON_ORE_KEY = registerKey("tropical_iron_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> MITHRIL_SMALL_ORE_KEY = registerKey("mithril_ore_small");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_TROPICAL_LAPIS_FIX = registerKey("ore_tropical_lapis_fix");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_TROPICAL_DIAMOND_SMALL = registerKey("ore_tropical_diamond_small");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_TROPICAL_DIAMOND_LARGE = registerKey("ore_tropical_diamond_large");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_TROPICAL_DIAMOND_BURIED = registerKey("ore_tropical_diamond_buried");

    public static final RegistryKey<ConfiguredFeature<?, ?>> IRON_ORE_KEY_SMALL = registerKey("tropical_iron_ore_small");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_TROPICAL_COAL = registerKey("ore_tropical_coal");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_TROPICAL_REDSTONE = registerKey("ore_tropical_redstone");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_TROPICAL_COAL_BURIED = registerKey("ore_tropical_coal_buried");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_TROPICAL_COAL_FIX = registerKey("ore_tropical_coal_fix");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_TROPICAL_REDSTONE_FIX = registerKey("ore_tropical_redstone_fix");

    public static final RegistryKey<ConfiguredFeature<?, ?>> AZURE_KEY = registerKey("azure");

    public static final RegistryKey<ConfiguredFeature<?, ?>> MANGO_KEY = registerKey("mango");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PINEAPPLE_BUSH_KEY = registerKey("pineapple_bush");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TROPICAL_GRASS_KEY = registerKey("tropical_grass");

    public static final RegistryKey<ConfiguredFeature<?, ?>> GRASS_KEY = registerKey("grass");

    public static final RegistryKey<ConfiguredFeature<?, ?>> CITRUS_PETAL_KEY = registerKey("citrus_petal");

    public static final RegistryKey<ConfiguredFeature<?, ?>> LILY_OF_THE_VALLEY_KEY = registerKey("lily_of_the_valley");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TROPICAL_BLOOM_KEY = registerKey("tropical_bloom");



    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest tropicalStoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);

        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);

        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        RuleTest BedrockStoneReplaceables = new TagMatchRuleTest(ModBlockTags.TROPICAL_VALLEY_BEDROCK_REPLACEABLE);

        RuleTest DeepslateBedrockStoneReplaceables = new BlockMatchRuleTest(Blocks.DEEPSLATE);

        RuleTest GrassReplaceables = new BlockMatchRuleTest(ModBlocks.TROPICAL_GRASS_BLOCK);

        RuleTest MithrilOreReplace = new BlockMatchRuleTest(ModBlocks.MITHRIL_ORE);

        RuleTest amberOreFix = new BlockMatchRuleTest(ModBlocks.AMBER_ORE_BLOCK);

        RuleTest TropicalDeepslateReplaceables = new BlockMatchRuleTest(ModBlocks.TROPICAL_STONE);

        RuleTest TopazOreFixReplace = new BlockMatchRuleTest(ModBlocks.TOPAZ_ORE);

        RuleTest TropicalDiamondFix = new BlockMatchRuleTest(ModBlocks.TROPICAL_DIAMOND_ORE);

        RuleTest TropicalLapisFix = new BlockMatchRuleTest(ModBlocks.TROPICAL_LAPIS_ORE);

        RuleTest TropicalGoldFix = new BlockMatchRuleTest(ModBlocks.TROPICAL_GOLD_ORE);

        RuleTest TropicalCoalFix = new BlockMatchRuleTest(ModBlocks.TROPICAL_COAL_ORE);

        RuleTest TropicalRedstoneFix = new BlockMatchRuleTest(ModBlocks.TROPICAL_REDSTONE_ORE);

        List<OreFeatureConfig.Target> StoneBedrock =
                List.of(OreFeatureConfig.createTarget(BedrockStoneReplaceables, Blocks.BEDROCK.getDefaultState()));
        List<OreFeatureConfig.Target> MithrilDeepslateOre =
                List.of(OreFeatureConfig.createTarget(MithrilOreReplace, ModBlocks.TROPICAL_DEEPSLATE_MITHRIL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> TopazDeepslateOre =
                List.of(OreFeatureConfig.createTarget(TopazOreFixReplace, ModBlocks.TROPICAL_DEEPSLATE_TOPAZ_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> GoldDeepslateOre =
                List.of(OreFeatureConfig.createTarget(TropicalGoldFix, ModBlocks.TROPICAL_DEEPSLATE_GOLD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> TropicalDiamondDeepslateOre =
                List.of(OreFeatureConfig.createTarget(TropicalDiamondFix, ModBlocks.TROPICAL_DEEPSLATE_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> TropicalLapisDeepslateOre =
                List.of(OreFeatureConfig.createTarget(TropicalLapisFix, ModBlocks.TROPICAL_DEEPSLATE_LAPIS_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> TropicalDeepslateAmberOre =
                List.of(OreFeatureConfig.createTarget(amberOreFix, ModBlocks.TROPICAL_DEEPSLATE_AMBER_ORE_BLOCK.getDefaultState()));
        List<OreFeatureConfig.Target> TropicalDeepslateCoalOre =
                List.of(OreFeatureConfig.createTarget(TropicalCoalFix, ModBlocks.TROPICAL_DEEPSLATE_COAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> TropicalDeepslateRedstoneOre =
                List.of(OreFeatureConfig.createTarget(TropicalRedstoneFix, ModBlocks.TROPICAL_DEEPSLATE_REDSTONE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> TropicalDeepslateLayer =
                List.of(OreFeatureConfig.createTarget(TropicalDeepslateReplaceables, ModBlocks.TROPICAL_DEEPSLATE.getDefaultState()));
        List<OreFeatureConfig.Target> GrassLayer =
                List.of(OreFeatureConfig.createTarget(GrassReplaceables, Blocks.GRASS_BLOCK.getDefaultState()));
        List<OreFeatureConfig.Target> DeepslateLayer =
                List.of(OreFeatureConfig.createTarget(DeepslateBedrockStoneReplaceables, ModBlocks.TROPICAL_DEEPSLATE.getDefaultState()));
        List<OreFeatureConfig.Target> StoneLayer =
                List.of(OreFeatureConfig.createTarget(TropicalDeepslateReplaceables, Blocks.STONE.getDefaultState()));
        List<OreFeatureConfig.Target> NormalDeepslateLayers =
                List.of(OreFeatureConfig.createTarget(TropicalDeepslateReplaceables, Blocks.DEEPSLATE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldMithrilOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.MITHRIL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.TROPICAL_DEEPSLATE_MITHRIL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> topazOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TOPAZ_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.TROPICAL_DEEPSLATE_TOPAZ_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> amberOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.AMBER_ORE_BLOCK.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.TROPICAL_DEEPSLATE_AMBER_ORE_BLOCK.getDefaultState()));
        List<OreFeatureConfig.Target> tropicalIronOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TROPICAL_IRON_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.TROPICAL_DEEPSLATE_IRON_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> tropicalLapisOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TROPICAL_LAPIS_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.TROPICAL_DEEPSLATE_LAPIS_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> tropicalRedstoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TROPICAL_REDSTONE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.TROPICAL_DEEPSLATE_REDSTONE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> tropicalDiamondOre =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TROPICAL_DIAMOND_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.TROPICAL_DEEPSLATE_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> tropicalGoldOre =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TROPICAL_GOLD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.TROPICAL_DEEPSLATE_GOLD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> tropicalCoalOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TROPICAL_COAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.TROPICAL_DEEPSLATE_COAL_ORE.getDefaultState()));


        register(context, MOD_BEDROCK_KEY, Feature.ORE, new OreFeatureConfig(StoneBedrock, 1000));

        register(context, MITHRIL_ORE_REPLACE_KEY, Feature.ORE, new OreFeatureConfig(MithrilDeepslateOre, 1000));

        register(context, ORE_AMBER_FIX, Feature.ORE, new OreFeatureConfig(TropicalDeepslateAmberOre, 1000));

        register(context, ORE_TROPICAL_REDSTONE_FIX, Feature.ORE, new OreFeatureConfig(TropicalDeepslateRedstoneOre, 1000));

        register(context, TOPAZ_ORE_FIX, Feature.ORE, new OreFeatureConfig(TopazDeepslateOre, 1000));

        register(context, TROPICAL_GOLD_ORE_KEY, Feature.ORE, new OreFeatureConfig(tropicalGoldOre, 9));

        register(context, ORE_TROPICAL_LAPIS, Feature.ORE, new OreFeatureConfig(tropicalLapisOres, 7));

        register(context, ORE_TROPICAL_REDSTONE, Feature.ORE, new OreFeatureConfig(tropicalRedstoneOres, 8));

        register(context, ORE_TROPICAL_LAPIS_BURIED, Feature.ORE, new OreFeatureConfig(tropicalLapisOres, 7));

        register(context, ORE_TROPICAL_COAL, Feature.ORE, new OreFeatureConfig(tropicalCoalOres, 17));

        register(context, ORE_TROPICAL_COAL_BURIED, Feature.ORE, new OreFeatureConfig(tropicalCoalOres, 17));

        register(context, ORE_AMBER, Feature.SCATTERED_ORE, new OreFeatureConfig(amberOres, 1));

        register(context, ORE_AMBER_LAVA, Feature.SCATTERED_ORE, new OreFeatureConfig(amberOres, 1));

        register(context, ORE_TROPICAL_DIAMOND_FIX, Feature.ORE, new OreFeatureConfig(TropicalDiamondDeepslateOre, 1000));

        register(context, STONE_KEY, Feature.ORE, new OreFeatureConfig(StoneLayer, 1000));

        register(context, ORE_TROPICAL_COAL_FIX, Feature.ORE, new OreFeatureConfig(TropicalDeepslateCoalOre, 1000));

        register(context, ORE_TROPICAL_DIAMOND_SMALL, Feature.ORE, new OreFeatureConfig(tropicalDiamondOre, 4));

        register(context, ORE_TROPICAL_GOLD_FIX, Feature.ORE, new OreFeatureConfig(GoldDeepslateOre, 1000));

        register(context, ORE_TROPICAL_LAPIS_FIX, Feature.ORE, new OreFeatureConfig(TropicalLapisDeepslateOre, 1000));

        register(context, ORE_TROPICAL_DIAMOND_LARGE, Feature.ORE, new OreFeatureConfig(tropicalDiamondOre, 12));

        register(context, ORE_TROPICAL_DIAMOND_BURIED, Feature.ORE, new OreFeatureConfig(tropicalDiamondOre, 8));

        register(context, TROPICAL_DEEPSLATE_KEY, Feature.ORE, new OreFeatureConfig(TropicalDeepslateLayer, 1000));

        register(context, NORMAL_DEEPSLATE_LAYER_KEY, Feature.ORE, new OreFeatureConfig(NormalDeepslateLayers, 1000));

        register(context, TROPICAL_DEEPSLATE_KEY, Feature.ORE, new OreFeatureConfig(DeepslateLayer, 1000));

        register(context, GRASS_KEY, Feature.ORE, new OreFeatureConfig(GrassLayer, 1000));

        register(context, MITHRIL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMithrilOres, 8));

        register(context, IRON_ORE_KEY, Feature.ORE, new OreFeatureConfig(tropicalIronOres, 10));

        register(context, ORE_TOPAZ_SMALL, Feature.ORE, new OreFeatureConfig(topazOres, 4));

        register(context, ORE_TOPAZ_BURIED, Feature.ORE, new OreFeatureConfig(topazOres, 8));

        register(context, ORE_TOPAZ_LARGE, Feature.ORE, new OreFeatureConfig(topazOres, 12));

        register(context, MITHRIL_SMALL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMithrilOres, 4));

        register(context, IRON_ORE_KEY_SMALL, Feature.ORE, new OreFeatureConfig(tropicalIronOres, 5));

        register(context, PINEAPPLE_BUSH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINEAPPLE_BUSH)))));

        register(context, TROPICAL_GRASS_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(128, 8, 4, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.TROPICAL_GRASS)))));

        register(context, CITRUS_PETAL_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 4, 4, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CITRUS_PETAL)))));

        register(context, TROPICAL_BLOOM_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(28, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.TROPICAL_BLOOM)))));

        register(context, TROPICAL_BLOOM_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(28, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.TROPICAL_BLOOM)))));


        register(context, AZURE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.AZURE_LOG),
                new MegaJungleTrunkPlacer(12, 6, 6),

                BlockStateProvider.of(ModBlocks.AZURE_LEAVES),
                new JungleFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(1), 12),

                new TwoLayersFeatureSize(2, 1, 3)).build());

        register(context, MANGO_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MANGO_LOG),
                new MegaJungleTrunkPlacer(12, 6, 6),

                BlockStateProvider.of(ModBlocks.MANGO_LEAVES),
                new JungleFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(1), 12),

                new TwoLayersFeatureSize(2, 1, 3)).build());

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(TropicalUpdate.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}