package com.ishtar.modpack.datagen;

import com.ishtar.modpack.ModPack;
import com.ishtar.modpack.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ModPack.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //DODAJ BLOKOVE
        blockWithItem(ModBlocks.STEEL_BLOCK);
        blockWithItem(ModBlocks.ESMERALD_ORE);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}