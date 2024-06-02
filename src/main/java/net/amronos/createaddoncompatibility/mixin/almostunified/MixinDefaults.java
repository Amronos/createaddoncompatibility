package net.amronos.createaddoncompatibility.mixin.almostunified;

import com.almostreliable.unified.AlmostUnifiedPlatform;
import com.almostreliable.unified.config.Defaults;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.List;

@Mixin(Defaults.class)
public class MixinDefaults {
    @Shadow
    public static List<String> getModPriorities(AlmostUnifiedPlatform.Platform platform) {
        List var10000;
        switch (platform) {
            case FORGE -> var10000 = List.of("minecraft", "amronos", "kubejs", "crafttweaker", "create", "thermal", "immersiveengineering", "mekanism");
            case FABRIC -> var10000 = List.of("minecraft", "kubejs", "crafttweaker", "create", "techreborn", "modern_industrialization", "indrev");
            default -> throw new IncompatibleClassChangeError();
        }

        return var10000;
    }

    public MixinDefaults(){
    }
}
