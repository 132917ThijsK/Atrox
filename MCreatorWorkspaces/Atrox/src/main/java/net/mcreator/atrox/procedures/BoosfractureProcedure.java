package net.mcreator.atrox.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.atrox.init.AtroxModParticleTypes;

public class BoosfractureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Chain = 0;
		double ChainWait = 0;
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
			_setstack.setCount(1);
			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
			if (_entity instanceof Player _player)
				_player.getInventory().setChanged();
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EFFECT, x, y, z, 15, 0.25, 1.8, 0.25, 1);
		if (entity.getPersistentData().getDouble("IA") < 100) {
			entity.setDeltaMovement(new Vec3(0, 0.075, 0));
		} else {
			entity.setDeltaMovement(new Vec3(0, 0, 0));
		}
		if (entity.getPersistentData().getDouble("IA") == 50) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")), SoundSource.NEUTRAL, 4, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")), SoundSource.NEUTRAL, 4, 1, false);
				}
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.MOB);
			for (int index0 = 0; index0 < 25; index0++) {
				world.addParticle((SimpleParticleType) (AtroxModParticleTypes.PORTALPARTICE.get()), x, y, z, (Mth.nextDouble(RandomSource.create(), 0.85, 0.45)), (Mth.nextDouble(RandomSource.create(), 0.85, 0.45)),
						(Mth.nextDouble(RandomSource.create(), 0.85, 0.45)));
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 100) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")), SoundSource.NEUTRAL, 4, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")), SoundSource.NEUTRAL, 4, 1, false);
				}
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.MOB);
			for (int index1 = 0; index1 < 25; index1++) {
				world.addParticle((SimpleParticleType) (AtroxModParticleTypes.PORTALPARTICE.get()), x, y, z, (Mth.nextDouble(RandomSource.create(), -0.85, -0.45)), (Mth.nextDouble(RandomSource.create(), -0.85, -0.45)),
						(Mth.nextDouble(RandomSource.create(), -0.85, -0.45)));
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 150) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")), SoundSource.NEUTRAL, 4, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")), SoundSource.NEUTRAL, 4, 1, false);
				}
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.MOB);
			for (int index2 = 0; index2 < 25; index2++) {
				world.addParticle((SimpleParticleType) (AtroxModParticleTypes.PORTALPARTICE.get()), x, y, z, (Mth.nextDouble(RandomSource.create(), 0.85, 0.45)), (Mth.nextDouble(RandomSource.create(), -0.85, -0.45)),
						(Mth.nextDouble(RandomSource.create(), -0.85, -0.45)));
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 200) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")), SoundSource.NEUTRAL, 4, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")), SoundSource.NEUTRAL, 4, 1, false);
				}
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.MOB);
			for (int index3 = 0; index3 < 25; index3++) {
				world.addParticle((SimpleParticleType) (AtroxModParticleTypes.PORTALPARTICE.get()), x, y, z, (Mth.nextDouble(RandomSource.create(), -0.85, -0.45)), (Mth.nextDouble(RandomSource.create(), 0.85, 0.45)),
						(Mth.nextDouble(RandomSource.create(), 0.85, 0.45)));
			}
		}
		if (entity.getPersistentData().getDouble("IA") > 200) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.025));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 60, 1));
		}
		if (entity.getPersistentData().getDouble("IA") == 250) {
			entity.getPersistentData().putBoolean("Phase", true);
			entity.setNoGravity(true);
			BoosstatechangerProcedure.execute(entity);
		}
	}
}
