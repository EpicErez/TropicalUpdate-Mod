/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.erez.tropicalupdate.item;

import java.util.Map;
import java.util.Optional;

import net.erez.tropicalupdate.TropicalUpdate;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.item.trim.ArmorTrimMaterials;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class ModArmorTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> TOPAZ = ModArmorTrimMaterials.of("topaz");

    public static void bootstrap(Registerable<ArmorTrimMaterial> registry) {
        ModArmorTrimMaterials.register(registry, TOPAZ, ModItems.TOPAZ, Style.EMPTY.withColor(7269586), 1.1f, Map.of(ArmorMaterials.DIAMOND, "topaz_darker"));
    }

    public static Optional<RegistryEntry.Reference<ArmorTrimMaterial>> get(DynamicRegistryManager registryManager, ItemStack stack) {
        return registryManager.get(RegistryKeys.TRIM_MATERIAL).streamEntries().filter(recipe -> stack.itemMatches(((ArmorTrimMaterial)recipe.value()).ingredient())).findFirst();
    }

    private static void register(Registerable<ArmorTrimMaterial> registry, RegistryKey<ArmorTrimMaterial> key, Item ingredient, Style style, float itemModelIndex) {
        ModArmorTrimMaterials.register(registry, key, ingredient, style, itemModelIndex);
    }

    private static void register(Registerable<ArmorTrimMaterial> registry, RegistryKey<ArmorTrimMaterial> key, Item ingredient, Style style, float itemModelIndex, Map<ArmorMaterials, String> overrideArmorMaterials) {
        ArmorTrimMaterial armorTrimMaterial = ArmorTrimMaterial.of(key.getValue().getPath(), ingredient, itemModelIndex, Text.translatable(Util.createTranslationKey("trim_material", key.getValue())).fillStyle(style), overrideArmorMaterials);
        registry.register(key, armorTrimMaterial);
    }

    private static RegistryKey<ArmorTrimMaterial> of(String id) {
        return RegistryKey.of(RegistryKeys.TRIM_MATERIAL, new Identifier(id));
    }

    public static void registerModArmorTrimMaterials() {
        TropicalUpdate.LOGGER.info("Registering Mod Armor Trims for " + TropicalUpdate.MOD_ID);
    }
}
