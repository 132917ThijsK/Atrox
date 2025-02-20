package net.mcreator.atrox.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Comparator;

public class BoosfracturedbeamteleportProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Grow = 0;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			if (entity.getPersistentData().getDouble("IA") == 20) {
				entity.getPersistentData().putDouble("TargetX",
						(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getDeltaMovement().x() * 30) - entity.getX()));
				entity.getPersistentData().putDouble("TargetY",
						(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + 1 + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getDeltaMovement().y() * 10) - entity.getY()));
				entity.getPersistentData().putDouble("TargetZ",
						(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getDeltaMovement().z() * 30) - entity.getZ()));
			}
			if (entity.getPersistentData().getDouble("IA") > 20 && entity.getPersistentData().getDouble("IA") < 40) {
				Grow = 0.1;
				for (int index0 = 0; index0 < 25; index0++) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ENCHANTED_HIT, (entity.getX() + entity.getPersistentData().getDouble("TargetX") * Grow), (entity.getY() + entity.getPersistentData().getDouble("TargetY") * Grow),
								(entity.getZ() + entity.getPersistentData().getDouble("TargetZ") * Grow), 2, 0.15, 0.15, 0.15, 0);
					Grow = Grow + 0.075;
				}
			}
			if (entity.getPersistentData().getDouble("IA") > 40 && entity.getPersistentData().getDouble("IA") < 60) {
				Grow = 0.1;
				for (int index1 = 0; index1 < 45; index1++) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CRIT, (entity.getX() + entity.getPersistentData().getDouble("TargetX") * Grow), (entity.getY() + entity.getPersistentData().getDouble("TargetY") * Grow),
								(entity.getZ() + entity.getPersistentData().getDouble("TargetZ") * Grow), 5, 0.35, 0.35, 0.35, 0);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getX() + entity.getPersistentData().getDouble("TargetX") * Grow, entity.getY() + entity.getPersistentData().getDouble("TargetY") * Grow,
									entity.getZ() + entity.getPersistentData().getDouble("TargetZ") * Grow), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.burn")), SoundSource.NEUTRAL, 2, 5);
						} else {
							_level.playLocalSound((entity.getX() + entity.getPersistentData().getDouble("TargetX") * Grow), (entity.getY() + entity.getPersistentData().getDouble("TargetY") * Grow),
									(entity.getZ() + entity.getPersistentData().getDouble("TargetZ") * Grow), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.burn")), SoundSource.NEUTRAL, 2, 5, false);
						}
					}
					{
						final Vec3 _center = new Vec3((entity.getX() + entity.getPersistentData().getDouble("TargetX") * Grow), (entity.getY() + entity.getPersistentData().getDouble("TargetY") * Grow),
								(entity.getZ() + entity.getPersistentData().getDouble("TargetZ") * Grow));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(0.75 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FELL_OUT_OF_WORLD)), 5);
						}
					}
					Grow = Grow + 0.025;
				}
			}
			if (entity.getPersistentData().getDouble("IA") == 70) {
			}
			if (entity.getPersistentData().getDouble("IA") == 80) {
				entity.getPersistentData().putDouble("TargetX",
						(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getDeltaMovement().x() * 60) - entity.getX()));
				entity.getPersistentData().putDouble("TargetY",
						(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getDeltaMovement().y() * 20) - entity.getY()));
				entity.getPersistentData().putDouble("TargetZ",
						(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getDeltaMovement().z() * 60) - entity.getZ()));
			}
			if (entity.getPersistentData().getDouble("IA") > 80 && entity.getPersistentData().getDouble("IA") < 100) {
				Grow = 0.1;
				for (int index2 = 0; index2 < 25; index2++) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ENCHANTED_HIT, (entity.getX() + entity.getPersistentData().getDouble("TargetX") * Grow), (entity.getY() + entity.getPersistentData().getDouble("TargetY") * Grow),
								(entity.getZ() + entity.getPersistentData().getDouble("TargetZ") * Grow), 2, 0.15, 0.15, 0.15, 0);
					Grow = Grow + 0.075;
				}
			}
			if (entity.getPersistentData().getDouble("IA") > 100 && entity.getPersistentData().getDouble("IA") < 120) {
				Grow = 0.1;
				for (int index3 = 0; index3 < 45; index3++) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CRIT, (entity.getX() + entity.getPersistentData().getDouble("TargetX") * Grow), (entity.getY() + entity.getPersistentData().getDouble("TargetY") * Grow),
								(entity.getZ() + entity.getPersistentData().getDouble("TargetZ") * Grow), 5, 0.35, 0.35, 0.35, 0);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getX() + entity.getPersistentData().getDouble("TargetX") * Grow, entity.getY() + entity.getPersistentData().getDouble("TargetY") * Grow,
									entity.getZ() + entity.getPersistentData().getDouble("TargetZ") * Grow), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.burn")), SoundSource.NEUTRAL, 2, 5);
						} else {
							_level.playLocalSound((entity.getX() + entity.getPersistentData().getDouble("TargetX") * Grow), (entity.getY() + entity.getPersistentData().getDouble("TargetY") * Grow),
									(entity.getZ() + entity.getPersistentData().getDouble("TargetZ") * Grow), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.burn")), SoundSource.NEUTRAL, 2, 5, false);
						}
					}
					{
						final Vec3 _center = new Vec3((entity.getX() + entity.getPersistentData().getDouble("TargetX") * Grow), (entity.getY() + entity.getPersistentData().getDouble("TargetY") * Grow),
								(entity.getZ() + entity.getPersistentData().getDouble("TargetZ") * Grow));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(0.75 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FELL_OUT_OF_WORLD)), 5);
						}
					}
					Grow = Grow + 0.025;
				}
			}
			if (entity.getPersistentData().getDouble("IA") == 120) {
				BoosfractureteleportProcedure.execute(world, x, y, z, entity);
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 140) {
			BoosstatechangerProcedure.execute(entity);
		}
	}
}
