package net.amronos.createaddoncompatibility.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;

public class CopycatsTags {
    public static class Fluids {
        public static final TagKey<Fluid> FUEL = tag("fuel");
        public static final TagKey<Fluid> OIL = tag("oil");

        private static TagKey<Fluid> tag(String name) {
            return FluidTags.create(new ResourceLocation("ad_astra", name));
        }
    }
}
