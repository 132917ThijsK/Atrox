
package net.mcreator.atrox.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.monster.EnderMan;

import net.mcreator.atrox.procedures.GhostbaubleWhileBaubleIsEquippedTickProcedure;
import net.mcreator.atrox.procedures.GhostbaubleBaubleIsEquippedProcedure;

public class GhostbaubleItem extends Item implements ICurioItem {
	public GhostbaubleItem() {
		super(new Item.Properties().stacksTo(0).rarity(Rarity.EPIC));
	}

	@Override
	public boolean makesPiglinsNeutral(SlotContext slotContext, ItemStack stack) {
		return true;
	}

	@Override
	public boolean isEnderMask(SlotContext slotContext, EnderMan enderMan, ItemStack stack) {
		return true;
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		GhostbaubleWhileBaubleIsEquippedTickProcedure.execute();
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		GhostbaubleBaubleIsEquippedProcedure.execute();
	}
}
