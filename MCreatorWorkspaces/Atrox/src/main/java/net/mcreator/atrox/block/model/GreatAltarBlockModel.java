package net.mcreator.atrox.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.atrox.block.entity.GreatAltarTileEntity;

public class GreatAltarBlockModel extends GeoModel<GreatAltarTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GreatAltarTileEntity animatable) {
		return new ResourceLocation("atrox", "animations/altar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GreatAltarTileEntity animatable) {
		return new ResourceLocation("atrox", "geo/altar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GreatAltarTileEntity animatable) {
		return new ResourceLocation("atrox", "textures/block/stone.png");
	}
}
