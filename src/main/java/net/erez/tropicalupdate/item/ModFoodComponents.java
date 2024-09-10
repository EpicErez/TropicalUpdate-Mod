package net.erez.tropicalupdate.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent TROPICAL_FRUITS = new FoodComponent.Builder().hunger(6).saturationModifier(0.45f).build();
    public static final FoodComponent TROPICAL_FRUIT_JUICE = new FoodComponent.Builder().hunger(4).saturationModifier(0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE , 140), 1f).build();
    public static final FoodComponent MANGO = new FoodComponent.Builder().hunger(3).saturationModifier(0.20f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 30), 0.10f).build();
    public static final FoodComponent PINEAPPLE = new FoodComponent.Builder().hunger(7).saturationModifier(0.7f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 70), 0.35f).build();
    public static final FoodComponent PINEAPPLE_JUICE = new FoodComponent.Builder().hunger(5).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 150), 1f).build();
    public static final FoodComponent PINEAPPLE_SLICE = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent PINEAPPLE_STEW = new FoodComponent.Builder().hunger(11).saturationModifier(1.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 120), 0.50f).meat().build();
    public static final FoodComponent BLUE_RASPBERRY = new FoodComponent.Builder().hunger(3).saturationModifier(0.35f).build();
    public static final FoodComponent PINEAPPLE_CAKE_SLICE = new FoodComponent.Builder().hunger(6).saturationModifier(0.55f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 80), 0.1f).build();
    public static final FoodComponent SALMON_STEW = new FoodComponent.Builder().hunger(7).saturationModifier(0.7f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 120), 1f).build();
    public static final FoodComponent CHICKEN_STEW = new FoodComponent.Builder().hunger(10).saturationModifier(0.9f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100), 0.5f).build();
}