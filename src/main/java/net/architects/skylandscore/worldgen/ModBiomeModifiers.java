package net.architects.skylandscore.worldgen;

import net.architects.skylandscore.EcoPortalsMod;
import net.architects.skylandscore.tags.ModTags;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_STRATIFIED_STONE_ORE = registerKey("add_stratified_stone_ore");
    public static final ResourceKey<BiomeModifier> ADD_LAMINATED_CRYSTAL_ORE = registerKey("add_laminated_crystal_ore");
    public static final ResourceKey<BiomeModifier> ADD_POCKED_CRYSTAL_ORE = registerKey("add_pocked_crystal_ore");
    public static final ResourceKey<BiomeModifier> ADD_HEATED_CRYSTAL_ORE = registerKey("add_heated_crystal_ore");
    public static final ResourceKey<BiomeModifier> ADD_PEARL_CRYSTAL_ORE = registerKey("add_pearl_crystal_ore");
    public static final ResourceKey<BiomeModifier> ADD_SHIFTING_CRYSTAL_ORE = registerKey("add_shifting_crystal_ore");
    public static final ResourceKey<BiomeModifier> ADD_JAGGED_STONE_ORE = registerKey("add_jagged_stone_ore");
    public static final ResourceKey<BiomeModifier> ADD_GLITCHED_STONE_ORE = registerKey("add_glitched_stone_ore");


    public static final ResourceKey<BiomeModifier> ADD_STRATIFIED_STONE_ORE_SHATTERED = registerKey("add_stratified_stone_ore_shattered");
    public static final ResourceKey<BiomeModifier> ADD_LAMINATED_CRYSTAL_ORE_SHATTERED = registerKey("add_laminated_crystal_ore_shattered");
    public static final ResourceKey<BiomeModifier> ADD_POCKED_CRYSTAL_ORE_SHATTERED = registerKey("add_pocked_crystal_ore_shattered");
    public static final ResourceKey<BiomeModifier> ADD_HEATED_CRYSTAL_ORE_SHATTERED = registerKey("add_heated_crystal_ore_shattered");
    public static final ResourceKey<BiomeModifier> ADD_PEARL_CRYSTAL_ORE_SHATTERED = registerKey("add_pearl_crystal_ore_shattered");
    public static final ResourceKey<BiomeModifier> ADD_SHIFTING_CRYSTAL_ORE_SHATTERED = registerKey("add_shifting_crystal_ore_shattered");
    public static final ResourceKey<BiomeModifier> ADD_JAGGED_STONE_ORE_SHATTERED = registerKey("add_jagged_stone_ore_shattered");
    public static final ResourceKey<BiomeModifier> ADD_GLITCHED_STONE_ORE_SHATTERED = registerKey("add_glitched_stone_ore_shattered");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

//        context.register(ADD_STRATIFIED_STONE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//                biomes.getOrThrow(ModTags.Biomes.IS_SHATTERED),
//                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.STRATIFIED_STONE_ORE_PLACED_KEY)),
//                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_STRATIFIED_STONE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.STRATIFIED_STONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


        context.register(ADD_LAMINATED_CRYSTAL_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.LAMINATED_CRYSTAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


        context.register(ADD_POCKED_CRYSTAL_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.POCKED_CRYSTAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


        context.register(ADD_HEATED_CRYSTAL_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.HEATED_CRYSTAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


        context.register(ADD_PEARL_CRYSTAL_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PEARL_CRYSTAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


        context.register(ADD_SHIFTING_CRYSTAL_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SHIFTING_CRYSTAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


        context.register(ADD_JAGGED_STONE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.JAGGED_STONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


        context.register(ADD_GLITCHED_STONE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GLITCHED_STONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));






        context.register(ADD_STRATIFIED_STONE_ORE_SHATTERED, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_SHATTERED),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.STRATIFIED_STONE_ORE_SHATTERED_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


        context.register(ADD_LAMINATED_CRYSTAL_ORE_SHATTERED, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_SHATTERED),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.LAMINATED_CRYSTAL_ORE_SHATTERED_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


        context.register(ADD_POCKED_CRYSTAL_ORE_SHATTERED, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_SHATTERED),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.POCKED_CRYSTAL_ORE_SHATTERED_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


        context.register(ADD_HEATED_CRYSTAL_ORE_SHATTERED, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_SHATTERED),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.HEATED_CRYSTAL_ORE_SHATTERED_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


        context.register(ADD_PEARL_CRYSTAL_ORE_SHATTERED, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_SHATTERED),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PEARL_CRYSTAL_ORE_SHATTERED_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


        context.register(ADD_SHIFTING_CRYSTAL_ORE_SHATTERED, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_SHATTERED),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SHIFTING_CRYSTAL_ORE_SHATTERED_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


        context.register(ADD_JAGGED_STONE_ORE_SHATTERED, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_SHATTERED),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.JAGGED_STONE_ORE_SHATTERED_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


        context.register(ADD_GLITCHED_STONE_ORE_SHATTERED, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_SHATTERED),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GLITCHED_STONE_ORE_SHATTERED_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(EcoPortalsMod.MOD_ID, name));
    }
}