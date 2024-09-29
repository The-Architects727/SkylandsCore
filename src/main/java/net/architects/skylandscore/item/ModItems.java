package net.architects.skylandscore.item;

import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import net.architects.skylandscore.EcoPortalsMod;
import net.architects.skylandscore.fluid.ModFluids;
import net.architects.skylandscore.item.custom.LorePage;
import net.architects.skylandscore.item.custom.OreExtractor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EcoPortalsMod.MOD_ID);



    public static final RegistryObject<Item> OBSIDIAN_TEARS_BUCKET = ITEMS.register("obsidian_tears_bucket",
            () -> new BucketItem(ModFluids.SOURCE_OBSIDIAN_TEARS,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));


    public static final RegistryObject<Item> RED_DRAGON_ESSENCE_BUCKET = ITEMS.register("red_dragon_essence_bucket",
            () -> new BucketItem(ModFluids.SOURCE_RED_DRAGON_ESSENCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));


    public static final RegistryObject<Item> ORANGE_DRAGON_ESSENCE_BUCKET = ITEMS.register("orange_dragon_essence_bucket",
            () -> new BucketItem(ModFluids.SOURCE_ORANGE_DRAGON_ESSENCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));


    public static final RegistryObject<Item> YELLOW_DRAGON_ESSENCE_BUCKET = ITEMS.register("yellow_dragon_essence_bucket",
            () -> new BucketItem(ModFluids.SOURCE_YELLOW_DRAGON_ESSENCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));


    public static final RegistryObject<Item> GREEN_DRAGON_ESSENCE_BUCKET = ITEMS.register("green_dragon_essence_bucket",
            () -> new BucketItem(ModFluids.SOURCE_GREEN_DRAGON_ESSENCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));


    public static final RegistryObject<Item> BLUE_DRAGON_ESSENCE_BUCKET = ITEMS.register("blue_dragon_essence_bucket",
            () -> new BucketItem(ModFluids.SOURCE_BLUE_DRAGON_ESSENCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));


    public static final RegistryObject<Item> PURPLE_DRAGON_ESSENCE_BUCKET = ITEMS.register("purple_dragon_essence_bucket",
            () -> new BucketItem(ModFluids.SOURCE_PURPLE_DRAGON_ESSENCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));


    public static final RegistryObject<Item> MAGENTA_DRAGON_ESSENCE_BUCKET = ITEMS.register("magenta_dragon_essence_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MAGENTA_DRAGON_ESSENCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));



    public static final RegistryObject<Item> STRATIFIED_DRAGON_ESSENCE = ITEMS.register("stratified_dragon_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LAMINATED_DRAGON_ESSENCE = ITEMS.register("laminated_dragon_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POCKED_DRAGON_ESSENCE = ITEMS.register("pocked_dragon_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HEATED_DRAGON_ESSENCE = ITEMS.register("heated_dragon_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PEARL_DRAGON_ESSENCE = ITEMS.register("pearl_dragon_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHIFTING_DRAGON_ESSENCE = ITEMS.register("shifting_dragon_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JAGGED_DRAGON_ESSENCE = ITEMS.register("jagged_dragon_essence",
            () -> new Item(new Item.Properties()));



    public static final RegistryObject<Item> CHARGED_EMERALD = ITEMS.register("charged_emerald",
            () -> new Item(new Item.Properties()));





    public static final RegistryObject<Item> STRATIFIED_DRAGON_UPGRADE_TEMPLATE = ITEMS.register("stratified_dragon_upgrade_template",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LAMINATED_DRAGON_UPGRADE_TEMPLATE = ITEMS.register("laminated_dragon_upgrade_template",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POCKED_DRAGON_UPGRADE_TEMPLATE = ITEMS.register("pocked_dragon_upgrade_template",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HEATED_DRAGON_UPGRADE_TEMPLATE = ITEMS.register("heated_dragon_upgrade_template",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PEARL_DRAGON_UPGRADE_TEMPLATE = ITEMS.register("pearl_dragon_upgrade_template",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHIFTING_DRAGON_UPGRADE_TEMPLATE = ITEMS.register("shifting_dragon_upgrade_template",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JAGGED_DRAGON_UPGRADE_TEMPLATE = ITEMS.register("jagged_dragon_upgrade_template",
            () -> new Item(new Item.Properties()));




    public static final RegistryObject<Item> FINAL_DRAGON_SHARD = ITEMS.register("final_dragon_shard",
            () -> new Item(new Item.Properties()));


    //Raw Ores
    public static final RegistryObject<Item> STRATIFIED_STONE = ITEMS.register("stratified_stone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LAMINATED_CRYSTAL = ITEMS.register("laminated_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POCKED_CRYSTAL = ITEMS.register("pocked_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HEATED_CRYSTAL = ITEMS.register("heated_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PEARL_CRYSTAL = ITEMS.register("pearl_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHIFTING_CRYSTAL = ITEMS.register("shifting_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JAGGED_STONE = ITEMS.register("jagged_stone",
            () -> new Item(new Item.Properties()));


    //Crushed
    public static final RegistryObject<Item> STRATIFIED_STONE_DUST = ITEMS.register("stratified_stone_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LAMINATED_CRYSTAL_DUST = ITEMS.register("laminated_crystal_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POCKED_CRYSTAL_DUST = ITEMS.register("pocked_crystal_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HEATED_CRYSTAL_DUST = ITEMS.register("heated_crystal_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PEARL_CRYSTAL_DUST = ITEMS.register("pearl_crystal_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHIFTING_CRYSTAL_DUST = ITEMS.register("shifting_crystal_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JAGGED_STONE_DUST = ITEMS.register("jagged_stone_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GLITCHED_STONE_DUST = ITEMS.register("glitched_stone_dust",
            () -> new Item(new Item.Properties()));


    //Smelted
    public static final RegistryObject<Item> STRATIFIED_STONE_BRICK = ITEMS.register("stratified_stone_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LAMINATED_CRYSTAL_BRICK = ITEMS.register("laminated_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POCKED_CRYSTAL_BRICK = ITEMS.register("pocked_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HEATED_CRYSTAL_BRICK = ITEMS.register("heated_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PEARL_CRYSTAL_BRICK = ITEMS.register("pearl_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHIFTING_CRYSTAL_BRICK = ITEMS.register("shifting_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JAGGED_STONE_BRICK = ITEMS.register("jagged_stone_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GLITCHED_STONE_BRICK = ITEMS.register("glitched_stone_brick",
            () -> new Item(new Item.Properties()));

    //Raw Ores Infused
    public static final RegistryObject<Item> INFUSED_STRATIFIED_STONE = ITEMS.register("infused_stratified_stone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_LAMINATED_CRYSTAL = ITEMS.register("infused_laminated_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_POCKED_CRYSTAL = ITEMS.register("infused_pocked_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_HEATED_CRYSTAL = ITEMS.register("infused_heated_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_PEARL_CRYSTAL = ITEMS.register("infused_pearl_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_SHIFTING_CRYSTAL = ITEMS.register("infused_shifting_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_JAGGED_STONE = ITEMS.register("infused_jagged_stone",
            () -> new Item(new Item.Properties()));



    //Crushed Infused
    public static final RegistryObject<Item> INFUSED_STRATIFIED_STONE_DUST = ITEMS.register("infused_stratified_stone_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_LAMINATED_CRYSTAL_DUST = ITEMS.register("infused_laminated_crystal_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_POCKED_CRYSTAL_DUST = ITEMS.register("infused_pocked_crystal_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_HEATED_CRYSTAL_DUST = ITEMS.register("infused_heated_crystal_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_PEARL_CRYSTAL_DUST = ITEMS.register("infused_pearl_crystal_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_SHIFTING_CRYSTAL_DUST = ITEMS.register("infused_shifting_crystal_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_JAGGED_STONE_DUST = ITEMS.register("infused_jagged_stone_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_GLITCHED_STONE_DUST = ITEMS.register("infused_glitched_stone_dust",
            () -> new Item(new Item.Properties()));


    //Smelted Infused
    public static final RegistryObject<Item> INFUSED_STRATIFIED_STONE_BRICK = ITEMS.register("infused_stratified_stone_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_LAMINATED_CRYSTAL_BRICK = ITEMS.register("infused_laminated_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_POCKED_CRYSTAL_BRICK = ITEMS.register("infused_pocked_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_HEATED_CRYSTAL_BRICK = ITEMS.register("infused_heated_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_PEARL_CRYSTAL_BRICK = ITEMS.register("infused_pearl_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_SHIFTING_CRYSTAL_BRICK = ITEMS.register("infused_shifting_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_JAGGED_STONE_BRICK = ITEMS.register("infused_jagged_stone_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFUSED_GLITCHED_STONE_BRICK = ITEMS.register("infused_glitched_stone_brick",
            () -> new Item(new Item.Properties()));




    //Smelted Charged
    public static final RegistryObject<Item> CHARGED_STRATIFIED_STONE_BRICK = ITEMS.register("charged_stratified_stone_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHARGED_LAMINATED_CRYSTAL_BRICK = ITEMS.register("charged_laminated_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHARGED_POCKED_CRYSTAL_BRICK = ITEMS.register("charged_pocked_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHARGED_HEATED_CRYSTAL_BRICK = ITEMS.register("charged_heated_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHARGED_PEARL_CRYSTAL_BRICK = ITEMS.register("charged_pearl_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHARGED_SHIFTING_CRYSTAL_BRICK = ITEMS.register("charged_shifting_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHARGED_JAGGED_STONE_BRICK = ITEMS.register("charged_jagged_stone_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHARGED_GLITCHED_STONE_BRICK = ITEMS.register("charged_glitched_stone_brick",
            () -> new Item(new Item.Properties()));



    //Smelted Infused Charged
    public static final RegistryObject<Item> CHARGED_INFUSED_STRATIFIED_STONE_BRICK = ITEMS.register("charged_infused_stratified_stone_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHARGED_INFUSED_LAMINATED_CRYSTAL_BRICK = ITEMS.register("charged_infused_laminated_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHARGED_INFUSED_POCKED_CRYSTAL_BRICK = ITEMS.register("charged_infused_pocked_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHARGED_INFUSED_HEATED_CRYSTAL_BRICK = ITEMS.register("charged_infused_heated_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHARGED_INFUSED_PEARL_CRYSTAL_BRICK = ITEMS.register("charged_infused_pearl_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHARGED_INFUSED_SHIFTING_CRYSTAL_BRICK = ITEMS.register("charged_infused_shifting_crystal_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHARGED_INFUSED_JAGGED_STONE_BRICK = ITEMS.register("charged_infused_jagged_stone_brick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHARGED_INFUSED_GLITCHED_STONE_BRICK = ITEMS.register("charged_infused_glitched_stone_brick",
            () -> new Item(new Item.Properties()));



    //Tablets
    public static final RegistryObject<Item> STRATIFIED_STONE_TABLET = ITEMS.register("stratified_stone_tablet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LAMINATED_CRYSTAL_TABLET = ITEMS.register("laminated_crystal_tablet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POCKED_CRYSTAL_TABLET = ITEMS.register("pocked_crystal_tablet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HEATED_CRYSTAL_TABLET = ITEMS.register("heated_crystal_tablet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PEARL_CRYSTAL_TABLET = ITEMS.register("pearl_crystal_tablet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHIFTING_CRYSTAL_TABLET = ITEMS.register("shifting_crystal_tablet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JAGGED_STONE_TABLET = ITEMS.register("jagged_stone_tablet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GLITCHED_STONE_TABLET = ITEMS.register("glitched_stone_tablet",
            () -> new Item(new Item.Properties()));




    public static final RegistryObject<Item> OBSIDIAN_TEARS = ITEMS.register("obsidian_tears",
            () -> new Item(new Item.Properties()));



//test

//    public static final RegistryObject<Item> OBSIDIAN_TEAR = ITEMS.register("obsidian_tear",
//            () -> new Item(new Item.Properties()));



    //Unfinished Tablets
    public static final RegistryObject<Item> UNFINISHED_STRATIFIED_STONE_TABLET = ITEMS.register("unfinished_stratified_stone_tablet",
            () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final RegistryObject<Item> UNFINISHED_LAMINATED_CRYSTAL_TABLET = ITEMS.register("unfinished_laminated_crystal_tablet",
            () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final RegistryObject<Item> UNFINISHED_POCKED_CRYSTAL_TABLET = ITEMS.register("unfinished_pocked_crystal_tablet",
            () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final RegistryObject<Item> UNFINISHED_HEATED_CRYSTAL_TABLET = ITEMS.register("unfinished_heated_crystal_tablet",
            () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final RegistryObject<Item> UNFINISHED_PEARL_CRYSTAL_TABLET = ITEMS.register("unfinished_pearl_crystal_tablet",
            () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final RegistryObject<Item> UNFINISHED_SHIFTING_CRYSTAL_TABLET = ITEMS.register("unfinished_shifting_crystal_tablet",
            () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final RegistryObject<Item> UNFINISHED_JAGGED_STONE_TABLET = ITEMS.register("unfinished_jagged_stone_tablet",
            () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final RegistryObject<Item> UNFINISHED_GLITCHED_STONE_TABLET = ITEMS.register("unfinished_glitched_stone_tablet",
            () -> new SequencedAssemblyItem(new Item.Properties()));



    public static final RegistryObject<Item> UNFINISHED_FINAL_SHARD = ITEMS.register("unfinished_final_shard",
            () -> new SequencedAssemblyItem(new Item.Properties()));



    public static final RegistryObject<Item> LORE_PAGE = ITEMS.register("lore_page",
            () -> new LorePage(new Item.Properties()));


    public static final RegistryObject<Item> STRATIFIED_PICKAXE = ITEMS.register("stratified_pickaxe",
            () -> new OreExtractor(ModToolTiers.STRATIFIED, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> LAMINATED_PICKAXE = ITEMS.register("laminated_pickaxe",
            () -> new OreExtractor(ModToolTiers.LAMINATED, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> POCKED_PICKAXE = ITEMS.register("pocked_pickaxe",
            () -> new OreExtractor(ModToolTiers.POCKED, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> HEATED_PICKAXE = ITEMS.register("heated_pickaxe",
            () -> new OreExtractor(ModToolTiers.HEATED, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> PEARL_PICKAXE = ITEMS.register("pearl_pickaxe",
            () -> new OreExtractor(ModToolTiers.PEARL, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SHIFTING_PICKAXE = ITEMS.register("shifting_pickaxe",
            () -> new OreExtractor(ModToolTiers.SHIFTING, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> JAGGED_PICKAXE = ITEMS.register("jagged_pickaxe",
            () -> new OreExtractor(ModToolTiers.JAGGED, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> GLITCHED_PICKAXE = ITEMS.register("glitched_pickaxe",
//            () -> new PickaxeItem(ModToolTiers.GLITCHED, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> LAMINATED_SWORD = ITEMS.register("laminated_sword",
//            () -> new SwordItem(ModToolTiers.LAMINATED, 4, 2, new Item.Properties()));
//    public static final RegistryObject<Item> LAMINATED_AXE = ITEMS.register("laminated_axe",
//            () -> new AxeItem(ModToolTiers.LAMINATED, 7, 1, new Item.Properties()));
//    public static final RegistryObject<Item> LAMINATED_SHOVEL = ITEMS.register("laminated_shovel",
//            () -> new ShovelItem(ModToolTiers.LAMINATED, 0, 0, new Item.Properties()));
//    public static final RegistryObject<Item> LAMINATED_HOE = ITEMS.register("laminated_hoe",
//            () -> new HoeItem(ModToolTiers.LAMINATED, 0, 0, new Item.Properties()));




//    public static final RegistryObject<Item> GLITCHED_STONE = ITEMS.register("glitched_stone",
//            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
