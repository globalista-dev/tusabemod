package com.globalista.tusabemod.datagen;

import com.globalista.tusabemod.additions.TusabeBlocks;
import com.globalista.tusabemod.additions.TusabeItems;
import com.globalista.tusabemod.util.TusabeRegister;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

public class TusabeModelGenerator extends FabricModelProvider {
    public TusabeModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(TusabeBlocks.MYTHRIL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(TusabeBlocks.STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(TusabeBlocks.REINFORCED_OBSIDIAN);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        for (Item item : TusabeRegister.equipments) {
            itemModelGenerator.register(item, Models.GENERATED);
        }

        itemModelGenerator.register(TusabeBlocks.HALLOWED_DEBRIS.asItem(), Models.GENERATED);
        itemModelGenerator.register(TusabeBlocks.MYTHRIL_BLOCK.asItem(), Models.GENERATED);
        itemModelGenerator.register(TusabeBlocks.STEEL_BLOCK.asItem(), Models.GENERATED);
        itemModelGenerator.register(TusabeBlocks.REINFORCED_OBSIDIAN.asItem(), Models.GENERATED);

        itemModelGenerator.register(TusabeItems.MYTHRIL_INGOT, Models.GENERATED);
        itemModelGenerator.register(TusabeItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(TusabeItems.MYTHRIL_UPGRADE, Models.GENERATED);

    }
}
