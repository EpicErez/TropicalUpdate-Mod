package net.erez.tropicalupdate.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.erez.tropicalupdate.TropicalUpdate;
import net.erez.tropicalupdate.block.custom.*;
import net.erez.tropicalupdate.world.tree.AzureSaplingGenerator;
import net.erez.tropicalupdate.world.tree.MangoTreeSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.BedPart;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block AZURE_LEAVES = registerBlock("azure_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).sounds(BlockSoundGroup.AZALEA_LEAVES).strength(0.3f)));
    public static final Block MITHRIL_LANTERN = registerBlock("mithril_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN).strength(4f).resistance(4f).luminance(15)));
    public static final Block MITHRIL_BARS = registerBlock("mithril_bars",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS).strength(5.5f).resistance(6.5f)));
    public static final Block POLISHED_TROPICAL_DEEPSLATE = registerBlock("polished_tropical_deepslate",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE).strength(4f).resistance(6.5f)));
    public static final Block MITHRIL_CHAIN = registerBlock("mithril_chain",
            new ChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).strength(5.5f).resistance(6.5f)));
    public static final Block MANGO_LEAVES = registerBlock("mango_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES).strength(0.2f)));
    public static final Block AZURE_LOG = registerBlock("azure_log",
            new CustomLogBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).burnable()));
    public static final Block MANGO_FRUIT_LEAVES = registerBlock("mango_fruit_leaves",
                new LeavesBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES).strength(0.4f)));
    public static final Block MANGO_LOG = registerBlock("mango_log",
            new CustomLogBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LOG).strength(2.5f).resistance(2.3f).burnable()));
    public static final Block COBBLED_TROPICAL_DEEPSLATE = registerBlock("cobbled_tropical_deepslate",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE).strength(4f).resistance(6.5f)));
    public static final Block TROPICAL_POTATO_BLOCK = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "tropical_potato_block"),
            new TropicalPotatoBlock(FabricBlockSettings.copyOf(Blocks.POTATOES).ticksRandomly()));
    public static final Block MITHRIL_ORE = registerBlock("mithril_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(3.6f).resistance(3.6f)));
    public static final Block TROPICAL_DEEPSLATE_MITHRIL_ORE = registerBlock("tropical_deepslate_mithril_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).strength(5.1f).resistance(3.6f)));
    public static final Block TROPICAL_DEEPSLATE_IRON_ORE = registerBlock("tropical_deepslate_iron_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).strength(5.0f).resistance(3.5f)));
    public static final Block TROPICAL_IRON_ORE = registerBlock("tropical_iron_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(3.5f).resistance(3.5f)));
    public static final Block TROPICAL_DEEPSLATE = registerBlock("tropical_deepslate",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).resistance(6.5f).strength(3.5f)));
    public static final Block AZURE_SAPLING = registerBlock("azure_sapling",
            new SaplingBlock(new AzureSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block MANGO_SAPLING = registerBlock("mango_sapling",
            new SaplingBlock(new MangoTreeSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block AZURE_PLANKS = registerBlock("azure_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f).resistance(2.3f).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block MANGO_PLANKS = registerBlock("mango_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS)));
    public static final Block TROPICAL_DIRT = registerBlock("tropical_dirt",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).strength(1f)));
    public static final Block TROPICAL_DIRT_PATH = registerBlock("tropical_dirt_path",
            new TropicalDirtPathBlock(FabricBlockSettings.copyOf(Blocks.DIRT_PATH).strength(1.15f)));
    public static final Block AZURE_WOOD = registerBlock("azure_wood",
            new CustomLogBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD).strength(2.6f).resistance(2.4f)));
    public static final Block MANGO_WOOD = registerBlock("mango_wood",
            new CustomLogBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD)));
    public static final Block STRIPPED_MANGO_WOOD = registerBlock("stripped_mango_wood",
            new CustomLogBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD)));
    public static final Block TROPICAL_CARROT_BLOCK = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "tropical_carrot_block"),
            new TropicalCarrotBlock(FabricBlockSettings.copyOf(Blocks.CARROTS).ticksRandomly()));
    public static final Block TROPICAL_GRASS_BLOCK = registerBlock("tropical_grass_block",
            new TropicalGrassBlock(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).strength(1.1f)));
    public static final Block TROPICAL_STONE = registerBlock("tropical_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f).resistance(6.5f)));
    public static final Block TROPICAL_COBBLESTONE = registerBlock("tropical_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).strength(2.5f).resistance(6.5f)));
    public static final Block TROPICAL_FARMLAND = registerBlock("tropical_farmland",
            new TropicalFarmland(FabricBlockSettings.copyOf(Blocks.FARMLAND).ticksRandomly().strength(1.1f)));
    public static final Block MITHRIL_BLOCK = registerBlock("mithril_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(5.5f).resistance(6.5f).sounds(BlockSoundGroup.NETHERITE)));
    public static final Block STRIPPED_AZURE_LOG = registerBlock("stripped_azure_log",
            new CustomLogBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2.5f).resistance(2.3f)));
    public static final Block STRIPPED_MANGO_LOG = registerBlock("stripped_mango_log",
            new CustomLogBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_LOG)));
    public static final Block STRIPPED_AZURE_WOOD = registerBlock("stripped_azure_wood",
            new CustomLogBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2.5f).resistance(2.3f)));
    public static final Block AZURE_STAIRS = registerBlock("azure_stairs",
            new StairsBlock(ModBlocks.AZURE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS).strength(2.5f).resistance(2.3f)));
    public static final Block TROPICAL_STONE_STAIRS = registerBlock("tropical_stone_stairs",
            new StairsBlock(ModBlocks.TROPICAL_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).strength(2f).resistance(6.5f)));
    public static final Block TROPICAL_STONE_BRICK_STAIRS = registerBlock("tropical_stone_brick_stairs",
            new StairsBlock(ModBlocks.TROPICAL_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).strength(2f).resistance(6.5f)));
    public static final Block MANGO_STAIRS = registerBlock("mango_stairs",
            new StairsBlock(ModBlocks.MANGO_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.JUNGLE_STAIRS)));
    public static final Block TROPICAL_COBBLESTONE_STAIRS = registerBlock("tropical_cobblestone_stairs",
            new StairsBlock(ModBlocks.TROPICAL_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS).strength(2.5f).resistance(6.5f)));
    public static final Block AZURE_DOOR = registerBlock("azure_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).strength(3.5f).resistance(2.3f), BlockSetType.OAK));
    public static final Block MANGO_DOOR = registerBlock("mango_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE));
    public static final Block AZURE_SLAB = registerBlock("azure_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB).strength(2.5f).resistance(2.3f)));
    public static final Block TROPICAL_STONE_BRICK_SLAB = registerBlock("tropical_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).strength(2.5f).resistance(6.5f)));
    public static final Block MANGO_SLAB = registerBlock("mango_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_SLAB)));
    public static final Block TROPICAL_SMOOTH_STONE_SLAB = registerBlock("tropical_smooth_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB).strength(2.5f).resistance(6.5f)));
    public static final Block TROPICAL_STONE_SLAB = registerBlock("tropical_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).strength(2.5f).resistance(6.5f)));
    public static final Block TROPICAL_COBBLESTONE_SLAB = registerBlock("tropical_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB).strength(2.5f).resistance(6.5f)));
    public static final Block AZURE_BUTTON = registerBlock("azure_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_BUTTON).strength(1.5f).resistance(1.3f), BlockSetType.OAK, 15, true));
    public static final Block MANGO_BUTTON = registerBlock("mango_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_BUTTON), BlockSetType.JUNGLE, 30, true));
    public static final Block TROPICAL_STONE_BUTTON = registerBlock("tropical_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON).strength(1).resistance(1), BlockSetType.STONE, 18, false));
    public static final Block AZURE_PRESSURE_PLATE = registerBlock("azure_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.CHERRY_PRESSURE_PLATE).strength(1.5f).resistance(1.3f), BlockSetType.OAK));
    public static final Block TROPICAL_STONE_PRESSURE_PLATE = registerBlock("tropical_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE).strength(1F).resistance(1F), BlockSetType.STONE));
    public static final Block MANGO_PRESSURE_PLATE = registerBlock("mango_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.JUNGLE_PRESSURE_PLATE), BlockSetType.JUNGLE));
    public static final Block AZURE_FENCE = registerBlock("azure_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE).strength(2.5f).resistance(2.3f)));
    public static final Block MANGO_FENCE = registerBlock("mango_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_FENCE)));
    public static final Block TROPICAL_COBBLESTONE_WALL = registerBlock("tropical_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).strength(2.5f).resistance(6.5f)));
    public static final Block TROPICAL_STONE_BRICK_WALL = registerBlock("tropical_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).strength(2.0f).resistance(6.5f)));
    public static final Block AZURE_FENCE_GATE = registerBlock("azure_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE).strength(2.5f).resistance(2.3f), WoodType.CHERRY));
    public static final Block MANGO_FENCE_GATE = registerBlock("mango_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_FENCE_GATE), WoodType.JUNGLE));
    public static final Block AZURE_TRAPDOOR = registerBlock("azure_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR), BlockSetType.CHERRY));
    public static final Block MANGO_TRAPDOOR = registerBlock("mango_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_TRAPDOOR), BlockSetType.JUNGLE));
    public static final Block PINEAPPLE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "pineapple_block"),
            new PineappleBlock(FabricBlockSettings.copyOf(Blocks.CARROTS).ticksRandomly()));
    public static final Block TROPICAL_SMOOTH_STONE = registerBlock("tropical_smooth_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE).strength(2.5f).resistance(6.5f)));
    public static final Block PINEAPPLE_BUSH = registerBlock("pineapple_bush",
            new PineappleBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH)));
    public static final Block TROPICAL_GRASS = registerBlock("tropical_grass",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block CITRUS_PETAL = registerBlock("citrus_petal",
            new FlowerBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.ORANGE_TULIP).nonOpaque()));
    public static final Block TROPICAL_BLOOM = registerBlock("tropical_bloom",
            new FlowerBlock(StatusEffects.STRENGTH, 10, FabricBlockSettings.copyOf(Blocks.CORNFLOWER).nonOpaque()));
    public static final Block POTTED_CITRUS_PETAL = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "potted_citrus_petal"),
            new FlowerPotBlock(CITRUS_PETAL, FabricBlockSettings.copyOf(Blocks.POTTED_ORANGE_TULIP).nonOpaque()));
    public static final Block POTTED_TROPICAL_BLOOM = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "potted_tropical_bloom"),
            new FlowerPotBlock(TROPICAL_BLOOM, FabricBlockSettings.copyOf(Blocks.POTTED_CORNFLOWER).nonOpaque()));
    public static final Block TURQUOISE_CONCRETE = registerBlock("turquoise_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE).strength(2.3f).resistance(2.3f)));
    public static final Block TURQUOISE_CONCRETE_POWDER = registerBlock("turquoise_concrete_powder",
            new ConcretePowderBlock(TURQUOISE_CONCRETE, FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE_POWDER).strength(1f).resistance(1f)));
    public static final Block TURQUOISE_WOOL = registerBlock("turquoise_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).strength(1.3f).resistance(1.3f)));
    public static final Block TURQUOISE_TERRACOTTA = registerBlock("turquoise_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA).strength(1.75f).resistance(4.7f)));
    public static final Block TURQUOISE_GLAZED_TERRACOTTA = registerBlock("turquoise_glazed_terracotta",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.LIME_GLAZED_TERRACOTTA).strength(1.9f).resistance(7.5f)));
    public static final Block TURQUOISE_CANDLE = registerBlock("turquoise_candle",
            new CandleBlock(FabricBlockSettings.copyOf(Blocks.LIME_CANDLE).nonOpaque().strength(0.2f)));
    public static final Block TURQUOISE_CANDLE_CAKE = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "turquoise_candle_cake"),
            new CandleCakeBlock(TURQUOISE_CANDLE, FabricBlockSettings.copyOf(Blocks.LIME_CANDLE_CAKE)));
    public static final Block TURQUOISE_CARPET = registerBlock("turquoise_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.LIME_CARPET).strength(0.2f)));
    public static final Block TROPICAL_BLOOM_PLANT = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "tropical_bloom_plant"),
            new TropicalBloomPlant(FabricBlockSettings.copyOf(Blocks.TORCHFLOWER_CROP).ticksRandomly()));
    public static final Block BLUE_RASPBERRY_CROP = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "blue_raspberry_crop"),
            new BlueRaspberryCrop(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH).ticksRandomly()));
    public static final Block TROPICAL_WHEAT_BLOCK = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "tropical_wheat_block"),
            new TropicalWheatBlock(FabricBlockSettings.copyOf(Blocks.WHEAT).ticksRandomly()));
    public static final Block TROPICAL_BEETROOT_BLOCK = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "tropical_beetroot_block"),
            new TropicalBeetrootBlock(FabricBlockSettings.copyOf(Blocks.BEETROOTS).ticksRandomly()));
    public static final Block TURQUOISE_GLASS = registerBlock("turquoise_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.LIME_STAINED_GLASS).strength(0.6f).resistance(0.8f).nonOpaque()));
    public static final Block TURQUOISE_STAINED_GLASS_PANE = registerBlock("turquoise_stained_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.LIME_STAINED_GLASS_PANE).strength(0.6f).resistance(0.6f).nonOpaque()));
    public static final Block TROPICAL_STONE_BRICKS = registerBlock("tropical_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(2.0f).resistance(6.5f)));
    public static final Block CHISELED_TROPICAL_STONE_BRICKS = registerBlock("chiseled_tropical_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS).strength(2.0f).resistance(6.5f).sounds(BlockSoundGroup.TUFF)));
    public static final Block TROPICAL_DEEPSLATE_BRICKS = registerBlock("tropical_deepslate_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS).strength(4f).resistance(6.5f)));
    public static final Block TROPICAL_DEEPSLATE_TILES = registerBlock("tropical_deepslate_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES).strength(4f).resistance(6.5f)));
    public static final Block PINEAPPLE_CAKE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "pineapple_cake_block"),
            new PineappleCakeBlock(FabricBlockSettings.copyOf(Blocks.CAKE).strength(0.6f)));
    public static final Block CHISELED_TROPICAL_DEEPSLATE = registerBlock("chiseled_tropical_deepslate",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_DEEPSLATE).strength(4f).resistance(6.5f)));
    public static final Block COBBLED_TROPICAL_DEEPSLATE_SLAB = registerBlock("cobbled_tropical_deepslate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE_SLAB).strength(4f).resistance(6.5f)));
    public static final Block COBBLED_TROPICAL_DEEPSLATE_STAIRS = registerBlock("cobbled_tropical_deepslate_stairs",
            new StairsBlock(ModBlocks.COBBLED_TROPICAL_DEEPSLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE_STAIRS).strength(4f).resistance(6.5f)));
    public static final Block COBBLED_TROPICAL_DEEPSLATE_WALL = registerBlock("cobbled_tropical_deepslate_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE_WALL).strength(4f).resistance(6.5f)));
    public static final Block POLISHED_TROPICAL_DEEPSLATE_SLAB = registerBlock("polished_tropical_deepslate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE_SLAB).strength(4f).resistance(6.5f)));
    public static final Block POLISHED_TROPICAL_DEEPSLATE_STAIRS = registerBlock("polished_tropical_deepslate_stairs",
            new StairsBlock(ModBlocks.POLISHED_TROPICAL_DEEPSLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE_STAIRS).strength(4f).resistance(6.5f)));
    public static final Block POLISHED_TROPICAL_DEEPSLATE_WALL = registerBlock("polished_tropical_deepslate_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE_WALL).strength(4f).resistance(6.5f)));
    public static final Block TROPICAL_DEEPSLATE_BRICK_SLAB = registerBlock("tropical_deepslate_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_SLAB).strength(4f).resistance(6.5f)));
    public static final Block TROPICAL_DEEPSLATE_BRICK_STAIRS = registerBlock("tropical_deepslate_brick_stairs",
            new StairsBlock(ModBlocks.TROPICAL_DEEPSLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_STAIRS).strength(4f).resistance(6.5f)));
    public static final Block TROPICAL_DEEPSLATE_BRICK_WALL = registerBlock("tropical_deepslate_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE_WALL).strength(4f).resistance(6.5f)));
    public static final Block TROPICAL_DEEPSLATE_TILE_SLAB = registerBlock("tropical_deepslate_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILE_SLAB).strength(4f).resistance(6.5f)));
    public static final Block TROPICAL_DEEPSLATE_TILE_STAIRS = registerBlock("tropical_deepslate_tile_stairs",
            new StairsBlock(ModBlocks.TROPICAL_DEEPSLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILE_STAIRS).strength(4f).resistance(6.5f)));
    public static final Block TROPICAL_DEEPSLATE_TILE_WALL = registerBlock("tropical_deepslate_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILE_WALL).strength(4f).resistance(6.5f)));
    public static final Block MITHRIL_DOOR = registerBlock("mithril_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).strength(5.5f), BlockSetType.IRON));
    public static final Block MITHRIL_TRAPDOOR = registerBlock("mithril_trapdoor",
                new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).strength(5.5f), BlockSetType.IRON));
    public static final Block TOPAZ_ORE = registerBlock("topaz_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).strength(4f).resistance(5f), UniformIntProvider.create(9, 18)));
    public static final Block TROPICAL_DIAMOND_ORE = registerBlock("tropical_diamond_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(3.5f).resistance(3.5f), UniformIntProvider.create(8, 16)));
    public static final Block TROPICAL_DEEPSLATE_DIAMOND_ORE = registerBlock("tropical_deepslate_diamond_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE).strength(5f).resistance(3.5f), UniformIntProvider.create(8, 16)));
    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).strength(6f).resistance(8f)));
    public static final Block RAW_MITHRIL_BLOCK = registerBlock("raw_mithril_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).strength(5.5f).resistance(6.5f)));
    public static final Block TROPICAL_DEEPSLATE_TOPAZ_ORE = registerBlock("tropical_deepslate_topaz_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).strength(5.5f).resistance(5f), UniformIntProvider.create(9, 18)));
    public static final Block AMBER_ORE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "amber_ore_block"),
            new AmberOreBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).strength(4.5f).resistance(5f), UniformIntProvider.create(10, 20)));
    public static final Block TROPICAL_DEEPSLATE_AMBER_ORE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "tropical_deepslate_amber_ore_block"),
            new AmberOreBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).strength(6f).resistance(5f), UniformIntProvider.create(10, 20)));
    public static final Block TROPICAL_GOLD_ORE = registerBlock("tropical_gold_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_ORE).strength(3.5f).resistance(3.5f)));
    public static final Block TROPICAL_LAPIS_ORE = registerBlock("tropical_lapis_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).strength(3.5f).resistance(3.5f), UniformIntProvider.create(2, 5)));
    public static final Block TROPICAL_COAL_ORE = registerBlock("tropical_coal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE).strength(3.5f).resistance(3.5f), UniformIntProvider.create(1, 2)));
    public static final Block TROPICAL_DEEPSLATE_LAPIS_ORE = registerBlock("tropical_deepslate_lapis_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).strength(5f).resistance(3.5f), UniformIntProvider.create(2, 5)));
    public static final Block TROPICAL_DEEPSLATE_COAL_ORE = registerBlock("tropical_deepslate_coal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COAL_ORE).strength(5f).resistance(3.5f), UniformIntProvider.create(1, 2)));
    public static final Block TROPICAL_DEEPSLATE_GOLD_ORE = registerBlock("tropical_deepslate_gold_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_GOLD_ORE).strength(5f).resistance(3.5f)));
    public static final Block AMBER_BLOCK_BASE = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "amber_block_base"),
            new AmberBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(8f).resistance(10f).sounds(BlockSoundGroup.COPPER)));
    public static final Block TROPICAL_REDSTONE_ORE = registerBlock("tropical_redstone_ore",
            new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_ORE).strength(3.5f).resistance(3.5f)));
    public static final Block TROPICAL_DEEPSLATE_REDSTONE_ORE = registerBlock("tropical_deepslate_redstone_ore",
            new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_REDSTONE_ORE).strength(5f).resistance(3.5f)));


    public static final Identifier AZURE_SIGN_TEXTURE = new Identifier(TropicalUpdate.MOD_ID, "entity/signs/azure");
    public static final Identifier AZURE_HANGING_SIGN_TEXTURE = new Identifier(TropicalUpdate.MOD_ID, "entity/signs/hanging/azure");
    public static final Identifier AZURE_HANGING_GUI_SIGN_TEXTURE = new Identifier(TropicalUpdate.MOD_ID, "textures/gui/hanging_signs/azure");

    public static final Identifier MANGO_SIGN_TEXTURE = new Identifier(TropicalUpdate.MOD_ID, "entity/signs/mango");
    public static final Identifier MANGO_HANGING_SIGN_TEXTURE = new Identifier(TropicalUpdate.MOD_ID, "entity/signs/hanging/mango");
    public static final Identifier MANGO_HANGING_GUI_SIGN_TEXTURE = new Identifier(TropicalUpdate.MOD_ID, "textures/gui/hanging_signs/mango");

    public static final Block AZURE_STANDING_SIGN = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "azure_standing_sign"),
            new TerraformSignBlock(AZURE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN).strength(1.5f).resistance(1.3f)));
    public static final Block AZURE_WALL_SIGN = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "azure_wall_sign"),
            new TerraformWallSignBlock(AZURE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN).dropsLike(AZURE_STANDING_SIGN).strength(1.5f).resistance(1.3f)));
    public static final Block HANGING_AZURE_SIGN = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "azure_hanging_sign"),
            new TerraformHangingSignBlock(AZURE_HANGING_SIGN_TEXTURE, AZURE_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN).strength(1.5f).resistance(1.3f)));
    public static final Block WALL_HANGING_AZURE_SIGN = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "azure_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(AZURE_HANGING_SIGN_TEXTURE, AZURE_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(HANGING_AZURE_SIGN).strength(1.5f).resistance(1.3f)));

    public static final Block MANGO_STANDING_SIGN = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "mango_standing_sign"),
            new TerraformSignBlock(MANGO_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.JUNGLE_SIGN)));
    public static final Block MANGO_WALL_SIGN = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "mango_wall_sign"),
            new TerraformWallSignBlock(MANGO_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.JUNGLE_WALL_SIGN).dropsLike(MANGO_STANDING_SIGN)));
    public static final Block HANGING_MANGO_SIGN = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "mango_hanging_sign"),
            new TerraformHangingSignBlock(MANGO_HANGING_SIGN_TEXTURE, MANGO_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.JUNGLE_HANGING_SIGN)));
    public static final Block WALL_HANGING_MANGO_SIGN = Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, "mango_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(MANGO_HANGING_SIGN_TEXTURE, MANGO_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.JUNGLE_WALL_HANGING_SIGN).dropsLike(HANGING_MANGO_SIGN)));





    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TropicalUpdate.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TropicalUpdate.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {
        TropicalUpdate.LOGGER.info("Registering ModBlock for " + TropicalUpdate.MOD_ID);
    }
}
