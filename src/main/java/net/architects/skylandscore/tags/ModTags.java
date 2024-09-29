package net.architects.skylandscore.tags;

import net.architects.skylandscore.EcoPortalsMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables");


        public static final TagKey<Block> MINABLE_WITH_ORE_EXTRACTOR = tag("mineable/ore_extractor");


        public static final TagKey<Block> NEEDS_STRATIFIED_TOOL = tag("needs_stratified_tool");
        public static final TagKey<Block> NEEDS_LAMINATED_TOOL = tag("needs_laminated_tool");
        public static final TagKey<Block> NEEDS_POCKED_TOOL = tag("needs_pocked_tool");
        public static final TagKey<Block> NEEDS_HEATED_TOOL = tag("needs_heated_tool");
        public static final TagKey<Block> NEEDS_PEARL_TOOL = tag("needs_pearl_tool");
        public static final TagKey<Block> NEEDS_SHIFTING_TOOL = tag("needs_shifting_tool");
        public static final TagKey<Block> NEEDS_JAGGED_TOOL = tag("needs_jagged_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(EcoPortalsMod.MOD_ID, name));
        }
    }
    public static class Biomes {
        public static final TagKey<Biome> IS_SHATTERED = tag("is_shattered");
        public static final TagKey<Biome> IS_OGSTRATO = tag("is_ogstrato");
        public static final TagKey<Biome> IS_STRATO = tag("is_strato");
        public static final TagKey<Biome> IS_EXO = tag("is_exo");
        public static final TagKey<Biome> IS_MESO = tag("is_meso");
        public static final TagKey<Biome> IS_THERMO = tag("is_thermo");
        public static final TagKey<Biome> IS_TROPO = tag("is_tropo");
        public static final TagKey<Biome> IS_AMPLIFIED = tag("is_amplified");


        private static TagKey<Biome> tag(String name) {
            return BiomeTags.create(String.valueOf(new ResourceLocation(EcoPortalsMod.MOD_ID, name)));
        }
    }
}