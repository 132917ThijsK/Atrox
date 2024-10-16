
package net.mcreator.atrox.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class AcidicMobEffect extends MobEffect {
	public AcidicMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16751104);
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
