package dev.amronos.createaddoncompatibility.data.datagen;

import dev.amronos.createaddoncompatibility.Constants;
import dev.amronos.createaddoncompatibility.data.tags.CommonTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModFluidTagsProvider extends FluidTagsProvider {

    public ModFluidTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
        tag(CommonTags.Fluids.CRUDE_OIL)
                .addOptional(ResourceLocation.fromNamespaceAndPath("pneumaticcraft", "flowing_oil"))
        ;
        tag(CommonTags.Fluids.PLASTIC)
                .addOptional(ResourceLocation.fromNamespaceAndPath("pneumaticcraft", "plastic"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("pneumaticcraft", "flowing_plastic"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tfmg", "liquid_plastic"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tfmg", "flowing_liquid_plastic"))
        ;
        tag(CommonTags.Fluids.LUBRICANT)
                .addOptionalTag(ResourceLocation.fromNamespaceAndPath("c", "lubrication_oil"))
        ;
        tag(CommonTags.Fluids.LUBRICATION_OIL)
                .addOptionalTag(ResourceLocation.fromNamespaceAndPath("c", "lubricant"))
        ;
    }
}
