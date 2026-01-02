package net.carbonkid.tbf.datagen;

import net.carbonkid.tbf.core.ModItems;
import net.carbonkid.tbf.core.block.ModBlocks;
import net.carbonkid.tbf.core.block.custome.BeenCropBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.data.server.loottable.vanilla.VanillaBarterLootTableGenerator;
import net.minecraft.data.server.loottable.vanilla.VanillaBlockLootTableGenerator;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;

import java.rmi.registry.Registry;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.LEAD_BLOCK);
        addDrop(ModBlocks.RAW_LEAD_BLOCK);

        addDrop(ModBlocks.COT_PLANK_BLOCK);
        addDrop(ModBlocks.COT_BUTTON);
        addDrop(ModBlocks.COT_FENCE);
        addDrop(ModBlocks.COT_FENCE_GATE);
        addDrop(ModBlocks.COT_TRAPDOOR);
        addDrop(ModBlocks.COT_PRESSURE_PLATE);
        addDrop(ModBlocks.COT_STAIRS);


        addDrop(ModBlocks.COT_LOG);
        addDrop(ModBlocks.COT_WOOD);
        addDrop(ModBlocks.STRIPPED_COT_WOOD);
        addDrop(ModBlocks.STRIPPED_COT_LOG);
        addDrop(ModBlocks.COT_SAPPLING);

        addDrop(ModBlocks.COT_LEAVES, leavesDrops(ModBlocks.COT_LEAVES,
                ModBlocks.COT_SAPPLING, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)); // TODO

        addDrop(ModBlocks.COT_DOOR, doorDrops(ModBlocks.COT_DOOR));
        addDrop(ModBlocks.COT_SLAB, slabDrops(ModBlocks.COT_SLAB));

        addDrop(ModBlocks.LEAD_ORE,oreDrops(ModBlocks.LEAD_ORE, ModItems.RAW_LEAD));
        addDrop(ModBlocks.DEEP_LEAD_ORE,oreDrops(ModBlocks.DEEP_LEAD_ORE, ModItems.RAW_LEAD));
        this.addDrop(ModBlocks.BEEN_CROP_BLOCK, block -> this.applyExplosionDecay(block,
                LootTable.builder().pool(LootPool.builder().conditionally(BlockStatePropertyLootCondition.builder( ModBlocks.BEEN_CROP_BLOCK)
                                                .properties(StatePredicate.Builder.create().exactMatch(BeenCropBlock.AGE, 3))).with(ItemEntry
                                                .builder(ModItems.BEEN_POD)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 3.0F)))
                                                .apply(ApplyBonusLootFunction.uniformBonusCount(Enchantments.FORTUNE))).pool(LootPool.builder()
                                                .conditionally(BlockStatePropertyLootCondition.builder( ModBlocks.BEEN_CROP_BLOCK).properties(StatePredicate.Builder.create().exactMatch(BeenCropBlock.AGE, 2)))
                                                .with(ItemEntry.builder(ModItems.BEEN_POD))
                                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F)))
                                                .apply(ApplyBonusLootFunction.uniformBonusCount(Enchantments.FORTUNE))
                                )
                )
        );

    }
}
