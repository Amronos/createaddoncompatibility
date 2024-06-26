package net.amronos.createaddoncompatibility;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import net.amronos.createaddoncompatibility.registry.ModDatapacks;

@Mod(CreateAddonCompatibility.MOD_ID)
public class CreateAddonCompatibility {
    public static final String MOD_ID = "createaddoncompatibility";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CreateAddonCompatibility() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::callRegisterModDatapacks);
    }

    public void callRegisterModDatapacks(final AddPackFindersEvent event) {
        ModDatapacks.registerModDatapacks(event);
    }
}
