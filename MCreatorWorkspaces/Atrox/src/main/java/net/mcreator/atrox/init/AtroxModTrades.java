
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.atrox.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class AtroxModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == AtroxModVillagerProfessions.WIZARD.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(Blocks.SOUL_SAND), new ItemStack(AtroxModBlocks.SPOOKYFRAME.get(), 6), 5, 15, 0.5f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6), new ItemStack(Blocks.SOUL_SAND, 2), new ItemStack(AtroxModItems.SPOOKYDIMENSION.get()), 2, 60, 1f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(AtroxModBlocks.SPOOKYWOOD_LOG.get(), 2), 10, 15, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.FEATHER, 2),

					new ItemStack(Items.EMERALD, 2), 10, 10, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.STRING, 5),

					new ItemStack(Items.EMERALD, 2), 10, 10, 0.05f));
		}
	}
}
