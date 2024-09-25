
package net.mcreator.atrox.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.atrox.entity.SpookyroamerEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class SpookyroamerRenderer extends HumanoidMobRenderer<SpookyroamerEntity, HumanoidModel<SpookyroamerEntity>> {
	public SpookyroamerRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	protected void scale(SpookyroamerEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.9f, 0.9f, 0.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpookyroamerEntity entity) {
		return new ResourceLocation("atrox:textures/entities/hazmattie.png");
	}
}
