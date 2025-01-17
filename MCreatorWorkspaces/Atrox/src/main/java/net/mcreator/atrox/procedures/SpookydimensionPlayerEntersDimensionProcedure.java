package net.mcreator.atrox.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.atrox.AtroxMod;

public class SpookydimensionPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, double y, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(0, y, 0);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(0, y, 0, _ent.getYRot(), _ent.getXRot());
		}
		if (entity instanceof Player _player) {
			_player.getAbilities().invulnerable = true;
			_player.onUpdateAbilities();
		}
		AtroxMod.queueServerWork(60, () -> {
			if (entity instanceof Player _player) {
				_player.getAbilities().invulnerable = false;
				_player.onUpdateAbilities();
			}
		});
	}
}
