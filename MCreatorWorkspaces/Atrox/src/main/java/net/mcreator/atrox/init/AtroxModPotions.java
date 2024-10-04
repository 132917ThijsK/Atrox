
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atrox.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.atrox.AtroxMod;

public class AtroxModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, AtroxMod.MODID);
	public static final RegistryObject<Potion> ACIDPOTION = REGISTRY.register("acidpotion", () -> new Potion(new MobEffectInstance(MobEffects.WEAKNESS, 300, 5, false, false), new MobEffectInstance(MobEffects.POISON, 300, 5, false, true)));
}
