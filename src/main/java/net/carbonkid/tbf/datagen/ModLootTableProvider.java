package net.carbonkid.tbf.datagen;

import net.carbonkid.tbf.core.ModItems;
import net.carbonkid.tbf.core.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.LEAD_BLOCK);
        addDrop(ModBlocks.RAW_LEAD_BLOCK);

        addDrop(ModBlocks.LEAD_ORE,oreDrops(ModBlocks.LEAD_ORE, ModItems.RAW_LEAD));
        addDrop(ModBlocks.DEEP_LEAD_ORE,oreDrops(ModBlocks.DEEP_LEAD_ORE, ModItems.RAW_LEAD));

    }
}
