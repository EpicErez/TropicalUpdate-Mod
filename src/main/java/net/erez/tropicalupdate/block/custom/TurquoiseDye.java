package net.erez.tropicalupdate.block.custom; // Adjust the package name

import net.minecraft.block.MapColor;
import net.minecraft.util.StringIdentifiable;

public enum TurquoiseDye implements StringIdentifiable {
    TURQUOISE(16, "turquoise", 65535, MapColor.CYAN, 0x40E0D0, 0x40E0D0);
    // Add other custom colors here if needed


    private final int id;
    private final String name;

    private TurquoiseDye(int id, String name, int color, MapColor mapColor, int fireworkColor, int signColor) {
        this.id = id;
        this.name = name;
        int j = (color & 16711680) >> 16;
        int k = (color & 0xff00) >> 8;
        int l = color & 0xff;
        float[] colorComponents = new float[]{(float) j / 255.0F, (float) k / 255.0F, (float) l / 255.0F};
    }

    // Implement other methods (getId, getName, getColorComponents, etc.) for each color

    @Override
    public String asString() {
        return this.name;
    }

}
