package net.amronos.createaddoncompatibility.mixin.almostunified;

import com.almostreliable.unified.AlmostUnifiedPlatform;
import com.almostreliable.unified.config.Defaults;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.List;

@Mixin(Defaults.class)
public class MixinDefaults {
    /**
     * @author Amronos
     * @reason Needed to change the default config file, and I wasn't able to find another way to do it. The config file can later be changed by the user of the mods.
     */
    @Overwrite(remap = false)
    public static List<String> getTags(AlmostUnifiedPlatform.Platform platform) {
        return List.of(
            "forge:nuggets/{material}",
            "forge:dusts/{material}",
            "forge:gears/{material}",
            "forge:gems/{material}",
            "forge:ingots/{material}",
            "forge:raw_materials/{material}",
            "forge:ores/{material}",
            "forge:plates/{material}",
            "forge:rods/{material}",
            "forge:wires/{material}",
            "forge:storage_blocks/{material}",
            "forge:storage_blocks/raw_{material}",
            "forge:plastic_sheet",
            "forge:create/six_way_gearbox"
        );
    }

    public MixinDefaults(){
    }
}
