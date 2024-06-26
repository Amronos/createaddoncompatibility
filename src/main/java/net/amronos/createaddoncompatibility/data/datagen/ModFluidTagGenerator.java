package net.amronos.createaddoncompatibility.data.datagen;

import net.amronos.createaddoncompatibility.CreateAddonCompatibility;
import net.amronos.createaddoncompatibility.data.tags.ForgeTags;
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
                .addOptional(new ResourceLocation("tfmg", "crude_oil_fluid"))
                .addOptional(new ResourceLocation("tfmg", "flowing_crude_oil_fluid"))
        ;
        this.tag(ForgeTags.Fluids.DIESEL)
                .addOptional(new ResourceLocation("tfmg", "diesel"))
                .addOptional(new ResourceLocation("tfmg", "flowing_diesel"))
        ;
        this.tag(ForgeTags.Fluids.ETHANOL)
                .addOptional(new ResourceLocation("createaddition", "bioethanol"))
                .addOptional(new ResourceLocation("createaddition", "flowing_bioethanol"))
        ;
        this.tag(ForgeTags.Fluids.GASOLINE)
                .addOptional(new ResourceLocation("tfmg", "gasoline"))
                .addOptional(new ResourceLocation("tfmg", "flowing_gasoline"))
        ;
        this.tag(ForgeTags.Fluids.KEROSENE)
                .addOptional(new ResourceLocation("tfmg", "kerosene"))
                .addOptional(new ResourceLocation("tfmg", "flowing_kerosene"))
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
