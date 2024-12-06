
package net.mcreator.atrox.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.atrox.init.AtroxModItems;

public class SlinkstonetoolsHoeItem extends HoeItem {
	public SlinkstonetoolsHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1800;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AtroxModItems.SLINKSTONE.get()));
			}
		}, 0, 0f, new Item.Properties().fireResistant());
	}
}
