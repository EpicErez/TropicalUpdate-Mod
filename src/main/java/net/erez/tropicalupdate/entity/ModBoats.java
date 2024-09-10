package net.erez.tropicalupdate.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.erez.tropicalupdate.TropicalUpdate;
import net.erez.tropicalupdate.block.ModBlocks;
import net.erez.tropicalupdate.item.ModItems;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBoats {
    public static final Identifier AZURE_BOAT_ID = new Identifier(TropicalUpdate.MOD_ID, "azure_boat");
    public static final Identifier AZURE_CHEST_BOAT_ID = new Identifier(TropicalUpdate.MOD_ID, "azure_chest_boat");
    public static final Identifier MANGO_BOAT_ID = new Identifier(TropicalUpdate.MOD_ID, "mango_boat");
    public static final Identifier MANGO_CHEST_BOAT_ID = new Identifier(TropicalUpdate.MOD_ID, "mango_chest_boat");

    public static final RegistryKey<TerraformBoatType> AZURE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(AZURE_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> MANGO_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MANGO_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType azureBoat = new TerraformBoatType.Builder()
                .item(ModItems.AZURE_BOAT)
                .chestItem(ModItems.AZURE_CHEST_BOAT)
                .planks(ModBlocks.AZURE_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE,AZURE_BOAT_KEY, azureBoat);

        TerraformBoatType mangoBoat = new TerraformBoatType.Builder()
                .item(ModItems.MANGO_BOAT)
                .chestItem(ModItems.MANGO_CHEST_BOAT)
                .planks(ModBlocks.MANGO_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE,MANGO_BOAT_KEY, mangoBoat);
    }
}
