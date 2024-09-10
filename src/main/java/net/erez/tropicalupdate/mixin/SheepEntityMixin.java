package net.erez.tropicalupdate.mixin;

import net.erez.tropicalupdate.block.custom.EatTropicalGrassGoal;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SheepEntity.class)
public abstract class SheepEntityMixin extends MobEntity {

    protected SheepEntityMixin(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "initGoals", at = @At("TAIL"))
    private void addTropicalGrassEatingGoal(CallbackInfo ci) {
        this.goalSelector.add(5, new EatTropicalGrassGoal((SheepEntity) (Object) this));
    }
}
