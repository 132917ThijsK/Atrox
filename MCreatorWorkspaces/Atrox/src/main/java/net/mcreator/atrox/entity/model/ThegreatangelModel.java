package net.mcreator.atrox.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.atrox.entity.ThegreatangelEntity;

public class ThegreatangelModel extends GeoModel<ThegreatangelEntity> {
	@Override
	public ResourceLocation getAnimationResource(ThegreatangelEntity entity) {
		return new ResourceLocation("atrox", "animations/thegreatangel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ThegreatangelEntity entity) {
		return new ResourceLocation("atrox", "geo/thegreatangel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ThegreatangelEntity entity) {
		return new ResourceLocation("atrox", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ThegreatangelEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
