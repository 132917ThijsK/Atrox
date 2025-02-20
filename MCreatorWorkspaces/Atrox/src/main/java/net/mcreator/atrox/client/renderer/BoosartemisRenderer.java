
package net.mcreator.atrox.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import net.mcreator.atrox.entity.BoosartemisEntity;

public class BoosartemisRenderer extends MobRenderer<BoosartemisEntity, OcelotModel<BoosartemisEntity>> {
	public BoosartemisRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel(context.bakeLayer(ModelLayers.OCELOT)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(BoosartemisEntity entity) {
		return new ResourceLocation("atrox:textures/entities/placeholder.png");
	}
}
