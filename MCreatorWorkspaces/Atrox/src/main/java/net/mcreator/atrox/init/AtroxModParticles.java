
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atrox.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.atrox.client.particle.PortalparticeParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AtroxModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(AtroxModParticleTypes.PORTALPARTICE.get(), PortalparticeParticle::provider);
	}
}
