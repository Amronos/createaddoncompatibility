package net.amronos.createaddoncompatibility.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class ForgeTags {

    public static class Blocks {
        public static final TagKey<Block> SIX_WAY_GEARBOX = tag("create/six_way_gearbox");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }


    public static class Fluids {
        public static final TagKey<Fluid> CRUDE_OIL = tag("crude_oil");
        public static final TagKey<Fluid> DIESEL = tag("diesel");
        public static final TagKey<Fluid> ETHANOL = tag("ethanol");
        public static final TagKey<Fluid> GASOLINE = tag("gasoline");
        public static final TagKey<Fluid> KEROSENE = tag("kerosene");
        public static final TagKey<Fluid> LIQUID_PLASTIC = tag("liquid_plastic");
        public static final TagKey<Fluid> LUBRICANT = tag("lubricant");

        private static TagKey<Fluid> tag(String name) {
            return FluidTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> PLASTIC_SHEET = tag("plastic_sheet");
        public static final TagKey<Item> SIX_WAY_GEARBOX = tag("create/six_way_gearbox");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
