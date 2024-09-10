package net.erez.tropicalupdate.mixin;

import net.erez.tropicalupdate.item.ModItems;
import net.minecraft.enchantment.EfficiencyEnchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EfficiencyEnchantment.class)
public abstract class MixinEfficiencyEnchantment {
	@Inject(method = "isAcceptableItem", at = @At("HEAD"), cancellable = true)
	private void modifyIsAcceptableItem(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
		if (stack.isOf(Items.SHEARS) || stack.isOf(ModItems.MITHRIL_SHEARS)) {
			cir.setReturnValue(true);
		}
	}
}
