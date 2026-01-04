package net.carbonkid.tbf.core.block;

import net.carbonkid.tbf.TheBlockeyFrontier;
import net.carbonkid.tbf.core.block.custome.BeenCropBlock;
import net.carbonkid.tbf.world.tree.CotSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block LEAD_ORE = registerBlock("lead_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block LEAD_BLOCK = registerBlock("lead_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block DEEP_LEAD_ORE = registerBlock("deep_lead_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));

    public static final Block RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    public static final Block COT_PLANK_BLOCK = registerBlock("cot_plank_block",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block COT_LOG = registerBlock("cot_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block COT_WOOD = registerBlock("cot_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_COT_LOG = registerBlock("stripped_cot_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_COT_WOOD = registerBlock("stripped_cot_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block FRONTIER_FRAME = registerBlock("frontier_frame",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));

    public static final Block COT_LEAVES = registerBlock("cot_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));

    public static final Block COT_SAPPLING = registerBlock("cot_sappling",
            new SaplingBlock(new CotSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));









    public static final Block COT_STAIRS = registerBlock("cot_stairs",
            new StairsBlock(ModBlocks.COT_PLANK_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block COT_SLAB = registerBlock("cot_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block COT_BUTTON = registerBlock("cot_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block COT_PRESSURE_PLATE = registerBlock("cot_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PLANKS),
                    BlockSetType.OAK));

    public static final Block COT_FENCE = registerBlock("cot_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block COT_FENCE_GATE = registerBlock("cut_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), WoodType.OAK));

    public static final Block COT_DOOR = registerBlock("cot_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block COT_TRAPDOOR = registerBlock("cot_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).nonOpaque(), BlockSetType.OAK));




    public static final Block BEEN_CROP_BLOCK = registerBlock("been_crop_block",
            new BeenCropBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TheBlockeyFrontier.MOD_ID, name),block);
    }

    private  static Item registerBlockItem(String name, Block block) {
        return  Registry.register(Registries.ITEM, new Identifier(TheBlockeyFrontier.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {
        TheBlockeyFrontier.LOGGER.info("Registering ModBlocks for" + TheBlockeyFrontier.MOD_ID);
    }
}
