package de.pnku.mlmv.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LoomBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MoreLoomVariantBlock extends LoomBlock {
    public final String loomWoodType;

    public MoreLoomVariantBlock(MapColor colour, String loomWoodType) {
        super(Properties.ofFullCopy(Blocks.LOOM).mapColor(colour));
        this.loomWoodType = loomWoodType;
    }

    public MoreLoomVariantBlock(MapColor colour, SoundType sound, String loomWoodType) {
        super(Properties.ofFullCopy(Blocks.LOOM).mapColor(colour).sound(sound));
        this.loomWoodType = loomWoodType;
    }
}