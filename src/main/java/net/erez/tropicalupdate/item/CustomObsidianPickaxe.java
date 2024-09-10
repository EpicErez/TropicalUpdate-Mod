package net.erez.tropicalupdate.item;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;

public class CustomObsidianPickaxe extends PickaxeItem {
    public CustomObsidianPickaxe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        if (state.isOf(Blocks.OBSIDIAN)) {
            return 100.0f;
        }
        return super.getMiningSpeedMultiplier(stack, state);
    }
}
