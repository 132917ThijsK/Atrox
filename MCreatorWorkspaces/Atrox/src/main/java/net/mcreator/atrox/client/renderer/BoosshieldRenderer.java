
package net.mcreator.atrox.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.atrox.entity.BoosshieldEntity;

public class BoosshieldRenderer extends MobRenderer<BoosshieldEntity, ChickenModel<BoosshieldEntity>> {
	public BoosshieldRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(BoosshieldEntity entity) {
		return new ResourceLocation("atrox:textures/entities/placeholder.png");
	}
}
