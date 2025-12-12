package net.carbonkid.tbf;

import net.carbonkid.tbf.core.ModItems;
import net.carbonkid.tbf.core.block.ModBlocks;
import net.carbonkid.tbf.core.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TheBlockeyFrontier implements ModInitializer {
	public static final String MOD_ID = "the-blocky-frontier";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}