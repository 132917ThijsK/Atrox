package net.mcreator.atrox.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.atrox.init.AtroxModBlockEntities;
import net.mcreator.atrox.block.renderer.GreatAltarTileRenderer;
import net.mcreator.atrox.block.renderer.GreatAltarPhase2TileRenderer;
import net.mcreator.atrox.AtroxMod;

@Mod.EventBusSubscriber(modid = AtroxMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(AtroxModBlockEntities.GREAT_ALTAR.get(), context -> new GreatAltarTileRenderer());
		event.registerBlockEntityRenderer(AtroxModBlockEntities.GREAT_ALTAR_PHASE_2.get(), context -> new GreatAltarPhase2TileRenderer());
	}
}
