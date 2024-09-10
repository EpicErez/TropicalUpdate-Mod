package net.erez.tropicalupdate.tag;

import net.erez.tropicalupdate.TropicalUpdate;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> TROPICAL_VALLEY_BEDROCK_REPLACEABLE = of("tropical_valley_bedrock_replaceable");

    public static void registerModBlockTags() {
        TropicalUpdate.LOGGER.info("Registering Mod Block Tags for " + TropicalUpdate.MOD_ID);
    }

    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(id));
    }
}
