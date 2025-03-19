package de.pnku.mlmv;

import de.pnku.mlmv.init.MlmvBlockInit;
import de.pnku.mlmv.init.MlmvItemInit;
import de.pnku.mlmv.poi.MlmvPointOfInterestTypes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

public class MoreLoomVariants implements ModInitializer {
    public static final String MODID = "lolmlmv";

    @Override
    public void onInitialize() {
        MlmvBlockInit.registerBlocks();
        MlmvItemInit.registerItems();
        MlmvPointOfInterestTypes.init();
    }

    public static ResourceLocation asId(String path) {
        return new ResourceLocation(MODID, path);
    }
}