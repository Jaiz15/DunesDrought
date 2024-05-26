package jaiz.desertupdate.villager;

import com.google.common.collect.ImmutableSet;
import jaiz.desertupdate.DunesDrought;
import jaiz.desertupdate.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {

    public static final RegistryKey<PointOfInterestType> SPICE_POI_KEY = poiKey("spicepoi");
    public static final PointOfInterestType SPICE_POI = registerPoi("spicepoi", ModBlocks.SPICE_BARREL);

    public static final VillagerProfession SPICE_TRADER = registerProfession("spice_trader", SPICE_POI_KEY);

    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(DunesDrought.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_CLERIC));
    }

    private static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(DunesDrought.MOD_ID, name), 1, 1, block);
    }

    public static RegistryKey<PointOfInterestType>  poiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(DunesDrought.MOD_ID, name));
    }

    public static void registerVillagers() {
        DunesDrought.LOGGER.info("Registering Villagers " + DunesDrought.MOD_ID);

    }
}
