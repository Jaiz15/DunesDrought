package jaiz.desertupdate.entity;


import jaiz.desertupdate.DunesDrought;
import jaiz.desertupdate.entity.custom.BanditEntity;
import jaiz.desertupdate.entity.custom.MasonmouthEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<MasonmouthEntity> MASON_MOUTH = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(DunesDrought.MOD_ID, "mason_mouth"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, MasonmouthEntity::new).dimensions(EntityDimensions.fixed(0.75f, 1.0f)).build());

    public static final EntityType<BanditEntity> BANDIT = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(DunesDrought.MOD_ID, "bandit"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, BanditEntity::new).dimensions(EntityDimensions.fixed(0.6f, 1.9f)).build());

}
