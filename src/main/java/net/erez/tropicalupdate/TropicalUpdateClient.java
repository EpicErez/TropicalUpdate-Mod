package net.erez.tropicalupdate;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import net.erez.tropicalupdate.block.ModBlocks;
import net.erez.tropicalupdate.entity.ModBoats;
import net.erez.tropicalupdate.entity.TurquoiseBedEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.block.entity.*;
import net.minecraft.block.enums.ChestType;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.block.entity.BedBlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.util.Identifier;

import static net.minecraft.client.render.TexturedRenderLayers.BEDS_ATLAS_TEXTURE;

public class TropicalUpdateClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {

        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.AZURE_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.AZURE_HANGING_SIGN_TEXTURE));

        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.MANGO_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.MANGO_HANGING_SIGN_TEXTURE));

        SpriteIdentifier turquoiseBedSprite = new SpriteIdentifier(TexturedRenderLayers.BEDS_ATLAS_TEXTURE, new Identifier(TropicalUpdate.MOD_ID, "entity/bed/turquoise"));

        TerraformBoatClientHelper.registerModelLayers(ModBoats.AZURE_BOAT_ID, false);

        TerraformBoatClientHelper.registerModelLayers(ModBoats.MANGO_BOAT_ID, false);
    }
}

