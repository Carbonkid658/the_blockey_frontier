package net.carbonkid.tbf;

import net.carbonkid.tbf.core.ModItems;
import net.carbonkid.tbf.core.block.ModBlocks;
import net.carbonkid.tbf.core.item.ModItemGroups;
import net.carbonkid.tbf.util.ModCustomTraides;
import net.carbonkid.tbf.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TheBlockeyFrontier implements ModInitializer {
	public static final String MOD_ID = "the-blockey-frontier";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModCustomTraides.registerCustomTrades();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();

		CustomPortalBuilder.beginPortal()
				.frameBlock(ModBlocks.FRONTIER_FRAME)
				.lightWithItem(ModItems.FRONTIER_EYE)
				.destDimID(new Identifier(TheBlockeyFrontier.MOD_ID, "frontierdim"))
				.tintColor(0x644c31)
				.registerPortal();




	}
}