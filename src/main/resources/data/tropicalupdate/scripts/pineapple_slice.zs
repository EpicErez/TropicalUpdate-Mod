import crafttweaker.api.item.IIngredient;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.recipes.CraftingRecipeBuilder;

// Define the items
val pineapple = <item:tropicalupdate:pineapple>;
val pineappleSlice = <item:tropicalupdate:pineapple_slice>;

// Define the swords
val swords = [<item:minecraft:wooden_sword>, <item:minecraft:stone_sword>, <item:minecraft:iron_sword>, <item:minecraft:diamond_sword>, <item:minecraft:netherite_sword>];

// Loop through each sword and create a recipe
for sword in swords {
    val damagedSword = sword.withDamage(1);
    val recipeName = "slice_pineapple_with_" + sword.commandString.replace(":", "_");

    // Create the recipe
    CraftingRecipeBuilder.shaped(recipeName, pineappleSlice * 4, [
        [null, sword, null],
        [null, pineapple, null],
        [null, null, null]
    ])
    .setDamageItems([sword])
    .build();
}
