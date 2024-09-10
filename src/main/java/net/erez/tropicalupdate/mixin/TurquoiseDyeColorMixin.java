package net.erez.tropicalupdate.mixin;

import net.minecraft.util.DyeColor;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(DyeColor.class)
public class TurquoiseDyeColorMixin {
    private static String TURQUOISE = "turquoise";
    static {
        // Other colors...
        TurquoiseDyeColorMixin.TURQUOISE = TURQUOISE;
    }
}
