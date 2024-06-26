package net.amronos.createaddoncompatibility.registry;

import net.amronos.createaddoncompatibility.CreateAddonCompatibility;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.PathPackResources;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.fml.ModList;

import java.nio.file.Path;

public class ModDatapacks {
    public static void registerModDatapacks(final AddPackFindersEvent event) {
        if (ModList.get().isLoaded("ad_astra")) {
            registerModDatapacks(event, "rockets_use_adastra_fuels_only");
        }
    }

    private static void registerModDatapacks(final AddPackFindersEvent event, String name) {
        if (event.getPackType() == PackType.SERVER_DATA) {
            Path path = ModList.get().getModFileById(CreateAddonCompatibility.MOD_ID).getFile().findResource("datapacks/" + name);
            Pack builtinDataPack = Pack.readMetaAndCreate(
                    CreateAddonCompatibility.MOD_ID + ":" + name,
                    Component.translatable("datapack." + CreateAddonCompatibility.MOD_ID + "." + name),
                    false,
                    (a) -> new PathPackResources(a, path, false),
                    PackType.SERVER_DATA,
                    Pack.Position.TOP,
                    PackSource.create((arg) -> Component.translatable("pack.nameAndSource", arg, Component.translatable("pack.source.builtin")).withStyle(ChatFormatting.GRAY), false)
            );
            event.addRepositorySource((packConsumer) -> packConsumer.accept(builtinDataPack));
        }
    }
}
