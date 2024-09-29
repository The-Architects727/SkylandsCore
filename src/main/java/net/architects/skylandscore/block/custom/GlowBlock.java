package net.architects.skylandscore.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockState;

public class GlowBlock extends Block {

    public GlowBlock(Properties pProperties, int lightLevel) {
        super(Properties.of()
                .lightLevel((p_50755_) -> {
                    return lightLevel;
                }));

    }

}
