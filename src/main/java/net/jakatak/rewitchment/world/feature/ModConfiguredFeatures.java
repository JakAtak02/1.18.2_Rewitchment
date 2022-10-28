package net.jakatak.rewitchment.world.feature;

import net.jakatak.rewitchment.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModConfiguredFeatures {
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> ROWAN_TREE =
            FeatureUtils.register("rowan", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.ROWAN_LOG.get()),
                    new StraightTrunkPlacer(3, 3, 2),
                    BlockStateProvider.simple(ModBlocks.ROWAN_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> ALDER_TREE =
            FeatureUtils.register("alder", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.ALDER_LOG.get()),
                    new StraightTrunkPlacer(3, 3, 2),
                    BlockStateProvider.simple(ModBlocks.ALDER_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> HAWTHORN_TREE =
            FeatureUtils.register("hawthorn", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.HAWTHORN_LOG.get()),
                    new StraightTrunkPlacer(3, 3, 2),
                    BlockStateProvider.simple(ModBlocks.HAWTHORN_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

}