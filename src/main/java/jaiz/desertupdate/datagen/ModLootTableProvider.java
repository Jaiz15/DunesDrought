package jaiz.desertupdate.datagen;


import jaiz.desertupdate.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.FANCY_WHITE_WOOL);
        addDrop(ModBlocks.FANCY_LIGHT_GRAY_WOOL);
        addDrop(ModBlocks.FANCY_GRAY_WOOL);
        addDrop(ModBlocks.FANCY_BLACK_WOOL);
        addDrop(ModBlocks.FANCY_BROWN_WOOL);
        addDrop(ModBlocks.FANCY_ORANGE_WOOL);
        addDrop(ModBlocks.FANCY_RED_WOOL);
        addDrop(ModBlocks.FANCY_YELLOW_WOOL);
        addDrop(ModBlocks.FANCY_LIME_WOOL);
        addDrop(ModBlocks.FANCY_GREEN_WOOL);
        addDrop(ModBlocks.FANCY_CYAN_WOOL);
        addDrop(ModBlocks.FANCY_LIGHT_BLUE_WOOL);
        addDrop(ModBlocks.FANCY_BLUE_WOOL);
        addDrop(ModBlocks.FANCY_PURPLE_WOOL);
        addDrop(ModBlocks.FANCY_MAGENTA_WOOL);
        addDrop(ModBlocks.FANCY_PINK_WOOL);

        addDrop(ModBlocks.GILDED_CHISELED_SANDSTONE);
        addDrop(ModBlocks.GILDED_CUT_SANDSTONE);
        addDrop(ModBlocks.GILDED_SANDSTONE);

        addDrop(ModBlocks.DESERT_OAK_WOOD);
        addDrop(ModBlocks.STRIPPED_DESERT_OAK_WOOD);
        addDrop(ModBlocks.DESERT_OAK_LOG);
        addDrop(ModBlocks.STRIPPED_DESERT_OAK_LOG);
        addDrop(ModBlocks.DESERT_OAK_PLANKS);

        addDrop(ModBlocks.DESERT_OAK_DOOR, doorDrops(ModBlocks.DESERT_OAK_DOOR));
        addDrop(ModBlocks.DESERT_OAK_SLAB, slabDrops(ModBlocks.DESERT_OAK_SLAB));
        addDrop(ModBlocks.DESERT_OAK_TRAPDOOR);
        addDrop(ModBlocks.DESERT_OAK_FENCE);
        addDrop(ModBlocks.DESERT_OAK_STAIRS);
        addDrop(ModBlocks.DESERT_OAK_FENCE_GATE);
        addDrop(ModBlocks.DESERT_OAK_SAPLING);

        addDrop(ModBlocks.STANDING_DESERT_OAK_SIGN);
        addDrop(ModBlocks.WALL_DESERT_OAK_SIGN);
        addDrop(ModBlocks.HANGING_DESERT_OAK_SIGN);
        addDrop(ModBlocks.WALL_HANGING_DESERT_OAK_SIGN);
        addDrop(ModBlocks.HONEYCOMB_DIRT);
        addDrop(ModBlocks.TERRACOTTA_BRICKS);
        addDrop(ModBlocks.CUT_COBBLESTONE);

        addDrop(ModBlocks.TERRACOTTA_BRICK_WALL);
        addDrop(ModBlocks.TERRACOTTA_BRICK_SLAB, slabDrops(ModBlocks.TERRACOTTA_BRICK_SLAB));
        addDrop(ModBlocks.TERRACOTTA_BRICK_STAIRS);


        addDrop(ModBlocks.DESERT_OAK_LEAVES, leavesDrops(ModBlocks.DESERT_OAK_LEAVES, ModBlocks.DESERT_OAK_SAPLING, 0.025f));


    }
}
