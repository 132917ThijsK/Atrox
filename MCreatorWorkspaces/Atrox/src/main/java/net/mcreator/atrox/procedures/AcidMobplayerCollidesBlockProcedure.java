package net.mcreator.atrox.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.atrox.entity.SpookyroamerEntity;
import net.mcreator.atrox.entity.SpookyBoatEntity;
import net.mcreator.atrox.AtroxMod;

public class AcidMobplayerCollidesBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof SpookyBoatEntity || entity instanceof SpookyroamerEntity || entity.isPassenger()) {
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(0));
		} else {
			AtroxMod.queueServerWork(10, () -> {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("atrox:spookypoison")))), 2);
			});
		}
	}
}
