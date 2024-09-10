package net.erez.tropicalupdate.item;

import net.erez.tropicalupdate.TropicalUpdate;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    MITHRIL("mithril", 22, new int[] { 2, 7, 6, 2 }, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1f, 0, () -> Ingredient.ofItems(ModItems.MITHRIL_INGOT)),
    TOPAZ("topaz", 47, new int[] { 4, 9, 7, 4 }, 26,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.5f, 0, () -> Ingredient.ofItems(ModItems.TOPAZ)),
    AMBER("amber", 56, new int[] { 5, 10, 8, 5 }, 28,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.5f, 0.1f, () -> Ingredient.ofItems(ModItems.AMBER)),
    AMBER_NETHERITE("amber_netherite", 76, new int[] { 5, 10, 8, 5 }, 28,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5f, 0.2f, () -> Ingredient.ofItems(ModItems.AMBER, Items.NETHERITE_INGOT)),
    ;

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 15, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return TropicalUpdate.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
