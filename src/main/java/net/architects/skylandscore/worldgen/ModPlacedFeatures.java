package net.architects.skylandscore.worldgen;

import net.architects.skylandscore.EcoPortalsMod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> STRATIFIED_STONE_ORE_PLACED_KEY = registerKey("stratified_stone_ore_placed");

    public static final ResourceKey<PlacedFeature> LAMINATED_CRYSTAL_ORE_PLACED_KEY = registerKey("laminated_crystal_ore_placed");

    public static final ResourceKey<PlacedFeature> POCKED_CRYSTAL_ORE_PLACED_KEY = registerKey("pocked_crystal_ore_placed");

    public static final ResourceKey<PlacedFeature> HEATED_CRYSTAL_ORE_PLACED_KEY = registerKey("heeted_crystal_ore_placed");

    public static final ResourceKey<PlacedFeature> PEARL_CRYSTAL_ORE_PLACED_KEY = registerKey("pearl_crystal_ore_placed");

    public static final ResourceKey<PlacedFeature> SHIFTING_CRYSTAL_ORE_PLACED_KEY = registerKey("shifting_crystal_ore_placed");

    public static final ResourceKey<PlacedFeature> JAGGED_STONE_ORE_PLACED_KEY = registerKey("jagged_stone_ore_placed");

    public static final ResourceKey<PlacedFeature> GLITCHED_STONE_ORE_PLACED_KEY = registerKey("glithced_stone_ore_placed");


    public static final ResourceKey<PlacedFeature> STRATIFIED_STONE_ORE_SHATTERED_PLACED_KEY = registerKey("stratified_stone_ore_shattered_placed");

    public static final ResourceKey<PlacedFeature> LAMINATED_CRYSTAL_ORE_SHATTERED_PLACED_KEY = registerKey("laminated_crystal_ore_shattered_placed");

    public static final ResourceKey<PlacedFeature> POCKED_CRYSTAL_ORE_SHATTERED_PLACED_KEY = registerKey("pocked_crystal_ore_shattered_placed");

    public static final ResourceKey<PlacedFeature> HEATED_CRYSTAL_ORE_SHATTERED_PLACED_KEY = registerKey("heeted_crystal_ore_shattered_placed");

    public static final ResourceKey<PlacedFeature> PEARL_CRYSTAL_ORE_SHATTERED_PLACED_KEY = registerKey("pearl_crystal_ore_shattered_placed");

    public static final ResourceKey<PlacedFeature> SHIFTING_CRYSTAL_ORE_SHATTERED_PLACED_KEY = registerKey("shifting_crystal_ore_shattered_placed");

    public static final ResourceKey<PlacedFeature> JAGGED_STONE_ORE_SHATTERED_PLACED_KEY = registerKey("jagged_stone_ore_shattered_placed");

    public static final ResourceKey<PlacedFeature> GLITCHED_STONE_ORE_SHATTERED_PLACED_KEY = registerKey("glithced_stone_ore_shattered_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, STRATIFIED_STONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_STRATIFIED_STONE_ORE_KEY),
                ModOrePlacement.rareOrePlacement(18,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(140))));

        register(context, LAMINATED_CRYSTAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_LAMINATED_CRYSTAL_ORE_KEY),
                ModOrePlacement.rareOrePlacement(18,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(140))));

        register(context, POCKED_CRYSTAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_POCKED_CRYSTAL_ORE_KEY),
                ModOrePlacement.rareOrePlacement(18,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(140))));

        register(context, HEATED_CRYSTAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_HEATED_CRYSTAL_ORE_KEY),
                ModOrePlacement.rareOrePlacement(18,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(140))));

        register(context, PEARL_CRYSTAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_PEARL_CRYSTAL_ORE_KEY),
                ModOrePlacement.rareOrePlacement(18,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(140))));

        register(context, SHIFTING_CRYSTAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SHIFTING_CRYSTAL_ORE_KEY),
                ModOrePlacement.rareOrePlacement(18,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(140))));

        register(context, JAGGED_STONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_JAGGED_STONE_ORE_KEY),
                ModOrePlacement.rareOrePlacement(18,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(140))));

        register(context, GLITCHED_STONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_GLITCHED_STONE_ORE_KEY),
                ModOrePlacement.rareOrePlacement(18,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(140))));






        register(context, STRATIFIED_STONE_ORE_SHATTERED_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_STRATIFIED_STONE_ORE_SHATTERED_KEY),
                ModOrePlacement.rareOrePlacement(18,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(140))));

        register(context, LAMINATED_CRYSTAL_ORE_SHATTERED_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_LAMINATED_CRYSTAL_ORE_SHATTERED_KEY),
                ModOrePlacement.rareOrePlacement(18,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(140))));

        register(context, POCKED_CRYSTAL_ORE_SHATTERED_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_POCKED_CRYSTAL_ORE_SHATTERED_KEY),
                ModOrePlacement.rareOrePlacement(18,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(140))));

        register(context, HEATED_CRYSTAL_ORE_SHATTERED_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_HEATED_CRYSTAL_ORE_SHATTERED_KEY),
                ModOrePlacement.rareOrePlacement(18,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(140))));

        register(context, PEARL_CRYSTAL_ORE_SHATTERED_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_PEARL_CRYSTAL_ORE_SHATTERED_KEY),
                ModOrePlacement.rareOrePlacement(18,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(140))));

        register(context, SHIFTING_CRYSTAL_ORE_SHATTERED_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SHIFTING_CRYSTAL_ORE_SHATTERED_KEY),
                ModOrePlacement.rareOrePlacement(18,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(140))));

        register(context, JAGGED_STONE_ORE_SHATTERED_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_JAGGED_STONE_ORE_SHATTERED_KEY),
                ModOrePlacement.rareOrePlacement(18,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(140))));

        register(context, GLITCHED_STONE_ORE_SHATTERED_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_GLITCHED_STONE_ORE_SHATTERED_KEY),
                ModOrePlacement.rareOrePlacement(18,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(140))));
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(EcoPortalsMod.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}