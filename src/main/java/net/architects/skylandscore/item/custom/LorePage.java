package net.architects.skylandscore.item.custom;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.particle.DustParticle;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class LorePage extends Item {
    public LorePage(Properties pProperties) {
            super(pProperties);
        }

        @Override
        public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        Player player = pPlayer;
            ItemStack pStack = pPlayer.getItemInHand(pUsedHand);
        if(!pLevel.isClientSide()) {
                if (player instanceof ServerPlayer) {

                    CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer)player, pStack);


                }
            }

            if (player != null) {
                player.awardStat(Stats.ITEM_USED.get(this));
                spawnFoundParticles(pLevel, pPlayer, pUsedHand);
                if (!player.getAbilities().instabuild) {
                    pStack.shrink(1);
                }
            }

            return InteractionResultHolder.pass(pPlayer.getItemInHand(pUsedHand));
        }

    private void spawnFoundParticles(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        for (int index0 = 0; index0 < 60; index0++) {
            if (pLevel instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.DRAGON_BREATH, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(), 3, (Mth.nextDouble(RandomSource.create(), -0.1, 0.1)), (Mth.nextDouble(RandomSource.create(), -0.1, 0.1)), (Mth.nextDouble(RandomSource.create(), -0.1, 0.1)), 0.2);
            if (pLevel instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.DRAGON_BREATH, pPlayer.getX(), (pPlayer.getY() + 1), pPlayer.getZ(), 3, (Mth.nextDouble(RandomSource.create(), -0.1, 0.1)), (Mth.nextDouble(RandomSource.create(), -0.1, 0.1)), (Mth.nextDouble(RandomSource.create(), -0.1, 0.1)), 0.2);
        }

//                pLevel.addParticle(ParticleTypes.PORTAL,
//                        pPlayer.getX() + 0.5d, pPlayer.getY() + 1, pPlayer.getZ() + 0.5d,
//                        0.15d, 0.15d, 0.15d);

    }
}
