
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atrox.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.atrox.block.entity.GreatAltarTileEntity;
import net.mcreator.atrox.block.entity.GreatAltarPhase2TileEntity;
import net.mcreator.atrox.AtroxMod;

public class AtroxModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, AtroxMod.MODID);
	public static final RegistryObject<BlockEntityType<GreatAltarTileEntity>> GREAT_ALTAR = REGISTRY.register("great_altar", () -> BlockEntityType.Builder.of(GreatAltarTileEntity::new, AtroxModBlocks.GREAT_ALTAR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GreatAltarPhase2TileEntity>> GREAT_ALTAR_PHASE_2 = REGISTRY.register("great_altar_phase_2",
			() -> BlockEntityType.Builder.of(GreatAltarPhase2TileEntity::new, AtroxModBlocks.GREAT_ALTAR_PHASE_2.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
