package net.amronos.createaddoncompatibility.mixin;

import com.almostreliable.unified.config.UnifyConfig;
import net.amronos.createaddoncompatibility.CreateAddonCompatibility;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Mixin(UnifyConfig.Serializer.class)
public class MixinUnifyConfig {

    @ModifyVariable(method = "deserialize", at = @At(value = "RETURN"), ordinal = 0, index = 3, name = "modPriorities", remap = false)
    private List<String> modPrioritiesMixin(List<String> modPriorities){
        CreateAddonCompatibility.LOGGER.info("Adding modPriorities for AlmostUnified, this will not reflect in unify.json");
        modPriorities = new ArrayList<>(modPriorities);
        List<String> cacModPriorities = new ArrayList<String>();
        cacModPriorities.add("pneumaticcraft");
        cacModPriorities.add("copycats");
        cacModPriorities.add("create_connected");
        cacModPriorities.add("createutilities");
        cacModPriorities.add("create_dd");
        cacModPriorities.add("tfmg");
        for (String i : cacModPriorities) {
            if (!modPriorities.contains(i)) {
                modPriorities.add(i);
            }
        }
        modPriorities = Collections.unmodifiableList(modPriorities);
        return modPriorities;
    }

    @ModifyVariable(method = "deserialize", at = @At(value = "RETURN"), ordinal = 2, index = 5, name = "tags", remap = false)
    private List<String> tagsMixin(List<String> tags){
        CreateAddonCompatibility.LOGGER.info("Adding tags for AlmostUnified, this will not reflect in unify.json");
        tags = new ArrayList<>(tags);
        List<String> cacTags = new ArrayList<String>();
        cacTags.add("forge:plastic_sheet");
        cacTags.add("createaddoncompatibility:six_way_gearbox");
        cacTags.add("copycats:copycat_beam");
        cacTags.add("copycats:copycat_block");
        cacTags.add("copycats:copycat_board");
        cacTags.add("copycats:copycat_box");
        cacTags.add("copycats:copycat_catwalk");
        cacTags.add("copycats:copycat_fence");
        cacTags.add("copycats:copycat_fence_gate");
        cacTags.add("copycats:copycat_slab");
        cacTags.add("copycats:copycat_stairs");
        cacTags.add("copycats:copycat_vertical_step");
        cacTags.add("copycats:copycat_wall");
        for (String i : cacTags) {
            if (!tags.contains(i)) {
                tags.add(i);
            }
        }
        tags = Collections.unmodifiableList(tags);
        return tags;
    }
}
