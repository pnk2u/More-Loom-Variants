package de.pnku.mlmv.init;

import de.pnku.mlmv.MoreLoomVariants;
import de.pnku.mlmv.block.MoreLoomVariantBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

import java.util.ArrayList;
import java.util.List;

public class MlmvBlockInit {
    public static final MoreLoomVariantBlock BIRCH_LOOM = new MoreLoomVariantBlock(MapColor.SAND, "birch");
    public static final MoreLoomVariantBlock DARK_OAK_LOOM = new MoreLoomVariantBlock(MapColor.COLOR_BROWN, "dark_oak");
    public static final MoreLoomVariantBlock SPRUCE_LOOM = new MoreLoomVariantBlock(MapColor.PODZOL, "spruce");
    public static final MoreLoomVariantBlock JUNGLE_LOOM = new MoreLoomVariantBlock(MapColor.DIRT, "jungle");
    public static final MoreLoomVariantBlock ACACIA_LOOM = new MoreLoomVariantBlock(MapColor.COLOR_ORANGE, "acacia");
    public static final MoreLoomVariantBlock MANGROVE_LOOM = new MoreLoomVariantBlock(MapColor.COLOR_RED, "mangrove");
    public static final MoreLoomVariantBlock CHERRY_LOOM = new MoreLoomVariantBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD, "cherry");
    public static final MoreLoomVariantBlock BAMBOO_LOOM = new MoreLoomVariantBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo");
    public static final MoreLoomVariantBlock CRIMSON_LOOM = new MoreLoomVariantBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson");
    public static final MoreLoomVariantBlock WARPED_LOOM = new MoreLoomVariantBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped");

    public static final List<Block> more_looms = new ArrayList<>();


    public static void registerBlocks() {
        registerBlock(BIRCH_LOOM);
        registerBlock(DARK_OAK_LOOM);
        registerBlock(SPRUCE_LOOM);
        registerBlock(JUNGLE_LOOM);
        registerBlock(ACACIA_LOOM);
        registerBlock(MANGROVE_LOOM);
        registerBlock(CHERRY_LOOM);
        registerBlock(BAMBOO_LOOM);
        registerBlock(CRIMSON_LOOM);
        registerBlock(WARPED_LOOM);

    }

    private static void registerBlock(MoreLoomVariantBlock loom) {
        Registry.register(BuiltInRegistries.BLOCK, MoreLoomVariants.asId(loom.loomWoodType + "_loom"), loom);
        more_looms.add(loom);
    }
}
