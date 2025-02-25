package net.mcreator.atrox.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.atrox.block.model.GreatAltarPhase2BlockModel;
import net.mcreator.atrox.block.entity.GreatAltarPhase2TileEntity;

public class GreatAltarPhase2TileRenderer extends GeoBlockRenderer<GreatAltarPhase2TileEntity> {
	public GreatAltarPhase2TileRenderer() {
		super(new GreatAltarPhase2BlockModel());
	}

	@Override
	public RenderType getRenderType(GreatAltarPhase2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
