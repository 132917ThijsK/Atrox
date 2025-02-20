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
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.atrox.init.AtroxModParticleTypes;

import java.util.List;
import java.util.Comparator;

public class BoosfracturedbeamProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Grow = 0;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			if (entity.getPersistentData().getDouble("IA") < 140) {
				entity.getPersistentData().putDouble("TargetX",
						(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getDeltaMovement().x() * 5) - entity.getX()));
				entity.getPersistentData().putDouble("TargetY",
						(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + 1 + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getDeltaMovement().y() * 2.5) - entity.getY()));
				entity.getPersistentData().putDouble("TargetZ",
						(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getDeltaMovement().z() * 5) - entity.getZ()));
			}
			if (entity.getPersistentData().getDouble("IA") > 20 && entity.getPersistentData().getDouble("IA") < 150) {
				Grow = 0.1;
				for (int index0 = 0; index0 < 25; index0++) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (AtroxModParticleTypes.PORTALPARTICE.get()), (entity.getX() + entity.getPersistentData().getDouble("TargetX") * Grow),
								(entity.getY() + entity.getPersistentData().getDouble("TargetY") * Grow), (entity.getZ() + entity.getPersistentData().getDouble("TargetZ") * Grow), 2, 0.05, 0.05, 0.05, 0);
					Grow = Grow + 0.075;
				}
			}
			if (entity.getPersistentData().getDouble("IA") == 150) {
				entity.getPersistentData().putDouble("Size", 1);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")), SoundSource.NEUTRAL, 5, (float) 0.5);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")), SoundSource.NEUTRAL, 5, (float) 0.5, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 5, (float) 0.5);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 5, (float) 0.5, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 5, (float) (-0.5));
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 5, (float) (-0.5), false);
					}
				}
			}
			if (entity.getPersistentData().getDouble("IA") > 150 && entity.getPersistentData().getDouble("IA") < 250) {
				Grow = 0.1;
				entity.getPersistentData().putDouble("Size", (entity.getPersistentData().getDouble("Size") + 0.01));
				for (int index1 = 0; index1 < 45; index1++) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null,
									BlockPos.containing(entity.getX() + entity.getPersistentData().getDouble("TargetX") * Grow, entity.getY() + entity.getPersistentData().getDouble("TargetY") * Grow,
											entity.getZ() + entity.getPersistentData().getDouble("TargetZ") * Grow),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.twinkle")), SoundSource.NEUTRAL, (float) 0.5, (float) (3 - entity.getPersistentData().getDouble("Size")));
						} else {
							_level.playLocalSound((entity.getX() + entity.getPersistentData().getDouble("TargetX") * Grow), (entity.getY() + entity.getPersistentData().getDouble("TargetY") * Grow),
									(entity.getZ() + entity.getPersistentData().getDouble("TargetZ") * Grow), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.twinkle")), SoundSource.NEUTRAL, (float) 0.5,
									(float) (3 - entity.getPersistentData().getDouble("Size")), false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (AtroxModParticleTypes.PORTALPARTICE.get()), (entity.getX() + entity.getPersistentData().getDouble("TargetX") * Grow),
								(entity.getY() + entity.getPersistentData().getDouble("TargetY") * Grow), (entity.getZ() + entity.getPersistentData().getDouble("TargetZ") * Grow), (int) Math.ceil(1.25 * entity.getPersistentData().getDouble("Size")),
								(0.25 * entity.getPersistentData().getDouble("Size")), (0.25 * entity.getPersistentData().getDouble("Size")), (0.25 * entity.getPersistentData().getDouble("Size")), 0);
					{
						final Vec3 _center = new Vec3((entity.getX() + entity.getPersistentData().getDouble("TargetX") * Grow), (entity.getY() + entity.getPersistentData().getDouble("TargetY") * Grow),
								(entity.getZ() + entity.getPersistentData().getDouble("TargetZ") * Grow));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((0.75 * entity.getPersistentData().getDouble("Size")) / 2d), e -> true).stream()
								.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FELL_OUT_OF_WORLD)), (float) (15 * entity.getPersistentData().getDouble("Size")));
						}
					}
					Grow = Grow + 0.025;
				}
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 300) {
			BoosstatechangerProcedure.execute(entity);
		}
	}
}
