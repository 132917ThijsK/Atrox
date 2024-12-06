
package net.mcreator.atrox.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StonestickItem extends Item {
	public StonestickItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
