package jaiz.desertupdate.util;

import jaiz.desertupdate.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {

        //armourer
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 1),
                    new ItemStack(Items.IRON_NUGGET, 3),
                    3, 2, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 3),
                    new ItemStack(Items.RAW_IRON, 1),
                    1, 2, 0.05f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 2),
                    new ItemStack(Items.RAW_IRON, 3),
                    3, 2, 0.05f
            ));

        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 3),
                    new ItemStack(Items.IRON_INGOT, 1),
                    3, 3, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 10),
                    new ItemStack(Items.RAW_IRON_BLOCK, 1),
                    2, 2, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 15),
                    new ItemStack(Items.IRON_BLOCK, 1),
                    1, 1, 0.05f
            ));

        });


        //weapon smith
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 1),
                    new ItemStack(Items.GOLD_NUGGET, 2),
                    8, 2, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 3),
                    new ItemStack(Items.RAW_GOLD, 1),
                    1, 2, 0.05f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 2),
                    new ItemStack(Items.RAW_GOLD, 3),
                    3, 2, 0.05f
            ));

        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 3),
                    new ItemStack(Items.GOLD_INGOT, 1),
                    3, 3, 0.05f
            ));

        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 10),
                    new ItemStack(ModItems.OBSIDIAN_SHARD, 1),
                    2, 2, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 10),
                    new ItemStack(ModItems.OBSIDIAN_SHARD, 1),
                    2, 2, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 10),
                    new ItemStack(ModItems.SHARP_OBSIDIAN_SHARD, 1),
                    2, 2, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 10),
                    new ItemStack(ModItems.WEDGE_OBSIDIAN_SHARD, 1),
                    2, 2, 0.05f
            ));

        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 40),
                    new ItemStack(ModItems.WEDGE_OBSIDIAN_DAGGER, 1),
                    1, 1, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 40),
                    new ItemStack(ModItems.SHARP_OBSIDIAN_DAGGER, 1),
                    1, 1, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 40),
                    new ItemStack(ModItems.OBSIDIAN_DAGGER, 1),
                    1, 1, 0.05f
            ));

        });

        //loom guy
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 6),
                    new ItemStack(Items.COBWEB, 1),
                    5, 2, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 8),
                    new ItemStack(Items.SHEARS, 1),
                    3, 2, 0.05f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 2),
                    new ItemStack(Items.WHITE_WOOL, 1),
                    12, 2, 0.05f
            ));

        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 3),
                    new ItemStack(ModItems.SILK, 1),
                    3, 1, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 2),
                    new ItemStack(Items.STRING, 1),
                    2, 2, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 1),
                    new ItemStack(ModItems.SILK, 1),
                    10, 3, 0.05f
            ));

        });

        //cleric
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 20),
                    new ItemStack(Items.NAUTILUS_SHELL, 1),
                    8, 5, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 10),
                    new ItemStack(Items.DECORATED_POT, 1),
                    3, 2, 0.05f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 3),
                    new ItemStack(Items.LAPIS_LAZULI, 1),
                    16, 1, 0.05f
            ));

        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 1),
                    new ItemStack(Items.AMETHYST_SHARD, 4),
                    6, 1, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 5),
                    new ItemStack(Items.ENDER_PEARL, 1),
                    2, 2, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(ModItems.RARE_SPICES, 1),
                    10, 3, 0.05f
            ));

        });

        //fletcher

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 16),
                    new ItemStack(Items.SPECTRAL_ARROW, 4),
                    4, 5, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 1),
                    new ItemStack(Items.STICK, 1),
                    16, 1, 0.05f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 3),
                    new ItemStack(Items.FEATHER, 1),
                    16, 1, 0.05f
            ));

        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 2),
                    new ItemStack(Items.FLINT, 1),
                    16, 1, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 1),
                    new ItemStack(Items.ARROW, 4),
                    16, 1, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 3),
                    new ItemStack(Items.OBSIDIAN, 1),
                    4, 3, 0.05f
            ));

        });

        //farmer

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 1),
                    new ItemStack(Items.CARROT, 1),
                    12, 1, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 1),
                    new ItemStack(Items.POTATO, 1),
                    12, 1, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 1),
                    new ItemStack(Items.BEETROOT_SEEDS, 1),
                    12, 1, 0.05f
            ));


        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 8),
                    new ItemStack(Items.IRON_HOE, 1),
                    3, 3, 0.05f
            ));

        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 16),
                    new ItemStack(Items.DIAMOND_HOE, 1),
                    1, 2, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 1),
                    new ItemStack(Items.COCOA_BEANS, 4),
                    3, 1, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 1),
                    new ItemStack(Items.BONE_MEAL, 3),
                    6, 3, 0.05f
            ));

        });

        //toolsmith

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 1),
                    new ItemStack(Items.RAW_COPPER, 1),
                    12, 1, 0.05f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 3),
                    new ItemStack(Items.COPPER_INGOT, 1),
                    6, 1, 0.05f
            ));

        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 9),
                    new ItemStack(Items.GOLDEN_PICKAXE, 1),
                    3, 3, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 12),
                    new ItemStack(Items.IRON_PICKAXE, 1),
                    3, 1, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 22),
                    new ItemStack(Items.DIAMOND_PICKAXE, 1),
                    1, 5, 0.05f
            ));

        });

        //butcher
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 12),
                    new ItemStack(Items.CHARCOAL, 3),
                    4, 1, 0.05f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 5),
                    new ItemStack(Items.PORKCHOP, 1),
                    12, 1, 0.05f
            ));

        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 3),
                    new ItemStack(Items.COOKED_RABBIT, 1),
                    12, 3, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 3),
                    new ItemStack(Items.COOKED_MUTTON, 1),
                    12, 2, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 1),
                    new ItemStack(Items.COOKED_BEEF, 1),
                    16, 1, 0.05f
            ));

        });

        //Cartographer

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 12),
                    new ItemStack(Items.BOOK, 3),
                    3, 1, 0.05f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 5),
                    new ItemStack(Items.MAP, 1),
                    3, 3, 0.05f
            ));

        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 3),
                    new ItemStack(Items.PAPER, 2),
                    6, 4, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 32),
                    new ItemStack(Items.CREEPER_BANNER_PATTERN, 1),
                    1, 12, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 32),
                    new ItemStack(Items.MOJANG_BANNER_PATTERN, 1),
                    1, 1, 0.05f
            ));

        });

        //Fisherman
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 3),
                    new ItemStack(Items.COD, 1),
                    3, 1, 0.05f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 5),
                    new ItemStack(Items.COOKED_SALMON, 4),
                    3, 4, 0.05f
            ));

        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 12),
                    new ItemStack(Items.BUCKET, 1),
                    3, 4, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 18),
                    new ItemStack(Items.TADPOLE_BUCKET, 1),
                    1, 6, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 14),
                    new ItemStack(Items.TROPICAL_FISH_BUCKET, 1),
                    1, 1, 0.05f
            ));

        });

        //Librarian
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 12),
                    new ItemStack(Items.BOOK, 3),
                    3, 1, 0.05f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 3),
                    new ItemStack(Items.PAPER, 1),
                    12, 3, 0.05f
            ));

        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 1),
                    new ItemStack(Items.PAPER, 2),
                    6, 6, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 32),
                    new ItemStack(Items.GLOBE_BANNER_PATTERN, 1),
                    1, 4, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 6),
                    new ItemStack(Items.WRITABLE_BOOK, 1),
                    3, 1, 0.05f
            ));

        });

        //leatherworker
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 8),
                    new ItemStack(Items.RABBIT_HIDE, 3),
                    3, 1, 0.05f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 12),
                    new ItemStack(Items.LEAD, 1),
                    1, 2, 0.05f
            ));

        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 1),
                    new ItemStack(Items.LEATHER, 1),
                    3, 1, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 12),
                    new ItemStack(Items.LEATHER_HORSE_ARMOR, 1),
                    1, 1, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 22),
                    new ItemStack(Items.IRON_HORSE_ARMOR, 1),
                    1, 1, 0.05f
            ));
        });

        //mason
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 6),
                    new ItemStack(Items.CLAY_BALL, 3),
                    6, 1, 0.05f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 1),
                    new ItemStack(Items.BRICK, 4),
                    3, 2, 0.05f
            ));

        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 1),
                    new ItemStack(Items.FLOWER_POT, 1),
                    3, 1, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 12),
                    new ItemStack(Items.OBSIDIAN, 4),
                    3, 1, 0.05f
            ));

        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 8),
                    new ItemStack(Items.DECORATED_POT, 1),
                    3, 1, 0.05f
            ));
        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 3),
                    new ItemStack(Items.BRICK, 16),
                    6, 1, 0.05f
            ));
        });        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RARE_SPICES, 1),
                    new ItemStack(Items.TERRACOTTA, 4),
                    8, 3, 0.05f
            ));
        });


    }
}
