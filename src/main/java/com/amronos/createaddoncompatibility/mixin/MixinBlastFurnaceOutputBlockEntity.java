package com.amronos.createaddoncompatibility.mixin;

import com.amronos.createaddoncompatibility.data.tags.ForgeTags;
import com.drmangotea.tfmg.blocks.machines.metal_processing.blast_furnace.BlastFurnaceOutputBlockEntity;
import com.drmangotea.tfmg.registry.TFMGItems;
import com.simibubi.create.foundation.item.SmartInventory;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.List;

@Pseudo
@Mixin(BlastFurnaceOutputBlockEntity.class)
public class MixinBlastFurnaceOutputBlockEntity {
    @Shadow
    public SmartInventory fuelInventory;
    @Shadow
    public SmartInventory inputInventory;

    @Unique
    public SmartInventory createaddoncompatibility$previousFuelInventory;
    @Unique
    public SmartInventory createaddoncompatibility$previousInputInventory;

    @Inject(remap = false, method = "acceptInsertedItems", at = @At(value = "HEAD"))
    private void savePreviousInventory(CallbackInfo info){
        createaddoncompatibility$previousFuelInventory = fuelInventory;
        createaddoncompatibility$previousInputInventory = inputInventory;
    }

    @Inject(remap = false, method = "acceptInsertedItems", at = @At(value = "TAIL"), locals = LocalCapture.CAPTURE_FAILSOFT)
    private void acceptInsertedItems(CallbackInfo info, List<ItemEntity> itemsToPick) {
        fuelInventory = createaddoncompatibility$previousFuelInventory;
        inputInventory = createaddoncompatibility$previousInputInventory;
        for (ItemEntity itemEntity : itemsToPick) {
            ItemStack itemStack = itemEntity.getItem();
            int count;
            int freeSpace2;
            if (itemStack.is(ForgeTags.Items.COKE_DUST)) {
                freeSpace2 = this.fuelInventory.getStackInSlot(0).getMaxStackSize() - this.fuelInventory.getStackInSlot(0).getCount();
                count = itemStack.getCount();
                if (count > freeSpace2) {
                    itemStack.setCount(itemStack.getCount() - freeSpace2);
                    this.fuelInventory.setItem(0, new ItemStack(TFMGItems.COAL_COKE_DUST.get(), this.fuelInventory.getStackInSlot(0).getCount() + freeSpace2));
                } else {
                    this.fuelInventory.setItem(0, new ItemStack(TFMGItems.COAL_COKE_DUST.get(), this.fuelInventory.getStackInSlot(0).getCount() + itemStack.getCount()));
                    itemEntity.discard();
                }
            } else {
                if (itemStack.getCount() == 1) {
                    itemStack.setCount(2);
                    itemEntity.setItem(itemStack);
                }

                freeSpace2 = this.inputInventory.getStackInSlot(0).getMaxStackSize() - this.inputInventory.getStackInSlot(0).getCount();
                count = itemStack.getCount();
                if (this.inputInventory.isEmpty() || this.inputInventory.getItem(0).is(itemStack.getItem())) {
                    if (count > freeSpace2) {
                        itemStack.setCount(itemStack.getCount() - freeSpace2);
                        this.inputInventory.setItem(0, new ItemStack(itemStack.getItem(), this.inputInventory.getStackInSlot(0).getCount() + freeSpace2));
                    } else {
                        this.inputInventory.setItem(0, new ItemStack(itemStack.getItem(), this.inputInventory.getStackInSlot(0).getCount() + itemStack.getCount()));
                        itemEntity.discard();
                    }
                }
            }
        }
    }
}
