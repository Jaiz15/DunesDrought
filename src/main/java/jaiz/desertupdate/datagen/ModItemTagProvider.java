package jaiz.desertupdate.datagen;

import jaiz.desertupdate.block.ModBlocks;
import jaiz.desertupdate.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.DESERT_OAK_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.BATTERED_AXE);

        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.ORIGAMI_HAIRBALL_MUSIC_DISC);


        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.DESERT_OAK_LOG.asItem())
                .add(ModBlocks.DESERT_OAK_WOOD.asItem())
                .add(ModBlocks.STRIPPED_DESERT_OAK_LOG.asItem())
                .add(ModBlocks.STRIPPED_DESERT_OAK_WOOD.asItem());

    }


}
