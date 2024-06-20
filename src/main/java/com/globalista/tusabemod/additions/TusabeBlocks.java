package com.globalista.tusabemod.additions;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;

import static com.globalista.tusabemod.util.TusabeRegister.*;

public class TusabeBlocks {

    public static final Block REINFORCED_OBSIDIAN = registerBlock("reinforced_obsidian",
            new Block(Block.Settings.create().strength(50.0f, 3600000.0f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(Block.Settings.create().strength(Blocks.IRON_BLOCK.getHardness(), Blocks.IRON_BLOCK.getBlastResistance()).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
            new Block(Block.Settings.create().strength(Blocks.NETHERITE_BLOCK.getHardness(), Blocks.NETHERITE_BLOCK.getBlastResistance()).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block HALLOWED_DEBRIS = registerBlock("hallowed_debris",
            new Block(Block.Settings.create().strength(Blocks.ANCIENT_DEBRIS.getHardness(), Blocks.ANCIENT_DEBRIS.getBlastResistance()).requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static void callBlocks(){};
}
