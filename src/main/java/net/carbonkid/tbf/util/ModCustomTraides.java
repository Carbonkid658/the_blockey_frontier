package net.carbonkid.tbf.util;

import net.carbonkid.tbf.core.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTraides {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories ->{
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.BEEN_POD, 16),
                    new ItemStack(Items.EMERALD, 1), 10, 1, 0.05f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItems.BEEN_POD, 2), 10, 1, 0.05f));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2, factories ->{
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItems.BISCUIT, 1), 10, 1, 0.05f));
        });

    }

}
