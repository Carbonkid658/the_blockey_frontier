package net.carbonkid.tbf.core.item;

import net.carbonkid.tbf.TheBlockeyFrontier;
import net.carbonkid.tbf.core.ModItems;
import net.carbonkid.tbf.core.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TBF_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheBlockeyFrontier.MOD_ID,"tbf"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tbf"))
                    .icon(()-> new ItemStack(ModItems.RAW_LEAD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_LEAD);
                        entries.add(ModBlocks.RAW_LEAD_BLOCK);

                        entries.add(ModBlocks.LEAD_ORE);
                        entries.add(ModBlocks.DEEP_LEAD_ORE);

                        entries.add(ModItems.LEAD_INGOT);
                        entries.add(ModItems.LEAD_NUGGET);
                        entries.add(ModBlocks.LEAD_BLOCK);

                        entries.add(ModItems.BISCUIT);
                        entries.add(ModItems.BEEN);
                        entries.add(ModItems.CAN);
                        entries.add(ModItems.BEEN_CAN);
                        entries.add(ModItems.BEEN_POD);

                        entries.add(ModItems.D0WSING_ROD);



                    }).build());

    public static void registerItemGroups() {
        TheBlockeyFrontier.LOGGER.info("Registering Item Groups for" +TheBlockeyFrontier.MOD_ID);
    }

}
