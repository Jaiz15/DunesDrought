package jaiz.desertupdate;

import jaiz.desertupdate.block.ModBlocks;
import jaiz.desertupdate.entity.ModEntities;
import jaiz.desertupdate.entity.custom.BanditEntity;
import jaiz.desertupdate.entity.custom.MasonmouthEntity;
import jaiz.desertupdate.item.ModItems;
import jaiz.desertupdate.item.custom.ModFoodComponents;
import jaiz.desertupdate.util.ModCustomTrades;
import jaiz.desertupdate.villager.ModVillagers;
import jaiz.desertupdate.world.ModConfiguredFeatures;
import jaiz.desertupdate.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DunesDrought implements ModInitializer {

	public static final String MOD_ID = "desertupdate";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Mod Blocks
		ModBlocks.registerModBlocks();

		//Mod Items
		ModItems.registerModItems();

		ModCustomTrades.registerCustomTrades();

		ModWorldGeneration.generateModWorldGen();

		FabricDefaultAttributeRegistry.register(ModEntities.MASON_MOUTH, MasonmouthEntity.createMasonMouthAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.BANDIT, BanditEntity.createBanditAttributes());

		// Flammable Mod Blocks Registry
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_WHITE_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_LIGHT_GRAY_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_GRAY_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_BLACK_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_BROWN_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_RED_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_ORANGE_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_YELLOW_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_LIME_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_GREEN_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_LIGHT_BLUE_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_CYAN_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_BLUE_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_PURPLE_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_PINK_WOOL, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_MAGENTA_WOOL, 30, 60);

		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_WHITE_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_LIGHT_GRAY_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_GRAY_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_BLACK_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_BROWN_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_RED_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_ORANGE_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_YELLOW_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_LIME_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_GREEN_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_LIGHT_BLUE_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_CYAN_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_BLUE_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_PURPLE_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_PINK_CARPET, 30, 60);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.FANCY_MAGENTA_CARPET, 30, 60);

		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.DESERT_OAK_LOG, 3, 5);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.STRIPPED_DESERT_OAK_LOG, 3, 5);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.STRIPPED_DESERT_OAK_WOOD, 3, 5);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.DESERT_OAK_WOOD, 3, 5);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.DESERT_OAK_PLANKS, 3, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.SPICE_BARREL, 1, 40);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.DESERT_OAK_SLAB, 3, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.DESERT_OAK_STAIRS, 3, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.DESERT_OAK_FENCE, 3, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.DESERT_OAK_FENCE_GATE, 3, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.DESERT_OAK_TRAPDOOR, 3, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.DESERT_OAK_DOOR, 3, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.DESERT_OAK_LEAVES, 20, 40);

		StrippableBlockRegistry.register(ModBlocks.DESERT_OAK_LOG, ModBlocks.STRIPPED_DESERT_OAK_LOG);
		StrippableBlockRegistry.register(ModBlocks.DESERT_OAK_WOOD, ModBlocks.STRIPPED_DESERT_OAK_WOOD);

		ModVillagers.registerVillagers();




	}
}