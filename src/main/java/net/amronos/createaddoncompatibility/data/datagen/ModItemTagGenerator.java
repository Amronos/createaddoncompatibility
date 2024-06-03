package net.amronos.createaddoncompatibility.data.datagen;

import net.amronos.createaddoncompatibility.CreateAddonCompatibility;
import net.amronos.createaddoncompatibility.data.tags.ForgeTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, CreateAddonCompatibility.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ForgeTags.Items.PLASTIC_SHEET)
                .addOptional(new ResourceLocation("pneumaticcraft", "plastic"))
                .addOptional(new ResourceLocation("tfmg", "plastic_sheet"))
        ;

        this.tag(ForgeTags.Items.SIX_WAY_GEARBOX)
                .addOptional(new ResourceLocation("create_connected", "six_way_gearbox"))
                .addOptional(new ResourceLocation("createutilities", "gearcube"))
        ;
    }
}
