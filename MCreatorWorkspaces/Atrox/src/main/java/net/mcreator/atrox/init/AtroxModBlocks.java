
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atrox.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.atrox.block.WizardrytableBlock;
import net.mcreator.atrox.block.SpookywoodWoodBlock;
import net.mcreator.atrox.block.SpookywoodStairsBlock;
import net.mcreator.atrox.block.SpookywoodSlabBlock;
import net.mcreator.atrox.block.SpookywoodPressurePlateBlock;
import net.mcreator.atrox.block.SpookywoodPlanksBlock;
import net.mcreator.atrox.block.SpookywoodLogBlock;
import net.mcreator.atrox.block.SpookywoodFenceGateBlock;
import net.mcreator.atrox.block.SpookywoodFenceBlock;
import net.mcreator.atrox.block.SpookywoodButtonBlock;
import net.mcreator.atrox.block.SpookyrackBlock;
import net.mcreator.atrox.block.SpookyleavesBlock;
import net.mcreator.atrox.block.SpookyframeBlock;
import net.mcreator.atrox.block.SpookydimensionPortalBlock;
import net.mcreator.atrox.block.AcidBlock;
import net.mcreator.atrox.AtroxMod;

public class AtroxModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AtroxMod.MODID);
	public static final RegistryObject<Block> SPOOKYDIMENSION_PORTAL = REGISTRY.register("spookydimension_portal", () -> new SpookydimensionPortalBlock());
	public static final RegistryObject<Block> SPOOKYRACK = REGISTRY.register("spookyrack", () -> new SpookyrackBlock());
	public static final RegistryObject<Block> SPOOKYLEAVES = REGISTRY.register("spookyleaves", () -> new SpookyleavesBlock());
	public static final RegistryObject<Block> SPOOKYWOOD_WOOD = REGISTRY.register("spookywood_wood", () -> new SpookywoodWoodBlock());
	public static final RegistryObject<Block> SPOOKYWOOD_LOG = REGISTRY.register("spookywood_log", () -> new SpookywoodLogBlock());
	public static final RegistryObject<Block> SPOOKYWOOD_PLANKS = REGISTRY.register("spookywood_planks", () -> new SpookywoodPlanksBlock());
	public static final RegistryObject<Block> SPOOKYWOOD_STAIRS = REGISTRY.register("spookywood_stairs", () -> new SpookywoodStairsBlock());
	public static final RegistryObject<Block> SPOOKYWOOD_SLAB = REGISTRY.register("spookywood_slab", () -> new SpookywoodSlabBlock());
	public static final RegistryObject<Block> SPOOKYWOOD_FENCE = REGISTRY.register("spookywood_fence", () -> new SpookywoodFenceBlock());
	public static final RegistryObject<Block> SPOOKYWOOD_FENCE_GATE = REGISTRY.register("spookywood_fence_gate", () -> new SpookywoodFenceGateBlock());
	public static final RegistryObject<Block> SPOOKYWOOD_PRESSURE_PLATE = REGISTRY.register("spookywood_pressure_plate", () -> new SpookywoodPressurePlateBlock());
	public static final RegistryObject<Block> SPOOKYWOOD_BUTTON = REGISTRY.register("spookywood_button", () -> new SpookywoodButtonBlock());
	public static final RegistryObject<Block> ACID = REGISTRY.register("acid", () -> new AcidBlock());
	public static final RegistryObject<Block> WIZARDRYTABLE = REGISTRY.register("wizardrytable", () -> new WizardrytableBlock());
	public static final RegistryObject<Block> SPOOKYFRAME = REGISTRY.register("spookyframe", () -> new SpookyframeBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
