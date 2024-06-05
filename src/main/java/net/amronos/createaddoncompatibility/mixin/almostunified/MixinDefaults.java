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
    public static List<String> getModPriorities(AlmostUnifiedPlatform.Platform platform) {
        return List.of(
                "minecraft",
                "kubejs",
                "crafttweaker",
                "create",
                "thermal",
                "immersiveengineering",
                "mekanism",
                "pneumaticcraft",
                "copycats",
                "create_connected",
                "createutilities",
                "create_dd",
                "tfmg"

        );
    }

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
                "createaddoncompatibility:six_way_gearbox",
                "copycats:copycat_beam",
                "copycats:copycat_block",
                "copycats:copycat_board",
                "copycats:copycat_box",
                "copycats:copycat_catwalk",
                "copycats:copycat_fence",
                "copycats:copycat_fence_gate",
                "copycats:copycat_slab",
                "copycats:copycat_stairs",
                "copycats:copycat_vertical_step",
                "copycats:copycat_wall"

        );
    }


    public MixinDefaults(){
    }
}
