
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atrox.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.atrox.potion.AcidicMobEffect;
import net.mcreator.atrox.AtroxMod;

public class AtroxModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AtroxMod.MODID);
	public static final RegistryObject<MobEffect> ACIDIC = REGISTRY.register("acidic", () -> new AcidicMobEffect());
}
