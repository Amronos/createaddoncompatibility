package com.amronos.createaddoncompatibility.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;

public class ForgeTags {

    public static class Fluids {
        public static final TagKey<Fluid> CRUDE_OIL = tag("crude_oil");
        public static final TagKey<Fluid> ETHANOL = tag("ethanol");
        public static final TagKey<Fluid> LIQUID_PLASTIC = tag("liquid_plastic");
        public static final TagKey<Fluid> LUBRICANT = tag("lubricant");

        private static TagKey<Fluid> tag(String name) {
            return FluidTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> PLASTIC = tag("ingots/plastic");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
