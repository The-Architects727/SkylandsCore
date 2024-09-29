package net.architects.skylandscore.entity.client;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.architects.skylandscore.entity.animations.ModAnimationDefinitions;
import net.architects.skylandscore.entity.custom.StoneOrbEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class StoneOrbModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "stone_orb"), "main");
	private final ModelPart stone_orb;

	public StoneOrbModel(ModelPart root) {
		this.stone_orb = root.getChild("stone_orb");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition stone_orb = partdefinition.addOrReplaceChild("stone_orb", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition ball = stone_orb.addOrReplaceChild("ball", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(24, 55).addBox(-3.0F, -5.0F, -3.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = ball.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 45).addBox(-3.0F, -5.0F, -3.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = ball.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 46).addBox(-3.0F, -5.0F, -3.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition ring = stone_orb.addOrReplaceChild("ring", CubeListBuilder.create().texOffs(66, 63).addBox(10.0F, -0.5F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(38, 61).addBox(-12.0F, -0.5F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = ring.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(52, 62).addBox(-1.0F, -0.5F, -4.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 0.0F, -8.5F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r4 = ring.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 62).addBox(-1.0F, -0.5F, -4.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -11.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r5 = ring.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(58, 51).addBox(-1.0F, -0.5F, -4.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 0.0F, -8.5F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r6 = ring.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(54, 30).addBox(-1.0F, -0.5F, -4.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 0.0F, 8.5F, 0.0F, 2.3562F, 0.0F));

		PartDefinition cube_r7 = ring.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(54, 15).addBox(-1.0F, -0.5F, -4.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 11.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r8 = ring.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(54, 0).addBox(-1.0F, -0.5F, -4.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 0.0F, 8.5F, 0.0F, -2.3562F, 0.0F));

		PartDefinition ring2 = stone_orb.addOrReplaceChild("ring2", CubeListBuilder.create().texOffs(18, 32).addBox(15.0F, -0.5F, -7.0F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 31).addBox(-17.0F, -0.5F, -7.0F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r9 = ring2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -0.5F, -8.0F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, 0.0F, -10.5F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r10 = ring2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(18, 2).addBox(-1.0F, -0.5F, -8.0F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -16.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r11 = ring2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(18, 17).addBox(-1.0F, -0.5F, -8.0F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.0F, 0.0F, -10.5F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r12 = ring2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, -0.5F, -8.0F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, 0.0F, 10.5F, 0.0F, 2.3562F, 0.0F));

		PartDefinition cube_r13 = ring2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(36, 15).addBox(-1.0F, -0.5F, -8.0F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 16.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r14 = ring2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(36, 30).addBox(-1.0F, -0.5F, -8.0F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.0F, 0.0F, 10.5F, 0.0F, -2.3562F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animateWalk(ModAnimationDefinitions.STONE_ORB_WALK, limbSwing, limbSwingAmount, 0.5f, 1.5f);
		this.animate(((StoneOrbEntity) entity).idleAnimationState, ModAnimationDefinitions.STONE_ORB_IDLE, ageInTicks, 1f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		stone_orb.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return stone_orb;
	}
}