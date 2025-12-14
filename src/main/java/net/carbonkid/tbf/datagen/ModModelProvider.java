package net.carbonkid.tbf.datagen;

import net.carbonkid.tbf.core.ModItems;
import net.carbonkid.tbf.core.block.ModBlocks;
import net.carbonkid.tbf.core.block.custome.BeenCropBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_LEAD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEP_LEAD_ORE);

        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.BEEN_CROP_BLOCK, BlockStateModelGenerator.TintType.NOT_TINTED,
                BeenCropBlock.AGE, 0, 1, 2, 3);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.LEAD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems. LEAD_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems. RAW_LEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems. BEEN, Models.GENERATED);
        itemModelGenerator.register(ModItems. BEEN_CAN, Models.GENERATED);
        itemModelGenerator.register(ModItems. BEEN_POD, Models.GENERATED);
        itemModelGenerator.register(ModItems. BISCUIT, Models.GENERATED);
        itemModelGenerator.register(ModItems. CAN, Models.GENERATED);
        itemModelGenerator.register(ModItems. D0WSING_ROD, Models.GENERATED);





    }
}
