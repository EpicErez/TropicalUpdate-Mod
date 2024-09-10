package net.erez.tropicalupdate.entity;

import com.terraformersmc.terraform.sign.TerraformSign;
import net.erez.tropicalupdate.TropicalUpdate;
import net.erez.tropicalupdate.TropicalUpdateClient;
import net.erez.tropicalupdate.block.ModBlocks;
import net.minecraft.client.render.block.entity.BedBlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.structure.Structure;

import javax.naming.Context;

public class TurquoiseBedEntityRenderer extends BedBlockEntityRenderer implements TerraformSign {
    public TurquoiseBedEntityRenderer(BlockEntityRendererFactory.Context dispatcher) {
        super(dispatcher);
    }

    @Override
    public Identifier getTexture() {
        return new Identifier(TropicalUpdate.MOD_ID, "entity/bed/turquoise");
    }
}
