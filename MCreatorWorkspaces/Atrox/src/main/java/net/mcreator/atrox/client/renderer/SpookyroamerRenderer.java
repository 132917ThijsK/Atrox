
package net.mcreator.atrox.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.atrox.entity.SpookyroamerEntity;
import net.mcreator.atrox.client.model.ModelmodelweepingangelJAVA;

import com.mojang.blaze3d.vertex.PoseStack;

public class SpookyroamerRenderer extends MobRenderer<SpookyroamerEntity, ModelmodelweepingangelJAVA<SpookyroamerEntity>> {
	public SpookyroamerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelmodelweepingangelJAVA(context.bakeLayer(ModelmodelweepingangelJAVA.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(SpookyroamerEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.1f, 1.1f, 1.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpookyroamerEntity entity) {
		return new ResourceLocation("atrox:textures/entities/normal_angel_idle.png");
	}
}
