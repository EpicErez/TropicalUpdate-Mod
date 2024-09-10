package net.erez.tropicalupdate.item;

import net.erez.tropicalupdate.TropicalUpdate;
import net.erez.tropicalupdate.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
        public static final ItemGroup FOOD_GROUP = Registry.register(Registries.ITEM_GROUP,
                new Identifier(TropicalUpdate.MOD_ID, "tropical_food_items"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tropical_food_items"))
                        .icon(() ->new ItemStack(ModItems.PINEAPPLE)).entries((displayContext, entries) ->  {
                        entries.add(ModItems.PINEAPPLE);
                        entries.add(ModItems.PINEAPPLE_SLICE);
                        entries.add(ModItems.PINEAPPLE_JUICE);
                        entries.add(ModItems.PINEAPPLE_STEW);
                        entries.add(ModItems.TROPICAL_FRUITS);
                        entries.add(ModItems.TROPICAL_FRUIT_JUICE);
                        entries.add(ModItems.SALMON_STEW);
                        entries.add(ModItems.MANGO);
                        entries.add(ModItems.CHICKEN_STEW);
                        entries.add(ModItems.BLUE_RASPBERRY);
                        entries.add(ModItems.PINEAPPLE_CAKE);
                        entries.add(ModItems.PINEAPPLE_CAKE_SLICE);
                    }).build());

        public static final ItemGroup TROPICALUPDATE_EQUIPMENT = Registry.register(Registries.ITEM_GROUP,
                new Identifier(TropicalUpdate.MOD_ID, "tropicalupdate_equipment"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tropicalupdate_equipment"))
                        .icon(() ->new ItemStack(ModItems.AMBER_NETHERITE_SWORD)).entries((displayContext, entries) ->  {
                        entries.add(ModItems.MITHRIL_SWORD);
                        entries.add(ModItems.MITHRIL_PICKAXE);
                        entries.add(ModItems.MITHRIL_AXE);
                        entries.add(ModItems.MITHRIL_SHOVEL);
                        entries.add(ModItems.MITHRIL_HOE);
                        entries.add(ModItems.MITHRIL_HELMET);
                        entries.add(ModItems.MITHRIL_CHESTPLATE);
                        entries.add(ModItems.MITHRIL_LEGGINGS);
                        entries.add(ModItems.MITHRIL_BOOTS);
                        entries.add(ModItems.TOPAZ_SWORD);
                        entries.add(ModItems.TOPAZ_PICKAXE);
                        entries.add(ModItems.TOPAZ_AXE);
                        entries.add(ModItems.TOPAZ_SHOVEL);
                        entries.add(ModItems.TOPAZ_HOE);
                        entries.add(ModItems.TOPAZ_HELMET);
                        entries.add(ModItems.TOPAZ_CHESTPLATE);
                        entries.add(ModItems.TOPAZ_LEGGINGS);
                        entries.add(ModItems.TOPAZ_BOOTS);
                        entries.add(ModItems.AMBER_SWORD);
                        entries.add(ModItems.AMBER_PICKAXE);
                        entries.add(ModItems.AMBER_AXE);
                        entries.add(ModItems.AMBER_SHOVEL);
                        entries.add(ModItems.AMBER_HOE);
                        entries.add(ModItems.AMBER_HELMET);
                        entries.add(ModItems.AMBER_CHESTPLATE);
                        entries.add(ModItems.AMBER_LEGGINGS);
                        entries.add(ModItems.AMBER_BOOTS);
                        entries.add(ModItems.AMBER_NETHERITE_SWORD);
                        entries.add(ModItems.AMBER_NETHERITE_PICKAXE);
                        entries.add(ModItems.AMBER_NETHERITE_AXE);
                        entries.add(ModItems.AMBER_NETHERITE_SHOVEL);
                        entries.add(ModItems.AMBER_NETHERITE_HOE);
                        entries.add(ModItems.AMBER_NETHERITE_HELMET);
                        entries.add(ModItems.AMBER_NETHERITE_CHESTPLATE);
                        entries.add(ModItems.AMBER_NETHERITE_LEGGINGS);
                        entries.add(ModItems.AMBER_NETHERITE_BOOTS);
                        entries.add(ModItems.MITHRIL_SHEARS);
                        entries.add(ModItems.AMBER_AND_STEEL);
                    }).build());

        public static final ItemGroup TROPICAL_MINERALS = Registry.register(Registries.ITEM_GROUP,
                new Identifier(TropicalUpdate.MOD_ID, "tropical_minerals"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tropical_minerals"))
                        .icon(() ->new ItemStack(ModItems.TOPAZ)).entries((displayContext, entries) ->  {
                        entries.add(ModItems.RAW_MITHRIL);
                        entries.add(ModItems.MITHRIL_INGOT);
                        entries.add(ModItems.MITHRIL_NUGGET);
                        entries.add(ModItems.TOPAZ);
                        entries.add(ModItems.AMBER);
                    }).build());

        public static final ItemGroup TROPICAL_UPDATE_NATURAL = Registry.register(Registries.ITEM_GROUP,
                new Identifier(TropicalUpdate.MOD_ID, "tropicalupdate_natural"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tropicalupdate_natural"))
                        .icon(() ->new ItemStack(ModBlocks.TROPICAL_GRASS_BLOCK)).entries((displayContext, entries) ->  {
                        entries.add(ModBlocks.TROPICAL_DIRT);
                        entries.add(ModBlocks.TROPICAL_GRASS_BLOCK);
                        entries.add(ModBlocks.TROPICAL_FARMLAND);
                        entries.add(ModBlocks.TROPICAL_GRASS);
                        entries.add(ModBlocks.AZURE_SAPLING);
                        entries.add(ModBlocks.AZURE_LOG);
                        entries.add(ModBlocks.AZURE_LEAVES);
                        entries.add(ModBlocks.MANGO_SAPLING);
                        entries.add(ModBlocks.MANGO_LOG);
                        entries.add(ModBlocks.MANGO_LEAVES);
                        entries.add(ModBlocks.MANGO_FRUIT_LEAVES);
                        entries.add(ModBlocks.CITRUS_PETAL);
                        entries.add(ModBlocks.TROPICAL_BLOOM);
                        entries.add(ModBlocks.PINEAPPLE_BUSH);
                        entries.add(ModItems.PINEAPPLE);
                        entries.add(ModItems.PINEAPPLE_SEEDS);
                        entries.add(ModItems.BLUE_RASPBERRY);
                        entries.add(ModItems.BLUE_RASPBERRY_SEEDS);
                        entries.add(ModItems.TROPICAL_BLOOM_SEEDS);
                        entries.add(ModBlocks.TROPICAL_STONE);
                        entries.add(ModBlocks.TROPICAL_DEEPSLATE);
                        entries.add(ModBlocks.TROPICAL_COAL_ORE);
                        entries.add(ModBlocks.TROPICAL_IRON_ORE);
                        entries.add(ModBlocks.TROPICAL_LAPIS_ORE);
                        entries.add(ModBlocks.TROPICAL_REDSTONE_ORE);
                        entries.add(ModBlocks.TROPICAL_GOLD_ORE);
                        entries.add(ModBlocks.MITHRIL_ORE);
                        entries.add(ModBlocks.TROPICAL_DIAMOND_ORE);
                        entries.add(ModBlocks.TOPAZ_ORE);
                        entries.add(ModItems.AMBER_ORE);
                        entries.add(ModBlocks.TROPICAL_DEEPSLATE_COAL_ORE);
                        entries.add(ModBlocks.TROPICAL_DEEPSLATE_IRON_ORE);
                        entries.add(ModBlocks.TROPICAL_DEEPSLATE_LAPIS_ORE);
                        entries.add(ModBlocks.TROPICAL_DEEPSLATE_REDSTONE_ORE);
                        entries.add(ModBlocks.TROPICAL_DEEPSLATE_GOLD_ORE);
                        entries.add(ModBlocks.TROPICAL_DEEPSLATE_MITHRIL_ORE);
                        entries.add(ModBlocks.TROPICAL_DEEPSLATE_DIAMOND_ORE);
                        entries.add(ModBlocks.TROPICAL_DEEPSLATE_TOPAZ_ORE);
                        entries.add(ModItems.TROPICAL_DEEPSLATE_AMBER_ORE);
                    }).build());

        public static final ItemGroup TROPICAL_UPDATE_BUILDING_BLOCKS = Registry.register(Registries.ITEM_GROUP,
                new Identifier(TropicalUpdate.MOD_ID, "tropicalupdate_building_blocks"),
                    FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tropicalupdate_building_blocks"))
                        .icon(() ->new ItemStack(ModBlocks.TROPICAL_STONE_BRICKS)).entries((displayContext, entries) ->  {
                        entries.add(ModBlocks.AZURE_LOG);
                        entries.add(ModBlocks.STRIPPED_AZURE_LOG);
                        entries.add(ModBlocks.AZURE_WOOD);
                        entries.add(ModBlocks.STRIPPED_AZURE_WOOD);
                        entries.add(ModBlocks.AZURE_PLANKS);
                        entries.add(ModBlocks.AZURE_FENCE);
                        entries.add(ModBlocks.AZURE_FENCE_GATE);
                        entries.add(ModBlocks.AZURE_DOOR);
                        entries.add(ModBlocks.AZURE_TRAPDOOR);
                        entries.add(ModBlocks.AZURE_BUTTON);
                        entries.add(ModBlocks.AZURE_PRESSURE_PLATE);
                        entries.add(ModBlocks.AZURE_STAIRS);
                        entries.add(ModBlocks.AZURE_SLAB);
                        entries.add(ModItems.AZURE_SIGN);
                        entries.add(ModItems.HANGING_AZURE_SIGN);
                        entries.add(ModBlocks.MANGO_LOG);
                        entries.add(ModBlocks.STRIPPED_MANGO_LOG);
                        entries.add(ModBlocks.MANGO_WOOD);
                        entries.add(ModBlocks.STRIPPED_MANGO_WOOD);
                        entries.add(ModBlocks.MANGO_PLANKS);
                        entries.add(ModBlocks.MANGO_FENCE);
                        entries.add(ModBlocks.MANGO_FENCE_GATE);
                        entries.add(ModBlocks.MANGO_DOOR);
                        entries.add(ModBlocks.MANGO_TRAPDOOR);
                        entries.add(ModBlocks.MANGO_BUTTON);
                        entries.add(ModBlocks.MANGO_PRESSURE_PLATE);
                        entries.add(ModBlocks.MANGO_STAIRS);
                        entries.add(ModBlocks.MANGO_SLAB);
                        entries.add(ModItems.MANGO_SIGN);
                        entries.add(ModItems.HANGING_MANGO_SIGN);
                        entries.add(ModBlocks.TROPICAL_COBBLESTONE);
                        entries.add(ModBlocks.TROPICAL_COBBLESTONE_STAIRS);
                        entries.add(ModBlocks.TROPICAL_COBBLESTONE_WALL);
                        entries.add(ModBlocks.TROPICAL_COBBLESTONE_SLAB);
                        entries.add(ModBlocks.TROPICAL_STONE);
                        entries.add(ModBlocks.TROPICAL_STONE_STAIRS);
                        entries.add(ModBlocks.TROPICAL_STONE_SLAB);
                        entries.add(ModBlocks.TROPICAL_STONE_BUTTON);
                        entries.add(ModBlocks.TROPICAL_STONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.TROPICAL_SMOOTH_STONE);
                        entries.add(ModBlocks.TROPICAL_SMOOTH_STONE_SLAB);
                        entries.add(ModBlocks.TROPICAL_STONE_BRICKS);
                        entries.add(ModBlocks.TROPICAL_STONE_BRICK_STAIRS);
                        entries.add(ModBlocks.TROPICAL_STONE_BRICK_WALL);
                        entries.add(ModBlocks.TROPICAL_STONE_BRICK_SLAB);
                        entries.add(ModBlocks.CHISELED_TROPICAL_STONE_BRICKS);
                        entries.add(ModBlocks.TROPICAL_DEEPSLATE);
                        entries.add(ModBlocks.COBBLED_TROPICAL_DEEPSLATE);
                        entries.add(ModBlocks.CHISELED_TROPICAL_DEEPSLATE);
                        entries.add(ModBlocks.COBBLED_TROPICAL_DEEPSLATE_STAIRS);
                        entries.add(ModBlocks.COBBLED_TROPICAL_DEEPSLATE_WALL);
                        entries.add(ModBlocks.COBBLED_TROPICAL_DEEPSLATE_SLAB);
                        entries.add(ModBlocks.POLISHED_TROPICAL_DEEPSLATE);
                        entries.add(ModBlocks.POLISHED_TROPICAL_DEEPSLATE_STAIRS);
                        entries.add(ModBlocks.POLISHED_TROPICAL_DEEPSLATE_WALL);
                        entries.add(ModBlocks.POLISHED_TROPICAL_DEEPSLATE_SLAB);
                        entries.add(ModBlocks.TROPICAL_DEEPSLATE_BRICKS);
                        entries.add(ModBlocks.TROPICAL_DEEPSLATE_BRICK_STAIRS);
                        entries.add(ModBlocks.TROPICAL_DEEPSLATE_BRICK_WALL);
                        entries.add(ModBlocks.TROPICAL_DEEPSLATE_BRICK_SLAB);
                        entries.add(ModBlocks.TROPICAL_DEEPSLATE_TILES);
                        entries.add(ModBlocks.TROPICAL_DEEPSLATE_TILE_STAIRS);
                        entries.add(ModBlocks.TROPICAL_DEEPSLATE_TILE_WALL);
                        entries.add(ModBlocks.TROPICAL_DEEPSLATE_TILE_SLAB);
                        entries.add(ModBlocks.TURQUOISE_CONCRETE_POWDER);
                        entries.add(ModBlocks.TURQUOISE_CONCRETE);
                        entries.add(ModBlocks.TURQUOISE_TERRACOTTA);
                        entries.add(ModBlocks.TURQUOISE_GLAZED_TERRACOTTA);
                        entries.add(ModBlocks.TURQUOISE_GLASS);
                        entries.add(ModBlocks.TURQUOISE_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.TROPICAL_DIRT_PATH);
                        entries.add(ModBlocks.MITHRIL_BARS);
                        entries.add(ModBlocks.MITHRIL_CHAIN);
                        entries.add(ModBlocks.MITHRIL_LANTERN);
                        entries.add(ModBlocks.MITHRIL_DOOR);
                        entries.add(ModBlocks.MITHRIL_TRAPDOOR);
                        entries.add(ModBlocks.MITHRIL_BLOCK);
                        entries.add(ModBlocks.TOPAZ_BLOCK);
                        entries.add(ModItems.AMBER_BLOCK);
                        entries.add(ModBlocks.RAW_MITHRIL_BLOCK);
                    }).build());

        public static final ItemGroup TROPICALUPDATE_MISC = Registry.register(Registries.ITEM_GROUP,
                new Identifier(TropicalUpdate.MOD_ID, "tropicalupdate_misc"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tropicalupdate_misc"))
                        .icon(() ->new ItemStack(ModItems.AMBER_UPGRADE_TEMPLATE)).entries((displayContext, entries) ->  {
                        entries.add(ModItems.AZURE_BOAT);
                        entries.add(ModItems.AZURE_CHEST_BOAT);
                        entries.add(ModItems.AZURE_SIGN);
                        entries.add(ModItems.HANGING_AZURE_SIGN);
                        entries.add(ModItems.MANGO_BOAT);
                        entries.add(ModItems.MANGO_CHEST_BOAT);
                        entries.add(ModItems.MANGO_SIGN);
                        entries.add(ModItems.HANGING_MANGO_SIGN);
                        entries.add(ModItems.TURQUOISE_DYE);
                        entries.add(ModBlocks.TURQUOISE_WOOL);
                        entries.add(ModBlocks.TURQUOISE_CARPET);
                        entries.add(ModBlocks.TURQUOISE_CANDLE);
                        entries.add(ModItems.AMBER_UPGRADE_TEMPLATE);
                    }).build());




    public static void registerItemGroups() {
        TropicalUpdate.LOGGER.info("Registering Item Groups for " + TropicalUpdate.MOD_ID);
    }
}
