package net.erez.tropicalupdate.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    TOPAZ(4, 2735, 11f, 5f, 24,
            () -> Ingredient.ofItems(ModItems.TOPAZ)),
    AMBER_NETHERITE(5, 4031, 13f, 7f, 26,
            () -> Ingredient.ofItems(ModItems.AMBER, Items.NETHERITE_INGOT)),
    AMBER_NETHERITE_PICKAXE(5, 4031, 16f, 7f, 26,
            () -> Ingredient.ofItems(ModItems.AMBER, Items.NETHERITE_INGOT)),
    AMBER(5, 3300, 13f, 6f, 26,
            () -> Ingredient.ofItems(ModItems.AMBER)),
    MITHRIL(3, 550, 7f, 2.5f, 15,
            () -> Ingredient.ofItems(ModItems.MITHRIL_INGOT)),
    MITHRILE(3, 550, 7f, 2f, 15,
            () -> Ingredient.ofItems(ModItems.MITHRIL_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
