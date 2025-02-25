package net.mcreator.atrox.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.atrox.block.model.GreatAltarPhase2DisplayModel;
import net.mcreator.atrox.block.display.GreatAltarPhase2DisplayItem;

public class GreatAltarPhase2DisplayItemRenderer extends GeoItemRenderer<GreatAltarPhase2DisplayItem> {
	public GreatAltarPhase2DisplayItemRenderer() {
		super(new GreatAltarPhase2DisplayModel());
	}

	@Override
	public RenderType getRenderType(GreatAltarPhase2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
