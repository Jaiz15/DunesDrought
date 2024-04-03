package jaiz.desertupdate;

import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import jaiz.desertupdate.block.ModBlocks;
import jaiz.desertupdate.entity.ModEntities;
import jaiz.desertupdate.entity.client.*;
import jaiz.desertupdate.entity.custom.MasonmouthEntity;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;

public class DunesDroughtClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DESERT_OAK_LEAVES, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DESERT_OAK_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DESERT_OAK_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DESERT_OAK_SAPLING, RenderLayer.getCutout());

		EntityRendererRegistry.register(ModEntities.MASON_MOUTH, MasonMouthRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MASON_MOUTH, Masonmouth::getTexturedModelData);

		EntityRendererRegistry.register(ModEntities.BANDIT, BanditRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.BANDIT, Bandit::getTexturedModelData);

		SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.DESERT_OAK_SIGN_TEXTURE));
		SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.DESERT_OAK_HANGING_SIGN_TEXTURE));


	}
}