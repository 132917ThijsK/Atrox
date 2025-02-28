
package net.mcreator.atrox.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.atrox.entity.CrackedAngelEntity;
import net.mcreator.atrox.client.model.ModelmodelweepingangelJAVA;

import com.mojang.blaze3d.vertex.PoseStack;

public class CrackedAngelRenderer extends MobRenderer<CrackedAngelEntity, ModelmodelweepingangelJAVA<CrackedAngelEntity>> {
	public CrackedAngelRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelmodelweepingangelJAVA(context.bakeLayer(ModelmodelweepingangelJAVA.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(CrackedAngelEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.1f, 1.1f, 1.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrackedAngelEntity entity) {
		return new ResourceLocation("atrox:textures/entities/cracked_angel_idle.png");
	}
}
