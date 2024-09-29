package net.architects.skylandscore.entity;

import net.architects.skylandscore.EcoPortalsMod;
import net.architects.skylandscore.entity.custom.StoneOrbEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, EcoPortalsMod.MOD_ID);

//    public static final RegistryObject<EntityType<StoneOrbEntity>> STONE_ORB =
//            ENTITY_TYPES.register("stone_orb", () -> EntityType.Builder.of(StoneOrbEntity::new, MobCategory.CREATURE)
//                    .sized(1f, 1.5f).build("stone_orb"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}