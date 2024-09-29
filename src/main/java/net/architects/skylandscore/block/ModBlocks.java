package net.architects.skylandscore.block;

import net.architects.skylandscore.EcoPortalsMod;
import net.architects.skylandscore.block.custom.PortalBlock;
import net.architects.skylandscore.fluid.ModFluids;
import net.architects.skylandscore.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EcoPortalsMod.MOD_ID);



    public static final RegistryObject<LiquidBlock> OBSIDIAN_TEARS_BLOCK = BLOCKS.register("obsidian_tears_block",
            () -> new LiquidBlock(ModFluids.SOURCE_OBSIDIAN_TEARS, BlockBehaviour.Properties.copy(Blocks.WATER)));


    public static final RegistryObject<LiquidBlock> RED_DRAGON_ESSENCE_BLOCK = BLOCKS.register("red_dragon_essence_block",
            () -> new LiquidBlock(ModFluids.SOURCE_RED_DRAGON_ESSENCE, BlockBehaviour.Properties.copy(Blocks.WATER)));


    public static final RegistryObject<LiquidBlock> ORANGE_DRAGON_ESSENCE_BLOCK = BLOCKS.register("orange_dragon_essence_block",
            () -> new LiquidBlock(ModFluids.SOURCE_ORANGE_DRAGON_ESSENCE, BlockBehaviour.Properties.copy(Blocks.WATER)));


    public static final RegistryObject<LiquidBlock> YELLOW_DRAGON_ESSENCE_BLOCK = BLOCKS.register("yellow_dragon_essence_block",
            () -> new LiquidBlock(ModFluids.SOURCE_YELLOW_DRAGON_ESSENCE, BlockBehaviour.Properties.copy(Blocks.WATER)));


    public static final RegistryObject<LiquidBlock> GREEN_DRAGON_ESSENCE_BLOCK = BLOCKS.register("green_dragon_essence_block",
            () -> new LiquidBlock(ModFluids.SOURCE_GREEN_DRAGON_ESSENCE, BlockBehaviour.Properties.copy(Blocks.WATER)));


    public static final RegistryObject<LiquidBlock> BLUE_DRAGON_ESSENCE_BLOCK = BLOCKS.register("blue_dragon_essence_block",
            () -> new LiquidBlock(ModFluids.SOURCE_BLUE_DRAGON_ESSENCE, BlockBehaviour.Properties.copy(Blocks.WATER)));


    public static final RegistryObject<LiquidBlock> PURPLE_DRAGON_ESSENCE_BLOCK = BLOCKS.register("purple_dragon_essence_block",
            () -> new LiquidBlock(ModFluids.SOURCE_PURPLE_DRAGON_ESSENCE, BlockBehaviour.Properties.copy(Blocks.WATER)));


    public static final RegistryObject<LiquidBlock> MAGENTA_DRAGON_ESSENCE_BLOCK = BLOCKS.register("magenta_dragon_essence_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MAGENTA_DRAGON_ESSENCE, BlockBehaviour.Properties.copy(Blocks.WATER)));


//
//    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
//            () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
//                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));
//
//    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
//            () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
//                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));
//
//    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
//            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
//


//    public static final RegistryObject<Block> STRATIFIED_STONE_ORE = registerBlock("stratified_stone_ore",
//            () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
//                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 6), 7));
//
//    public static final RegistryObject<Block> DEEPSLATE_STRATIFIED_STONE_ORE = registerBlock("deepslate_stratified_stone_ore",
//            () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
//                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 6), 7));
//
//    public static final RegistryObject<Block> STRATIFIED_STONE_BLOCK = registerBlock("stratified_stone_block",
//            () -> new GlowBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), 10));
//
//
//
//    public static final RegistryObject<Block> LAMINATED_CRYSTAL_ORE = registerBlock("laminated_crystal_ore",
//            () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
//                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 6), 7));
//
//    public static final RegistryObject<Block> DEEPSLATE_LAMINATED_CRYSTAL_ORE = registerBlock("deepslate_laminated_crystal_ore",
//            () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
//                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 6), 7));
//
//    public static final RegistryObject<Block> LAMINATED_CRYSTAL_BLOCK = registerBlock("laminated_crystal_block",
//            () -> new GlowBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), 10));
//
//
//
//    public static final RegistryObject<Block> POCKED_CRYSTAL_ORE = registerBlock("pocked_crystal_ore",
//            () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
//                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 6), 7));
//
//    public static final RegistryObject<Block> DEEPSLATE_POCKED_CRYSTAL_ORE = registerBlock("deepslate_pocked_crystal_ore",
//            () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
//                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 6), 7));
//
//    public static final RegistryObject<Block> POCKED_CRYSTAL_BLOCK = registerBlock("pocked_crystal_block",
//            () -> new GlowBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), 10));
//
//
//
//    public static final RegistryObject<Block> HEATED_CRYSTAL_ORE = registerBlock("heated_crystal_ore",
//            () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
//                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 6), 7));
//
//    public static final RegistryObject<Block> DEEPSLATE_HEATED_CRYSTAL_ORE = registerBlock("deepslate_heated_crystal_ore",
//            () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
//                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 6), 7));
//
//    public static final RegistryObject<Block> HEATED_CRYSTAL_BLOCK = registerBlock("heated_crystal_block",
//            () -> new GlowBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), 10));
//
//
//
//    public static final RegistryObject<Block> PEARL_CRYSTAL_ORE = registerBlock("pearl_crystal_ore",
//            () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
//                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 6), 7));
//
//    public static final RegistryObject<Block> DEEPSLATE_PEARL_CRYSTAL_ORE = registerBlock("deepslate_pearl_crystal_ore",
//            () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
//                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 6), 7));
//
//    public static final RegistryObject<Block> PEARL_CRYSTAL_BLOCK = registerBlock("pearl_crystal_block",
//            () -> new GlowBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), 10));
//
//
//
//    public static final RegistryObject<Block> SHIFTING_CRYSTAL_ORE = registerBlock("shifting_crystal_ore",
//            () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
//                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 6), 7));
//
//    public static final RegistryObject<Block> DEEPSLATE_SHIFTING_CRYSTAL_ORE = registerBlock("deepslate_shifting_crystal_ore",
//            () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
//                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 6), 7));
//
//    public static final RegistryObject<Block> SHIFTING_CRYSTAL_BLOCK = registerBlock("shifting_crystal_block",
//            () -> new GlowBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), 10));
//
//
//
//    public static final RegistryObject<Block> JAGGED_STONE_ORE = registerBlock("jagged_stone_ore",
//            () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
//                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 6), 7));
//
//    public static final RegistryObject<Block> DEEPSLATE_JAGGED_STONE_ORE = registerBlock("deepslate_jagged_stone_ore",
//            () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
//                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 6), 7));
//
//    public static final RegistryObject<Block> JAGGED_STONE_BLOCK = registerBlock("jagged_stone_block",
//            () -> new GlowBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), 10));

    public static final RegistryObject<Block> STRATIFIED_STONE_ORE = registerBlock("stratified_stone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(10, 9).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> DEEPSLATE_STRATIFIED_STONE_ORE = registerBlock("deepslate_stratified_stone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(10, 9).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> STRATIFIED_STONE_BLOCK = registerBlock("stratified_stone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));



    public static final RegistryObject<Block> LAMINATED_CRYSTAL_ORE = registerBlock("laminated_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(10, 9).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> DEEPSLATE_LAMINATED_CRYSTAL_ORE = registerBlock("deepslate_laminated_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(10, 9).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> LAMINATED_CRYSTAL_BLOCK = registerBlock("laminated_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));



    public static final RegistryObject<Block> POCKED_CRYSTAL_ORE = registerBlock("pocked_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(10, 9).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> DEEPSLATE_POCKED_CRYSTAL_ORE = registerBlock("deepslate_pocked_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(10, 9).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> POCKED_CRYSTAL_BLOCK = registerBlock("pocked_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));



    public static final RegistryObject<Block> HEATED_CRYSTAL_ORE = registerBlock("heated_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(10, 9).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> DEEPSLATE_HEATED_CRYSTAL_ORE = registerBlock("deepslate_heated_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(10, 9).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> HEATED_CRYSTAL_BLOCK = registerBlock("heated_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));



    public static final RegistryObject<Block> PEARL_CRYSTAL_ORE = registerBlock("pearl_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(10, 9).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> DEEPSLATE_PEARL_CRYSTAL_ORE = registerBlock("deepslate_pearl_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(10, 9).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> PEARL_CRYSTAL_BLOCK = registerBlock("pearl_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));



    public static final RegistryObject<Block> SHIFTING_CRYSTAL_ORE = registerBlock("shifting_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(10, 9).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> DEEPSLATE_SHIFTING_CRYSTAL_ORE = registerBlock("deepslate_shifting_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(10, 9).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> SHIFTING_CRYSTAL_BLOCK = registerBlock("shifting_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));



    public static final RegistryObject<Block> JAGGED_STONE_ORE = registerBlock("jagged_stone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(10, 9).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> DEEPSLATE_JAGGED_STONE_ORE = registerBlock("deepslate_jagged_stone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(10, 9).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> JAGGED_STONE_BLOCK = registerBlock("jagged_stone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));



    public static final RegistryObject<Block> GLITCHED_STONE_BLOCK = registerBlock("glitched_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(10, 9).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> INFUSED_GLITCHED_STONE_BLOCK = registerBlock("infused_glitched_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(10, 9).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> AMPLIFIED_PORTAL_BLOCK = registerBlock("amplified_portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> AMPLIFIED_PORTAL_END_BLOCK = registerBlock("amplified_portal_end_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> ASTHENO_PORTAL_BLOCK = registerBlock("astheno_portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> ASTHENO_NETHER_PORTAL_BLOCK = registerBlock("astheno_nether_portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> DEFAULT_PORTAL_BLOCK = registerBlock("default_portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

//    public static final RegistryObject<Block> LARGEBIOMES_PORTAL_BLOCK = registerBlock("largebiomes_portal_block",
//            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> LITHO_PORTAL_BLOCK = registerBlock("litho_portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> LITHO_NETHER_PORTAL_BLOCK = registerBlock("litho_nether_portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> MESO_PORTAL_BLOCK = registerBlock("meso_portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> MESO_PORTAL_END_BLOCK = registerBlock("meso_portal_end_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> MESO_NETHER_PORTAL_BLOCK = registerBlock("meso_nether_portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> EXO_PORTAL_BLOCK = registerBlock("exo_portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> EXO_PORTAL_END_BLOCK = registerBlock("exo_portal_end_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> EXO_NETHER_PORTAL_BLOCK = registerBlock("exo_nether_portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> STRATO_PORTAL_BLOCK = registerBlock("strato_portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> STRATO_PORTAL_END_BLOCK = registerBlock("strato_portal_end_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> STRATO_NETHER_PORTAL_BLOCK = registerBlock("strato_nether_portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> OGSTRATO_PORTAL_BLOCK = registerBlock("ogstrato_portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> OGSTRATO_PORTAL_END_BLOCK = registerBlock("ogstrato_portal_end_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> OGSTRATO_NETHER_PORTAL_BLOCK = registerBlock("ogstrato_nether_portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> THERMO_PORTAL_BLOCK = registerBlock("thermo_portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> THERMO_PORTAL_END_BLOCK = registerBlock("thermo_portal_end_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> THERMO_NETHER_PORTAL_BLOCK = registerBlock("thermo_nether_portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> TROPO_PORTAL_BLOCK = registerBlock("tropo_portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> TROPO_PORTAL_END_BLOCK = registerBlock("tropo_portal_end_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> TROPO_NETHER_PORTAL_BLOCK = registerBlock("tropo_nether_portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
