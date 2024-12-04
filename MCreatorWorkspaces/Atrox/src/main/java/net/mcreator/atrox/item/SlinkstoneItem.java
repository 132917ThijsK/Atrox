
package net.mcreator.atrox.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SlinkstoneItem extends Item {
	public SlinkstoneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
