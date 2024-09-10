package net.erez.tropicalupdate.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.erez.tropicalupdate.TropicalUpdate;
import net.erez.tropicalupdate.block.ModBlocks;
import net.erez.tropicalupdate.block.custom.ModArmorItem;
import net.erez.tropicalupdate.entity.ModBoats;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MANGO = registerItem("mango", new Item(new FabricItemSettings().food(ModFoodComponents.MANGO)));
    public static final Item PINEAPPLE = registerItem("pineapple", new Item(new FabricItemSettings().food(ModFoodComponents.PINEAPPLE)));
    public static final Item CHICKEN_STEW = registerItem("chicken_stew", new PineappleStewItem(new FabricItemSettings().food(ModFoodComponents.CHICKEN_STEW)));
    public static final Item BLUE_RASPBERRY = registerItem("blue_raspberry", new Item(new FabricItemSettings().food(ModFoodComponents.BLUE_RASPBERRY)));
    public static final Item AMBER_AND_STEEL = registerItem("amber_and_steel", new FlintAndSteelItem(new FabricItemSettings().maxDamage(714)));
    public static final Item MITHRIL_SWORD = registerItem("mithril_sword",
            new SwordItem(ModToolMaterial.MITHRIL, 3, -2.4f, new FabricItemSettings()));
    public static final Item MITHRIL_PICKAXE = registerItem("mithril_pickaxe",
            new PickaxeItem(ModToolMaterial.MITHRIL, 1, -2.8f, new FabricItemSettings()));
    public static final Item MITHRIL_AXE = registerItem("mithril_axe",
            new AxeItem(ModToolMaterial.MITHRIL, 5, -3f, new FabricItemSettings()));
    public static final Item MITHRIL_SHOVEL = registerItem("mithril_shovel",
            new ShovelItem(ModToolMaterial.MITHRILE, 2, -3f, new FabricItemSettings()));
    public static final Item MITHRIL_HOE = registerItem("mithril_hoe",
            new HoeItem(ModToolMaterial.MITHRILE, -2, 0, new FabricItemSettings()));
    public static final Item TOPAZ_SWORD = registerItem("topaz_sword",
            new SwordItem(ModToolMaterial.TOPAZ, 3, -2.4f, new FabricItemSettings()));
    public static final Item TOPAZ_PICKAXE = registerItem("topaz_pickaxe",
            new PickaxeItem(ModToolMaterial.TOPAZ, 1, -2.8f, new FabricItemSettings()));
    public static final Item TOPAZ_AXE = registerItem("topaz_axe",
            new AxeItem(ModToolMaterial.TOPAZ, 4.5f, -3f, new FabricItemSettings()));
    public static final Item TOPAZ_SHOVEL = registerItem("topaz_shovel",
            new ShovelItem(ModToolMaterial.TOPAZ, 1.5f, -3f, new FabricItemSettings()));
    public static final Item TOPAZ_HOE = registerItem("topaz_hoe",
            new HoeItem(ModToolMaterial.TOPAZ, -5, 0, new FabricItemSettings()));
    public static final Item AMBER_SWORD = registerItem("amber_sword",
            new AmberSword(ModToolMaterial.AMBER, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static final Item AMBER_PICKAXE = registerItem("amber_pickaxe",
            new CustomObsidianPickaxe(ModToolMaterial.AMBER, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static final Item AMBER_AXE = registerItem("amber_axe",
            new AxeItem(ModToolMaterial.AMBER, 4f, -3f, new FabricItemSettings().fireproof()));
    public static final Item AMBER_SHOVEL = registerItem("amber_shovel",
            new ShovelItem(ModToolMaterial.AMBER, 1.5f, -3f, new FabricItemSettings().fireproof()));
    public static final Item AMBER_HOE = registerItem("amber_hoe",
            new HoeItem(ModToolMaterial.AMBER, -6, 0, new FabricItemSettings().fireproof()));
    public static final Item AMBER_NETHERITE_SWORD = registerItem("amber_netherite_sword",
            new AmberSword(ModToolMaterial.AMBER_NETHERITE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static final Item AMBER_NETHERITE_PICKAXE = registerItem("amber_netherite_pickaxe",
            new CustomObsidianPickaxe(ModToolMaterial.AMBER_NETHERITE_PICKAXE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static final Item AMBER_NETHERITE_AXE = registerItem("amber_netherite_axe",
            new AxeItem(ModToolMaterial.AMBER_NETHERITE, 4f, -3f, new FabricItemSettings().fireproof()));
    public static final Item AMBER_NETHERITE_SHOVEL = registerItem("amber_netherite_shovel",
            new ShovelItem(ModToolMaterial.AMBER_NETHERITE, 1.5f, -3f, new FabricItemSettings().fireproof()));
    public static final Item AMBER_NETHERITE_HOE = registerItem("amber_netherite_hoe",
            new HoeItem(ModToolMaterial.AMBER_NETHERITE, -7, 0, new FabricItemSettings().fireproof()));
    public static final Item MITHRIL_HELMET = registerItem("mithril_helmet",
            new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item MITHRIL_CHESTPLATE = registerItem("mithril_chestplate",
            new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item MITHRIL_LEGGINGS = registerItem("mithril_leggings",
            new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item MITHRIL_BOOTS = registerItem("mithril_boots",
            new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item TOPAZ_HELMET = registerItem("topaz_helmet",
            new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item TOPAZ_CHESTPLATE = registerItem("topaz_chestplate",
            new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item TOPAZ_LEGGINGS = registerItem("topaz_leggings",
            new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item TOPAZ_BOOTS = registerItem("topaz_boots",
            new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item AMBER_HELMET = registerItem("amber_helmet",
            new ModArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item AMBER_CHESTPLATE = registerItem("amber_chestplate",
            new ModArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item AMBER_LEGGINGS = registerItem("amber_leggings",
            new ModArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item AMBER_BOOTS = registerItem("amber_boots",
            new ModArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));
    public static final Item AMBER_NETHERITE_HELMET = registerItem("amber_netherite_helmet",
            new ModArmorItem(ModArmorMaterials.AMBER_NETHERITE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item AMBER_NETHERITE_CHESTPLATE = registerItem("amber_netherite_chestplate",
            new ModArmorItem(ModArmorMaterials.AMBER_NETHERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item AMBER_NETHERITE_LEGGINGS = registerItem("amber_netherite_leggings",
            new ModArmorItem(ModArmorMaterials.AMBER_NETHERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item AMBER_NETHERITE_BOOTS = registerItem("amber_netherite_boots",
            new ModArmorItem(ModArmorMaterials.AMBER_NETHERITE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));
    public static final Item TROPICAL_FRUITS = registerItem("tropical_fruits", new Item(new FabricItemSettings().food(ModFoodComponents.TROPICAL_FRUITS)));
    public static final Item TOPAZ = registerItem("topaz", new Item(new FabricItemSettings()));
    public static final Item AMBER = registerItem("amber", new AmberItem(new FabricItemSettings().fireproof()));
    public static final Item PINEAPPLE_JUICE = registerItem("pineapple_juice", new PineappleJuiceItem(new FabricItemSettings().food(ModFoodComponents.PINEAPPLE_JUICE).maxCount(16)));
    public static final Item TROPICAL_FRUIT_JUICE = registerItem("tropical_fruit_juice", new PineappleJuiceItem(new FabricItemSettings().food(ModFoodComponents.TROPICAL_FRUIT_JUICE).maxCount(16)));
    public static final Item PINEAPPLE_STEW = registerItem("pineapple_stew", new PineappleStewItem(new FabricItemSettings().food(ModFoodComponents.PINEAPPLE_STEW)));
    public static final Item TURQUOISE_DYE = registerItem("turquoise_dye", new Item(new FabricItemSettings()));
    public static final Item SALMON_STEW = registerItem("salmon_stew", new PineappleStewItem(new FabricItemSettings().food(ModFoodComponents.SALMON_STEW)));
    public static final Item MITHRIL_INGOT = registerItem("mithril_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_MITHRIL = registerItem("raw_mithril", new Item(new FabricItemSettings()));
    public static final Item MITHRIL_NUGGET = registerItem("mithril_nugget", new Item(new FabricItemSettings()));
    public static final Item AZURE_SIGN = registerItem("azure_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.AZURE_STANDING_SIGN, ModBlocks.AZURE_WALL_SIGN));
    public static final Item HANGING_AZURE_SIGN = registerItem("azure_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_AZURE_SIGN, ModBlocks.WALL_HANGING_AZURE_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item MANGO_SIGN = registerItem("mango_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.MANGO_STANDING_SIGN, ModBlocks.MANGO_WALL_SIGN));
    public static final Item HANGING_MANGO_SIGN = registerItem("mango_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_MANGO_SIGN, ModBlocks.WALL_HANGING_MANGO_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item AZURE_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.AZURE_BOAT_ID, ModBoats.AZURE_BOAT_KEY, false);
    public static final Item AZURE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.AZURE_CHEST_BOAT_ID, ModBoats.AZURE_BOAT_KEY, true);
    public static final Item MANGO_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.MANGO_BOAT_ID, ModBoats.MANGO_BOAT_KEY, false);
    public static final Item MANGO_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.MANGO_CHEST_BOAT_ID, ModBoats.MANGO_BOAT_KEY, true);
    public static final Item PINEAPPLE_SLICE = registerItem("pineapple_slice", new Item(new FabricItemSettings().food(ModFoodComponents.PINEAPPLE_SLICE)));
    public static final Item TROPICAL_BLOOM_SEEDS = registerItem("tropical_bloom_seeds",
            new AliasedBlockItem(ModBlocks.TROPICAL_BLOOM_PLANT, new FabricItemSettings()));
    public static final Item BLUE_RASPBERRY_SEEDS = registerItem("blue_raspberry_seeds",
            new AliasedBlockItem(ModBlocks.BLUE_RASPBERRY_CROP, new  FabricItemSettings()));
    public static final Item PINEAPPLE_CAKE_SLICE = registerItem("pineapple_cake_slice",
            new Item(new FabricItemSettings().food(ModFoodComponents.PINEAPPLE_CAKE_SLICE)));
    public static final Item PINEAPPLE_SEEDS = registerItem("pineapple_seeds",
            new AliasedBlockItem(ModBlocks.PINEAPPLE_BLOCK, new FabricItemSettings()));
    public static final Item PINEAPPLE_CAKE = registerItem("pineapple_cake",
            new AliasedBlockItem(ModBlocks.PINEAPPLE_CAKE_BLOCK, new FabricItemSettings().maxCount(16)));
    public static final Block AMBER_ORE = Block.getBlockFromItem(registerItem("amber_ore",
            new BlockItem(ModBlocks.AMBER_ORE_BLOCK, new FabricItemSettings().fireproof())));
    public static final Block TROPICAL_DEEPSLATE_AMBER_ORE = Block.getBlockFromItem(registerItem("tropical_deepslate_amber_ore",
            new BlockItem(ModBlocks.TROPICAL_DEEPSLATE_AMBER_ORE_BLOCK, new FabricItemSettings().fireproof())));
    public static final Block AMBER_BLOCK = Block.getBlockFromItem(registerItem("amber_block",
            new BlockItem(ModBlocks.AMBER_BLOCK_BASE, new FabricItemSettings().fireproof())));
    public static final Item MITHRIL_SHEARS = registerItem("mithril_shears",
            new MithrilShearsItem(new FabricItemSettings().maxCount(1).maxDamage(874)));
    public static final Item TURQUOISE_WOOL = BlockItem.fromBlock(ModBlocks.TURQUOISE_WOOL);
    public static final Item AMBER_UPGRADE_TEMPLATE = registerItem("amber_upgrade_template",
            new AmberUpgradeTrimItem(new FabricItemSettings(), "upgrade_template.amber_upgrade.upgrade", "upgrade_template.amber_upgrade.air",
                    "upgrade_template.amber_upgrade.applies", "upgrade_template.amber_upgrade.equipment_type",
                    "upgrade_template.amber_upgrade.ingredient", "upgrade_template.amber_upgrade.material"));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TropicalUpdate.MOD_ID, name), item);
    }


    public static void registerModItems() {
        TropicalUpdate.LOGGER.info("Registering Mod Items for " + TropicalUpdate.MOD_ID);
    }
}
