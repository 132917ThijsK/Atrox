package net.mcreator.atrox.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.atrox.init.AtroxModMobEffects;
import net.mcreator.atrox.entity.SpookyroamerEntity;
import net.mcreator.atrox.entity.SpookyBoatEntity;
import net.mcreator.atrox.AtroxMod;

public class AcidMobplayerCollidesBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"/recipe give @a atrox:acidpotionrecipe");
		if (entity instanceof SpookyBoatEntity || entity instanceof SpookyroamerEntity || entity.isPassenger() || entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(AtroxModMobEffects.ACIDIC.get())) {
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(0));
		} else {
			AtroxMod.queueServerWork(10, () -> {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("atrox:spookypoison")))), 2);
			});
		}
	}
}
