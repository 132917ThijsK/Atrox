package net.mcreator.atrox.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class SpookydimensionPlayerEntersDimensionProcedure {
	public static void execute(double y, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(0, y, 0);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(0, y, 0, _ent.getYRot(), _ent.getXRot());
		}
	}
}
