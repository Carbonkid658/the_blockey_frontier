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
        BlockStateModelGenerator.BlockTexturePool cotPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COT_PLANK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_LEAD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FRONTIER_FRAME);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEP_LEAD_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_BLOCK);

        blockStateModelGenerator.registerLog(ModBlocks.COT_LOG).log(ModBlocks.COT_LOG).wood(ModBlocks.COT_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_COT_LOG).log(ModBlocks.STRIPPED_COT_LOG).wood(ModBlocks.STRIPPED_COT_WOOD);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COT_LEAVES);
        blockStateModelGenerator.registerTintableCross(ModBlocks.COT_SAPPLING,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        cotPool.stairs(ModBlocks.COT_STAIRS);
        cotPool.slab(ModBlocks.COT_SLAB);
        cotPool.fence(ModBlocks.COT_FENCE);
        cotPool.fenceGate(ModBlocks.COT_FENCE_GATE);
        cotPool.button(ModBlocks.COT_BUTTON);
        cotPool.pressurePlate(ModBlocks.COT_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.COT_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.COT_TRAPDOOR);




        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.BEEN_CROP_BLOCK,
                BlockStateModelGenerator.TintType.NOT_TINTED,
                BeenCropBlock.AGE, 0, 1, 2, 3);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.LEAD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRONTIER_EYE, Models.GENERATED);
        itemModelGenerator.register(ModItems. LEAD_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems. RAW_LEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems. BEEN, Models.GENERATED);
        itemModelGenerator.register(ModItems. BEEN_CAN, Models.GENERATED);
        itemModelGenerator.register(ModItems. BISCUIT, Models.GENERATED);
        itemModelGenerator.register(ModItems. HARDTAK, Models.GENERATED);
        itemModelGenerator.register(ModItems. CAN, Models.GENERATED);
        itemModelGenerator.register(ModItems. REVOLVER, Models.GENERATED);
        itemModelGenerator.register(ModItems. D0WSING_ROD, Models.GENERATED);





    }
}
