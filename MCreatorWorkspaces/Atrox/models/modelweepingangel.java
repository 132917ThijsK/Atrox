// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class modelweepingangelJAVA<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "modelweepingangeljava"), "main");
	private final ModelPart Torso;
	private final ModelPart LeftArm;
	private final ModelPart Legs;
	private final ModelPart RightArm;
	private final ModelPart Head;
	private final ModelPart LeftWing;
	private final ModelPart RightWing;

	public modelweepingangelJAVA(ModelPart root) {
		this.Torso = root.getChild("Torso");
		this.LeftArm = root.getChild("LeftArm");
		this.Legs = root.getChild("Legs");
		this.RightArm = root.getChild("RightArm");
		this.Head = root.getChild("Head");
		this.LeftWing = root.getChild("LeftWing");
		this.RightWing = root.getChild("RightWing");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Torso = partdefinition.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(56, 17).addBox(-4.0F, -5.0F, -2.0F, 8.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(36, 20).addBox(-4.0F, -6.0F, -2.5F, 8.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(4.0F, 2.0F, 0.0F));

		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(2, 59).addBox(-3.0F, -2.0F, -11.0F, 3.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, -2.8798F));

		PartDefinition Legs = partdefinition.addOrReplaceChild("Legs", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 11.0F, -4.0F, 12.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(-5.0F, 0.0F, -3.0F, 10.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-4.0F, 2.0F, 0.0F));

		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(2, 59).addBox(-3.0F, -2.0F, -11.0F, 3.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, -0.2618F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 17).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(86, 22).addBox(-4.5F, -9.0F, -4.5F, 9.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hairback_r1 = Head.addOrReplaceChild("hairback_r1", CubeListBuilder.create().texOffs(85, 35).addBox(-7.5F, -9.0F, -0.5F, 9.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 2.0F, 4.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition hairtop_r1 = Head.addOrReplaceChild("hairtop_r1", CubeListBuilder.create().texOffs(80, 0).addBox(-18.0F, -9.0F, -0.5F, 8.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, -8.0F, -4.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition hairright_r1 = Head.addOrReplaceChild("hairright_r1", CubeListBuilder.create().texOffs(89, 8).addBox(-10.5F, -9.0F, 9.5F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, 0.0F, 6.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition hairleft_r1 = Head.addOrReplaceChild("hairleft_r1", CubeListBuilder.create().texOffs(89, 8).addBox(-17.5F, -10.0F, 1.0F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 1.0F, 13.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition LeftWing = partdefinition.addOrReplaceChild("LeftWing", CubeListBuilder.create().texOffs(9, 40).addBox(-2.0F, -7.0F, -13.0F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 37).addBox(-2.0F, -10.0F, -12.0F, 2.0F, 19.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(7, 35).addBox(-2.0F, -12.0F, -11.0F, 2.0F, 21.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(5, 34).addBox(-2.0F, -12.0F, -10.0F, 2.0F, 22.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(2, 32).addBox(-2.0F, -12.0F, -8.0F, 2.0F, 23.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 35).addBox(-2.0F, -11.0F, -5.0F, 2.0F, 22.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.0F, 2.0F, -3.106F, -1.0048F, -3.0858F));

		PartDefinition cube_r1 = LeftWing.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(17, 50).mirror().addBox(-1.25F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 49).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, -4.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r2 = LeftWing.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(19, 51).mirror().addBox(0.0F, -6.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0F, -3.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r3 = LeftWing.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(15, 48).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.0F, -2.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition RightWing = partdefinition.addOrReplaceChild("RightWing", CubeListBuilder.create().texOffs(9, 40).mirror().addBox(0.0F, -7.0F, -13.0F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(8, 37).mirror().addBox(0.0F, -10.0F, -12.0F, 2.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(7, 35).mirror().addBox(0.0F, -12.0F, -11.0F, 2.0F, 21.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(5, 34).mirror().addBox(0.0F, -12.0F, -10.0F, 2.0F, 22.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(2, 32).mirror().addBox(0.0F, -12.0F, -8.0F, 2.0F, 23.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 35).mirror().addBox(0.0F, -11.0F, -5.0F, 2.0F, 22.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.0F, 2.0F, -3.0666F, 1.0038F, 3.1274F));

		PartDefinition cube_r4 = RightWing.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 49).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, 0.0F, 0.7854F, -3.1416F));

		PartDefinition cube_r5 = RightWing.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(15, 48).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0F, -2.0F, 0.0F, -0.5236F, -3.1416F));

		PartDefinition cube_r6 = RightWing.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(19, 51).mirror().addBox(0.0F, -6.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0F, -3.0F, 0.0F, 0.7854F, -3.1416F));

		PartDefinition cube_r7 = RightWing.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(17, 50).mirror().addBox(-1.25F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, -4.0F, 0.0F, 0.7854F, -3.1416F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftWing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightWing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}