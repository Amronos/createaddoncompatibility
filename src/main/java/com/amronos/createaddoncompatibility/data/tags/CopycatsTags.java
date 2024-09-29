package com.amronos.createaddoncompatibility.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class CopycatsTags {
    public static class Items {
        public static final TagKey<Item> COPYCAT_BLOCK = tag("copycat_block");
        public static final TagKey<Item> COPYCAT_BOX = tag("copycat_box");
        public static final TagKey<Item> COPYCAT_CATWALK = tag("copycat_catwalk");
        public static final TagKey<Item> COPYCAT_SLAB = tag("copycat_slab");
        public static final TagKey<Item> COPYCAT_STAIRS = tag("copycat_stairs");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation("copycats", name));
        }
    }
}
