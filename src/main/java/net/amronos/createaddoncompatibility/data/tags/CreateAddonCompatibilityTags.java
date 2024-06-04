package net.amronos.createaddoncompatibility.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;

public class CreateAddonCompatibilityTags {
    public static class Items {
        public static final TagKey<Item> SIX_WAY_GEARBOX = tag("six_way_gearbox");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation("createaddoncompatibility", name));
        }
    }
}
