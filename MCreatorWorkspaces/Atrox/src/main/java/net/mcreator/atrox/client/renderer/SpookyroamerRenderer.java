
package net.mcreator.atrox.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.atrox.entity.SpookyroamerEntity;
import net.mcreator.atrox.client.model.ModelManspook;

import com.mojang.blaze3d.vertex.PoseStack;

public class SpookyroamerRenderer extends MobRenderer<SpookyroamerEntity, ModelManspook<SpookyroamerEntity>> {
	public SpookyroamerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelManspook(context.bakeLayer(ModelManspook.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(SpookyroamerEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.9f, 0.9f, 0.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpookyroamerEntity entity) {
		return new ResourceLocation("atrox:textures/entities/skeletontexture.png");
	}
}
