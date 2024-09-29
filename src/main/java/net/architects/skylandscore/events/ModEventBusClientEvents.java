package net.architects.skylandscore.events;

import net.architects.skylandscore.EcoPortalsMod;
import net.architects.skylandscore.entity.client.ModModelLayers;
import net.architects.skylandscore.entity.client.StoneOrbModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EcoPortalsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
//        event.registerLayerDefinition(ModModelLayers.STONE_ORB_LAYER, StoneOrbModel::createBodyLayer);
    }
}
