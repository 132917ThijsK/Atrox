
package net.mcreator.atrox.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SpookstoneDustItem extends Item {
	public SpookstoneDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
