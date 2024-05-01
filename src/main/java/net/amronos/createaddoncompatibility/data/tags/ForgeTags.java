package net.amronos.createaddoncompatibility.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;

public class ForgeTags {
    public static class Fluids {
        public static final TagKey<Fluid> CRUDE_OIL = tag("crude_oil");
        public static final TagKey<Fluid> DIESEL = tag("diesel");
        public static final TagKey<Fluid> ETHANOL = tag("ethanol");
        public static final TagKey<Fluid> GASOLINE = tag("gasoline");
        public static final TagKey<Fluid> KEROSENE = tag("kerosene");
        public static final TagKey<Fluid> LIQUID_PLASTIC = tag("liquid_plastic");
        public static final TagKey<Fluid> LUBRICANT = tag("lubricant");
        public static final TagKey<Fluid> PLANTOIL = tag("plantoil");

        private static TagKey<Fluid> tag(String name) {
            return FluidTags.create(new ResourceLocation("forge", name));
        }
    }
}
