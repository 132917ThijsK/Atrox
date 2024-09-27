
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atrox.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.atrox.item.SpookydimensionItem;
import net.mcreator.atrox.item.AcidItem;
import net.mcreator.atrox.AtroxMod;

public class AtroxModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AtroxMod.MODID);
	public static final RegistryObject<Item> SPOOKYDIMENSION = REGISTRY.register("spookydimension", () -> new SpookydimensionItem());
	public static final RegistryObject<Item> SPOOKYRACK = block(AtroxModBlocks.SPOOKYRACK);
	public static final RegistryObject<Item> SPOOKYLEAVES = block(AtroxModBlocks.SPOOKYLEAVES);
	public static final RegistryObject<Item> SPOOKYWOOD_WOOD = block(AtroxModBlocks.SPOOKYWOOD_WOOD);
	public static final RegistryObject<Item> SPOOKYWOOD_LOG = block(AtroxModBlocks.SPOOKYWOOD_LOG);
	public static final RegistryObject<Item> SPOOKYWOOD_PLANKS = block(AtroxModBlocks.SPOOKYWOOD_PLANKS);
	public static final RegistryObject<Item> SPOOKYWOOD_STAIRS = block(AtroxModBlocks.SPOOKYWOOD_STAIRS);
	public static final RegistryObject<Item> SPOOKYWOOD_SLAB = block(AtroxModBlocks.SPOOKYWOOD_SLAB);
	public static final RegistryObject<Item> SPOOKYWOOD_FENCE = block(AtroxModBlocks.SPOOKYWOOD_FENCE);
	public static final RegistryObject<Item> SPOOKYWOOD_FENCE_GATE = block(AtroxModBlocks.SPOOKYWOOD_FENCE_GATE);
	public static final RegistryObject<Item> SPOOKYWOOD_PRESSURE_PLATE = block(AtroxModBlocks.SPOOKYWOOD_PRESSURE_PLATE);
	public static final RegistryObject<Item> SPOOKYWOOD_BUTTON = block(AtroxModBlocks.SPOOKYWOOD_BUTTON);
	public static final RegistryObject<Item> ACID_BUCKET = REGISTRY.register("acid_bucket", () -> new AcidItem());
	public static final RegistryObject<Item> SPOOKYROAMER_SPAWN_EGG = REGISTRY.register("spookyroamer_spawn_egg", () -> new ForgeSpawnEggItem(AtroxModEntities.SPOOKYROAMER, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> WIZARDRYTABLE = block(AtroxModBlocks.WIZARDRYTABLE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
