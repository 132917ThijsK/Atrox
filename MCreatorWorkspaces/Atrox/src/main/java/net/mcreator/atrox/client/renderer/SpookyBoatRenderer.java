
package net.mcreator.atrox.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.atrox.entity.SpookyBoatEntity;
import net.mcreator.atrox.client.model.Modelspookyboat;

public class SpookyBoatRenderer extends MobRenderer<SpookyBoatEntity, Modelspookyboat<SpookyBoatEntity>> {
	public SpookyBoatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelspookyboat(context.bakeLayer(Modelspookyboat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpookyBoatEntity entity) {
		return new ResourceLocation("atrox:textures/entities/spookyboat.png");
	}
}
