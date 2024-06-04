package net.amronos.createaddoncompatibility.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;

public class CreateAddonCompatibilityTags {
    public static class Blocks {

        private static TagKey<Fluid> tag(String name) {
            return FluidTags.create(new ResourceLocation("createaddoncompatibility", name));
        }
    }
}
