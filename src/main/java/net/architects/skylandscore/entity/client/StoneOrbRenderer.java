package net.architects.skylandscore.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.architects.skylandscore.EcoPortalsMod;
import net.architects.skylandscore.entity.custom.StoneOrbEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class StoneOrbRenderer extends MobRenderer<StoneOrbEntity, StoneOrbModel<StoneOrbEntity>> {
    public StoneOrbRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new StoneOrbModel<>(pContext.bakeLayer(ModModelLayers.STONE_ORB_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(StoneOrbEntity pEntity) {
        return new ResourceLocation(EcoPortalsMod.MOD_ID, "textures/entity/stone_orb.png");
    }

    @Override
    public void render(StoneOrbEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}