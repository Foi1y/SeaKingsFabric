package net.foi1y.seakings.util;

import net.foi1y.seakings.SeaKingsMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(SeaKingsMod.MOD_ID, name));
        }
    }

        public static class Items {
            public static final TagKey<Item> SEAKING_ARMOR_TAG =
                    createTag("seakingarmortag");
            public static final TagKey<Item> ONE_SWORD_STYLE =
                    createTag("1ss");
            public static final TagKey<Item> TWO_SWORD_STYLE =
                    createTag("2ss");
            public static final TagKey<Item> THREE_SWORD_STYLE =
                    createTag("3ss");

            private static TagKey<Item> createTag(String name) {
                return TagKey.of(RegistryKeys.ITEM, new Identifier(SeaKingsMod.MOD_ID, name));
            }
        }
    }
