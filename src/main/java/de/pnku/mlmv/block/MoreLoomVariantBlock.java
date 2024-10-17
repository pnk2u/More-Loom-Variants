package de.pnku.mlmv.block;

import de.pnku.mlmv.MoreLoomVariants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LoomBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MoreLoomVariantBlock extends LoomBlock {
    public final String loomWoodType;

    public MoreLoomVariantBlock(MapColor colour, String loomWoodType) {
        super(Properties.ofFullCopy(Blocks.LOOM).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreLoomVariants.asId(loomWoodType + "_loom"))));
        this.loomWoodType = loomWoodType;
    }

    public MoreLoomVariantBlock(MapColor colour, SoundType sound, String loomWoodType) {
        super(Properties.ofFullCopy(Blocks.LOOM).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreLoomVariants.asId(loomWoodType + "_loom"))).sound(sound));
        this.loomWoodType = loomWoodType;
    }
}