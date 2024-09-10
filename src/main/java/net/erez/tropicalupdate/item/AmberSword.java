package net.erez.tropicalupdate.item;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.enchantment.EnchantmentHelper; // Don't forget to import this!

public class AmberSword extends SwordItem {
    public AmberSword(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (target != null && !target.isFireImmune()) {
            int fireTicks = 5; // Default fire duration
            int fireAspectLevel = EnchantmentHelper.getLevel(Enchantments.FIRE_ASPECT, stack);
            if (fireAspectLevel == 1) {
                fireTicks = 7;
            } else if (fireAspectLevel == 2) {
                fireTicks = 10;
            }
            target.setOnFireFor(fireTicks);
        }
        return super.postHit(stack, target, attacker);
    }
}
