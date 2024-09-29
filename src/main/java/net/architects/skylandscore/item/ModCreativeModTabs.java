package net.architects.skylandscore.item;

import net.architects.skylandscore.EcoPortalsMod;
import net.architects.skylandscore.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EcoPortalsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ECO_DIMENSION_TAB = CREATIVE_MODE_TABS.register("ecospherical_dimensions_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.STRATIFIED_STONE_BLOCK.get(), 1))
                    .title(Component.translatable("creativetab.ecospherical_dimensions_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.RED_DRAGON_ESSENCE_BUCKET.get());
                        pOutput.accept(ModItems.ORANGE_DRAGON_ESSENCE_BUCKET.get());
                        pOutput.accept(ModItems.YELLOW_DRAGON_ESSENCE_BUCKET.get());
                        pOutput.accept(ModItems.GREEN_DRAGON_ESSENCE_BUCKET.get());
                        pOutput.accept(ModItems.BLUE_DRAGON_ESSENCE_BUCKET.get());
                        pOutput.accept(ModItems.PURPLE_DRAGON_ESSENCE_BUCKET.get());
                        pOutput.accept(ModItems.MAGENTA_DRAGON_ESSENCE_BUCKET.get());

                        pOutput.accept(ModItems.OBSIDIAN_TEARS_BUCKET.get());
                        pOutput.accept(ModItems.OBSIDIAN_TEARS.get());


                        pOutput.accept(ModBlocks.STRATIFIED_STONE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_STRATIFIED_STONE_ORE.get());
                        pOutput.accept(ModBlocks.STRATIFIED_STONE_BLOCK.get());


                        pOutput.accept(ModBlocks.LAMINATED_CRYSTAL_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_LAMINATED_CRYSTAL_ORE.get());
                        pOutput.accept(ModBlocks.LAMINATED_CRYSTAL_BLOCK.get());


                        pOutput.accept(ModBlocks.POCKED_CRYSTAL_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_POCKED_CRYSTAL_ORE.get());
                        pOutput.accept(ModBlocks.POCKED_CRYSTAL_BLOCK.get());


                        pOutput.accept(ModBlocks.HEATED_CRYSTAL_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_HEATED_CRYSTAL_ORE.get());
                        pOutput.accept(ModBlocks.HEATED_CRYSTAL_BLOCK.get());


                        pOutput.accept(ModBlocks.PEARL_CRYSTAL_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_PEARL_CRYSTAL_ORE.get());
                        pOutput.accept(ModBlocks.PEARL_CRYSTAL_BLOCK.get());


                        pOutput.accept(ModBlocks.SHIFTING_CRYSTAL_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SHIFTING_CRYSTAL_ORE.get());
                        pOutput.accept(ModBlocks.SHIFTING_CRYSTAL_BLOCK.get());


                        pOutput.accept(ModBlocks.JAGGED_STONE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_JAGGED_STONE_ORE.get());
                        pOutput.accept(ModBlocks.JAGGED_STONE_BLOCK.get());


                        pOutput.accept(ModBlocks.GLITCHED_STONE_BLOCK.get());
                        pOutput.accept(ModBlocks.INFUSED_GLITCHED_STONE_BLOCK.get());


                        pOutput.accept(ModItems.CHARGED_EMERALD.get());

                        pOutput.accept(ModItems.STRATIFIED_STONE.get());
                        pOutput.accept(ModItems.LAMINATED_CRYSTAL.get());
                        pOutput.accept(ModItems.POCKED_CRYSTAL.get());
                        pOutput.accept(ModItems.HEATED_CRYSTAL.get());
                        pOutput.accept(ModItems.PEARL_CRYSTAL.get());
                        pOutput.accept(ModItems.SHIFTING_CRYSTAL.get());
                        pOutput.accept(ModItems.JAGGED_STONE.get());

                        pOutput.accept(ModItems.STRATIFIED_STONE_DUST.get());
                        pOutput.accept(ModItems.LAMINATED_CRYSTAL_DUST.get());
                        pOutput.accept(ModItems.POCKED_CRYSTAL_DUST.get());
                        pOutput.accept(ModItems.HEATED_CRYSTAL_DUST.get());
                        pOutput.accept(ModItems.PEARL_CRYSTAL_DUST.get());
                        pOutput.accept(ModItems.SHIFTING_CRYSTAL_DUST.get());
                        pOutput.accept(ModItems.JAGGED_STONE_DUST.get());
                        pOutput.accept(ModItems.GLITCHED_STONE_DUST.get());

                        pOutput.accept(ModItems.STRATIFIED_STONE_BRICK.get());
                        pOutput.accept(ModItems.LAMINATED_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.POCKED_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.HEATED_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.PEARL_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.SHIFTING_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.JAGGED_STONE_BRICK.get());
                        pOutput.accept(ModItems.GLITCHED_STONE_BRICK.get());


                        pOutput.accept(ModItems.CHARGED_STRATIFIED_STONE_BRICK.get());
                        pOutput.accept(ModItems.CHARGED_LAMINATED_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.CHARGED_POCKED_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.CHARGED_HEATED_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.CHARGED_PEARL_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.CHARGED_SHIFTING_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.CHARGED_JAGGED_STONE_BRICK.get());
                        pOutput.accept(ModItems.CHARGED_GLITCHED_STONE_BRICK.get());

                        pOutput.accept(ModItems.INFUSED_STRATIFIED_STONE.get());
                        pOutput.accept(ModItems.INFUSED_LAMINATED_CRYSTAL.get());
                        pOutput.accept(ModItems.INFUSED_POCKED_CRYSTAL.get());
                        pOutput.accept(ModItems.INFUSED_HEATED_CRYSTAL.get());
                        pOutput.accept(ModItems.INFUSED_PEARL_CRYSTAL.get());
                        pOutput.accept(ModItems.INFUSED_SHIFTING_CRYSTAL.get());
                        pOutput.accept(ModItems.INFUSED_JAGGED_STONE.get());

                        pOutput.accept(ModItems.INFUSED_STRATIFIED_STONE_DUST.get());
                        pOutput.accept(ModItems.INFUSED_LAMINATED_CRYSTAL_DUST.get());
                        pOutput.accept(ModItems.INFUSED_POCKED_CRYSTAL_DUST.get());
                        pOutput.accept(ModItems.INFUSED_HEATED_CRYSTAL_DUST.get());
                        pOutput.accept(ModItems.INFUSED_PEARL_CRYSTAL_DUST.get());
                        pOutput.accept(ModItems.INFUSED_SHIFTING_CRYSTAL_DUST.get());
                        pOutput.accept(ModItems.INFUSED_JAGGED_STONE_DUST.get());
                        pOutput.accept(ModItems.INFUSED_GLITCHED_STONE_DUST.get());

                        pOutput.accept(ModItems.INFUSED_STRATIFIED_STONE_BRICK.get());
                        pOutput.accept(ModItems.INFUSED_LAMINATED_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.INFUSED_POCKED_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.INFUSED_HEATED_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.INFUSED_PEARL_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.INFUSED_SHIFTING_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.INFUSED_JAGGED_STONE_BRICK.get());
                        pOutput.accept(ModItems.INFUSED_GLITCHED_STONE_BRICK.get());

                        pOutput.accept(ModItems.CHARGED_INFUSED_STRATIFIED_STONE_BRICK.get());
                        pOutput.accept(ModItems.CHARGED_INFUSED_LAMINATED_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.CHARGED_INFUSED_POCKED_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.CHARGED_INFUSED_HEATED_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.CHARGED_INFUSED_PEARL_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.CHARGED_INFUSED_SHIFTING_CRYSTAL_BRICK.get());
                        pOutput.accept(ModItems.CHARGED_INFUSED_JAGGED_STONE_BRICK.get());
                        pOutput.accept(ModItems.CHARGED_INFUSED_GLITCHED_STONE_BRICK.get());


                        pOutput.accept(ModItems.STRATIFIED_STONE_TABLET.get());
                        pOutput.accept(ModItems.LAMINATED_CRYSTAL_TABLET.get());
                        pOutput.accept(ModItems.POCKED_CRYSTAL_TABLET.get());
                        pOutput.accept(ModItems.HEATED_CRYSTAL_TABLET.get());
                        pOutput.accept(ModItems.PEARL_CRYSTAL_TABLET.get());
                        pOutput.accept(ModItems.SHIFTING_CRYSTAL_TABLET.get());
                        pOutput.accept(ModItems.JAGGED_STONE_TABLET.get());
                        pOutput.accept(ModItems.GLITCHED_STONE_TABLET.get());


                        pOutput.accept(ModItems.STRATIFIED_DRAGON_ESSENCE.get());
                        pOutput.accept(ModItems.LAMINATED_DRAGON_ESSENCE.get());
                        pOutput.accept(ModItems.POCKED_DRAGON_ESSENCE.get());
                        pOutput.accept(ModItems.HEATED_DRAGON_ESSENCE.get());
                        pOutput.accept(ModItems.PEARL_DRAGON_ESSENCE.get());
                        pOutput.accept(ModItems.SHIFTING_DRAGON_ESSENCE.get());
                        pOutput.accept(ModItems.JAGGED_DRAGON_ESSENCE.get());
                        pOutput.accept(ModItems.FINAL_DRAGON_SHARD.get());


                        pOutput.accept(ModItems.STRATIFIED_DRAGON_UPGRADE_TEMPLATE.get());
                        pOutput.accept(ModItems.LAMINATED_DRAGON_UPGRADE_TEMPLATE.get());
                        pOutput.accept(ModItems.POCKED_DRAGON_UPGRADE_TEMPLATE.get());
                        pOutput.accept(ModItems.HEATED_DRAGON_UPGRADE_TEMPLATE.get());
                        pOutput.accept(ModItems.PEARL_DRAGON_UPGRADE_TEMPLATE.get());
                        pOutput.accept(ModItems.SHIFTING_DRAGON_UPGRADE_TEMPLATE.get());
                        pOutput.accept(ModItems.JAGGED_DRAGON_UPGRADE_TEMPLATE.get());


                        pOutput.accept(ModItems.STRATIFIED_PICKAXE.get());
                        pOutput.accept(ModItems.LAMINATED_PICKAXE.get());
                        pOutput.accept(ModItems.POCKED_PICKAXE.get());
                        pOutput.accept(ModItems.HEATED_PICKAXE.get());
                        pOutput.accept(ModItems.PEARL_PICKAXE.get());
                        pOutput.accept(ModItems.SHIFTING_PICKAXE.get());
                        pOutput.accept(ModItems.JAGGED_PICKAXE.get());



                        pOutput.accept(ModItems.LORE_PAGE.get());

//
//                        pOutput.accept(ModBlocks.ASTHENO_PORTAL_BLOCK.get());
//                        pOutput.accept(ModBlocks.ASTHENO_NETHER_PORTAL_BLOCK.get());
//                        pOutput.accept(ModBlocks.DEFAULT_PORTAL_BLOCK.get());
//                        pOutput.accept(ModBlocks.LARGEBIOMES_PORTAL_BLOCK.get());
//                        pOutput.accept(ModBlocks.LITHO_PORTAL_BLOCK.get());
//                        pOutput.accept(ModBlocks.LITHO_NETHER_PORTAL_BLOCK.get());
                        pOutput.accept(ModBlocks.OGSTRATO_PORTAL_BLOCK.get());
                        pOutput.accept(ModBlocks.OGSTRATO_NETHER_PORTAL_BLOCK.get());
                        pOutput.accept(ModBlocks.STRATO_PORTAL_BLOCK.get());
                        pOutput.accept(ModBlocks.STRATO_NETHER_PORTAL_BLOCK.get());
                        pOutput.accept(ModBlocks.EXO_PORTAL_BLOCK.get());
                        pOutput.accept(ModBlocks.EXO_NETHER_PORTAL_BLOCK.get());
                        pOutput.accept(ModBlocks.THERMO_PORTAL_BLOCK.get());
                        pOutput.accept(ModBlocks.THERMO_NETHER_PORTAL_BLOCK.get());
                        pOutput.accept(ModBlocks.MESO_PORTAL_BLOCK.get());
                        pOutput.accept(ModBlocks.MESO_NETHER_PORTAL_BLOCK.get());
                        pOutput.accept(ModBlocks.TROPO_PORTAL_BLOCK.get());
                        pOutput.accept(ModBlocks.TROPO_NETHER_PORTAL_BLOCK.get());
                        pOutput.accept(ModBlocks.AMPLIFIED_PORTAL_BLOCK.get());


                        pOutput.accept(ModBlocks.OGSTRATO_PORTAL_END_BLOCK.get());
                        pOutput.accept(ModBlocks.STRATO_PORTAL_END_BLOCK.get());
                        pOutput.accept(ModBlocks.EXO_PORTAL_END_BLOCK.get());
                        pOutput.accept(ModBlocks.THERMO_PORTAL_END_BLOCK.get());
                        pOutput.accept(ModBlocks.MESO_PORTAL_END_BLOCK.get());
                        pOutput.accept(ModBlocks.TROPO_PORTAL_END_BLOCK.get());
                        pOutput.accept(ModBlocks.AMPLIFIED_PORTAL_END_BLOCK.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
