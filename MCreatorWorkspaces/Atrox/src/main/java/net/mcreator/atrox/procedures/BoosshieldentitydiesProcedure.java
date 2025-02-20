package net.mcreator.atrox.procedures;

import net.minecraft.world.entity.Entity;

public class BoosshieldentitydiesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level().isClientSide())
			entity.discard();
	}
}
