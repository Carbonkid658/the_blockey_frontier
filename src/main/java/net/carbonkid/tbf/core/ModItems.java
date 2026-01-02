package net.carbonkid.tbf.core;

import net.carbonkid.tbf.TheBlockeyFrontier;
import net.carbonkid.tbf.core.block.ModBlocks;
import net.carbonkid.tbf.core.item.ModFoodComponents;
import net.carbonkid.tbf.core.item.custome.DowsingRodItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BEEN = registerItem("been", new Item(new FabricItemSettings()
            .food(ModFoodComponents.BEEN)));

    public static final Item BEEN_CAN = registerItem("been_can", new Item(new FabricItemSettings()
            .food(ModFoodComponents.BEEN_CAN)));

    public static final Item BISCUIT = registerItem("biscuit", new Item(new FabricItemSettings()
            .food(ModFoodComponents.BISCUIT)));

    public static final Item HARDTAK = registerItem("hardtak", new Item(new FabricItemSettings()
            .food(ModFoodComponents.HARDTAK)));

    public static final Item CAN = registerItem("can",new Item(new FabricItemSettings()));
    public static final Item BEEN_POD = registerItem("been_pod",
            new AliasedBlockItem(ModBlocks.BEEN_CROP_BLOCK, new Item.Settings().food(ModFoodComponents.BEEN_POD)));

    public static final Item RAW_LEAD = registerItem("raw_lead",new Item(new FabricItemSettings()));
    public static final Item LEAD_INGOT = registerItem("lead_ingot",new Item(new FabricItemSettings()));
    public static final Item LEAD_NUGGET = registerItem("lead_nugget",new Item(new FabricItemSettings()));
    public static final Item FRONTIER_EYE = registerItem("frontier_eye",new Item(new FabricItemSettings()));

    public static final Item D0WSING_ROD  = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().maxDamage(16)));

    public static final Item REVOLVER = registerItem("revolver", new CrossbowItem(
            new Item.Settings().maxDamage(15)));

    private static void  addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(BISCUIT);
        entries.add(HARDTAK);
        entries.add(RAW_LEAD);
        entries.add(LEAD_INGOT);
        entries.add(LEAD_NUGGET);
    }

    private  static Item registerItem(String name, Item item){

        return Registry.register(Registries.ITEM, new Identifier(TheBlockeyFrontier.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheBlockeyFrontier.LOGGER.info("reistering Mod Items for" + TheBlockeyFrontier.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
                   }

}
