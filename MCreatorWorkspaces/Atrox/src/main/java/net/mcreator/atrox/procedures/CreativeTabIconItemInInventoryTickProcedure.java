package net.mcreator.atrox.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.atrox.init.AtroxModItems;

public class CreativeTabIconItemInInventoryTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(AtroxModItems.CREATIVE_TAB_ICON.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 99999, _player.inventoryMenu.getCraftSlots());
		}
	}
}
