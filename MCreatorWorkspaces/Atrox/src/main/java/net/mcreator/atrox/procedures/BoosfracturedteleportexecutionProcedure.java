package net.mcreator.atrox.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BoosfracturedteleportexecutionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Chain = 0;
		double ChainWait = 0;
		if (entity.getPersistentData().getDouble("IA") == 5) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.shoot")), SoundSource.NEUTRAL, 5, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.shoot")), SoundSource.NEUTRAL, 5, 1, false);
				}
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 20) {
			BoosfractureteleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 25) {
			BoosfractureteleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 30) {
			BoosfractureteleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 35) {
			BoosfractureteleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 40) {
			BoosfractureteleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 45) {
			BoosfractureteleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 50) {
			BoosfractureteleportProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getDouble("IA") == 55) {
			BoosfractureteleportProcedure.execute(world, x, y, z, entity);
			BoosstatechangerProcedure.execute(entity);
		}
	}
}
