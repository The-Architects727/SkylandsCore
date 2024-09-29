package net.architects.skylandscore.mixins;

import com.google.common.collect.Lists;
import net.architects.skylandscore.dimensions.ModDimensions;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.DimensionSpecialEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.TicketType;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Unit;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.pattern.BlockInWorld;
import net.minecraft.world.level.block.state.pattern.BlockPattern;
import net.minecraft.world.level.dimension.end.DragonRespawnAnimation;
import net.minecraft.world.level.dimension.end.EndDragonFight;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.EndPodiumFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.client.extensions.IForgeDimensionSpecialEffects;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.Iterator;
import java.util.List;

@Mixin(value = EndDragonFight.class, priority = 69430)
public class DragonFight implements IForgeDimensionSpecialEffects {

    /**
     * @author Apothicon
     * @reason Removes hardcoded ambient lighting from the end.
     */
    @Overwrite
    public void tick() {

    }
//    /**
//     * @author Apothicon
//     * @reason Removes hardcoded ambient lighting from the end.
//     */
//    @Overwrite
//    private void findOrCreateDragon() {
//
//    }
//    /**
//     * @author Apothicon
//     * @reason Removes hardcoded ambient lighting from the end.
//     */
//    @Overwrite
//    public void tryRespawn() {
//
//    }
//    /**
//     * @author Apothicon
//     * @reason Removes hardcoded ambient lighting from the end.
//     */
//    @Overwrite
//    private void respawnDragon(List<EndCrystal> pCrystals) {
//
//
//    }
//
//    /**
//     * @author Apothicon
//     * @reason Removes hardcoded ambient lighting from the end.
//     */
//    @Overwrite
//    private void spawnExitPortal(boolean pActive) {
//
//    }


}