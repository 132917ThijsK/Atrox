
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atrox.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.atrox.AtroxMod;

public class AtroxModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AtroxMod.MODID);
	public static final RegistryObject<CreativeModeTab> SPOOKY = REGISTRY.register("spooky",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.atrox.spooky")).icon(() -> new ItemStack(AtroxModItems.SPOOKYDIMENSION.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AtroxModItems.SPOOKYDIMENSION.get());
				tabData.accept(AtroxModBlocks.SPOOKYRACK.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKYLEAVES.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKYWOOD_WOOD.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKYWOOD_LOG.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKYWOOD_PLANKS.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKYWOOD_STAIRS.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKYWOOD_SLAB.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKYWOOD_FENCE.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKYWOOD_FENCE_GATE.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKYWOOD_PRESSURE_PLATE.get().asItem());
				tabData.accept(AtroxModBlocks.SPOOKYWOOD_BUTTON.get().asItem());
				tabData.accept(AtroxModItems.ACID_BUCKET.get());
				tabData.accept(AtroxModItems.SPOOKYROAMER_SPAWN_EGG.get());
			})

					.build());
}
