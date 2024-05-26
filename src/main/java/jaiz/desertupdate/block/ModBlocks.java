package jaiz.desertupdate.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import jaiz.desertupdate.DunesDrought;
import jaiz.desertupdate.world.ModConfiguredFeatures;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModBlocks {

    public static final Block FANCY_WHITE_WOOL = registerBlock("fancy_white_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_BLUE_WOOL = registerBlock("fancy_blue_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_CYAN_WOOL = registerBlock("fancy_cyan_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_LIGHT_BLUE_WOOL = registerBlock("fancy_light_blue_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_BROWN_WOOL = registerBlock("fancy_brown_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BROWN_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_PINK_WOOL = registerBlock("fancy_pink_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.PINK_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_MAGENTA_WOOL = registerBlock("fancy_magenta_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_PURPLE_WOOL = registerBlock("fancy_purple_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_BLACK_WOOL = registerBlock("fancy_black_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_LIGHT_GRAY_WOOL = registerBlock("fancy_light_gray_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_GRAY_WOOL = registerBlock("fancy_gray_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.GRAY_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_LIME_WOOL = registerBlock("fancy_lime_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.LIME_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_GREEN_WOOL = registerBlock("fancy_green_wool",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.GREEN_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_ORANGE_WOOL = registerBlock("fancy_orange_wool",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_RED_WOOL = registerBlock("fancy_red_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_YELLOW_WOOL = registerBlock("fancy_yellow_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_WOOL).sounds(BlockSoundGroup.WOOL)));

    //Carpets

    public static final Block FANCY_WHITE_CARPET = registerBlock("fancy_white_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_BLUE_CARPET = registerBlock("fancy_blue_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.BLUE_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_CYAN_CARPET = registerBlock("fancy_cyan_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.CYAN_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_LIGHT_BLUE_CARPET = registerBlock("fancy_light_blue_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_BROWN_CARPET = registerBlock("fancy_brown_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.BROWN_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_PINK_CARPET = registerBlock("fancy_pink_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.PINK_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_MAGENTA_CARPET = registerBlock("fancy_magenta_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_PURPLE_CARPET = registerBlock("fancy_purple_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_BLACK_CARPET = registerBlock("fancy_black_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.BLACK_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_LIGHT_GRAY_CARPET = registerBlock("fancy_light_gray_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_GRAY_CARPET = registerBlock("fancy_gray_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.GRAY_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_LIME_CARPET = registerBlock("fancy_lime_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.LIME_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_GREEN_CARPET = registerBlock("fancy_green_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.GREEN_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_ORANGE_CARPET = registerBlock("fancy_orange_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_RED_CARPET = registerBlock("fancy_red_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.RED_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block FANCY_YELLOW_CARPET = registerBlock("fancy_yellow_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_CARPET).sounds(BlockSoundGroup.WOOL)));

    //sandstone

    public static final Block GILDED_SANDSTONE = registerBlock("gilded_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE).sounds(BlockSoundGroup.GILDED_BLACKSTONE).requiresTool()));
    public static final Block GILDED_CUT_SANDSTONE = registerBlock("gilded_cut_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE).sounds(BlockSoundGroup.GILDED_BLACKSTONE).requiresTool()));
    public static final Block GILDED_CHISELED_SANDSTONE = registerBlock("gilded_chiseled_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE).sounds(BlockSoundGroup.GILDED_BLACKSTONE).requiresTool()));


    public static final Block DESERT_OAK_LOG = registerBlock("desert_oak_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(3f)));

    public static final SaplingGenerator DESERT_OAK = new SaplingGenerator("desert_oak",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.DESERT_OAK_KEY),
            Optional.empty());
    public static final Block DESERT_OAK_SAPLING = registerBlock("desert_oak_sapling",
            new SaplingBlock(DESERT_OAK, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    public static final Block DESERT_OAK_WOOD = registerBlock("desert_oak_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(3f)));

    public static final Block STRIPPED_DESERT_OAK_LOG = registerBlock("stripped_desert_oak_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(3f)));

    public static final Block STRIPPED_DESERT_OAK_WOOD = registerBlock("stripped_desert_oak_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(3f)));

    public static final Block DESERT_OAK_PLANKS = registerBlock("desert_oak_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(3f)));

    public static final Block DESERT_OAK_BUTTON = registerBlock("desert_oak_button",
            new ButtonBlock(BlockSetType.OAK, 10, FabricBlockSettings.copyOf(Blocks.OAK_BUTTON)));
    public static final Block DESERT_OAK_PRESSURE_PLATE = registerBlock("desert_oak_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE)));

    public static final Block DESERT_OAK_LEAVES = registerBlock("desert_oak_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));

    public static final Identifier DESERT_OAK_SIGN_TEXTURE = new Identifier(DunesDrought.MOD_ID, "entity/signs/desert_oak");
    public static final Identifier DESERT_OAK_HANGING_SIGN_TEXTURE = new Identifier(DunesDrought.MOD_ID, "entity/signs/hanging/desert_oak");
    public static final Identifier DESERT_OAK_HANGING_GUI_SIGN_TEXTURE = new Identifier(DunesDrought.MOD_ID, "textures/gui/hanging_signs/desert_oak");

    public static final Block STANDING_DESERT_OAK_SIGN = Registry.register(Registries.BLOCK, new Identifier(DunesDrought.MOD_ID, "desert_oak_standing_sign"),
    new TerraformSignBlock(DESERT_OAK_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));

    public static final Block WALL_DESERT_OAK_SIGN = Registry.register(Registries.BLOCK, new Identifier(DunesDrought.MOD_ID, "desert_oak_wall_sign"),
            new TerraformWallSignBlock(DESERT_OAK_SIGN_TEXTURE, FabricBlockSettings.copyOf(ModBlocks.STANDING_DESERT_OAK_SIGN)));

    public static final Block HANGING_DESERT_OAK_SIGN = Registry.register(Registries.BLOCK, new Identifier(DunesDrought.MOD_ID, "desert_oak_hanging_sign"),
            new TerraformHangingSignBlock(DESERT_OAK_HANGING_SIGN_TEXTURE, DESERT_OAK_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN)));

    public static final Block WALL_HANGING_DESERT_OAK_SIGN = Registry.register(Registries.BLOCK, new Identifier(DunesDrought.MOD_ID, "desert_oak_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(DESERT_OAK_HANGING_SIGN_TEXTURE, DESERT_OAK_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(ModBlocks.HANGING_DESERT_OAK_SIGN)));

    // Fancy Bits for the desert oak
    public static final Block DESERT_OAK_STAIRS = registerBlock("desert_oak_stairs",
            new StairsBlock(ModBlocks.DESERT_OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block DESERT_OAK_SLAB = registerBlock("desert_oak_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));

    public static final Block DESERT_OAK_FENCE = registerBlock("desert_oak_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DESERT_OAK_FENCE_GATE = registerBlock("desert_oak_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block DESERT_OAK_DOOR = registerBlock("desert_oak_door",
            new DoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block DESERT_OAK_TRAPDOOR = registerBlock("desert_oak_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));


    public static final BlockFamily DESERT_OAK_FAMILY = BlockFamilies.register(ModBlocks.DESERT_OAK_PLANKS)
            .sign(ModBlocks.STANDING_DESERT_OAK_SIGN, ModBlocks.WALL_DESERT_OAK_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final BlockFamily TERRACOTTA_BRICK_FAMILY = BlockFamilies.register(ModBlocks.TERRACOTTA_BRICKS)
            .group("terracotta").build();

    public static final Block FOSSIL_SOIL = registerBlock("fossil_soil",
            new BrushableBlock(Blocks.AIR, SoundEvents.ITEM_BRUSH_BRUSHING_GRAVEL, SoundEvents.ITEM_BRUSH_BRUSHING_GRAVEL_COMPLETE, AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(Instrument.SNARE).strength(5f).sounds(BlockSoundGroup.SUSPICIOUS_GRAVEL).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block HONEYCOMB_DIRT = registerBlock("honeycomb_dirt",
            new Block(FabricBlockSettings.copyOf(Blocks.COARSE_DIRT).strength(2f)));

    public static final Block TERRACOTTA_BRICKS = registerBlock("terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block TERRACOTTA_BRICK_STAIRS = registerBlock("terracotta_brick_stairs",
            new StairsBlock(ModBlocks.TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).requiresTool()));

    public static final Block TERRACOTTA_BRICK_SLAB = registerBlock("terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).requiresTool()));

    public static final Block TERRACOTTA_BRICK_WALL= registerBlock("terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).requiresTool()));

    public static final Block SPICE_BARREL = registerBlock("spice_barrel",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(DunesDrought.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(DunesDrought.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        DunesDrought.LOGGER.info("Registering ModBlocks for " + DunesDrought.MOD_ID);
    }

}
