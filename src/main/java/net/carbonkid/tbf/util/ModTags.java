package net.carbonkid.tbf.util;

import net.carbonkid.tbf.TheBlockeyFrontier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.security.PublicKey;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> DOWSING_ROD_DETECTABLE_BLOCKS =
               TagKey.of(RegistryKeys.BLOCK,
                       new Identifier("the-blockey-frontier","dowsing_rod_detectable_blocks"));

//        private static TagKey<Block> createTag(String name) {
//            return TagKey.of(RegistryKeys.BLOCK, new Identifier(TheBlockeyFrontier.MOD_ID, name));
//        }
    }

//    public static class Items {
//
//
//        private  static TagKey<Item> createTag(String name) {
//            return TagKey.of(RegistryKey.ITEM, new Identifier(TheBlockeyFrontier.MOD_ID, name));
//        }
//
//
//
//    }`





}
