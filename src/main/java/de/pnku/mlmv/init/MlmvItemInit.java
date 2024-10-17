package de.pnku.mlmv.init;

import de.pnku.mlmv.MoreLoomVariants;
import de.pnku.mlmv.block.MoreLoomVariantBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.core.Registry;

import static de.pnku.mlmv.init.MlmvBlockInit.*;

public class MlmvItemInit {
    public static final BlockItem BIRCH_LOOM_I = itemFromBlock(BIRCH_LOOM);
    public static final BlockItem DARK_OAK_LOOM_I = itemFromBlock(DARK_OAK_LOOM);
    public static final BlockItem SPRUCE_LOOM_I = itemFromBlock(SPRUCE_LOOM);
    public static final BlockItem JUNGLE_LOOM_I = itemFromBlock(JUNGLE_LOOM);
    public static final BlockItem ACACIA_LOOM_I = itemFromBlock(ACACIA_LOOM);
    public static final BlockItem MANGROVE_LOOM_I = itemFromBlock(MANGROVE_LOOM);
    public static final BlockItem CHERRY_LOOM_I = itemFromBlock(CHERRY_LOOM);
    public static final BlockItem BAMBOO_LOOM_I = itemFromBlock(BAMBOO_LOOM);
    public static final BlockItem CRIMSON_LOOM_I = itemFromBlock(CRIMSON_LOOM);
    public static final BlockItem WARPED_LOOM_I = itemFromBlock(WARPED_LOOM);

    public static BlockItem itemFromBlock(MoreLoomVariantBlock moreLoomVariantBlock) {
        return new BlockItem(moreLoomVariantBlock, setProperties(moreLoomVariantBlock));
    }

    public static Item.Properties setProperties(MoreLoomVariantBlock moreLoomVariantBlock) {
        return new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM,BuiltInRegistries.BLOCK.getKey(moreLoomVariantBlock))).useBlockDescriptionPrefix();
    }

    public static void registerItems() {
        registerItem(BIRCH_LOOM_I, Items.LOOM);
        registerItem(DARK_OAK_LOOM_I, BIRCH_LOOM_I);
        registerItem(SPRUCE_LOOM_I, DARK_OAK_LOOM_I);
        registerItem(JUNGLE_LOOM_I, SPRUCE_LOOM_I);
        registerItem(ACACIA_LOOM_I, JUNGLE_LOOM_I);
        registerItem(MANGROVE_LOOM_I, ACACIA_LOOM_I);
        registerItem(CHERRY_LOOM_I, MANGROVE_LOOM_I);
        registerItem(BAMBOO_LOOM_I, CHERRY_LOOM_I);
        registerItem(CRIMSON_LOOM_I, BAMBOO_LOOM_I);
        registerItem(WARPED_LOOM_I, CRIMSON_LOOM_I);
    }

    private static void registerItem(BlockItem loom, Item loomAfter) {
        Registry.register(BuiltInRegistries.ITEM, MoreLoomVariants.asId(((MoreLoomVariantBlock) loom.getBlock()).loomWoodType + "_loom"), loom);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(loomAfter, loom));
    }
}