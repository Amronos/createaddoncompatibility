package net.amronos.createaddoncompatibility.data.datagen;

import net.amronos.createaddoncompatibility.CreateAddonCompatibility;
import net.amronos.createaddoncompatibility.data.tags.ForgeTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CreateAddonCompatibility.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ForgeTags.Blocks.SIX_WAY_GEARBOX)
                .addOptional(new ResourceLocation("create_connected", "six_way_gearbox"))
                .addOptional(new ResourceLocation("createutilities", "gearcube"))
        ;
    }
}
