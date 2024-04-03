package jaiz.desertupdate.item;

import jaiz.desertupdate.DunesDrought;
import jaiz.desertupdate.block.ModBlocks;
import jaiz.desertupdate.entity.ModEntities;
import jaiz.desertupdate.item.custom.*;
import jaiz.desertupdate.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DunesDrought.MOD_ID, name), item);
    }

    // Food
    private static void addItemsToFoodGroup(FabricItemGroupEntries entries) {
        entries.add(GOURMET_MEAL);
    }

    // Ingredients

    public static final Item SILK = registerItem("silk", new Item(new FabricItemSettings()));
    public static final Item BATTERED_AXE_REMNANT = registerItem("battered_axe_remnant", new Item(new FabricItemSettings()));
    public static final Item ANCIENT_HORN_01 = registerItem("ancient_horn_01", new HornItem(new FabricItemSettings().maxCount(1)));
    public static final Item ANCIENT_HORN_02 = registerItem("ancient_horn_02", new HornItem2(new FabricItemSettings().maxCount(1)));
    public static final Item ANCIENT_HORN_03 = registerItem("ancient_horn_03", new HornItem3(new FabricItemSettings().maxCount(1)));
    public static final Item RARE_SPICES = registerItem("rare_spices", new Item(new FabricItemSettings().food(ModFoodComponents.RARE_SPICES)));
    public static final Item GOURMET_MEAL = registerItem("gourmet_meal", new Item(new FabricItemSettings().food(ModFoodComponents.GOURMET_MEAL).maxCount(16)));
    public static final Item OBSIDIAN_SHARD = registerItem("obsidian_shard", new Item(new FabricItemSettings()));
    public static final Item SHARP_OBSIDIAN_SHARD = registerItem("sharp_obsidian_shard", new Item(new FabricItemSettings()));
    public static final Item WEDGE_OBSIDIAN_SHARD = registerItem("wedge_obsidian_shard", new Item(new FabricItemSettings()));

    //spawneggs

    public static final Item MIMIC_POT = registerItem("mimic_pot", new SpawnEggItem(ModEntities.MASON_MOUTH, 0xFFFFFF, 0xFFFFFF, new FabricItemSettings()));
    public static final Item BANDIT_SPAWN_EGG = registerItem("bandit_spawn_egg", new SpawnEggItem(ModEntities.BANDIT, 0xD3B081, 0x715F3B, new FabricItemSettings()));

    private static void addItemsToIngredientsGroup(FabricItemGroupEntries entries) {
        entries.add(SILK);
        entries.add(RARE_SPICES);
        entries.add(OBSIDIAN_SHARD);
        entries.add(WEDGE_OBSIDIAN_SHARD);
        entries.add(SHARP_OBSIDIAN_SHARD);
        entries.add(BATTERED_AXE_REMNANT);
    }

    // Armour Items

    // Tools + Weapons

    public static final Item OBSIDIAN_DAGGER = registerItem("obsidian_dagger", new SwordItem(ModToolMaterial.OBSIDIAN_DAGGER, 2, -2.4f, new FabricItemSettings()));
    public static final Item SHARP_OBSIDIAN_DAGGER = registerItem("sharp_obsidian_dagger", new SwordItem(ModToolMaterial.SHARP_OBSIDIAN_DAGGER, 2, -2.0f, new FabricItemSettings()));
    public static final Item WEDGE_OBSIDIAN_DAGGER = registerItem("wedge_obsidian_dagger", new SwordItem(ModToolMaterial.WEDGE_OBSIDIAN_DAGGER, 3, -2.8f, new FabricItemSettings()));


    public static final Item OBSIDIAN_SWORD = registerItem("obsidian_sword", new SwordItem(ModToolMaterial.OBSIDIAN_SWORD, 2, -2.4f, new FabricItemSettings()));
    public static final Item SHARP_OBSIDIAN_SWORD = registerItem("sharp_obsidian_sword", new SwordItem(ModToolMaterial.SHARP_OBSIDIAN_SWORD, 2, -2.0f, new FabricItemSettings()));
    public static final Item WEDGE_OBSIDIAN_SWORD = registerItem("wedge_obsidian_sword", new SwordItem(ModToolMaterial.WEDGE_OBSIDIAN_SWORD, 1, -2.8f, new FabricItemSettings()));

    public static final Item WEDGE_REGULAR_OBSIDIAN_SWORD = registerItem("wedge_regular_obsidian_sword", new SwordItem(ModToolMaterial.WEDGE_REGULAR_OBSIDIAN_SWORD, 2, -2.8f, new FabricItemSettings()));
    public static final Item SHARP_REGULAR_OBSIDIAN_SWORD = registerItem("sharp_regular_obsidian_sword", new SwordItem(ModToolMaterial.SHARP_REGULAR_OBSIDIAN_SWORD, 3, -2.0f, new FabricItemSettings()));
    public static final Item SHARP_WEDGE_OBSIDIAN_SWORD = registerItem("sharp_wedge_obsidian_sword", new SwordItem(ModToolMaterial.SHARP_WEDGE_OBSIDIAN_SWORD, 3, -3.2f, new FabricItemSettings()));


    public static final Item BATTERED_AXE = registerItem("battered_axe", new AxeItem(ModToolMaterial.BATTERED, 5, -2.8f, new FabricItemSettings()));

    //Music

    public static final Item ORIGAMI_HAIRBALL_MUSIC_DISC = registerItem("origami_hairball_music_disc", new MusicDiscItem(4, ModSounds.ORIGAMI_HAIRBALL, new FabricItemSettings().maxCount(1), 300));

    private static void addItemsToCombatGroup(FabricItemGroupEntries entries) {
        entries.add(BATTERED_AXE);
        entries.add(OBSIDIAN_DAGGER);
        entries.add(WEDGE_OBSIDIAN_DAGGER);
        entries.add(SHARP_OBSIDIAN_DAGGER);
        entries.add(OBSIDIAN_SWORD);
        entries.add(WEDGE_OBSIDIAN_SWORD);
        entries.add(SHARP_OBSIDIAN_SWORD);
        entries.add(WEDGE_REGULAR_OBSIDIAN_SWORD);
        entries.add(SHARP_WEDGE_OBSIDIAN_SWORD);
        entries.add(SHARP_REGULAR_OBSIDIAN_SWORD);
    }


    // Spawn Eggs


    private static void addItemsToEggItemGroup(FabricItemGroupEntries entries) {
        entries.add(MIMIC_POT);
        entries.add(BANDIT_SPAWN_EGG);

    }


    //Colour Blocks
    private static void addItemsToColourBlockGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.FANCY_WHITE_WOOL);
        entries.add(ModBlocks.FANCY_LIGHT_GRAY_WOOL);
        entries.add(ModBlocks.FANCY_GRAY_WOOL);
        entries.add(ModBlocks.FANCY_BLACK_WOOL);
        entries.add(ModBlocks.FANCY_BROWN_WOOL);
        entries.add(ModBlocks.FANCY_RED_WOOL);
        entries.add(ModBlocks.FANCY_ORANGE_WOOL);
        entries.add(ModBlocks.FANCY_YELLOW_WOOL);
        entries.add(ModBlocks.FANCY_LIME_WOOL);
        entries.add(ModBlocks.FANCY_GREEN_WOOL);
        entries.add(ModBlocks.FANCY_CYAN_WOOL);
        entries.add(ModBlocks.FANCY_LIGHT_BLUE_WOOL);
        entries.add(ModBlocks.FANCY_BLUE_WOOL);
        entries.add(ModBlocks.FANCY_PURPLE_WOOL);
        entries.add(ModBlocks.FANCY_MAGENTA_WOOL);
        entries.add(ModBlocks.FANCY_PINK_WOOL);

        entries.add(ModBlocks.FANCY_WHITE_CARPET);
        entries.add(ModBlocks.FANCY_LIGHT_GRAY_CARPET);
        entries.add(ModBlocks.FANCY_GRAY_CARPET);
        entries.add(ModBlocks.FANCY_BLACK_CARPET);
        entries.add(ModBlocks.FANCY_BROWN_CARPET);
        entries.add(ModBlocks.FANCY_RED_CARPET);
        entries.add(ModBlocks.FANCY_ORANGE_CARPET);
        entries.add(ModBlocks.FANCY_YELLOW_CARPET);
        entries.add(ModBlocks.FANCY_LIME_CARPET);
        entries.add(ModBlocks.FANCY_GREEN_CARPET);
        entries.add(ModBlocks.FANCY_CYAN_CARPET);
        entries.add(ModBlocks.FANCY_LIGHT_BLUE_CARPET);
        entries.add(ModBlocks.FANCY_BLUE_CARPET);
        entries.add(ModBlocks.FANCY_PURPLE_CARPET);
        entries.add(ModBlocks.FANCY_MAGENTA_CARPET);
        entries.add(ModBlocks.FANCY_PINK_CARPET);
    }

    //Building

    public static final Item DESERT_OAK_SIGN = registerItem("desert_oak_sign", new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_DESERT_OAK_SIGN, ModBlocks.WALL_DESERT_OAK_SIGN));
    public static final Item HANGING_DESERT_OAK_SIGN = registerItem("hanging_desert_oak_sign", new HangingSignItem(ModBlocks.HANGING_DESERT_OAK_SIGN, ModBlocks.WALL_HANGING_DESERT_OAK_SIGN, new FabricItemSettings().maxCount(16)));

    private static void addItemsToBuildingBlockGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.GILDED_CHISELED_SANDSTONE);
        entries.add(ModBlocks.GILDED_CUT_SANDSTONE);
        entries.add(ModBlocks.GILDED_SANDSTONE);
        entries.add(ModBlocks.CUT_COBBLESTONE);
        entries.add(ModBlocks.TERRACOTTA_BRICKS);
        entries.add(ModBlocks.TERRACOTTA_BRICK_STAIRS);
        entries.add(ModBlocks.TERRACOTTA_BRICK_WALL);
        entries.add(ModBlocks.TERRACOTTA_BRICK_SLAB);
        entries.add(ModBlocks.DESERT_OAK_PLANKS);
        entries.add(ModBlocks.DESERT_OAK_DOOR);
        entries.add(ModBlocks.DESERT_OAK_TRAPDOOR);
        entries.add(ModBlocks.DESERT_OAK_FENCE);
        entries.add(ModBlocks.DESERT_OAK_FENCE_GATE);
        entries.add(ModBlocks.DESERT_OAK_SLAB);
        entries.add(ModBlocks.DESERT_OAK_STAIRS);
        entries.add(ModItems.DESERT_OAK_SIGN);
        entries.add(ModItems.HANGING_DESERT_OAK_SIGN);
        entries.add(ModBlocks.SPICE_BARREL);

    }

    private static void addItemsToNaturalBlockGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.DESERT_OAK_SAPLING);
        entries.add(ModBlocks.DESERT_OAK_LEAVES);
        entries.add(ModBlocks.DESERT_OAK_LOG);
        entries.add(ModBlocks.DESERT_OAK_WOOD);
        entries.add(ModBlocks.STRIPPED_DESERT_OAK_LOG);
        entries.add(ModBlocks.STRIPPED_DESERT_OAK_WOOD);
        entries.add(ModBlocks.DESERT_OAK_PLANKS);
        entries.add(ModBlocks.FOSSIL_SOIL);
        entries.add(ModBlocks.HONEYCOMB_DIRT);


    }

    private static void addItemsToFunctionalBlockGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.DESERT_OAK_DOOR);
        entries.add(ModBlocks.DESERT_OAK_FENCE);
        entries.add(ModBlocks.DESERT_OAK_FENCE_GATE);
        entries.add(ModItems.DESERT_OAK_SIGN);
        entries.add(ModItems.HANGING_DESERT_OAK_SIGN);
        entries.add(ModBlocks.DESERT_OAK_TRAPDOOR);
        entries.add(ModBlocks.DESERT_OAK_PRESSURE_PLATE);
        entries.add(ModBlocks.DESERT_OAK_BUTTON);
        entries.add(MIMIC_POT);
        entries.add(ORIGAMI_HAIRBALL_MUSIC_DISC);
    }

    private static void addItemsToToolsGroup(FabricItemGroupEntries entries) {
        entries.add(ANCIENT_HORN_01);
        entries.add(ANCIENT_HORN_02);
        entries.add(ANCIENT_HORN_03);
    }

    // Item group registries

    public static void registerModItems() {
        DunesDrought.LOGGER.info("Registering Mod Items for " + DunesDrought.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(ModItems::addItemsToEggItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(ModItems::addItemsToColourBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addItemsToFunctionalBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsGroup);
    }
}
