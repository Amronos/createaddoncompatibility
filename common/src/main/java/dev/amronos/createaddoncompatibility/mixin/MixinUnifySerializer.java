package dev.amronos.createaddoncompatibility.mixin;

import com.almostreliable.unified.config.UnificationConfig;
import dev.amronos.createaddoncompatibility.Constants;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.ArrayList;
import java.util.List;

@Mixin(UnificationConfig.UnifySerializer.class)
public class MixinUnifySerializer {
    @ModifyVariable(method = "handleDeserialization*", at = @At(value = "STORE"), name = "modPriorities", remap = false)
    private List<String> modPrioritiesMixin(List<String> modPriorities){
        Constants.LOG.info("Adding modPriorities for AlmostUnified, this will not reflect in unify.json");
        ArrayList<String> newModPriorities = new ArrayList<>(modPriorities);
        List<String> cacModPriorities = new ArrayList<>();
        cacModPriorities.add("pneumaticcraft");
        cacModPriorities.add("copycats");
        cacModPriorities.add("create_connected");
        cacModPriorities.add("create_dd");
        cacModPriorities.add("tfmg");
        for (String i : cacModPriorities) {
            if (!newModPriorities.contains(i)) {
                newModPriorities.add(i);
            }
        }
        return newModPriorities;
    }

    @ModifyVariable(method = "handleDeserialization*", at = @At(value = "STORE"), name = "tags", remap = false)
    private List<String> tagsMixin(List<String> tags){
        Constants.LOG.info("Adding tags for AlmostUnified, this will not reflect in unify.json");
        ArrayList<String> newTags = new ArrayList<>(tags);
        List<String> cacTags = new ArrayList<>();
        cacTags.add("c:ingots/plastic");
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
            if (!newTags.contains(i)) {
                newTags.add(i);
            }
        }
        return newTags;
    }
}
