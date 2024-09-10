package net.erez.tropicalupdate.mixin;

import net.erez.tropicalupdate.item.ModItems;
import net.erez.tropicalupdate.item.SheepShearCallback;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SheepEntity.class)
public abstract class MixinSheepEntity {
    @Inject(method = "interactMob", at = @At("HEAD"), cancellable = true)
    private void onShearAttempt(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResult> ci) {
        if (player.getStackInHand(hand).isOf(ModItems.MITHRIL_SHEARS)) {
            ActionResult result = SheepShearCallback.EVENT.invoker().interact(player, (SheepEntity)(Object)this);
            if (result != ActionResult.PASS) {
                ci.setReturnValue(result);
            }
        }
    }
}
