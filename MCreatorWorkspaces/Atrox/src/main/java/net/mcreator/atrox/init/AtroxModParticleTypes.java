
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atrox.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.atrox.AtroxMod;

public class AtroxModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, AtroxMod.MODID);
	public static final RegistryObject<SimpleParticleType> PORTALPARTICE = REGISTRY.register("portalpartice", () -> new SimpleParticleType(false));
}
