package net.mcreator.atrox.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.atrox.block.model.GreatAltarDisplayModel;
import net.mcreator.atrox.block.display.GreatAltarDisplayItem;

public class GreatAltarDisplayItemRenderer extends GeoItemRenderer<GreatAltarDisplayItem> {
	public GreatAltarDisplayItemRenderer() {
		super(new GreatAltarDisplayModel());
	}

	@Override
	public RenderType getRenderType(GreatAltarDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
