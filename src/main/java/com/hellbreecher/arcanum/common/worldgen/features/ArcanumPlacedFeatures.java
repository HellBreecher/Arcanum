package com.hellbreecher.arcanum.common.worldgen.features;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ArcanumPlacedFeatures {

	//Ingot Ores	
    public static final Holder<PlacedFeature> greensapphireoreplaced = PlacementUtils.register("greensapphireoreplaced",
            ArcanumConfiguredFeatures.greensapphireore, ArcanumOrePlacement.commonOrePlacement(30, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(256))));
    public static final Holder<PlacedFeature> blooddiamondoreplaced = PlacementUtils.register("blooddiamondoreplaced",
            ArcanumConfiguredFeatures.blooddiamondore, ArcanumOrePlacement.commonOrePlacement(20, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(256))));
    public static final Holder<PlacedFeature> voiddiamondoreplaced = PlacementUtils.register("voiddiamondoreplaced",
            ArcanumConfiguredFeatures.voiddiamodnore, ArcanumOrePlacement.commonOrePlacement(10, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(256))));

    //Random Ores
    
    public static final Holder<PlacedFeature> vanillarandomoreplaced = PlacementUtils.register("vanillarandomoreplaced",
            ArcanumConfiguredFeatures.vanillarandomore, ArcanumOrePlacement.commonOrePlacement(15, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(256))));
    public static final Holder<PlacedFeature> modrandomoreplaced = PlacementUtils.register("modrandomoreplaced",
            ArcanumConfiguredFeatures.modrandomore, ArcanumOrePlacement.commonOrePlacement(15, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(256))));
    
    //Mob Drop Ores
    public static final Holder<PlacedFeature> fleshoreplaced = PlacementUtils.register("fleshoreplaced",
            ArcanumConfiguredFeatures.fleshore, ArcanumOrePlacement.commonOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(256))));
    public static final Holder<PlacedFeature> boneoreplaced = PlacementUtils.register("boneoreplaced",
            ArcanumConfiguredFeatures.boneore, ArcanumOrePlacement.commonOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(256))));
    public static final Holder<PlacedFeature> sulfuroreplaced = PlacementUtils.register("sulfuroreplaced",
            ArcanumConfiguredFeatures.sulfurore, ArcanumOrePlacement.commonOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(256))));
}
