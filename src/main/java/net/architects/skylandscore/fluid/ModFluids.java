package net.architects.skylandscore.fluid;

import net.architects.skylandscore.EcoPortalsMod;
import net.architects.skylandscore.block.ModBlocks;
import net.architects.skylandscore.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, EcoPortalsMod.MOD_ID);

    //Obsidian Tears
    public static final RegistryObject<FlowingFluid> SOURCE_OBSIDIAN_TEARS = FLUIDS.register("obsidian_tears_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.OBSIDIAN_TEARS_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_OBSIDIAN_TEARS = FLUIDS.register("flowing_obsidian_tears",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.OBSIDIAN_TEARS_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties OBSIDIAN_TEARS_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.OBSIDIAN_TEARS_FLUID_TYPE, SOURCE_OBSIDIAN_TEARS, FLOWING_OBSIDIAN_TEARS)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.OBSIDIAN_TEARS_BLOCK)
            .bucket(ModItems.OBSIDIAN_TEARS_BUCKET);


    //Red Dragon Essence
    public static final RegistryObject<FlowingFluid> SOURCE_RED_DRAGON_ESSENCE = FLUIDS.register("red_dragon_essence_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.RED_DRAGON_ESSENCE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_RED_DRAGON_ESSENCE = FLUIDS.register("flowing_red_dragon_essence",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.RED_DRAGON_ESSENCE_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties RED_DRAGON_ESSENCE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.RED_DRAGON_ESSENCE_FLUID_TYPE, SOURCE_RED_DRAGON_ESSENCE, FLOWING_RED_DRAGON_ESSENCE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.RED_DRAGON_ESSENCE_BLOCK)
            .bucket(ModItems.RED_DRAGON_ESSENCE_BUCKET);


    //Orange Dragon Essence
    public static final RegistryObject<FlowingFluid> SOURCE_ORANGE_DRAGON_ESSENCE = FLUIDS.register("orange_dragon_essence_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.ORANGE_DRAGON_ESSENCE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_ORANGE_DRAGON_ESSENCE = FLUIDS.register("flowing_orange_dragon_essence",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.ORANGE_DRAGON_ESSENCE_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties ORANGE_DRAGON_ESSENCE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.ORANGE_DRAGON_ESSENCE_FLUID_TYPE, SOURCE_ORANGE_DRAGON_ESSENCE, FLOWING_ORANGE_DRAGON_ESSENCE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.ORANGE_DRAGON_ESSENCE_BLOCK)
            .bucket(ModItems.ORANGE_DRAGON_ESSENCE_BUCKET);


    //Yellow Dragon Essence
    public static final RegistryObject<FlowingFluid> SOURCE_YELLOW_DRAGON_ESSENCE = FLUIDS.register("yellow_dragon_essence_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.YELLOW_DRAGON_ESSENCE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_YELLOW_DRAGON_ESSENCE = FLUIDS.register("flowing_yellow_dragon_essence",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.YELLOW_DRAGON_ESSENCE_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties YELLOW_DRAGON_ESSENCE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.YELLOW_DRAGON_ESSENCE_FLUID_TYPE, SOURCE_YELLOW_DRAGON_ESSENCE, FLOWING_YELLOW_DRAGON_ESSENCE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.YELLOW_DRAGON_ESSENCE_BLOCK)
            .bucket(ModItems.YELLOW_DRAGON_ESSENCE_BUCKET);


    //Green Dragon Essence
    public static final RegistryObject<FlowingFluid> SOURCE_GREEN_DRAGON_ESSENCE = FLUIDS.register("green_dragon_essence_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.GREEN_DRAGON_ESSENCE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_GREEN_DRAGON_ESSENCE = FLUIDS.register("flowing_green_dragon_essence",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.GREEN_DRAGON_ESSENCE_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties GREEN_DRAGON_ESSENCE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.GREEN_DRAGON_ESSENCE_FLUID_TYPE, SOURCE_GREEN_DRAGON_ESSENCE, FLOWING_GREEN_DRAGON_ESSENCE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.GREEN_DRAGON_ESSENCE_BLOCK)
            .bucket(ModItems.GREEN_DRAGON_ESSENCE_BUCKET);


    //Blue Dragon Essence
    public static final RegistryObject<FlowingFluid> SOURCE_BLUE_DRAGON_ESSENCE = FLUIDS.register("blue_dragon_essence_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.BLUE_DRAGON_ESSENCE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_BLUE_DRAGON_ESSENCE = FLUIDS.register("flowing_blue_dragon_essence",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.BLUE_DRAGON_ESSENCE_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties BLUE_DRAGON_ESSENCE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.BLUE_DRAGON_ESSENCE_FLUID_TYPE, SOURCE_BLUE_DRAGON_ESSENCE, FLOWING_BLUE_DRAGON_ESSENCE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.BLUE_DRAGON_ESSENCE_BLOCK)
            .bucket(ModItems.BLUE_DRAGON_ESSENCE_BUCKET);


    //Purple Dragon Essence
    public static final RegistryObject<FlowingFluid> SOURCE_PURPLE_DRAGON_ESSENCE = FLUIDS.register("purple_dragon_essence_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.PURPLE_DRAGON_ESSENCE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_PURPLE_DRAGON_ESSENCE = FLUIDS.register("flowing_purple_dragon_essence",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.PURPLE_DRAGON_ESSENCE_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties PURPLE_DRAGON_ESSENCE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.PURPLE_DRAGON_ESSENCE_FLUID_TYPE, SOURCE_PURPLE_DRAGON_ESSENCE, FLOWING_PURPLE_DRAGON_ESSENCE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.PURPLE_DRAGON_ESSENCE_BLOCK)
            .bucket(ModItems.PURPLE_DRAGON_ESSENCE_BUCKET);


    //Magenta Dragon Essence
    public static final RegistryObject<FlowingFluid> SOURCE_MAGENTA_DRAGON_ESSENCE = FLUIDS.register("magenta_dragon_essence_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MAGENTA_DRAGON_ESSENCE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MAGENTA_DRAGON_ESSENCE = FLUIDS.register("flowing_magenta_dragon_essence",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MAGENTA_DRAGON_ESSENCE_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties MAGENTA_DRAGON_ESSENCE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MAGENTA_DRAGON_ESSENCE_FLUID_TYPE, SOURCE_MAGENTA_DRAGON_ESSENCE, FLOWING_MAGENTA_DRAGON_ESSENCE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MAGENTA_DRAGON_ESSENCE_BLOCK)
            .bucket(ModItems.MAGENTA_DRAGON_ESSENCE_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}