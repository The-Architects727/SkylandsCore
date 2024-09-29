package net.architects.skylandscore.worldgen;

import net.architects.skylandscore.EcoPortalsMod;
import net.architects.skylandscore.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_STRATIFIED_STONE_ORE_KEY = registerKey("stratified_stone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LAMINATED_CRYSTAL_ORE_KEY = registerKey("laminated_crystal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_POCKED_CRYSTAL_ORE_KEY = registerKey("pocked_crystal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_HEATED_CRYSTAL_ORE_KEY = registerKey("heated_crystal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PEARL_CRYSTAL_ORE_KEY = registerKey("pearl_crystal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SHIFTING_CRYSTAL_ORE_KEY = registerKey("shifting_crystal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_JAGGED_STONE_ORE_KEY = registerKey("jagged_stone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GLITCHED_STONE_ORE_KEY = registerKey("glitched_stone_ore");


    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_STRATIFIED_STONE_ORE_SHATTERED_KEY = registerKey("stratified_stone_ore_shattered");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LAMINATED_CRYSTAL_ORE_SHATTERED_KEY = registerKey("laminated_crystal_ore_shattered");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_POCKED_CRYSTAL_ORE_SHATTERED_KEY = registerKey("pocked_crystal_ore_shattered");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_HEATED_CRYSTAL_ORE_SHATTERED_KEY = registerKey("heated_crystal_ore_shattered");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PEARL_CRYSTAL_ORE_SHATTERED_KEY = registerKey("pearl_crystal_ore_shattered");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SHIFTING_CRYSTAL_ORE_SHATTERED_KEY = registerKey("shifting_crystal_ore_shattered");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_JAGGED_STONE_ORE_SHATTERED_KEY = registerKey("jagged_stone_ore_shattered");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GLITCHED_STONE_ORE_SHATTERED_KEY = registerKey("glitched_stone_ore_shattered");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldStratifiedStoneOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.STRATIFIED_STONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_STRATIFIED_STONE_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_STRATIFIED_STONE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldStratifiedStoneOres, 8, 0.75F));



        List<OreConfiguration.TargetBlockState> overworldLaminatedCrystalOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.LAMINATED_CRYSTAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_LAMINATED_CRYSTAL_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_LAMINATED_CRYSTAL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldLaminatedCrystalOres, 8, 0.75F));



        List<OreConfiguration.TargetBlockState> overworldPockedCrystalOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.POCKED_CRYSTAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_POCKED_CRYSTAL_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_POCKED_CRYSTAL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPockedCrystalOres, 8, 0.75F));



        List<OreConfiguration.TargetBlockState> overworldHeatedCrystalOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.HEATED_CRYSTAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_HEATED_CRYSTAL_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_HEATED_CRYSTAL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldHeatedCrystalOres, 8, 0.75F));



        List<OreConfiguration.TargetBlockState> overworldPearlCrystalOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.PEARL_CRYSTAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_PEARL_CRYSTAL_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_PEARL_CRYSTAL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPearlCrystalOres, 8, 0.75F));



        List<OreConfiguration.TargetBlockState> overworldShiftingCrystalOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.SHIFTING_CRYSTAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SHIFTING_CRYSTAL_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_SHIFTING_CRYSTAL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldShiftingCrystalOres, 8, 0.75F));



        List<OreConfiguration.TargetBlockState> overworldJaggedStoneOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.JAGGED_STONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_JAGGED_STONE_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_JAGGED_STONE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldJaggedStoneOres, 8, 0.75F));



        List<OreConfiguration.TargetBlockState> overworldGlitchedStoneOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.GLITCHED_STONE_BLOCK.get().defaultBlockState()));

        register(context, OVERWORLD_GLITCHED_STONE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldGlitchedStoneOres, 8, 0.75F));










        List<OreConfiguration.TargetBlockState> overworldStratifiedStoneOresShattered = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.STRATIFIED_STONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_STRATIFIED_STONE_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_STRATIFIED_STONE_ORE_SHATTERED_KEY, Feature.ORE, new OreConfiguration(overworldStratifiedStoneOresShattered, 8, 0.75F));



        List<OreConfiguration.TargetBlockState> overworldLaminatedCrystalOresShattered = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.LAMINATED_CRYSTAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_LAMINATED_CRYSTAL_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_LAMINATED_CRYSTAL_ORE_SHATTERED_KEY, Feature.ORE, new OreConfiguration(overworldLaminatedCrystalOresShattered, 8, 0.75F));



        List<OreConfiguration.TargetBlockState> overworldPockedCrystalOresShattered = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.POCKED_CRYSTAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_POCKED_CRYSTAL_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_POCKED_CRYSTAL_ORE_SHATTERED_KEY, Feature.ORE, new OreConfiguration(overworldPockedCrystalOresShattered, 8, 0.75F));



        List<OreConfiguration.TargetBlockState> overworldHeatedCrystalOresShattered = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.HEATED_CRYSTAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_HEATED_CRYSTAL_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_HEATED_CRYSTAL_ORE_SHATTERED_KEY, Feature.ORE, new OreConfiguration(overworldHeatedCrystalOresShattered, 8, 0.75F));



        List<OreConfiguration.TargetBlockState> overworldPearlCrystalOresShattered = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.PEARL_CRYSTAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_PEARL_CRYSTAL_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_PEARL_CRYSTAL_ORE_SHATTERED_KEY, Feature.ORE, new OreConfiguration(overworldPearlCrystalOresShattered, 8, 0.75F));



        List<OreConfiguration.TargetBlockState> overworldShiftingCrystalOresShattered = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.SHIFTING_CRYSTAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SHIFTING_CRYSTAL_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_SHIFTING_CRYSTAL_ORE_SHATTERED_KEY, Feature.ORE, new OreConfiguration(overworldShiftingCrystalOresShattered, 8, 0.75F));



        List<OreConfiguration.TargetBlockState> overworldJaggedStoneOresShattered = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.JAGGED_STONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_JAGGED_STONE_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_JAGGED_STONE_ORE_SHATTERED_KEY, Feature.ORE, new OreConfiguration(overworldJaggedStoneOresShattered, 8, 0.75F));



        List<OreConfiguration.TargetBlockState> overworldGlitchedStoneOresShattered = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.GLITCHED_STONE_BLOCK.get().defaultBlockState()));

        register(context, OVERWORLD_GLITCHED_STONE_ORE_SHATTERED_KEY, Feature.ORE, new OreConfiguration(overworldGlitchedStoneOresShattered, 8, 0.75F));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(EcoPortalsMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}