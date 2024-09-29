package net.architects.skylandscore;

import com.mojang.logging.LogUtils;
import net.architects.skylandscore.block.ModBlocks;
import net.architects.skylandscore.entity.ModEntities;
import net.architects.skylandscore.entity.client.StoneOrbRenderer;
import net.architects.skylandscore.fluid.ModFluidTypes;
import net.architects.skylandscore.fluid.ModFluids;
import net.architects.skylandscore.item.ModCreativeModTabs;
import net.architects.skylandscore.item.ModItems;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.Random;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(EcoPortalsMod.MOD_ID)
public class EcoPortalsMod {
    public static final String MOD_ID = "skylandscore";
    public static final Logger LOGGER = LogUtils.getLogger();

    private Random rand = new Random();

    public EcoPortalsMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModCreativeModTabs.register(modEventBus);
        modEventBus.addListener(this::addPortals);

        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
//            SpawnPlacements.register(ModEntities.STONE_ORB.get(),
//                    SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
//                    Animal::checkAnimalSpawnRules);


        });
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    private void addPortals(final FMLCommonSetupEvent event){
//        addPortalVert(BOPBlocks.REDWOOD_LOG.get(), Items.DIAMOND, 189, 50, 44, "ecosphericalexpansion:amplified");
//        addPortalVert(BOPBlocks.FIR_LOG.get(), Items.DIAMOND, 160, 149, 123, "ecosphericalexpansion:default");
//        addPortalVert(BOPBlocks.PALM_LOG.get(), Items.DIAMOND, 192, 135, 58, "ecosphericalexpansion:largebiomes");
//        addPortalVert(BOPBlocks.DEAD_LOG.get(), Items.DIAMOND, 135, 129, 120, "ecosphericalexpansion:asthenospherical");
//        addPortalVert(Blocks.WARPED_STEM, Items.DIAMOND, 59, 153, 151, "ecosphericalexpansion:asthenosphericalnether");
//        addPortalVert(BOPBlocks.MAHOGANY_LOG.get(), Items.DIAMOND, 185, 116, 136, "ecosphericalexpansion:lithospherical");
//        addPortalVert(BOPBlocks.BRIMSTONE.get(), Items.DIAMOND, 196, 133, 45, "ecosphericalexpansion:lithosphericalnether");
//        addPortalVert(BOPBlocks.JACARANDA_LOG.get(), Items.DIAMOND, 225, 218, 225, "ecosphericalexpansion:mesospherical");
//        addPortalVert(Blocks.CRIMSON_STEM, Items.DIAMOND, 137, 57, 91, "ecosphericalexpansion:mesosphericalnether");
//        addPortalVert(BOPBlocks.UMBRAN_LOG.get(), Items.DIAMOND, 67, 69, 107, "ecosphericalexpansion:stratospherical");
//        addPortalVert(BOPBlocks.HELLBARK_LOG.get(), Items.DIAMOND, 55, 44, 44, "ecosphericalexpansion:stratosphericalnether");
//        addPortalVert(BOPBlocks.WILLOW_LOG.get(), Items.DIAMOND, 147, 161, 119, "ecosphericalexpansion:thermospherical");
//        addPortalVert(BOPBlocks.ROSE_QUARTZ_BLOCK.get(), Items.DIAMOND, 204, 45, 87, "ecosphericalexpansion:thermosphericalnether");
//        addPortalVert(BOPBlocks.MAGIC_LOG.get(), Items.DIAMOND, 70, 106, 180, "ecosphericalexpansion:tropospherical");
//        addPortalVert(BOPBlocks.FLESH.get(), Items.DIAMOND, 128, 46, 37, "ecosphericalexpansion:troposphericalnether");
//

//        addPortalVertFluid(ModBlocks.AMPLIFIED_PORTAL_BLOCK.get(), Fluids.WATER, 189, 50, 44, "ecosphericalexpansion:amplified");
//        addPortalVertFluid(ModBlocks.DEFAULT_PORTAL_BLOCK.get(), Fluids.WATER, 160, 149, 123, "ecosphericalexpansion:default");
//        addPortalVertFluid(ModBlocks.LARGEBIOMES_PORTAL_BLOCK.get(), Fluids.WATER, 192, 135, 58, "ecosphericalexpansion:largebiomes");
//        addPortalFlatFluid(ModBlocks.ASTHENO_PORTAL_BLOCK.get(), Fluids.WATER, 135, 129, 120, "ecosphericalexpansion:asthenospherical");
//        addPortalFlatFluid(ModBlocks.ASTHENO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 59, 153, 151, "ecosphericalexpansion:asthenosphericalnether");
//        addPortalFlatFluid(ModBlocks.LITHO_PORTAL_BLOCK.get(), Fluids.WATER, 185, 116, 136, "ecosphericalexpansion:lithospherical");
//        addPortalFlatFluid(ModBlocks.LITHO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 196, 133, 45, "ecosphericalexpansion:lithosphericalnether");
//        addPortalVertFluid(ModBlocks.MESO_PORTAL_BLOCK.get(), Fluids.WATER, 225, 218, 225, "ecosphericalexpansion:mesospherical");
//        addPortalVertFluid(ModBlocks.MESO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 137, 57, 91, "ecosphericalexpansion:mesosphericalnether");
//        addPortalVertFluid(ModBlocks.STRATO_PORTAL_BLOCK.get(), Fluids.WATER, 67, 69, 107, "ecosphericalexpansion:stratospherical");
//        addPortalVertFluid(ModBlocks.STRATO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 55, 44, 44, "ecosphericalexpansion:stratosphericalnether");
//        addPortalVertFluid(ModBlocks.THERMO_PORTAL_BLOCK.get(), Fluids.WATER, 147, 161, 119, "ecosphericalexpansion:thermospherical");
//        addPortalVertFluid(ModBlocks.THERMO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 204, 45, 87, "ecosphericalexpansion:thermosphericalnether");
//        addPortalVertFluid(ModBlocks.TROPO_PORTAL_BLOCK.get(), Fluids.WATER, 70, 106, 180, "ecosphericalexpansion:tropospherical");
//        addPortalVertFluid(ModBlocks.TROPO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 128, 46, 37, "ecosphericalexpansion:troposphericalnether");
//        addPortalVertFluid(ModBlocks.OVERWORLD_PORTAL_BLOCK.get(), Fluids.WATER, 70, 106, 180, "minecraft:overworld");


        //OG Strato (overworld)
        //Strato
        //Thermo
        //Meso
        //Tropo
        //Amplified
        //Large Biomes
        //Default
//        addPortalVertFluidProgresive(ModBlocks.OGSTRATO_PORTAL_BLOCK.get(), Fluids.WATER, 67, 69, 107, "skylandscore:ogstratospherical", "skylandscore:stratospherical");
//        addPortalVertFluidProgresive(ModBlocks.OGSTRATO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 55, 44, 44, "skylandscore:ogstratosphericalnether", "skylandscore:ogstratospherical");
//
//        addPortalVertFluidProgresive(ModBlocks.STRATO_PORTAL_BLOCK.get(), Fluids.WATER, 67, 69, 107, "skylandscore:stratospherical", "skylandscore:ogstratospherical");
//        addPortalVertFluidProgresive(ModBlocks.STRATO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 55, 44, 44, "skylandscore:stratosphericalnether", "skylandscore:stratospherical");
//
//        addPortalVertFluidProgresive(ModBlocks.THERMO_PORTAL_BLOCK.get(), Fluids.WATER, 147, 161, 119, "skylandscore:thermospherical", "skylandscore:stratospherical");
//        addPortalVertFluidProgresive(ModBlocks.THERMO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 204, 45, 87, "skylandscore:thermosphericalnether", "skylandscore:thermospherical");
//
//        addPortalVertFluidProgresive(ModBlocks.MESO_PORTAL_BLOCK.get(), Fluids.WATER, 225, 218, 225, "skylandscore:mesospherical", "skylandscore:thermospherical");
//        addPortalVertFluidProgresive(ModBlocks.MESO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 137, 57, 91, "skylandscore:mesosphericalnether", "skylandscore:mesospherical");
//
//        addPortalVertFluidProgresive(ModBlocks.EXO_PORTAL_BLOCK.get(), Fluids.WATER, 225, 218, 225, "skylandscore:mesospherical", "skylandscore:thermospherical");
//        addPortalVertFluidProgresive(ModBlocks.EXO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 137, 57, 91, "skylandscore:mesosphericalnether", "skylandscore:mesospherical");
//
//        addPortalVertFluidProgresive(ModBlocks.TROPO_PORTAL_BLOCK.get(), Fluids.WATER, 70, 106, 180, "skylandscore:tropospherical", "skylandscore:mesospherical");
//        addPortalVertFluidProgresive(ModBlocks.TROPO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 128, 46, 37, "skylandscore:troposphericalnether", "skylandscore:tropospherical");
//
//        addPortalVertFluidProgresive(ModBlocks.AMPLIFIED_PORTAL_BLOCK.get(), Fluids.WATER, 189, 50, 44, "skylandscore:amplified", "skylandscore:tropospherical");
//
////        addPortalVertFluidProgresive(ModBlocks.LARGEBIOMES_PORTAL_BLOCK.get(), Fluids.WATER, 192, 135, 58, "skylandscore:largebiomes", "skylandscore:amplified");
//
//        addPortalVertFluidProgresive(ModBlocks.DEFAULT_PORTAL_BLOCK.get(), Fluids.WATER, 160, 149, 123, "skylandscore:default", "skylandscore:largebiomes");

//        addPortalVertFluidProgresive(ModBlocks.AMPLIFIED_PORTAL_BLOCK.get(), Fluids.WATER, 189, 50, 44, "skylandscore:amplified");

//        addPortalVertFluid(ModBlocks.LARGEBIOMES_PORTAL_BLOCK.get(), Fluids.WATER, 192, 135, 58, "skylandscore:largebiomes", "skylandscore:amplified");

//        addPortalVertFluid(ModBlocks.DEFAULT_PORTAL_BLOCK.get(), Fluids.WATER, 160, 149, 123, "skylandscore:default");



//        addPortalFlatFluidProgresive(ModBlocks.ASTHENO_PORTAL_BLOCK.get(), Fluids.WATER, 135, 129, 120, "skylandscore:asthenospherical");
//        addPortalFlatFluidProgresive(ModBlocks.ASTHENO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 59, 153, 151, "skylandscore:asthenosphericalnether");
//        addPortalFlatFluidProgresive(ModBlocks.LITHO_PORTAL_BLOCK.get(), Fluids.WATER, 185, 116, 136, "skylandscore:lithospherical");
//        addPortalFlatFluidProgresive(ModBlocks.LITHO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 196, 133, 45, "skylandscore:lithosphericalnether");
//


//        addPortalVertFluidProgresive(ModBlocks.OGSTRATO_PORTAL_END_BLOCK.get(), Fluids.WATER, randColor() randColor(), randColor(),"skylandscore:end", "skylandscore:ogstratospherical");
//        addPortalVertFluidProgresive(ModBlocks.OGSTRATO_PORTAL_BLOCK.get(), Fluids.WATER, randColor() randColor(), randColor(),"skylandscore:ogstratospherical", "skylandscore:stratospherical");
//        addPortalVertFluidProgresive(ModBlocks.OGSTRATO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, randColor() randColor(), randColor(),"skylandscore:ogstratosphericalnether", "skylandscore:ogstratospherical");
//
//        addPortalVertFluidProgresive(ModBlocks.STRATO_PORTAL_END_BLOCK.get(), Fluids.WATER, randColor() randColor(), randColor(),"skylandscore:end", "skylandscore:stratospherical");
//        addPortalVertFluidProgresive(ModBlocks.STRATO_PORTAL_BLOCK.get(), Fluids.WATER, randColor() randColor(), randColor(),"skylandscore:stratospherical", "skylandscore:thermospherical");
//        addPortalVertFluidProgresive(ModBlocks.STRATO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, randColor() randColor(), randColor(),"skylandscore:stratosphericalnether", "skylandscore:stratospherical");
//
//        addPortalVertFluidProgresive(ModBlocks.THERMO_PORTAL_END_BLOCK.get(), Fluids.WATER, randColor() randColor(), randColor(),"skylandscore:end", "skylandscore:thermospherical");
//        addPortalVertFluidProgresive(ModBlocks.THERMO_PORTAL_BLOCK.get(), Fluids.WATER, randColor() randColor(), randColor(),"skylandscore:thermospherical", "skylandscore:mesospherical");
//        addPortalVertFluidProgresive(ModBlocks.THERMO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 204, 45, 87, "skylandscore:thermosphericalnether", "skylandscore:thermospherical");
//
//        addPortalVertFluidProgresive(ModBlocks.MESO_PORTAL_END_BLOCK.get(), Fluids.WATER, randColor() randColor(), randColor(),"skylandscore:end", "skylandscore:mesospherical");
//        addPortalVertFluidProgresive(ModBlocks.MESO_PORTAL_BLOCK.get(), Fluids.WATER, randColor() randColor(), randColor(),"skylandscore:mesospherical", "skylandscore:exospherical");
//        addPortalVertFluidProgresive(ModBlocks.MESO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, randColor() randColor(), randColor(),"skylandscore:mesosphericalnether", "skylandscore:mesospherical");
//
//        addPortalVertFluidProgresive(ModBlocks.EXO_PORTAL_END_BLOCK.get(), Fluids.WATER, randColor() randColor(), randColor(),"skylandscore:end", "skylandscore:exospherical");
//        addPortalVertFluidProgresive(ModBlocks.EXO_PORTAL_BLOCK.get(), Fluids.WATER, randColor() randColor(), randColor(),"skylandscore:exospherical", "skylandscore:tropospherical");
//        addPortalVertFluidProgresive(ModBlocks.EXO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, randColor() randColor(), randColor(),"skylandscore:exosphericalnether", "skylandscore:exospherical");
//
//        addPortalVertFluidProgresive(ModBlocks.TROPO_PORTAL_END_BLOCK.get(), Fluids.WATER, randColor() randColor(), randColor(),"skylandscore:end", "skylandscore:tropospherical");
//        addPortalVertFluidProgresive(ModBlocks.TROPO_PORTAL_BLOCK.get(), Fluids.WATER, randColor() randColor(), randColor(),"skylandscore:tropospherical", "skylandscore:amplified");
//        addPortalVertFluidProgresive(ModBlocks.TROPO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, randColor() randColor(), randColor(),"skylandscore:troposphericalnether", "skylandscore:tropospherical");
//
//        addPortalVertFluidProgresive(ModBlocks.AMPLIFIED_PORTAL_END_BLOCK.get(), Fluids.WATER, randColor() randColor(), randColor(),"skylandscore:end", "skylandscore:amplified");
//

//        addPortalVertProgresive(ModBlocks.OGSTRATO_PORTAL_END_BLOCK.get(), ModItems.STRATIFIED_STONE_TABLET.get(), 67, 69, 107, "minecraft:the_end", "minecraft:overworld");
//        addPortalVertProgresive(ModBlocks.OGSTRATO_PORTAL_BLOCK.get(), ModItems.STRATIFIED_DRAGON_ESSENCE.get(), 67, 69, 107, "minecraft:overworld", "skylandscore:stratospherical");
////        addPortalVertProgresive(ModBlocks.OGSTRATO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 55, 44, 44, "skylandscore:ogstratosphericalnether", "skylandscore:ogstratospherical");
//
//        addPortalVertProgresive(ModBlocks.STRATO_PORTAL_END_BLOCK.get(), ModItems.LAMINATED_CRYSTAL_TABLET.get(), 67, 69, 107, "minecraft:the_end", "skylandscore:stratospherical");
//        addPortalVertProgresive(ModBlocks.STRATO_PORTAL_BLOCK.get(), ModItems.LAMINATED_DRAGON_ESSENCE.get(), 67, 69, 107, "skylandscore:stratospherical", "skylandscore:exospherical");
//        addPortalVertFluidProgresive(ModBlocks.STRATO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 55, 44, 44, "skylandscore:stratosphericalnether", "skylandscore:stratospherical");
//
//        addPortalVertProgresive(ModBlocks.EXO_PORTAL_END_BLOCK.get(), ModItems.POCKED_CRYSTAL_TABLET.get(), 67, 69, 107, "minecraft:the_end", "skylandscore:exospherical");
//        addPortalVertProgresive(ModBlocks.EXO_PORTAL_BLOCK.get(), ModItems.POCKED_DRAGON_ESSENCE.get(), 225, 218, 225, "skylandscore:exospherical", "skylandscore:thermospherical");
//        addPortalVertFluidProgresive(ModBlocks.EXO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 137, 57, 91, "skylandscore:exosphericalnether", "skylandscore:exospherical");
//
//        addPortalVertProgresive(ModBlocks.THERMO_PORTAL_END_BLOCK.get(), ModItems.HEATED_CRYSTAL_TABLET.get(), 67, 69, 107, "minecraft:the_end", "skylandscore:thermospherical");
//        addPortalVertProgresive(ModBlocks.THERMO_PORTAL_BLOCK.get(), ModItems.HEATED_DRAGON_ESSENCE.get(), 147, 161, 119, "skylandscore:thermospherical", "skylandscore:mesospherical");
//        addPortalVertFluidProgresive(ModBlocks.THERMO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 204, 45, 87, "skylandscore:thermosphericalnether", "skylandscore:thermospherical");
//
//        addPortalVertProgresive(ModBlocks.MESO_PORTAL_END_BLOCK.get(), ModItems.PEARL_CRYSTAL_TABLET.get(), 67, 69, 107, "minecraft:the_end", "skylandscore:mesospherical");
//        addPortalVertProgresive(ModBlocks.MESO_PORTAL_BLOCK.get(), ModItems.PEARL_DRAGON_ESSENCE.get(), 225, 218, 225, "skylandscore:mesospherical", "skylandscore:tropospherical");
//        addPortalVertFluidProgresive(ModBlocks.MESO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 137, 57, 91, "skylandscore:mesosphericalnether", "skylandscore:mesospherical");
//
//        addPortalVertProgresive(ModBlocks.TROPO_PORTAL_END_BLOCK.get(), ModItems.SHIFTING_CRYSTAL_TABLET.get(), 67, 69, 107, "minecraft:the_end", "skylandscore:tropospherical");
//        addPortalVertProgresive(ModBlocks.TROPO_PORTAL_BLOCK.get(), ModItems.SHIFTING_DRAGON_ESSENCE.get(), 70, 106, 180, "skylandscore:tropospherical", "skylandscore:amplified");
//        addPortalVertFluidProgresive(ModBlocks.TROPO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 128, 46, 37, "skylandscore:troposphericalnether", "skylandscore:tropospherical");
//
//        addPortalVertProgresive(ModBlocks.AMPLIFIED_PORTAL_END_BLOCK.get(), ModItems.JAGGED_STONE_TABLET.get(), 67, 69, 107, "minecraft:the_end","skylandscore:amplified");


        addPortalVertProgresive(ModBlocks.OGSTRATO_PORTAL_END_BLOCK.get(), ModItems.STRATIFIED_STONE_TABLET.get(), 150, 0, 15, "minecraft:the_end", "minecraft:overworld");
        addPortalVertProgresive(ModBlocks.OGSTRATO_PORTAL_BLOCK.get(), ModItems.STRATIFIED_DRAGON_ESSENCE.get(), 150, 0, 15, "minecraft:overworld", "skylandscore:stratospherical");
//        addPortalVertProgresive(ModBlocks.OGSTRATO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 55, 44, 44, "skylandscore:ogstratosphericalnether", "skylandscore:ogstratospherical");

        addPortalVertProgresive(ModBlocks.STRATO_PORTAL_END_BLOCK.get(), ModItems.LAMINATED_CRYSTAL_TABLET.get(), 190, 90, 0, "minecraft:the_end", "skylandscore:stratospherical");
        addPortalVertProgresive(ModBlocks.STRATO_PORTAL_BLOCK.get(), ModItems.LAMINATED_DRAGON_ESSENCE.get(), 190, 90, 0, "skylandscore:stratospherical", "skylandscore:exospherical");
        addPortalVertFluidProgresive(ModBlocks.STRATO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 190, 90, 0, "skylandscore:stratosphericalnether", "skylandscore:stratospherical");

        addPortalVertProgresive(ModBlocks.EXO_PORTAL_END_BLOCK.get(), ModItems.POCKED_CRYSTAL_TABLET.get(), 147, 140, 0, "minecraft:the_end", "skylandscore:exospherical");
        addPortalVertProgresive(ModBlocks.EXO_PORTAL_BLOCK.get(), ModItems.POCKED_DRAGON_ESSENCE.get(), 147, 140, 0, "skylandscore:exospherical", "skylandscore:thermospherical");
        addPortalVertFluidProgresive(ModBlocks.EXO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 147, 140, 0, "skylandscore:exosphericalnether", "skylandscore:exospherical");

        addPortalVertProgresive(ModBlocks.THERMO_PORTAL_END_BLOCK.get(), ModItems.HEATED_CRYSTAL_TABLET.get(), 147, 140, 0, "minecraft:the_end", "skylandscore:thermospherical");
        addPortalVertProgresive(ModBlocks.THERMO_PORTAL_BLOCK.get(), ModItems.HEATED_DRAGON_ESSENCE.get(), 147, 140, 0, "skylandscore:thermospherical", "skylandscore:mesospherical");
        addPortalVertFluidProgresive(ModBlocks.THERMO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 147, 140, 0, "skylandscore:thermosphericalnether", "skylandscore:thermospherical");

        addPortalVertProgresive(ModBlocks.MESO_PORTAL_END_BLOCK.get(), ModItems.PEARL_CRYSTAL_TABLET.get(), 3, 53, 250, "minecraft:the_end", "skylandscore:mesospherical");
        addPortalVertProgresive(ModBlocks.MESO_PORTAL_BLOCK.get(), ModItems.PEARL_DRAGON_ESSENCE.get(), 3, 53, 250, "skylandscore:mesospherical", "skylandscore:tropospherical");
        addPortalVertFluidProgresive(ModBlocks.MESO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 3, 53, 250, "skylandscore:mesosphericalnether", "skylandscore:mesospherical");

        addPortalVertProgresive(ModBlocks.TROPO_PORTAL_END_BLOCK.get(), ModItems.SHIFTING_CRYSTAL_TABLET.get(), 103, 10, 166, "minecraft:the_end", "skylandscore:tropospherical");
        addPortalVertProgresive(ModBlocks.TROPO_PORTAL_BLOCK.get(), ModItems.SHIFTING_DRAGON_ESSENCE.get(), 103, 10, 166, "skylandscore:tropospherical", "skylandscore:amplified");
        addPortalVertFluidProgresive(ModBlocks.TROPO_NETHER_PORTAL_BLOCK.get(), Fluids.LAVA, 103, 10, 166, "skylandscore:troposphericalnether", "skylandscore:tropospherical");

        addPortalVertProgresive(ModBlocks.AMPLIFIED_PORTAL_END_BLOCK.get(), ModItems.JAGGED_STONE_TABLET.get(), 107, 3, 132, "minecraft:the_end","skylandscore:amplified");


    }

    private int randColor() {
        return rand.nextInt(255);
    }
    private void addPortalVert(Block block, Item item, int r, int g, int b, String dimension){
        CustomPortalBuilder.beginPortal()
// Sets the frame block to Diamond blocks,
// Can use registered Block or Resource Location
                .frameBlock(block)
// Sets the lighting item to an Ender Eye
// Can use lightWithWater() instead to use water
// Can use lightWithFluid(MyFluids.CUSTOMFLUID) instead to use a custom Fluid
                .lightWithItem(item)
// Tells the portal to go the dim, in case The End
                .destDimID(new ResourceLocation(dimension))
// What RGB color to make the portal
                .tintColor(r,g,b)
// Registers the portal
                .registerPortal();
    }

    private void addPortalVertProgresive(Block block, Item item, int r, int g, int b, String destDimension, String returnDimension){
        CustomPortalBuilder.beginPortal()
// Sets the frame block to Diamond blocks,
// Can use registered Block or Resource Location
                .frameBlock(block)
// Sets the lighting item to an Ender Eye
// Can use lightWithWater() instead to use water
// Can use lightWithFluid(MyFluids.CUSTOMFLUID) instead to use a custom Fluid
                .lightWithItem(item)
                .returnDim(new ResourceLocation(returnDimension), true)
// Tells the portal to go the dim, in case The End
                .destDimID(new ResourceLocation(destDimension))
// What RGB color to make the portal
                .tintColor(r,g,b)
// Registers the portal
                .registerPortal();
    }

    private void addPortalFlat(Block block, Item item, int r, int g, int b, String dimension){
        CustomPortalBuilder.beginPortal()
// Sets the frame block to Diamond blocks,
// Can use registered Block or Resource Location
                .frameBlock(block)
// Sets the lighting item to an Ender Eye
// Can use lightWithWater() instead to use water
// Can use lightWithFluid(MyFluids.CUSTOMFLUID) instead to use a custom Fluid
                .lightWithItem(item)
                .flatPortal()
// Tells the portal to go the dim, in case The End
                .destDimID(new ResourceLocation(dimension))
// What RGB color to make the portal
                .tintColor(r,g,b)
// Registers the portal
                .registerPortal();
    }

    private void addPortalVertFluidProgresive(Block block, Fluid fluid, int r, int g, int b, String destDimension, String returnDimension){
        CustomPortalBuilder.beginPortal()
// Sets the frame block to Diamond blocks,
// Can use registered Block or Resource Location
                .frameBlock(block)
// Sets the lighting item to an Ender Eye
// Can use lightWithWater() instead to use water
// Can use lightWithFluid(MyFluids.CUSTOMFLUID) instead to use a custom Fluid
                .lightWithFluid(fluid)
                .returnDim(new ResourceLocation(returnDimension), true)
// Tells the portal to go the dim, in case The End
                .destDimID(new ResourceLocation(destDimension))
// What RGB color to make the portal
                .tintColor(r,g,b)
// Registers the portal
                .registerPortal();
    }

    private void addPortalFlatFluidProgresive(Block block, Fluid fluid, int r, int g, int b, String destDimension, String returnDimension){
        CustomPortalBuilder.beginPortal()
// Sets the frame block to Diamond blocks,
// Can use registered Block or Resource Location
                .frameBlock(block)
// Sets the lighting item to an Ender Eye
// Can use lightWithWater() instead to use water
// Can use lightWithFluid(MyFluids.CUSTOMFLUID) instead to use a custom Fluid
                .lightWithFluid(fluid)
                .returnDim(new ResourceLocation(returnDimension), true)
                .flatPortal()
// Tells the portal to go the dim, in case The End
                .destDimID(new ResourceLocation(destDimension))
// What RGB color to make the portal
                .tintColor(r,g,b)
// Registers the portal
                .registerPortal();
    }


    private void addPortalVertFluid(Block block, Fluid fluid, int r, int g, int b, String dimension){
        CustomPortalBuilder.beginPortal()
// Sets the frame block to Diamond blocks,
// Can use registered Block or Resource Location
                .frameBlock(block)
// Sets the lighting item to an Ender Eye
// Can use lightWithWater() instead to use water
// Can use lightWithFluid(MyFluids.CUSTOMFLUID) instead to use a custom Fluid
                .lightWithFluid(fluid)
// Tells the portal to go the dim, in case The End
                .destDimID(new ResourceLocation(dimension))
// What RGB color to make the portal
                .tintColor(r,g,b)
// Registers the portal
                .registerPortal();
    }

    private void addPortalFlatFluid(Block block, Fluid fluid, int r, int g, int b, String dimension){
        CustomPortalBuilder.beginPortal()
// Sets the frame block to Diamond blocks,
// Can use registered Block or Resource Location
                .frameBlock(block)
// Sets the lighting item to an Ender Eye
// Can use lightWithWater() instead to use water
// Can use lightWithFluid(MyFluids.CUSTOMFLUID) instead to use a custom Fluid
                .lightWithFluid(fluid)
                .flatPortal()
// Tells the portal to go the dim, in case The End
                .destDimID(new ResourceLocation(dimension))
// What RGB color to make the portal
                .tintColor(r,g,b)
// Registers the portal
                .registerPortal();
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_OBSIDIAN_TEARS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_OBSIDIAN_TEARS.get(), RenderType.translucent());
        }
    }

}
