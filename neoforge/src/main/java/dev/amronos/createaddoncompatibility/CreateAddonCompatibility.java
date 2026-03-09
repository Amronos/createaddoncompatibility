package dev.amronos.createaddoncompatibility;


import dev.amronos.createaddoncompatibility.data.datagen.ModDataGenerator;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class CreateAddonCompatibility {

    public CreateAddonCompatibility(IEventBus eventBus) {
        CommonClass.init();
        eventBus.register(ModDataGenerator.class);
    }
}
