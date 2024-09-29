package net.architects.skylandscore.events;

import net.architects.skylandscore.EcoPortalsMod;
import net.architects.skylandscore.entity.ModEntities;
import net.architects.skylandscore.entity.custom.StoneOrbEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EcoPortalsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
//        event.put(ModEntities.STONE_ORB.get(), StoneOrbEntity.createAttributes().build());
    }
}