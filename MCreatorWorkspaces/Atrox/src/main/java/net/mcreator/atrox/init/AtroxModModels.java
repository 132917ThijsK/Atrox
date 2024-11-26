
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atrox.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.atrox.client.model.Modelspookyboat;
import net.mcreator.atrox.client.model.ModelmodelweepingangelJAVA;
import net.mcreator.atrox.client.model.ModelManspook;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AtroxModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelManspook.LAYER_LOCATION, ModelManspook::createBodyLayer);
		event.registerLayerDefinition(Modelspookyboat.LAYER_LOCATION, Modelspookyboat::createBodyLayer);
		event.registerLayerDefinition(ModelmodelweepingangelJAVA.LAYER_LOCATION, ModelmodelweepingangelJAVA::createBodyLayer);
	}
}
