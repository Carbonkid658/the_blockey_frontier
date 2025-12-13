package net.carbonkid.tbf.datagen;

import net.carbonkid.tbf.core.block.ModBlocks;
import net.carbonkid.tbf.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Blocks.DOWSING_ROD_DETECTABLE_BLOCKS)
                .add(ModBlocks.DEEP_LEAD_ORE)
                .add(ModBlocks.LEAD_ORE)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.COAL_ORES);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RAW_LEAD_BLOCK)
                .add(ModBlocks.LEAD_BLOCK)
                .add(ModBlocks.LEAD_ORE)
                .add(ModBlocks.DEEP_LEAD_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RAW_LEAD_BLOCK)
                .add(ModBlocks.LEAD_BLOCK)
                .add(ModBlocks.LEAD_ORE)
                .add(ModBlocks.DEEP_LEAD_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);




    }
}
