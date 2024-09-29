package net.architects.skylandscore.dimensions;

import net.architects.skylandscore.EcoPortalsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public class ModDimensions {

    public static final ResourceKey<Level> SKYLANDS_CORE_END = ResourceKey.create(Registries.DIMENSION,
            new ResourceLocation(EcoPortalsMod.MOD_ID, "end"));


}
