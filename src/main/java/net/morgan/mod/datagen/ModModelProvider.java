package net.morgan.mod.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.morgan.mod.block.ModBlocks;
import net.morgan.mod.item.ModItems;



public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        TextureMapping mapping = new TextureMapping();
        mapping.put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(ModBlocks.RICE_BLOCK, "_bottom")).
                put(TextureSlot.TOP, TextureMapping.getBlockTexture(ModBlocks.RICE_BLOCK, "_top")).
                put(TextureSlot.SIDE, TextureMapping.getBlockTexture(ModBlocks.RICE_BLOCK, "_side"));
        var modelId = ModelTemplates.CUBE_BOTTOM_TOP.create(ModBlocks.RICE_BLOCK, mapping, blockModelGenerators.modelOutput);
        blockModelGenerators.blockStateOutput.accept(blockModelGenerators.createSimpleBlock(ModBlocks.RICE_BLOCK, blockModelGenerators.plainVariant(modelId)));
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.RICE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BOWL_OF_RICE, ModelTemplates.FLAT_ITEM);


        itemModelGenerators.generateFlatItem(ModItems.COOKED_RICE, ModelTemplates.FLAT_ITEM);


    }
}
