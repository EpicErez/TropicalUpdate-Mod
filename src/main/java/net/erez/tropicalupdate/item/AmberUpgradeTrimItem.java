package net.erez.tropicalupdate.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AmberUpgradeTrimItem extends Item {
    private final String tooltipKey;
    private final String tooltipKey1;
    private final String tooltipKey2;
    private final String tooltipKey3;
    private final String tooltipkeyair;
    private final String tooltipkey0;

    public AmberUpgradeTrimItem(Settings settings, String tooltipkey0, String tooltipkeyair, String tooltipKey, String tooltipKey1, String tooltipKey2, String tooltipKey3) {
        super(settings);
        this.tooltipkey0 = tooltipkey0;
        this.tooltipkeyair = tooltipkeyair;
        this.tooltipKey = tooltipKey;
        this.tooltipKey1 = tooltipKey1;
        this.tooltipKey2 = tooltipKey2;
        this.tooltipKey3 = tooltipKey3;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable(tooltipkey0).formatted(Formatting.GRAY));
        tooltip.add(Text.translatable(tooltipkeyair).formatted(Formatting.WHITE));
        tooltip.add(Text.translatable(tooltipKey).formatted(Formatting.GRAY));
        tooltip.add(Text.translatable(tooltipKey1).formatted(Formatting.BLUE));
        tooltip.add(Text.translatable(tooltipKey2).formatted(Formatting.GRAY));
        tooltip.add(Text.translatable(tooltipKey3).formatted(Formatting.BLUE));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
