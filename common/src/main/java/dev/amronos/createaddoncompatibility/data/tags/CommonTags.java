package dev.amronos.createaddoncompatibility.data.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;

public class CommonTags {
    public static class Fluids {
        public static final TagKey<Fluid> CRUDE_OIL = tag("crude_oil");
        public static final TagKey<Fluid> PLASTIC = tag("plastic");
        public static final TagKey<Fluid> LUBRICANT = tag("lubricant");
        public static final TagKey<Fluid> LUBRICATION_OIL = tag("lubrication_oil");

        private static TagKey<Fluid> tag(String name) {
            return TagKey.create(
                    Registries.FLUID,
                    ResourceLocation.fromNamespaceAndPath("c", name)
            );
        }
    }

    public static class Items {
        public static final TagKey<Item> PLASTIC = tag("ingots/plastic");

        private static TagKey<Item> tag(String name) {
            return TagKey.create(
                    Registries.ITEM,
                    ResourceLocation.fromNamespaceAndPath("c", name)
            );
        }
    }
}
