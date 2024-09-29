package com.amronos.createaddoncompatibility.data.datagen;

import com.amronos.createaddoncompatibility.CreateAddonCompatibility;
import com.amronos.createaddoncompatibility.data.tags.ForgeTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;


public class ModFluidTagGenerator extends FluidTagsProvider {
    public ModFluidTagGenerator(PackOutput p_255941_, CompletableFuture<HolderLookup.Provider> p_256600_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_255941_, p_256600_, CreateAddonCompatibility.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ForgeTags.Fluids.CRUDE_OIL)
                .addOptional(new ResourceLocation("ad_astra", "oil"))
                .addOptional(new ResourceLocation("ad_astra", "flowing_oil"))
                .addOptional(new ResourceLocation("pneumaticcraft", "oil"))
                .addOptional(new ResourceLocation("pneumaticcraft", "flowing_oil"))
        ;
        this.tag(ForgeTags.Fluids.ETHANOL)
                .addOptional(new ResourceLocation("createaddition", "bioethanol"))
                .addOptional(new ResourceLocation("createaddition", "flowing_bioethanol"))
        ;
        this.tag(ForgeTags.Fluids.LIQUID_PLASTIC)
                .addOptional(new ResourceLocation("pneumaticcraft", "plastic"))
                .addOptional(new ResourceLocation("pneumaticcraft", "flowing_plastic"))
                .addOptional(new ResourceLocation("tfmg", "liquid_plastic"))
                .addOptional(new ResourceLocation("tfmg", "flowing_liquid_plastic"))
        ;
        this.tag(ForgeTags.Fluids.LUBRICANT)
                .addOptional(new ResourceLocation("tfmg", "lubrication_oil"))
                .addOptional(new ResourceLocation("tfmg", "flowing_lubrication_oil"))
        ;
    }
}
