package net.mcreator.atrox.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.atrox.init.AtroxModEntities;
import net.mcreator.atrox.AtroxMod;

public class BoosfracturedteleportartemisProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Chain = 0;
		double ChainWait = 0;
		if (entity.getPersistentData().getDouble("IA") == 5) {
			BoosfractureteleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 55) {
			BoosfractureteleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 105) {
			BoosfractureteleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 155) {
			BoosfractureteleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 5) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.shoot")), SoundSource.NEUTRAL, 5, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.shoot")), SoundSource.NEUTRAL, 5, 1, false);
				}
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 25) {
			Chain = 2;
			for (int index0 = 0; index0 < (int) Chain; index0++) {
				AtroxMod.queueServerWork((int) ChainWait, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AtroxModEntities.BOOSARTEMIS.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
				ChainWait = ChainWait + 3;
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 75) {
			Chain = 2;
			for (int index1 = 0; index1 < (int) Chain; index1++) {
				AtroxMod.queueServerWork((int) ChainWait, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AtroxModEntities.BOOSARTEMIS.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
				ChainWait = ChainWait + 3;
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 125) {
			Chain = 2;
			for (int index2 = 0; index2 < (int) Chain; index2++) {
				AtroxMod.queueServerWork((int) ChainWait, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AtroxModEntities.BOOSARTEMIS.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
				ChainWait = ChainWait + 3;
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 175) {
			Chain = 2;
			for (int index3 = 0; index3 < (int) Chain; index3++) {
				AtroxMod.queueServerWork((int) ChainWait, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AtroxModEntities.BOOSARTEMIS.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
				ChainWait = ChainWait + 3;
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 225) {
		}
	}
}
