package jaiz.desertupdate.datagen;

import jaiz.desertupdate.block.ModBlocks;
import jaiz.desertupdate.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) { super(output);}

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerWoolAndCarpet((ModBlocks.FANCY_WHITE_WOOL), (ModBlocks.FANCY_WHITE_CARPET));
        blockStateModelGenerator.registerWoolAndCarpet((ModBlocks.FANCY_LIGHT_GRAY_WOOL), (ModBlocks.FANCY_LIGHT_GRAY_CARPET));
        blockStateModelGenerator.registerWoolAndCarpet((ModBlocks.FANCY_GRAY_WOOL), (ModBlocks.FANCY_GRAY_CARPET));
        blockStateModelGenerator.registerWoolAndCarpet((ModBlocks.FANCY_BLACK_WOOL), (ModBlocks.FANCY_BLACK_CARPET));
        blockStateModelGenerator.registerWoolAndCarpet((ModBlocks.FANCY_BROWN_WOOL), (ModBlocks.FANCY_BROWN_CARPET));
        blockStateModelGenerator.registerWoolAndCarpet((ModBlocks.FANCY_RED_WOOL), (ModBlocks.FANCY_RED_CARPET));
        blockStateModelGenerator.registerWoolAndCarpet((ModBlocks.FANCY_YELLOW_WOOL), (ModBlocks.FANCY_YELLOW_CARPET));
        blockStateModelGenerator.registerWoolAndCarpet((ModBlocks.FANCY_LIME_WOOL), (ModBlocks.FANCY_LIME_CARPET));
        blockStateModelGenerator.registerWoolAndCarpet((ModBlocks.FANCY_CYAN_WOOL), (ModBlocks.FANCY_CYAN_CARPET));
        blockStateModelGenerator.registerWoolAndCarpet((ModBlocks.FANCY_LIGHT_BLUE_WOOL), (ModBlocks.FANCY_LIGHT_BLUE_CARPET));
        blockStateModelGenerator.registerWoolAndCarpet((ModBlocks.FANCY_PURPLE_WOOL), (ModBlocks.FANCY_PURPLE_CARPET));
        blockStateModelGenerator.registerWoolAndCarpet((ModBlocks.FANCY_MAGENTA_WOOL), (ModBlocks.FANCY_MAGENTA_CARPET));
        blockStateModelGenerator.registerWoolAndCarpet((ModBlocks.FANCY_PINK_WOOL), (ModBlocks.FANCY_PINK_CARPET));
        blockStateModelGenerator.registerWoolAndCarpet((ModBlocks.FANCY_BLUE_WOOL), (ModBlocks.FANCY_BLUE_CARPET));

        blockStateModelGenerator.registerLog(ModBlocks.FANCY_ORANGE_WOOL).log(ModBlocks.FANCY_ORANGE_WOOL);
        blockStateModelGenerator.registerLog(ModBlocks.FANCY_GREEN_WOOL).log(ModBlocks.FANCY_GREEN_WOOL);


        blockStateModelGenerator.registerLog(ModBlocks.DESERT_OAK_LOG).log(ModBlocks.DESERT_OAK_LOG).wood(ModBlocks.DESERT_OAK_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_DESERT_OAK_LOG).log(ModBlocks.STRIPPED_DESERT_OAK_LOG).wood(ModBlocks.STRIPPED_DESERT_OAK_WOOD);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DESERT_OAK_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_COBBLESTONE);

        BlockStateModelGenerator.BlockTexturePool desert_oak_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DESERT_OAK_PLANKS);
        desert_oak_pool.family(ModBlocks.DESERT_OAK_FAMILY);

        BlockStateModelGenerator.BlockTexturePool terracotta_brick_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TERRACOTTA_BRICKS);
        terracotta_brick_pool.family(ModBlocks.TERRACOTTA_BRICK_FAMILY);
        terracotta_brick_pool.stairs(ModBlocks.TERRACOTTA_BRICK_STAIRS);
        terracotta_brick_pool.slab(ModBlocks.TERRACOTTA_BRICK_SLAB);
        terracotta_brick_pool.wall(ModBlocks.TERRACOTTA_BRICK_WALL);

        desert_oak_pool.stairs(ModBlocks.DESERT_OAK_STAIRS);
        desert_oak_pool.slab(ModBlocks.DESERT_OAK_SLAB);
        desert_oak_pool.fence(ModBlocks.DESERT_OAK_FENCE);
        desert_oak_pool.fenceGate(ModBlocks.DESERT_OAK_FENCE_GATE);
        desert_oak_pool.button(ModBlocks.DESERT_OAK_BUTTON);
        desert_oak_pool.pressurePlate(ModBlocks.DESERT_OAK_PRESSURE_PLATE);

        blockStateModelGenerator.registerTintableCross(ModBlocks.DESERT_OAK_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerDoor(ModBlocks.DESERT_OAK_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.DESERT_OAK_TRAPDOOR);

        blockStateModelGenerator.registerBrushableBlock(ModBlocks.FOSSIL_SOIL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HONEYCOMB_DIRT);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.SILK, Models.GENERATED);
        itemModelGenerator.register(ModItems.RARE_SPICES, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.WEDGE_OBSIDIAN_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHARP_OBSIDIAN_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIMIC_POT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOURMET_MEAL, Models.GENERATED);

        itemModelGenerator.register(ModItems.BATTERED_AXE_REMNANT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BATTERED_AXE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ANCIENT_HORN_01, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_HORN_02, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_HORN_03, Models.GENERATED);

        itemModelGenerator.register(ModItems.ORIGAMI_HAIRBALL_MUSIC_DISC, Models.GENERATED);

        itemModelGenerator.register(ModItems.SHARP_OBSIDIAN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WEDGE_OBSIDIAN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SHARP_OBSIDIAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WEDGE_OBSIDIAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SHARP_WEDGE_OBSIDIAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SHARP_REGULAR_OBSIDIAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WEDGE_REGULAR_OBSIDIAN_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.HANGING_DESERT_OAK_SIGN, Models.GENERATED);

        itemModelGenerator.register(ModItems.BANDIT_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));

    }
}
