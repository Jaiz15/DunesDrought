package jaiz.desertupdate.datagen;

import jaiz.desertupdate.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
         getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.DESERT_OAK_FENCE)
                 .add(ModBlocks.TERRACOTTA_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.TERRACOTTA_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.DESERT_OAK_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.DESERT_OAK_LEAVES);


        getOrCreateTagBuilder(BlockTags.WOOL_CARPETS)
                .add(ModBlocks.FANCY_WHITE_CARPET)
                .add(ModBlocks.FANCY_LIGHT_GRAY_CARPET)
                .add(ModBlocks.FANCY_GRAY_CARPET)
                .add(ModBlocks.FANCY_BLACK_CARPET)
                .add(ModBlocks.FANCY_BROWN_CARPET)
                .add(ModBlocks.FANCY_RED_CARPET)
                .add(ModBlocks.FANCY_ORANGE_CARPET)
                .add(ModBlocks.FANCY_YELLOW_CARPET)
                .add(ModBlocks.FANCY_LIME_CARPET)
                .add(ModBlocks.FANCY_GREEN_CARPET)
                .add(ModBlocks.FANCY_CYAN_CARPET)
                .add(ModBlocks.FANCY_LIGHT_BLUE_CARPET)
                .add(ModBlocks.FANCY_BLUE_CARPET)
                .add(ModBlocks.FANCY_PURPLE_CARPET)
                .add(ModBlocks.FANCY_MAGENTA_CARPET)
                .add(ModBlocks.FANCY_PINK_CARPET);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.DESERT_OAK_LOG)
                .add(ModBlocks.DESERT_OAK_WOOD)
                .add(ModBlocks.STRIPPED_DESERT_OAK_LOG)
                .add(ModBlocks.STRIPPED_DESERT_OAK_WOOD);


        getOrCreateTagBuilder(BlockTags.ANIMALS_SPAWNABLE_ON)
                .add(ModBlocks.FOSSIL_SOIL)
                .add(ModBlocks.HONEYCOMB_DIRT);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.DESERT_OAK_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.DESERT_OAK_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.DESERT_OAK_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.DESERT_OAK_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.DESERT_OAK_FENCE);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.DESERT_OAK_DOOR)
                .add(ModBlocks.DESERT_OAK_TRAPDOOR);



    }
}
