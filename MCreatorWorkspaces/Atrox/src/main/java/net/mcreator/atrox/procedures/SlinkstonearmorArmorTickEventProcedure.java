package net.mcreator.atrox.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.atrox.init.AtroxModMobEffects;

public class SlinkstonearmorArmorTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(AtroxModMobEffects.ACIDIC.get(), 2, 1, false, false));
	}
}
