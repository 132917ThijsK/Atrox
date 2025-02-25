package net.mcreator.atrox.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.atrox.block.display.GreatAltarDisplayItem;

public class GreatAltarDisplayModel extends GeoModel<GreatAltarDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GreatAltarDisplayItem animatable) {
		return new ResourceLocation("atrox", "animations/altar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GreatAltarDisplayItem animatable) {
		return new ResourceLocation("atrox", "geo/altar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GreatAltarDisplayItem entity) {
		return new ResourceLocation("atrox", "textures/block/stone.png");
	}
}
