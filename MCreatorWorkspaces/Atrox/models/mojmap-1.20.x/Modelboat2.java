// Made with Blockbench 4.11.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelboat2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "boat2"), "main");
	private final ModelPart front;

	public Modelboat2(ModelPart root) {
		this.front = root.getChild("front");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition front = partdefinition.addOrReplaceChild("front",
				CubeListBuilder.create().texOffs(0, 19)
						.addBox(-9.0F, -7.0F, 18.0F, 18.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-8.0F, -7.0F, -11.0F, 16.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 22.0F, 5.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition base_r1 = front.addOrReplaceChild("base_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-13.5F, -10.0F, 8.0F, 28.0F, 16.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 10.0F, 4.5F, 0.0F, 1.5708F, -1.5708F));

		PartDefinition sides2_r1 = front
				.addOrReplaceChild("sides2_r1",
						CubeListBuilder.create().texOffs(0, 43).addBox(-13.5F, -9.0F, -30.0F, 28.0F, 6.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(20.0F, 2.0F, 4.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition sides_r1 = front.addOrReplaceChild("sides_r1",
				CubeListBuilder.create().texOffs(0, 35).addBox(-14.5F, -9.0F, -12.0F, 28.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 2.0F, 4.5F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		front.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}