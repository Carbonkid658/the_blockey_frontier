package net.carbonkid.tbf.world.biome;

import net.carbonkid.tbf.TheBlockeyFrontier;
import net.carbonkid.tbf.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

import javax.swing.plaf.synth.Region;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(TheBlockeyFrontier.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, TheBlockeyFrontier.MOD_ID, ModMaterialRules.makeRules());

    }
}
