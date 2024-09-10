package net.erez.tropicalupdate.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.event.GameEvent;

public class MithrilShearsItem extends ShearsItem {
    public MithrilShearsItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity player, LivingEntity entity, Hand hand) {
        if (entity instanceof SheepEntity) {
            SheepEntity sheep = (SheepEntity) entity;
            if (!sheep.isSheared()) {
                sheep.sheared(SoundCategory.PLAYERS);
                sheep.emitGameEvent(GameEvent.SHEAR, player);
                if (!player.isCreative()) {
                    stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
                }

                // Custom logic: Drop wool based on sheep's color
                net.minecraft.util.DyeColor woolColor = sheep.getColor();
                ItemStack woolStack = new ItemStack((ItemConvertible) getWoolItem(woolColor));
                sheep.dropStack(woolStack);

                return ActionResult.SUCCESS;
            }
        }
        return super.useOnEntity(stack, player, entity, hand);
    }

    private Item getWoolItem(net.minecraft.util.DyeColor color) {
        switch (color) {
            case WHITE:
                return Items.WHITE_WOOL;
            case ORANGE:
                return Items.ORANGE_WOOL;
            case BLACK:
                return Items.BLACK_WOOL;
            case YELLOW:
                return Items.YELLOW_WOOL;
            case MAGENTA:
                return Items.MAGENTA_WOOL;
            case LIME:
                return Items.LIME_WOOL;
            case GREEN:
                return Items.GREEN_WOOL;
            case CYAN:
                return ModItems.TURQUOISE_WOOL;
            case LIGHT_BLUE:
                return Items.LIGHT_BLUE_WOOL;
            case BLUE:
                return Items.BLUE_WOOL;
            case PURPLE:
                return Items.PURPLE_WOOL;
            case PINK:
                return Items.PINK_WOOL;
            case GRAY:
                return Items.GRAY_WOOL;
            case LIGHT_GRAY:
                return Items.LIGHT_GRAY_WOOL;
            case RED:
                return Items.RED_WOOL;
            case BROWN:
                return Items.BROWN_WOOL;
            // Add cases for other colors as needed
            default:
                return Items.WHITE_WOOL; // Default to white wool
        }
    }
}
