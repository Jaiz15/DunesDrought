package jaiz.desertupdate.datagen;

import jaiz.desertupdate.block.ModBlocks;
import jaiz.desertupdate.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;


public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        // idk

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOURMET_MEAL, 1)
                .pattern("RX")
                .pattern("SY")
                .input('S', Items.BEETROOT)
                .input('R', Items.CARROT)
                .input('Y', Items.COOKED_CHICKEN)
                .input('X', ModItems.RARE_SPICES)
                .criterion(hasItem(Items.BEETROOT), conditionsFromItem(Items.BEETROOT))
                .criterion(hasItem(Items.COOKED_CHICKEN), conditionsFromItem(Items.COOKED_CHICKEN))
                .criterion(hasItem(Items.CARROT), conditionsFromItem(Items.CARROT))
                .criterion(hasItem(ModItems.RARE_SPICES), conditionsFromItem(ModItems.RARE_SPICES))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOURMET_MEAL)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_BRICKS, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', Items.TERRACOTTA)
                .input('R', Items.BRICK)
                .criterion(hasItem(Items.BRICK), conditionsFromItem(Items.BRICK))
                .criterion(hasItem(Items.TERRACOTTA), conditionsFromItem(Items.TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TERRACOTTA_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HONEYCOMB_DIRT, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', Items.HONEYCOMB)
                .input('R', Items.DIRT)
                .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                .criterion(hasItem(Blocks.DIRT), conditionsFromItem(Items.DIRT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.HONEYCOMB_DIRT)));

        //wools ;-;

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_BLACK_WOOL, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', ModItems.SILK)
                .input('R', Items.BLACK_WOOL)
                .criterion(hasItem(Items.BLACK_WOOL), conditionsFromItem(Items.BLACK_WOOL))
                .criterion(hasItem(ModItems.SILK), conditionsFromItem(ModItems.SILK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_BLACK_WOOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_GRAY_WOOL, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', ModItems.SILK)
                .input('R', Items.GRAY_WOOL)
                .criterion(hasItem(Items.GRAY_WOOL), conditionsFromItem(Items.GRAY_WOOL))
                .criterion(hasItem(ModItems.SILK), conditionsFromItem(ModItems.SILK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_GRAY_WOOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_LIGHT_GRAY_WOOL, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', ModItems.SILK)
                .input('R', Items.LIGHT_GRAY_WOOL)
                .criterion(hasItem(Items.LIGHT_GRAY_WOOL), conditionsFromItem(Items.LIGHT_GRAY_WOOL))
                .criterion(hasItem(ModItems.SILK), conditionsFromItem(ModItems.SILK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_LIGHT_GRAY_WOOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_WHITE_WOOL, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', ModItems.SILK)
                .input('R', Items.WHITE_WOOL)
                .criterion(hasItem(Items.WHITE_WOOL), conditionsFromItem(Items.WHITE_WOOL))
                .criterion(hasItem(ModItems.SILK), conditionsFromItem(ModItems.SILK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_WHITE_WOOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_BROWN_WOOL, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', ModItems.SILK)
                .input('R', Items.BROWN_WOOL)
                .criterion(hasItem(Items.BROWN_WOOL), conditionsFromItem(Items.BROWN_WOOL))
                .criterion(hasItem(ModItems.SILK), conditionsFromItem(ModItems.SILK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_BROWN_WOOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_ORANGE_WOOL, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', ModItems.SILK)
                .input('R', Items.ORANGE_WOOL)
                .criterion(hasItem(Items.ORANGE_WOOL), conditionsFromItem(Items.ORANGE_WOOL))
                .criterion(hasItem(ModItems.SILK), conditionsFromItem(ModItems.SILK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_ORANGE_WOOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_RED_WOOL, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', ModItems.SILK)
                .input('R', Items.RED_WOOL)
                .criterion(hasItem(Items.RED_WOOL), conditionsFromItem(Items.RED_WOOL))
                .criterion(hasItem(ModItems.SILK), conditionsFromItem(ModItems.SILK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_RED_WOOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_YELLOW_WOOL, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', ModItems.SILK)
                .input('R', Items.YELLOW_WOOL)
                .criterion(hasItem(Items.YELLOW_WOOL), conditionsFromItem(Items.YELLOW_WOOL))
                .criterion(hasItem(ModItems.SILK), conditionsFromItem(ModItems.SILK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_YELLOW_WOOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_LIME_WOOL, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', ModItems.SILK)
                .input('R', Items.LIME_WOOL)
                .criterion(hasItem(Items.LIME_WOOL), conditionsFromItem(Items.LIME_WOOL))
                .criterion(hasItem(ModItems.SILK), conditionsFromItem(ModItems.SILK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_LIME_WOOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_GREEN_WOOL, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', ModItems.SILK)
                .input('R', Items.GREEN_WOOL)
                .criterion(hasItem(Items.GREEN_WOOL), conditionsFromItem(Items.GREEN_WOOL))
                .criterion(hasItem(ModItems.SILK), conditionsFromItem(ModItems.SILK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_GREEN_WOOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_CYAN_WOOL, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', ModItems.SILK)
                .input('R', Items.CYAN_WOOL)
                .criterion(hasItem(Items.CYAN_WOOL), conditionsFromItem(Items.CYAN_WOOL))
                .criterion(hasItem(ModItems.SILK), conditionsFromItem(ModItems.SILK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_CYAN_WOOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_LIGHT_BLUE_WOOL, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', ModItems.SILK)
                .input('R', Items.LIGHT_BLUE_WOOL)
                .criterion(hasItem(Items.LIGHT_BLUE_WOOL), conditionsFromItem(Items.LIGHT_BLUE_WOOL))
                .criterion(hasItem(ModItems.SILK), conditionsFromItem(ModItems.SILK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_LIGHT_BLUE_WOOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_BLUE_WOOL, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', ModItems.SILK)
                .input('R', Items.BLUE_WOOL)
                .criterion(hasItem(Items.BLUE_WOOL), conditionsFromItem(Items.BLUE_WOOL))
                .criterion(hasItem(ModItems.SILK), conditionsFromItem(ModItems.SILK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_BLUE_WOOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_PURPLE_WOOL, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', ModItems.SILK)
                .input('R', Items.PURPLE_WOOL)
                .criterion(hasItem(Items.PURPLE_WOOL), conditionsFromItem(Items.PURPLE_WOOL))
                .criterion(hasItem(ModItems.SILK), conditionsFromItem(ModItems.SILK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_PURPLE_WOOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_MAGENTA_WOOL, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', ModItems.SILK)
                .input('R', Items.MAGENTA_WOOL)
                .criterion(hasItem(Items.MAGENTA_WOOL), conditionsFromItem(Items.MAGENTA_WOOL))
                .criterion(hasItem(ModItems.SILK), conditionsFromItem(ModItems.SILK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_MAGENTA_WOOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_PINK_WOOL, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', ModItems.SILK)
                .input('R', Items.PINK_WOOL)
                .criterion(hasItem(Items.PINK_WOOL), conditionsFromItem(Items.PINK_WOOL))
                .criterion(hasItem(ModItems.SILK), conditionsFromItem(ModItems.SILK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_PINK_WOOL)));

        //more fucking carpets


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_BLACK_CARPET, 2)
                .pattern("RR")
                .input('R', ModBlocks.FANCY_BLACK_WOOL)
                .criterion(hasItem(ModBlocks.FANCY_BLACK_WOOL), conditionsFromItem(ModBlocks.FANCY_BLACK_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_BLACK_CARPET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_BROWN_CARPET, 2)
                .pattern("RR")
                .input('R', ModBlocks.FANCY_BROWN_WOOL)
                .criterion(hasItem(ModBlocks.FANCY_BROWN_WOOL), conditionsFromItem(ModBlocks.FANCY_BROWN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_BROWN_CARPET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_GRAY_CARPET, 2)
                .pattern("RR")
                .input('R', ModBlocks.FANCY_GRAY_WOOL)
                .criterion(hasItem(ModBlocks.FANCY_GRAY_WOOL), conditionsFromItem(ModBlocks.FANCY_GRAY_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_GRAY_CARPET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_LIGHT_GRAY_CARPET, 2)
                .pattern("RR")
                .input('R', ModBlocks.FANCY_LIGHT_GRAY_WOOL)
                .criterion(hasItem(ModBlocks.FANCY_LIGHT_GRAY_WOOL), conditionsFromItem(ModBlocks.FANCY_LIGHT_GRAY_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_LIGHT_GRAY_CARPET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_WHITE_CARPET, 2)
                .pattern("RR")
                .input('R', ModBlocks.FANCY_WHITE_WOOL)
                .criterion(hasItem(ModBlocks.FANCY_WHITE_WOOL), conditionsFromItem(ModBlocks.FANCY_WHITE_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_WHITE_CARPET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_BLUE_CARPET, 2)
                .pattern("RR")
                .input('R', ModBlocks.FANCY_BLUE_WOOL)
                .criterion(hasItem(ModBlocks.FANCY_BLUE_WOOL), conditionsFromItem(ModBlocks.FANCY_BLUE_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_BLUE_CARPET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_LIGHT_BLUE_CARPET, 2)
                .pattern("RR")
                .input('R', ModBlocks.FANCY_LIGHT_BLUE_WOOL)
                .criterion(hasItem(ModBlocks.FANCY_LIGHT_BLUE_WOOL), conditionsFromItem(ModBlocks.FANCY_LIGHT_BLUE_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_LIGHT_BLUE_CARPET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_LIME_CARPET, 2)
                .pattern("RR")
                .input('R', ModBlocks.FANCY_LIME_WOOL)
                .criterion(hasItem(ModBlocks.FANCY_LIME_WOOL), conditionsFromItem(ModBlocks.FANCY_LIME_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_LIME_CARPET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_GREEN_CARPET, 2)
                .pattern("RR")
                .input('R', ModBlocks.FANCY_GREEN_WOOL)
                .criterion(hasItem(ModBlocks.FANCY_GREEN_WOOL), conditionsFromItem(ModBlocks.FANCY_GREEN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_GREEN_CARPET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_YELLOW_CARPET, 2)
                .pattern("RR")
                .input('R', ModBlocks.FANCY_YELLOW_WOOL)
                .criterion(hasItem(ModBlocks.FANCY_YELLOW_WOOL), conditionsFromItem(ModBlocks.FANCY_YELLOW_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_YELLOW_CARPET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_RED_CARPET, 2)
                .pattern("RR")
                .input('R', ModBlocks.FANCY_RED_WOOL)
                .criterion(hasItem(ModBlocks.FANCY_RED_WOOL), conditionsFromItem(ModBlocks.FANCY_RED_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_RED_CARPET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_ORANGE_CARPET, 2)
                .pattern("RR")
                .input('R', ModBlocks.FANCY_ORANGE_WOOL)
                .criterion(hasItem(ModBlocks.FANCY_ORANGE_WOOL), conditionsFromItem(ModBlocks.FANCY_ORANGE_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_ORANGE_CARPET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_PINK_CARPET, 2)
                .pattern("RR")
                .input('R', ModBlocks.FANCY_PINK_WOOL)
                .criterion(hasItem(ModBlocks.FANCY_PINK_WOOL), conditionsFromItem(ModBlocks.FANCY_PINK_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_PINK_CARPET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_CYAN_CARPET, 2)
                .pattern("RR")
                .input('R', ModBlocks.FANCY_CYAN_WOOL)
                .criterion(hasItem(ModBlocks.FANCY_CYAN_WOOL), conditionsFromItem(ModBlocks.FANCY_CYAN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_CYAN_CARPET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_MAGENTA_CARPET, 2)
                .pattern("RR")
                .input('R', ModBlocks.FANCY_MAGENTA_WOOL)
                .criterion(hasItem(ModBlocks.FANCY_MAGENTA_WOOL), conditionsFromItem(ModBlocks.FANCY_MAGENTA_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_MAGENTA_CARPET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_PURPLE_CARPET, 2)
                .pattern("RR")
                .input('R', ModBlocks.FANCY_PURPLE_WOOL)
                .criterion(hasItem(ModBlocks.FANCY_PURPLE_WOOL), conditionsFromItem(ModBlocks.FANCY_PURPLE_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_PURPLE_CARPET)));




        // Sandstone Variants

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_SANDSTONE, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', Items.GOLD_NUGGET)
                .input('R', Items.SANDSTONE)
                .criterion(hasItem(Items.GOLD_NUGGET), conditionsFromItem(Items.GOLD_NUGGET))
                .criterion(hasItem(Items.SANDSTONE), conditionsFromItem(Items.SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GILDED_SANDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_CHISELED_SANDSTONE, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', Items.GOLD_NUGGET)
                .input('R', Items.CHISELED_SANDSTONE)
                .criterion(hasItem(Items.GOLD_NUGGET), conditionsFromItem(Items.GOLD_NUGGET))
                .criterion(hasItem(Items.CHISELED_SANDSTONE), conditionsFromItem(Items.CHISELED_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GILDED_CHISELED_SANDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_CUT_SANDSTONE, 4)
                .pattern("RS")
                .pattern("SR")
                .input('S', Items.GOLD_NUGGET)
                .input('R', Items.CUT_SANDSTONE)
                .criterion(hasItem(Items.GOLD_NUGGET), conditionsFromItem(Items.GOLD_NUGGET))
                .criterion(hasItem(Items.CUT_SANDSTONE), conditionsFromItem(Items.CUT_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GILDED_CUT_SANDSTONE)));

        //Desert Oak

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModItems.DESERT_OAK_SIGN, 3)
                .pattern("RRR")
                .pattern("RRR")
                .pattern(" X ")
                .input('R', ModBlocks.DESERT_OAK_PLANKS)
                .input('x', Items.STICK)
                .criterion(hasItem(ModBlocks.DESERT_OAK_PLANKS), conditionsFromItem(ModBlocks.DESERT_OAK_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DESERT_OAK_SIGN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModItems.HANGING_DESERT_OAK_SIGN, 6)
                .pattern("X X")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModBlocks.STRIPPED_DESERT_OAK_LOG)
                .input('X', Blocks.CHAIN)
                .criterion(hasItem(ModBlocks.STRIPPED_DESERT_OAK_LOG), conditionsFromItem(ModBlocks.STRIPPED_DESERT_OAK_LOG))
                .criterion(hasItem(Blocks.CHAIN), conditionsFromItem(Blocks.CHAIN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_DESERT_OAK_SIGN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DESERT_OAK_DOOR, 3)
                .pattern("RR")
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.DESERT_OAK_PLANKS)
                .criterion(hasItem(ModBlocks.DESERT_OAK_PLANKS), conditionsFromItem(ModBlocks.DESERT_OAK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DESERT_OAK_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DESERT_OAK_TRAPDOOR, 2)
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModBlocks.DESERT_OAK_PLANKS)
                .criterion(hasItem(ModBlocks.DESERT_OAK_PLANKS), conditionsFromItem(ModBlocks.DESERT_OAK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DESERT_OAK_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DESERT_OAK_FENCE, 3)
                .pattern("RXR")
                .pattern("RXR")
                .input('R', ModBlocks.DESERT_OAK_PLANKS)
                .input('X', Items.STICK)
                .criterion(hasItem(ModBlocks.DESERT_OAK_PLANKS), conditionsFromItem(ModBlocks.DESERT_OAK_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DESERT_OAK_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DESERT_OAK_FENCE_GATE, 1)
                .pattern("RXR")
                .pattern("RXR")
                .input('X', ModBlocks.DESERT_OAK_PLANKS)
                .input('R', Items.STICK)
                .criterion(hasItem(ModBlocks.DESERT_OAK_PLANKS), conditionsFromItem(ModBlocks.DESERT_OAK_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DESERT_OAK_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DESERT_OAK_SLAB, 6)
                .pattern("RRR")
                .input('R', ModBlocks.DESERT_OAK_PLANKS)
                .criterion(hasItem(ModBlocks.DESERT_OAK_PLANKS), conditionsFromItem(ModBlocks.DESERT_OAK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DESERT_OAK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DESERT_OAK_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.DESERT_OAK_PLANKS)
                .criterion(hasItem(ModBlocks.DESERT_OAK_PLANKS), conditionsFromItem(ModBlocks.DESERT_OAK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DESERT_OAK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, Items.OAK_BOAT, 1)
                .pattern("R R")
                .pattern("RRR")
                .input('R', ModBlocks.DESERT_OAK_PLANKS)
                .criterion(hasItem(ModBlocks.DESERT_OAK_PLANKS), conditionsFromItem(ModBlocks.DESERT_OAK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Items.OAK_BOAT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DESERT_OAK_WOOD, 4)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.DESERT_OAK_LOG)
                .criterion(hasItem(ModBlocks.DESERT_OAK_LOG), conditionsFromItem(ModBlocks.DESERT_OAK_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DESERT_OAK_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_DESERT_OAK_WOOD, 4)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.STRIPPED_DESERT_OAK_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_DESERT_OAK_LOG), conditionsFromItem(ModBlocks.STRIPPED_DESERT_OAK_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STRIPPED_DESERT_OAK_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DESERT_OAK_PRESSURE_PLATE, 1)
                .pattern("RR")
                .input('R', ModBlocks.DESERT_OAK_PLANKS)
                .criterion(hasItem(ModBlocks.DESERT_OAK_PLANKS), conditionsFromItem(ModBlocks.DESERT_OAK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DESERT_OAK_PRESSURE_PLATE)));

        //Swords recipe

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OBSIDIAN_SWORD, 1)
                .pattern("R")
                .pattern("R")
                .pattern("X")
                .input('R', ModItems.OBSIDIAN_SHARD)
                .input('X', Items.STICK)
                .criterion(hasItem(ModItems.OBSIDIAN_SHARD), conditionsFromItem(ModItems.OBSIDIAN_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WEDGE_OBSIDIAN_SWORD, 1)
                .pattern("R")
                .pattern("R")
                .pattern("X")
                .input('R', ModItems.WEDGE_OBSIDIAN_SHARD)
                .input('X', Items.STICK)
                .criterion(hasItem(ModItems.WEDGE_OBSIDIAN_SHARD), conditionsFromItem(ModItems.WEDGE_OBSIDIAN_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WEDGE_OBSIDIAN_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SHARP_OBSIDIAN_SWORD, 1)
                .pattern("R")
                .pattern("R")
                .pattern("X")
                .input('R', ModItems.SHARP_OBSIDIAN_SHARD)
                .input('X', Items.STICK)
                .criterion(hasItem(ModItems.SHARP_OBSIDIAN_SHARD), conditionsFromItem(ModItems.SHARP_OBSIDIAN_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SHARP_OBSIDIAN_SWORD)));

        //custom ones
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SHARP_REGULAR_OBSIDIAN_SWORD, 1)
                .pattern("R")
                .pattern("C")
                .pattern("X")
                .input('R', ModItems.SHARP_OBSIDIAN_SHARD)
                .input('C', ModItems.OBSIDIAN_SHARD)
                .input('X', Items.STICK)
                .criterion(hasItem(ModItems.OBSIDIAN_SHARD), conditionsFromItem(ModItems.OBSIDIAN_SHARD))
                .criterion(hasItem(ModItems.SHARP_OBSIDIAN_SHARD), conditionsFromItem(ModItems.SHARP_OBSIDIAN_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SHARP_REGULAR_OBSIDIAN_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WEDGE_REGULAR_OBSIDIAN_SWORD, 1)
                .pattern("R")
                .pattern("C")
                .pattern("X")
                .input('R', ModItems.WEDGE_OBSIDIAN_SHARD)
                .input('C', ModItems.OBSIDIAN_SHARD)
                .input('X', Items.STICK)
                .criterion(hasItem(ModItems.OBSIDIAN_SHARD), conditionsFromItem(ModItems.OBSIDIAN_SHARD))
                .criterion(hasItem(ModItems.WEDGE_OBSIDIAN_SHARD), conditionsFromItem(ModItems.WEDGE_OBSIDIAN_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WEDGE_REGULAR_OBSIDIAN_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SHARP_WEDGE_OBSIDIAN_SWORD, 1)
                .pattern("R")
                .pattern("C")
                .pattern("X")
                .input('R', ModItems.SHARP_OBSIDIAN_SHARD)
                .input('C', ModItems.WEDGE_OBSIDIAN_SHARD)
                .input('X', Items.STICK)
                .criterion(hasItem(ModItems.WEDGE_OBSIDIAN_SHARD), conditionsFromItem(ModItems.WEDGE_OBSIDIAN_SHARD))
                .criterion(hasItem(ModItems.SHARP_OBSIDIAN_SHARD), conditionsFromItem(ModItems.SHARP_OBSIDIAN_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SHARP_WEDGE_OBSIDIAN_SWORD)));

        //daggers

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OBSIDIAN_DAGGER, 1)
                .pattern("R")
                .pattern("X")
                .input('R', ModItems.OBSIDIAN_SHARD)
                .input('X', Items.STICK)
                .criterion(hasItem(ModItems.OBSIDIAN_SHARD), conditionsFromItem(ModItems.OBSIDIAN_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_DAGGER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WEDGE_OBSIDIAN_DAGGER, 1)
                .pattern("R")
                .pattern("X")
                .input('R', ModItems.WEDGE_OBSIDIAN_SHARD)
                .input('X', Items.STICK)
                .criterion(hasItem(ModItems.WEDGE_OBSIDIAN_SHARD), conditionsFromItem(ModItems.WEDGE_OBSIDIAN_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WEDGE_OBSIDIAN_DAGGER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SHARP_OBSIDIAN_DAGGER, 1)
                .pattern("R")
                .pattern("X")
                .input('R', ModItems.SHARP_OBSIDIAN_SHARD)
                .input('X', Items.STICK)
                .criterion(hasItem(ModItems.SHARP_OBSIDIAN_SHARD), conditionsFromItem(ModItems.SHARP_OBSIDIAN_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SHARP_OBSIDIAN_DAGGER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_BRICK_SLAB, 6)
                .pattern("RRR")
                .input('R', ModBlocks.TERRACOTTA_BRICKS)
                .criterion(hasItem(ModBlocks.TERRACOTTA_BRICKS), conditionsFromItem(ModBlocks.TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TERRACOTTA_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_BRICK_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.TERRACOTTA_BRICKS)
                .criterion(hasItem(ModBlocks.TERRACOTTA_BRICKS), conditionsFromItem(ModBlocks.TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TERRACOTTA_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_BRICK_WALL, 6)
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModBlocks.TERRACOTTA_BRICKS)
                .criterion(hasItem(ModBlocks.TERRACOTTA_BRICKS), conditionsFromItem(ModBlocks.TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TERRACOTTA_BRICK_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE, 4)
                .pattern("RR")
                .pattern("RR")
                .input('R', Blocks.COBBLESTONE)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUT_COBBLESTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModBlocks.SPICE_BARREL, 1)
                .pattern("RRR")
                .pattern("RXR")
                .pattern("RRR")
                .input('R', ModItems.RARE_SPICES)
                .input('X', Items.BARREL)
                .criterion(hasItem(ModItems.RARE_SPICES), conditionsFromItem(ModItems.RARE_SPICES))
                .criterion(hasItem(Items.BARREL), conditionsFromItem(Items.BARREL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SPICE_BARREL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BATTERED_AXE, 1)
                .pattern("RYR")
                .pattern(" X ")
                .input('Y', ModItems.BATTERED_AXE_REMNANT)
                .input('X', Items.STICK)
                .input('R', Items.COPPER_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(ModItems.BATTERED_AXE_REMNANT), conditionsFromItem(ModItems.BATTERED_AXE_REMNANT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BATTERED_AXE)));



    }
}
