
package net.mcreator.atrox.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.atrox.entity.SpookyBoatEntity;
import net.mcreator.atrox.client.model.Modelboat2;

public class SpookyBoatRenderer extends MobRenderer<SpookyBoatEntity, Modelboat2<SpookyBoatEntity>> {
	public SpookyBoatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboat2(context.bakeLayer(Modelboat2.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpookyBoatEntity entity) {
		return new ResourceLocation("atrox:textures/entities/spookyboat.png");
	}
}
