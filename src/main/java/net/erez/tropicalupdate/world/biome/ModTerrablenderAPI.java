package net.erez.tropicalupdate.world.biome;

import net.erez.tropicalupdate.TropicalUpdate;
import net.erez.tropicalupdate.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(TropicalUpdate.MOD_ID, "overworld"), 50));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, TropicalUpdate.MOD_ID, ModMaterialRules.makeRules());

    }
}
