
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atrox.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.atrox.client.renderer.SpookyroamerRenderer;
import net.mcreator.atrox.client.renderer.SpookyBoatRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AtroxModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AtroxModEntities.SPOOKYROAMER.get(), SpookyroamerRenderer::new);
		event.registerEntityRenderer(AtroxModEntities.SPOOKY_BOAT.get(), SpookyBoatRenderer::new);
	}
}
