package de.pnku.mlmv.poi;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import de.pnku.mlmv.init.MlmvBlockInit;
import de.pnku.mlmv.mixin.PoiTypesAccessor;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MlmvPointOfInterestTypes {
    public static void init() {
        Map<BlockState, Holder<PoiType>> poiStatesToType = PoiTypesAccessor
                .getPointOfInterestStatesToType();

        Holder<PoiType> shepherdEntry = BuiltInRegistries.POINT_OF_INTEREST_TYPE
                .get(PoiTypes.SHEPHERD).get();

        PoiType shepherdPoiType = BuiltInRegistries.POINT_OF_INTEREST_TYPE.getValue(PoiTypes.SHEPHERD);

        List<BlockState> shepherdBlockStates = new ArrayList<BlockState>(shepherdPoiType.matchingStates);

        for (Block block : MlmvBlockInit.more_looms) {
            ImmutableList<BlockState> blockStates = block.getStateDefinition().getPossibleStates();

            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, shepherdEntry);
            }

            shepherdBlockStates.addAll(blockStates);
        }

        shepherdPoiType.matchingStates = ImmutableSet.copyOf(shepherdBlockStates);
    }
}