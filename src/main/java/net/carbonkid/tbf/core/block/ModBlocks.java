package net.carbonkid.tbf.core.block;

import net.carbonkid.tbf.TheBlockeyFrontier;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block LEAD_ORE = registerBlock("lead_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));

    public static final Block DEEP_LEAD_ORE = registerBlock("deep_lead_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));

    public static final Block RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));

    public static final Block LEAD_BLOCK = registerBlock("lead_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block BEEN_CROP_BLOCK = registerBlock("been_crop_block",
            new Block(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH)));



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
