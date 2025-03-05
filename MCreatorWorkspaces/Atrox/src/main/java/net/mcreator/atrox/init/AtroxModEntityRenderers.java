
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atrox.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.atrox.client.renderer.ThegreatangelRenderer;
import net.mcreator.atrox.client.renderer.SpookyroamerRenderer;
import net.mcreator.atrox.client.renderer.SpookyBoatRenderer;
import net.mcreator.atrox.client.renderer.CrackedAngelRenderer;
import net.mcreator.atrox.client.renderer.BoosshieldRenderer;
import net.mcreator.atrox.client.renderer.BoosartemisRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AtroxModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AtroxModEntities.WEEPING_ANGEL.get(), SpookyroamerRenderer::new);
		event.registerEntityRenderer(AtroxModEntities.SPOOKY_BOAT.get(), SpookyBoatRenderer::new);
		event.registerEntityRenderer(AtroxModEntities.THEGREATANGEL.get(), ThegreatangelRenderer::new);
<<<<<<< Updated upstream
		event.registerEntityRenderer(AtroxModEntities.BOOSSMALLFIREBALLPROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AtroxModEntities.BOOSSHIELD.get(), BoosshieldRenderer::new);
		event.registerEntityRenderer(AtroxModEntities.BOOSARTEMIS.get(), BoosartemisRenderer::new);
		event.registerEntityRenderer(AtroxModEntities.CRACKED_ANGEL.get(), CrackedAngelRenderer::new);
=======
		event.registerEntityRenderer(AtroxModEntities.BOSSSMALLFIREBALLPROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AtroxModEntities.BOSSSHIELD.get(), BoosshieldRenderer::new);
		event.registerEntityRenderer(AtroxModEntities.BOSSARTEMIS.get(), BoosartemisRenderer::new);
>>>>>>> Stashed changes
	}
}
