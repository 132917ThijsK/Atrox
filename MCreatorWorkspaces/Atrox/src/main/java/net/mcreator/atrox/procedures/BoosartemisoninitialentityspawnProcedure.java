package net.mcreator.atrox.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class BoosartemisoninitialentityspawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3((Mth.nextInt(RandomSource.create(), (int) (-0.75), (int) 0.75)), (Mth.nextInt(RandomSource.create(), (int) 0.25, (int) 0.75)), (Mth.nextInt(RandomSource.create(), (int) (-0.75), (int) 0.75))));
	}
}
