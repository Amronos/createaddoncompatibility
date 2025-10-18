package dev.amronos.createaddoncompatibility.data.datagen;

import dev.amronos.createaddoncompatibility.Constants;
import dev.amronos.createaddoncompatibility.data.tags.CommonTags;
import dev.amronos.createaddoncompatibility.data.tags.CopycatsTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(CommonTags.Items.PLASTIC)
                .addOptional(ResourceLocation.fromNamespaceAndPath("pneumaticcraft", "plastic"))
        ;

        this.tag(CopycatsTags.Items.COPYCAT_BLOCK)
                .addOptional(ResourceLocation.fromNamespaceAndPath("create_dd", "copycat_block"))
        ;
        this.tag(CopycatsTags.Items.COPYCAT_BOX)
                .addOptional(ResourceLocation.fromNamespaceAndPath("create_connected", "copycat_box"))
        ;
        this.tag(CopycatsTags.Items.COPYCAT_CATWALK)
                .addOptional(ResourceLocation.fromNamespaceAndPath("create_connected", "copycat_catwalk"))
        ;
        this.tag(CopycatsTags.Items.COPYCAT_SLAB)
                .addOptional(ResourceLocation.fromNamespaceAndPath("create_dd", "copycat_slab"))
        ;
        this.tag(CopycatsTags.Items.COPYCAT_STAIRS)
                .replace(true)
                .addOptional(ResourceLocation.fromNamespaceAndPath("copycats", "copycat_stairs"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("create_connected", "copycat_stairs"))
        ;
    }
}
