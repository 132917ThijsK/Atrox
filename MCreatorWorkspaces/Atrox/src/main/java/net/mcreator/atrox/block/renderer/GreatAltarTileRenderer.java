package net.mcreator.atrox.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.atrox.block.model.GreatAltarBlockModel;
import net.mcreator.atrox.block.entity.GreatAltarTileEntity;

public class GreatAltarTileRenderer extends GeoBlockRenderer<GreatAltarTileEntity> {
	public GreatAltarTileRenderer() {
		super(new GreatAltarBlockModel());
	}

	@Override
	public RenderType getRenderType(GreatAltarTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
