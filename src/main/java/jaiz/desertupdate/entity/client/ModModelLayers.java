package jaiz.desertupdate.entity.client;


import jaiz.desertupdate.DunesDrought;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {

    public static final EntityModelLayer MASON_MOUTH =
            new EntityModelLayer(new Identifier(DunesDrought.MOD_ID, "mason_mouth"), "main");

    public static final EntityModelLayer BANDIT =
            new EntityModelLayer(new Identifier(DunesDrought.MOD_ID, "bandit"), "main");


}
