package net.architects.skylandscore.item;

import net.architects.skylandscore.EcoPortalsMod;
import net.architects.skylandscore.tags.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {



    public static final Tier STRATIFIED = TierSortingRegistry.registerTier(
            new ForgeTier(15, 1500, 5f, 2f, 25,
                    ModTags.Blocks.NEEDS_STRATIFIED_TOOL, () -> Ingredient.of(ModItems.LAMINATED_CRYSTAL.get())),
            new ResourceLocation(EcoPortalsMod.MOD_ID, "stratified"), List.of(), List.of());


    public static final Tier LAMINATED = TierSortingRegistry.registerTier(
            new ForgeTier(15, 1500, 5f, 2f, 25,
                    ModTags.Blocks.NEEDS_LAMINATED_TOOL, () -> Ingredient.of(ModItems.LAMINATED_CRYSTAL.get())),
            new ResourceLocation(EcoPortalsMod.MOD_ID, "laminated"), List.of(ModToolTiers.STRATIFIED), List.of());


    public static final Tier POCKED = TierSortingRegistry.registerTier(
            new ForgeTier(15, 1500, 6f, 2.5f, 25,
                    ModTags.Blocks.NEEDS_POCKED_TOOL, () -> Ingredient.of(ModItems.POCKED_CRYSTAL.get())),
            new ResourceLocation(EcoPortalsMod.MOD_ID, "pocked"), List.of(ModToolTiers.LAMINATED), List.of());


    public static final Tier HEATED = TierSortingRegistry.registerTier(
            new ForgeTier(15, 1500, 7f, 3f, 25,
                    ModTags.Blocks.NEEDS_HEATED_TOOL, () -> Ingredient.of(ModItems.HEATED_CRYSTAL.get())),
            new ResourceLocation(EcoPortalsMod.MOD_ID, "heated"), List.of(ModToolTiers.POCKED), List.of());


    public static final Tier PEARL = TierSortingRegistry.registerTier(
            new ForgeTier(15, 1500, 8f, 3.5f, 25,
                    ModTags.Blocks.NEEDS_PEARL_TOOL, () -> Ingredient.of(ModItems.PEARL_CRYSTAL.get())),
            new ResourceLocation(EcoPortalsMod.MOD_ID, "pearl"), List.of(ModToolTiers.HEATED), List.of());


    public static final Tier SHIFTING = TierSortingRegistry.registerTier(
            new ForgeTier(15, 1500, 9f, 4f, 25,
                    ModTags.Blocks.NEEDS_SHIFTING_TOOL, () -> Ingredient.of(ModItems.SHIFTING_CRYSTAL.get())),
            new ResourceLocation(EcoPortalsMod.MOD_ID, "shifting"), List.of(ModToolTiers.PEARL), List.of());


    public static final Tier JAGGED = TierSortingRegistry.registerTier(
            new ForgeTier(15, 1500, 10f, 4.5f, 25,
                    ModTags.Blocks.NEEDS_JAGGED_TOOL, () -> Ingredient.of(ModItems.JAGGED_STONE.get())),
            new ResourceLocation(EcoPortalsMod.MOD_ID, "jagged"), List.of(ModToolTiers.SHIFTING), List.of());

}