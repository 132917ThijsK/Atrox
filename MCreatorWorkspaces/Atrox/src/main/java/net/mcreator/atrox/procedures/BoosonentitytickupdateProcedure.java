package net.mcreator.atrox.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class BoosonentitytickupdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Chain = 0;
		double ChainWait = 0;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) || (entity.getPersistentData().getString("State")).equals("Fracture") || (entity.getPersistentData().getString("State")).equals("Disperse")) {
			entity.getPersistentData().putDouble("IA", (entity.getPersistentData().getDouble("IA") + 1));
		} else {
			entity.getPersistentData().putString("State", "Idle");
			entity.getPersistentData().putDouble("IA", 0);
		}
		if (entity.getPersistentData().getBoolean("Phase")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 60, 1, false, false));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.WITCH, x, (y + 0.9), z, 25, 0.2, 0.9, 0.2, 0);
		}
		if ((entity.getPersistentData().getString("State")).equals("Idle")) {
			if (entity.getPersistentData().getDouble("IA") == 20) {
			}
		}
		if (!entity.getPersistentData().getBoolean("Phase")) {
			if ((entity.getPersistentData().getString("State")).equals("Melee")) {
				BoosmeleeProcedure.execute(entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("Fireball")) {
				BoosfireballProcedure.execute(world, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("Summon")) {
				BoossummonProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("Regeneration")) {
				BoosregenerationProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("Teleport")) {
				BoosteleportattackProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("Fracture")) {
				BoosfractureProcedure.execute(world, x, y, z, entity);
			}
		} else {
			if ((entity.getPersistentData().getString("State")).equals("FracturedArtemis")) {
				BoosfracturedartemisProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("FracturedBeam")) {
				BoosfracturedbeamProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("FracturedTeleport")) {
				BoosfracturedteleportexecutionProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("FracturedDispersion")) {
				BoosfractureddispersionProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("FracturedArtemisTeleport")) {
				BoosfracturedteleportartemisProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("FracturedTeleportBeam")) {
				BoosfracturedbeamteleportProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getPersistentData().getString("State")).equals("Disperse")) {
				BoosdisperseProcedure.execute(world, x, y, z, entity);
			}
		}
	}
}
