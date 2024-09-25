
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atrox.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.atrox.fluid.types.AcidFluidType;
import net.mcreator.atrox.AtroxMod;

public class AtroxModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, AtroxMod.MODID);
	public static final RegistryObject<FluidType> ACID_TYPE = REGISTRY.register("acid", () -> new AcidFluidType());
}
