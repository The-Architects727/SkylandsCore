package net.architects.skylandscore.fluid;

import net.architects.skylandscore.EcoPortalsMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class ModFluidTypes {

    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");



    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, EcoPortalsMod.MOD_ID);


    // Obsidian Tears
    public static final ResourceLocation SOAP_OVERLAY_RL = new ResourceLocation(EcoPortalsMod.MOD_ID, "misc/in_obsidian_tears");

    public static final RegistryObject<FluidType> OBSIDIAN_TEARS_FLUID_TYPE = register("obsidian_tears_fluid",
            FluidType.Properties.create().lightLevel(11).canExtinguish(true).canDrown(true).canSwim(true).density(10).viscosity(3).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK), SOAP_OVERLAY_RL, 0xFF8800FF, 151f, 0f, 250f);



    // Red Dragon Essence
    public static final ResourceLocation RED_DRAGON_ESSENCE_OVERLAY_RL = new ResourceLocation(EcoPortalsMod.MOD_ID, "misc/in_red_dragon_essence");

    public static final RegistryObject<FluidType> RED_DRAGON_ESSENCE_FLUID_TYPE = register("red_dragon_essence_fluid",
            FluidType.Properties.create().lightLevel(11).canExtinguish(true).canDrown(true).canSwim(true).density(10).viscosity(3).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK), RED_DRAGON_ESSENCE_OVERLAY_RL, 0xA196040E, 150f, 0f, 15f);


    // Orange Dragon Essence
    public static final ResourceLocation ORANGE_DRAGON_ESSENCE_OVERLAY_RL = new ResourceLocation(EcoPortalsMod.MOD_ID, "misc/in_orange_dragon_essence");

    public static final RegistryObject<FluidType> ORANGE_DRAGON_ESSENCE_FLUID_TYPE = register("orange_dragon_essence_fluid",
            FluidType.Properties.create().lightLevel(11).canExtinguish(true).canDrown(true).canSwim(true).density(10).viscosity(3).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK), ORANGE_DRAGON_ESSENCE_OVERLAY_RL, 0xA1BB5A05, 190f, 90f, 0f);


    // Yellow Dragon Essence
    public static final ResourceLocation YELLOW_DRAGON_ESSENCE_OVERLAY_RL = new ResourceLocation(EcoPortalsMod.MOD_ID, "misc/in_yellow_dragon_essence");

    public static final RegistryObject<FluidType> YELLOW_DRAGON_ESSENCE_FLUID_TYPE = register("yellow_dragon_essence_fluid",
            FluidType.Properties.create().lightLevel(11).canExtinguish(true).canDrown(true).canSwim(true).density(10).viscosity(3).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK), YELLOW_DRAGON_ESSENCE_OVERLAY_RL, 0xA1938C04, 147f, 140f, 0f);


    // Green Dragon Essence
    public static final ResourceLocation GREEN_DRAGON_ESSENCE_OVERLAY_RL = new ResourceLocation(EcoPortalsMod.MOD_ID, "misc/in_green_dragon_essence");

    public static final RegistryObject<FluidType> GREEN_DRAGON_ESSENCE_FLUID_TYPE = register("green_dragon_essence_fluid",
            FluidType.Properties.create().lightLevel(11).canExtinguish(true).canDrown(true).canSwim(true).density(10).viscosity(3).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK), GREEN_DRAGON_ESSENCE_OVERLAY_RL, 0xA12F682D, 147f, 140f, 0f);


    // Blue Dragon Essence
    public static final ResourceLocation BLUE_DRAGON_ESSENCE_OVERLAY_RL = new ResourceLocation(EcoPortalsMod.MOD_ID, "misc/in_blue_dragon_essence");

    public static final RegistryObject<FluidType> BLUE_DRAGON_ESSENCE_FLUID_TYPE = register("blue_dragon_essence_fluid",
            FluidType.Properties.create().lightLevel(11).canExtinguish(true).canDrown(true).canSwim(true).density(10).viscosity(3).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK), BLUE_DRAGON_ESSENCE_OVERLAY_RL, 0xA10335FF, 3f, 53f, 250f);


    // Purple Dragon Essence
    public static final ResourceLocation PURPLE_DRAGON_ESSENCE_OVERLAY_RL = new ResourceLocation(EcoPortalsMod.MOD_ID, "misc/in_purple_dragon_essence");

    public static final RegistryObject<FluidType> PURPLE_DRAGON_ESSENCE_FLUID_TYPE = register("purple_dragon_essence_fluid",
            FluidType.Properties.create().lightLevel(11).canExtinguish(true).canDrown(true).canSwim(true).density(10).viscosity(3).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK), PURPLE_DRAGON_ESSENCE_OVERLAY_RL, 0xA1670AD8, 103f, 10f, 166f);


    // Magenta Dragon Essence
    public static final ResourceLocation MAGENTA_DRAGON_ESSENCE_OVERLAY_RL = new ResourceLocation(EcoPortalsMod.MOD_ID, "misc/in_magenta_dragon_essence");

    public static final RegistryObject<FluidType> MAGENTA_DRAGON_ESSENCE_FLUID_TYPE = register("magenta_dragon_essence_fluid",
            FluidType.Properties.create().lightLevel(11).canExtinguish(true).canDrown(true).canSwim(true).density(10).viscosity(3).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK), MAGENTA_DRAGON_ESSENCE_OVERLAY_RL, 0xA16B0384, 107f, 3f, 132f);







    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties, ResourceLocation SubmersionImage, int tintColor, float R, float G, float B) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, SubmersionImage,
                tintColor, new Vector3f(R / 255f, G / 255f, B / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}