package net.mcreator.atrox.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.atrox.init.AtroxModParticleTypes;

public class BoosfractureteleportProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean CanTeleport = false;
		double XTeleport = 0;
		double YTeleport = 0;
		double ZTeleport = 0;
		double OriginalX = 0;
		double OriginalY = 0;
		double OriginalZ = 0;
		double Grow = 0;
		for (int index0 = 0; index0 < 5; index0++) {
			if (!CanTeleport) {
				XTeleport = Mth.nextInt(RandomSource.create(), (int) (-7.5), (int) 7.5);
				YTeleport = Mth.nextInt(RandomSource.create(), 5, 10);
				ZTeleport = Mth.nextInt(RandomSource.create(), (int) (-7.5), (int) 7.5);
				for (int index1 = 0; index1 < 15; index1++) {
					if (!CanTeleport) {
						if (!(world.getBlockState(BlockPos.containing((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() + XTeleport, (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + YTeleport,
								(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() + ZTeleport)).canOcclude())
								&& !(world.getBlockState(BlockPos.containing((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() + XTeleport,
										(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + YTeleport + 1, (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() + ZTeleport)).canOcclude())) {
							CanTeleport = true;
						} else {
							YTeleport = YTeleport + 1;
						}
					} else {
						break;
					}
				}
			} else {
				break;
			}
		}
		if (CanTeleport) {
			OriginalX = entity.getX();
			OriginalY = entity.getY();
			OriginalZ = entity.getZ();
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (AtroxModParticleTypes.PORTALPARTICE.get()), x, y, z, 120, 0.5, 1.8, 0.5, 0);
			{
				Entity _ent = entity;
				_ent.teleportTo(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() + XTeleport), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + YTeleport),
						((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() + ZTeleport));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() + XTeleport), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + YTeleport),
							((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() + ZTeleport), _ent.getYRot(), _ent.getXRot());
			}
			for (int index2 = 0; index2 < 20; index2++) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AtroxModParticleTypes.PORTALPARTICE.get()), (entity.getX() + (OriginalX - entity.getX()) * Grow), (entity.getY() + (OriginalY - entity.getY()) * Grow),
							(entity.getZ() + (OriginalZ - entity.getZ()) * Grow), 2, 0.05, 0.05, 0.05, 0);
				Grow = Grow + 0.05;
			}
		}
	}
}
