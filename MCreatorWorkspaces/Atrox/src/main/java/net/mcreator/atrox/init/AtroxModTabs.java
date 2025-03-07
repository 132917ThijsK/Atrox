
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atrox.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.atrox.AtroxMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AtroxModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AtroxMod.MODID);
	public static final RegistryObject<CreativeModeTab> SPOOKY = REGISTRY.register("spooky",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.atrox.spooky")).icon(() -> new ItemStack(AtroxModItems.CREATIVE_TAB_ICON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AtroxModItems.SPOOKYDIMENSION.get());
				tabData.accept(AtroxModBlocks.SPOOKYRACK.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKYFRAME.get().asItem());
				tabData.accept(AtroxModItems.ACID_BUCKET.get());
				tabData.accept(AtroxModBlocks.SPOOKYLEAVES.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKYWOOD_WOOD.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKYWOOD_LOG.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKYWOOD_PLANKS.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKYWOOD_STAIRS.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKYWOOD_SLAB.get().asItem());
				tabData.accept(AtroxModItems.BOATSPAWNER.get());
				tabData.accept(AtroxModBlocks.SPOOKYWOOD_FENCE.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKYWOOD_FENCE_GATE.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKYWOOD_BUTTON.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKYWOOD_PRESSURE_PLATE.get().asItem());
				tabData.accept(AtroxModBlocks.TRAPPEDSTONEPRESSUREPLATE.get().asItem());
				tabData.accept(AtroxModItems.WEEPING_ANGEL_SPAWN_EGG.get());
				tabData.accept(AtroxModItems.CRACKED_ANGEL_SPAWN_EGG.get());
				tabData.accept(AtroxModItems.THEGREATANGEL_SPAWN_EGG.get());
				tabData.accept(AtroxModItems.ANGELIC_STONE.get());
				tabData.accept(AtroxModItems.ANGELIC_SWORD.get());
				tabData.accept(AtroxModBlocks.SLINKSTONE_ORE.get().asItem());
				tabData.accept(AtroxModItems.SLINKSTONE.get());
				tabData.accept(AtroxModBlocks.SLINKSTONE_BLOCK.get().asItem());
				tabData.accept(AtroxModItems.SLINKSTONETOOLS_SWORD.get());
				tabData.accept(AtroxModItems.SLINKSTONETOOLS_PICKAXE.get());
				tabData.accept(AtroxModItems.SLINKSTONETOOLS_AXE.get());
				tabData.accept(AtroxModItems.SLINKSTONETOOLS_SHOVEL.get());
				tabData.accept(AtroxModItems.SLINKSTONETOOLS_HOE.get());
				tabData.accept(AtroxModItems.SLINKSTONEARMOR_ARMOR_HELMET.get());
				tabData.accept(AtroxModItems.SLINKSTONEARMOR_ARMOR_CHESTPLATE.get());
				tabData.accept(AtroxModItems.SLINKSTONEARMOR_ARMOR_LEGGINGS.get());
				tabData.accept(AtroxModItems.SLINKSTONEARMOR_ARMOR_BOOTS.get());
				tabData.accept(AtroxModBlocks.SPOOKSTONE.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKSTONE_STAIRS.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKSTONE_SLAB.get().asItem());
				tabData.accept(AtroxModItems.SPOOKSTONE_DUST.get());
				tabData.accept(AtroxModBlocks.WIZARDRYTABLE.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(AtroxModBlocks.SPOOKYWOOD_WOOD.get().asItem());
			tabData.accept(AtroxModBlocks.SPOOKYWOOD_LOG.get().asItem());
			tabData.accept(AtroxModBlocks.SPOOKYWOOD_PLANKS.get().asItem());
			tabData.accept(AtroxModBlocks.SPOOKYWOOD_STAIRS.get().asItem());
			tabData.accept(AtroxModBlocks.SPOOKYWOOD_SLAB.get().asItem());
			tabData.accept(AtroxModBlocks.SPOOKYWOOD_FENCE.get().asItem());
			tabData.accept(AtroxModBlocks.SPOOKYWOOD_FENCE_GATE.get().asItem());
			tabData.accept(AtroxModBlocks.SPOOKYWOOD_BUTTON.get().asItem());
			tabData.accept(AtroxModBlocks.SPOOKYWOOD_PRESSURE_PLATE.get().asItem());
			tabData.accept(AtroxModBlocks.TRAPPEDSTONEPRESSUREPLATE.get().asItem());
			tabData.accept(AtroxModBlocks.SLINKSTONE_BLOCK.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {

			tabData.accept(AtroxModBlocks.SPOOKYWOOD_BUTTON.get().asItem());
			tabData.accept(AtroxModBlocks.SPOOKYWOOD_PRESSURE_PLATE.get().asItem());
			tabData.accept(AtroxModBlocks.TRAPPEDSTONEPRESSUREPLATE.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {

			tabData.accept(AtroxModItems.ANGELIC_SWORD.get());
			tabData.accept(AtroxModItems.SLINKSTONETOOLS_SWORD.get());
			tabData.accept(AtroxModItems.SLINKSTONEARMOR_ARMOR_HELMET.get());
			tabData.accept(AtroxModItems.SLINKSTONEARMOR_ARMOR_CHESTPLATE.get());
			tabData.accept(AtroxModItems.SLINKSTONEARMOR_ARMOR_LEGGINGS.get());
			tabData.accept(AtroxModItems.SLINKSTONEARMOR_ARMOR_BOOTS.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(AtroxModItems.WEEPING_ANGEL_SPAWN_EGG.get());
			tabData.accept(AtroxModItems.CRACKED_ANGEL_SPAWN_EGG.get());
			tabData.accept(AtroxModItems.THEGREATANGEL_SPAWN_EGG.get());
			tabData.accept(AtroxModItems.BOOSSHIELD_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(AtroxModItems.ANGELIC_STONE.get());
			tabData.accept(AtroxModItems.SLINKSTONE.get());
			tabData.accept(AtroxModItems.STONESTICK.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

			tabData.accept(AtroxModBlocks.SPOOKYFRAME.get().asItem());
			tabData.accept(AtroxModBlocks.SPOOKYRACK.get().asItem());
			tabData.accept(AtroxModBlocks.SPOOKYLEAVES.get().asItem());
			tabData.accept(AtroxModBlocks.SPOOKYWOOD_WOOD.get().asItem());
			tabData.accept(AtroxModBlocks.SPOOKYWOOD_LOG.get().asItem());
			tabData.accept(AtroxModBlocks.SLINKSTONE_ORE.get().asItem());
			tabData.accept(AtroxModBlocks.SPOOKSTONE.get().asItem());
			tabData.accept(AtroxModBlocks.SPOOKSTONE_STAIRS.get().asItem());
			tabData.accept(AtroxModBlocks.SPOOKSTONE_SLAB.get().asItem());
			tabData.accept(AtroxModItems.SPOOKSTONE_DUST.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(AtroxModItems.SLINKSTONETOOLS_PICKAXE.get());
			tabData.accept(AtroxModItems.SLINKSTONETOOLS_AXE.get());
			tabData.accept(AtroxModItems.SLINKSTONETOOLS_SHOVEL.get());
			tabData.accept(AtroxModItems.SLINKSTONETOOLS_HOE.get());

		}
	}
}
