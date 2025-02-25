package net.mcreator.atrox.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.atrox.block.entity.GreatAltarPhase2TileEntity;

public class GreatAltarPhase2BlockModel extends GeoModel<GreatAltarPhase2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GreatAltarPhase2TileEntity animatable) {
		return new ResourceLocation("atrox", "animations/altar2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GreatAltarPhase2TileEntity animatable) {
		return new ResourceLocation("atrox", "geo/altar2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GreatAltarPhase2TileEntity animatable) {
		return new ResourceLocation("atrox", "textures/block/stonephase2.png");
	}
}
