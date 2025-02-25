package net.mcreator.atrox.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.atrox.block.display.GreatAltarPhase2DisplayItem;

public class GreatAltarPhase2DisplayModel extends GeoModel<GreatAltarPhase2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GreatAltarPhase2DisplayItem animatable) {
		return new ResourceLocation("atrox", "animations/altar2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GreatAltarPhase2DisplayItem animatable) {
		return new ResourceLocation("atrox", "geo/altar2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GreatAltarPhase2DisplayItem entity) {
		return new ResourceLocation("atrox", "textures/block/stonephase2.png");
	}
}
