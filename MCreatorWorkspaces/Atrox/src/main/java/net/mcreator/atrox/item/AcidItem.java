
package net.mcreator.atrox.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.atrox.init.AtroxModFluids;

public class AcidItem extends BucketItem {
	public AcidItem() {
		super(AtroxModFluids.ACID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
