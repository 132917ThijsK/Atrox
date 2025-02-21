// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcircle<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "circle"), "main");
	private final ModelPart seal;
	private final ModelPart lower_seal;

	public Modelcircle(ModelPart root) {
		this.seal = root.getChild("seal");
		this.lower_seal = root.getChild("lower_seal");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition seal = partdefinition.addOrReplaceChild("seal", CubeListBuilder.create().texOffs(-24, 0)
				.addBox(-12.0F, -1.1F, -12.0F, 24.0F, 0.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.95F, 0.0F));

		PartDefinition lower_seal = partdefinition.addOrReplaceChild("lower_seal", CubeListBuilder.create()
				.texOffs(-24, 24).addBox(-12.0F, 0.0F, -12.0F, 24.0F, 0.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.95F, 0.0F));

		return LayerDefinition.create(meshdefinition, 48, 48);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		seal.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lower_seal.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.seal.yRot = ageInTicks / 20.f;
		this.lower_seal.yRot = ageInTicks;
	}
}