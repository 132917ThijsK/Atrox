package net.mcreator.atrox.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class BoosstatechangerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double StateSelector = 0;
		entity.getPersistentData().putString("PreviousPreviousState", (entity.getPersistentData().getString("PreviousState")));
		entity.getPersistentData().putString("PreviousState", (entity.getPersistentData().getString("State")));
		entity.getPersistentData().putDouble("IA", 0);
		if (!entity.getPersistentData().getBoolean("Phase")) {
			StateSelector = Mth.nextInt(RandomSource.create(), 0, 4);
			if (StateSelector == 0) {
				entity.getPersistentData().putString("State", "Melee");
			}
			if (StateSelector == 1) {
				entity.getPersistentData().putString("State", "Fireball");
			}
			if (StateSelector == 2) {
				entity.getPersistentData().putString("State", "Summon");
			}
			if (StateSelector == 3) {
				entity.getPersistentData().putString("State", "Regeneration");
			}
			if (StateSelector == 4) {
				entity.getPersistentData().putString("State", "Teleport");
			}
		} else {
			StateSelector = Mth.nextInt(RandomSource.create(), 0, 7);
			if (StateSelector < 3) {
				entity.getPersistentData().putString("State", "FracturedTeleport");
			}
			if (StateSelector == 3) {
				entity.getPersistentData().putString("State", "FracturedArtemis");
			}
			if (StateSelector == 4) {
				entity.getPersistentData().putString("State", "FracturedBeam");
			}
			if (StateSelector == 5) {
				entity.getPersistentData().putString("State", "FracturedDispersion");
			}
			if (StateSelector == 6) {
				entity.getPersistentData().putString("State", "FracturedArtemisTeleport");
			}
			if (StateSelector == 7) {
				entity.getPersistentData().putString("State", "FracturedTeleportBeam");
			}
		}
		if ((entity.getPersistentData().getString("State")).equals(entity.getPersistentData().getString("PreviousState")) || (entity.getPersistentData().getString("State")).equals(entity.getPersistentData().getString("PreviousPreviousState"))) {
			BoosstatechangerProcedure.execute(entity);
		}
	}
}
