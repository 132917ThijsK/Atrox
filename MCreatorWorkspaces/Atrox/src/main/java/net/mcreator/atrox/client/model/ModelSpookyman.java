package net.mcreator.atrox.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSpookyman<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("atrox", "model_spookyman"), "main");
	public final ModelPart Leftleg;
	public final ModelPart Rightleg;
	public final ModelPart Chest;
	public final ModelPart Rightarm;
	public final ModelPart Leftarm;
	public final ModelPart bb_main;

	public ModelSpookyman(ModelPart root) {
		this.Leftleg = root.getChild("Leftleg");
		this.Rightleg = root.getChild("Rightleg");
		this.Chest = root.getChild("Chest");
		this.Rightarm = root.getChild("Rightarm");
		this.Leftarm = root.getChild("Leftarm");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Leftleg = partdefinition.addOrReplaceChild("Leftleg", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -6.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, 18.0F, 0.0F));
		PartDefinition Rightleg = partdefinition.addOrReplaceChild("Rightleg", CubeListBuilder.create().texOffs(40, 16).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 18.0F, 0.0F));
		PartDefinition Chest = partdefinition.addOrReplaceChild("Chest",
				CubeListBuilder.create().texOffs(23, 26).mirror().addBox(4.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 18).addBox(-4.0F, -9.0F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(28, 18).addBox(-4.0F, -11.0F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 18).addBox(-4.0F, -7.0F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 26)
						.addBox(-4.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 18).mirror().addBox(4.0F, -7.0F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 18).mirror()
						.addBox(4.0F, -9.0F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 18).mirror().addBox(4.0F, -11.0F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 11.0F, 0.0F));
		PartDefinition cube_r1 = Chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 20).mirror().addBox(0.0F, -1.0F, -5.0F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -6.0F, 2.0F, -1.5708F, 1.5708F, 0.0F));
		PartDefinition cube_r2 = Chest.addOrReplaceChild(
				"cube_r2", CubeListBuilder.create().texOffs(29, 19).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(29, 21).mirror()
						.addBox(0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(29, 17).mirror().addBox(0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -9.0F, 2.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r3 = Chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 22).mirror().addBox(0.0F, -1.0F, -3.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 2.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r4 = Chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 22).mirror().addBox(0.0F, -1.0F, -3.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.0F, -2.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r5 = Chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(30, 20).mirror().addBox(0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -11.0F, -2.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r6 = Chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(8, -2).addBox(0.0F, -4.0F, -2.0F, 0.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r7 = Chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(16, 20).addBox(0.0F, -1.0F, -5.0F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 2.0F, -1.5708F, -1.5708F, 0.0F));
		PartDefinition cube_r8 = Chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(9, -1).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(9, -1)
				.addBox(0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(9, -1).addBox(0.0F, -4.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -7.0F, 2.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r9 = Chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(29, 21).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(29, 19)
				.addBox(0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(29, 19).addBox(0.0F, -4.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -7.0F, 2.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r10 = Chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(20, 12).addBox(0.0F, 0.0F, -5.0F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -11.0F, -2.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r11 = Chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(16, 22).addBox(0.0F, -1.0F, -3.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 2.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r12 = Chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(24, 22).addBox(0.0F, -1.0F, -3.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, -2.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Rightarm = partdefinition.addOrReplaceChild("Rightarm", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-11.0F, -6.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, 6.0F, 0.0F));
		PartDefinition Leftarm = partdefinition.addOrReplaceChild("Leftarm", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 6.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Chest.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
