package jaiz.desertupdate.sound;

import jaiz.desertupdate.DunesDrought;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent ORIGAMI_HAIRBALL = registerSoundEvent("origami_hairball");

    public static final SoundEvent ANCIENT_HORN_01 = registerSoundEvent("ancient_horn_01");
    public static final SoundEvent ANCIENT_HORN_02 = registerSoundEvent("ancient_horn_02");
    public static final SoundEvent ANCIENT_HORN_03 = registerSoundEvent("ancient_horn_03");

    public static void registerSounds() {
        DunesDrought.LOGGER.info(("Registering sounds for " + DunesDrought.MOD_ID));
    }

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(DunesDrought.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));

    }
}
