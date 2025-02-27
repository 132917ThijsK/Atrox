
package net.mcreator.atrox.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.atrox.init.AtroxModItems;

public class SlinkstonetoolsAxeItem extends AxeItem {
	public SlinkstonetoolsAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1800;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 5.5f;
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
		}, 1, -3f, new Item.Properties().fireResistant());
	}
}
