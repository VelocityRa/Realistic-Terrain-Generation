package teamrtg.rtg.api.world;

import com.google.common.annotations.VisibleForTesting;
import com.google.gson.*;
import net.minecraft.init.Biomes;
import net.minecraft.util.JsonUtils;
import net.minecraft.world.biome.Biome;

import java.lang.reflect.Type;

/**
 * Created by VelocityRa on 24/7/2016.
 */

public class ChunkProviderRTGSettings {

    public final float coordinateScale;
    public final float heightScale;
    public final float upperLimitScale;
    public final float lowerLimitScale;
    public final float depthNoiseScaleX;
    public final float depthNoiseScaleZ;
    public final float depthNoiseScaleExponent;
    public final float mainNoiseScaleX;
    public final float mainNoiseScaleY;
    public final float mainNoiseScaleZ;
    public final float baseSize;
    public final float stretchY;
    public final float biomeDepthWeight;
    public final float biomeDepthOffSet;
    public final float biomeScaleWeight;
    public final float biomeScaleOffset;
    public final int seaLevel;
    public final boolean useCaves;
    public final boolean useDungeons;
    public final int dungeonChance;
    public final boolean useStrongholds;
    public final boolean useVillages;
    public final boolean useMineShafts;
    public final boolean useTemples;
    public final boolean useMonuments;
    public final boolean useRavines;
    public final boolean useWaterLakes;
    public final int waterLakeChance;
    public final boolean useLavaLakes;
    public final int lavaLakeChance;
    public final boolean useLavaOceans;
    public final int fixedBiome;
    public final int biomeSize;
    public final int riverSize;
    public final int dirtSize;
    public final int dirtCount;
    public final int dirtMinHeight;
    public final int dirtMaxHeight;
    public final int gravelSize;
    public final int gravelCount;
    public final int gravelMinHeight;
    public final int gravelMaxHeight;
    public final int graniteSize;
    public final int graniteCount;
    public final int graniteMinHeight;
    public final int graniteMaxHeight;
    public final int dioriteSize;
    public final int dioriteCount;
    public final int dioriteMinHeight;
    public final int dioriteMaxHeight;
    public final int andesiteSize;
    public final int andesiteCount;
    public final int andesiteMinHeight;
    public final int andesiteMaxHeight;
    public final int coalSize;
    public final int coalCount;
    public final int coalMinHeight;
    public final int coalMaxHeight;
    public final int ironSize;
    public final int ironCount;
    public final int ironMinHeight;
    public final int ironMaxHeight;
    public final int goldSize;
    public final int goldCount;
    public final int goldMinHeight;
    public final int goldMaxHeight;
    public final int redstoneSize;
    public final int redstoneCount;
    public final int redstoneMinHeight;
    public final int redstoneMaxHeight;
    public final int diamondSize;
    public final int diamondCount;
    public final int diamondMinHeight;
    public final int diamondMaxHeight;
    public final int lapisSize;
    public final int lapisCount;
    public final int lapisCenterHeight;
    public final int lapisSpread;

    public final int villageSize;
    public final int distVillages;
    public final int caveDensity;
    public final int caveFrequency;

    private ChunkProviderRTGSettings(Factory settingsFactory) {
        this.coordinateScale = settingsFactory.coordinateScale;
        this.heightScale = settingsFactory.heightScale;
        this.upperLimitScale = settingsFactory.upperLimitScale;
        this.lowerLimitScale = settingsFactory.lowerLimitScale;
        this.depthNoiseScaleX = settingsFactory.depthNoiseScaleX;
        this.depthNoiseScaleZ = settingsFactory.depthNoiseScaleZ;
        this.depthNoiseScaleExponent = settingsFactory.depthNoiseScaleExponent;
        this.mainNoiseScaleX = settingsFactory.mainNoiseScaleX;
        this.mainNoiseScaleY = settingsFactory.mainNoiseScaleY;
        this.mainNoiseScaleZ = settingsFactory.mainNoiseScaleZ;
        this.baseSize = settingsFactory.baseSize;
        this.stretchY = settingsFactory.stretchY;
        this.biomeDepthWeight = settingsFactory.biomeDepthWeight;
        this.biomeDepthOffSet = settingsFactory.biomeDepthOffset;
        this.biomeScaleWeight = settingsFactory.biomeScaleWeight;
        this.biomeScaleOffset = settingsFactory.biomeScaleOffset;
        this.seaLevel = settingsFactory.seaLevel;
        this.useCaves = settingsFactory.useCaves;
        this.useDungeons = settingsFactory.useDungeons;
        this.dungeonChance = settingsFactory.dungeonChance;
        this.useStrongholds = settingsFactory.useStrongholds;
        this.useVillages = settingsFactory.useVillages;
        this.useMineShafts = settingsFactory.useMineShafts;
        this.useTemples = settingsFactory.useTemples;
        this.useMonuments = settingsFactory.useMonuments;
        this.useRavines = settingsFactory.useRavines;
        this.useWaterLakes = settingsFactory.useWaterLakes;
        this.waterLakeChance = settingsFactory.waterLakeChance;
        this.useLavaLakes = settingsFactory.useLavaLakes;
        this.lavaLakeChance = settingsFactory.lavaLakeChance;
        this.useLavaOceans = settingsFactory.useLavaOceans;
        this.fixedBiome = settingsFactory.fixedBiome;
        this.biomeSize = settingsFactory.biomeSize;
        this.riverSize = settingsFactory.riverSize;
        this.dirtSize = settingsFactory.dirtSize;
        this.dirtCount = settingsFactory.dirtCount;
        this.dirtMinHeight = settingsFactory.dirtMinHeight;
        this.dirtMaxHeight = settingsFactory.dirtMaxHeight;
        this.gravelSize = settingsFactory.gravelSize;
        this.gravelCount = settingsFactory.gravelCount;
        this.gravelMinHeight = settingsFactory.gravelMinHeight;
        this.gravelMaxHeight = settingsFactory.gravelMaxHeight;
        this.graniteSize = settingsFactory.graniteSize;
        this.graniteCount = settingsFactory.graniteCount;
        this.graniteMinHeight = settingsFactory.graniteMinHeight;
        this.graniteMaxHeight = settingsFactory.graniteMaxHeight;
        this.dioriteSize = settingsFactory.dioriteSize;
        this.dioriteCount = settingsFactory.dioriteCount;
        this.dioriteMinHeight = settingsFactory.dioriteMinHeight;
        this.dioriteMaxHeight = settingsFactory.dioriteMaxHeight;
        this.andesiteSize = settingsFactory.andesiteSize;
        this.andesiteCount = settingsFactory.andesiteCount;
        this.andesiteMinHeight = settingsFactory.andesiteMinHeight;
        this.andesiteMaxHeight = settingsFactory.andesiteMaxHeight;
        this.coalSize = settingsFactory.coalSize;
        this.coalCount = settingsFactory.coalCount;
        this.coalMinHeight = settingsFactory.coalMinHeight;
        this.coalMaxHeight = settingsFactory.coalMaxHeight;
        this.ironSize = settingsFactory.ironSize;
        this.ironCount = settingsFactory.ironCount;
        this.ironMinHeight = settingsFactory.ironMinHeight;
        this.ironMaxHeight = settingsFactory.ironMaxHeight;
        this.goldSize = settingsFactory.goldSize;
        this.goldCount = settingsFactory.goldCount;
        this.goldMinHeight = settingsFactory.goldMinHeight;
        this.goldMaxHeight = settingsFactory.goldMaxHeight;
        this.redstoneSize = settingsFactory.redstoneSize;
        this.redstoneCount = settingsFactory.redstoneCount;
        this.redstoneMinHeight = settingsFactory.redstoneMinHeight;
        this.redstoneMaxHeight = settingsFactory.redstoneMaxHeight;
        this.diamondSize = settingsFactory.diamondSize;
        this.diamondCount = settingsFactory.diamondCount;
        this.diamondMinHeight = settingsFactory.diamondMinHeight;
        this.diamondMaxHeight = settingsFactory.diamondMaxHeight;
        this.lapisSize = settingsFactory.lapisSize;
        this.lapisCount = settingsFactory.lapisCount;
        this.lapisCenterHeight = settingsFactory.lapisCenterHeight;
        this.lapisSpread = settingsFactory.lapisSpread;

        this.villageSize = settingsFactory.villageSize;
        this.distVillages = settingsFactory.distVillages;
        this.caveDensity = settingsFactory.caveDensity;
        this.caveFrequency = settingsFactory.caveFrequency;

    }

    public static class Factory {
        @VisibleForTesting
        static final Gson JSON_ADAPTER = (new GsonBuilder()).registerTypeAdapter(ChunkProviderRTGSettings.Factory.class, new ChunkProviderRTGSettings.Serializer()).create();
        public float coordinateScale = 684.412F;
        public float heightScale = 684.412F;
        public float upperLimitScale = 512.0F;
        public float lowerLimitScale = 512.0F;
        public float depthNoiseScaleX = 200.0F;
        public float depthNoiseScaleZ = 200.0F;
        public float depthNoiseScaleExponent = 0.5F;
        public float mainNoiseScaleX = 80.0F;
        public float mainNoiseScaleY = 160.0F;
        public float mainNoiseScaleZ = 80.0F;
        public float baseSize = 8.5F;
        public float stretchY = 12.0F;
        public float biomeDepthWeight = 1.0F;
        public float biomeDepthOffset;
        public float biomeScaleWeight = 1.0F;
        public float biomeScaleOffset;
        public int seaLevel = 63;
        public boolean useCaves = true;
        public boolean useDungeons = true;
        public int dungeonChance = 8;
        public boolean useStrongholds = true;
        public boolean useVillages = true;
        public boolean useMineShafts = true;
        public boolean useTemples = true;
        public boolean useMonuments = true;
        public boolean useRavines = true;
        public boolean useWaterLakes = true;
        public int waterLakeChance = 4;
        public boolean useLavaLakes = true;
        public int lavaLakeChance = 80;
        public boolean useLavaOceans;
        public int fixedBiome = -1;
        public int biomeSize = 4;
        public int riverSize = 4;
        public int dirtSize = 33;
        public int dirtCount = 10;
        public int dirtMinHeight;
        public int dirtMaxHeight = 256;
        public int gravelSize = 33;
        public int gravelCount = 8;
        public int gravelMinHeight;
        public int gravelMaxHeight = 256;
        public int graniteSize = 33;
        public int graniteCount = 10;
        public int graniteMinHeight;
        public int graniteMaxHeight = 80;
        public int dioriteSize = 33;
        public int dioriteCount = 10;
        public int dioriteMinHeight;
        public int dioriteMaxHeight = 80;
        public int andesiteSize = 33;
        public int andesiteCount = 10;
        public int andesiteMinHeight;
        public int andesiteMaxHeight = 80;
        public int coalSize = 17;
        public int coalCount = 20;
        public int coalMinHeight;
        public int coalMaxHeight = 128;
        public int ironSize = 9;
        public int ironCount = 20;
        public int ironMinHeight;
        public int ironMaxHeight = 64;
        public int goldSize = 9;
        public int goldCount = 2;
        public int goldMinHeight;
        public int goldMaxHeight = 32;
        public int redstoneSize = 8;
        public int redstoneCount = 8;
        public int redstoneMinHeight;
        public int redstoneMaxHeight = 16;
        public int diamondSize = 8;
        public int diamondCount = 1;
        public int diamondMinHeight;
        public int diamondMaxHeight = 16;
        public int lapisSize = 7;
        public int lapisCount = 1;
        public int lapisCenterHeight = 16;
        public int lapisSpread = 16;

        public int villageSize = 1;
        public int distVillages = 32;
        public int caveDensity = 7;
        public int caveFrequency = 12;

        public static ChunkProviderRTGSettings.Factory jsonToFactory(String p_177865_0_) {
            if (p_177865_0_.isEmpty()) {
                return new ChunkProviderRTGSettings.Factory();
            } else {
                try {
                    return (ChunkProviderRTGSettings.Factory) JsonUtils.gsonDeserialize(JSON_ADAPTER, p_177865_0_, ChunkProviderRTGSettings.Factory.class);
                } catch (Exception var2) {
                    return new ChunkProviderRTGSettings.Factory();
                }
            }
        }

        public String toString() {
            return JSON_ADAPTER.toJson((Object) this);
        }

        public Factory() {
            this.setDefaults();
        }

        public void setDefaults() {
            this.coordinateScale = 684.412F;
            this.heightScale = 684.412F;
            this.upperLimitScale = 512.0F;
            this.lowerLimitScale = 512.0F;
            this.depthNoiseScaleX = 200.0F;
            this.depthNoiseScaleZ = 200.0F;
            this.depthNoiseScaleExponent = 0.5F;
            this.mainNoiseScaleX = 80.0F;
            this.mainNoiseScaleY = 160.0F;
            this.mainNoiseScaleZ = 80.0F;
            this.baseSize = 8.5F;
            this.stretchY = 12.0F;
            this.biomeDepthWeight = 1.0F;
            this.biomeDepthOffset = 0.0F;
            this.biomeScaleWeight = 1.0F;
            this.biomeScaleOffset = 0.0F;
            this.seaLevel = 63;
            this.useCaves = true;
            this.useDungeons = true;
            this.dungeonChance = 8;
            this.useStrongholds = true;
            this.useVillages = true;
            this.useMineShafts = true;
            this.useTemples = true;
            this.useMonuments = true;
            this.useRavines = true;
            this.useWaterLakes = true;
            this.waterLakeChance = 4;
            this.useLavaLakes = true;
            this.lavaLakeChance = 80;
            this.useLavaOceans = false;
            this.fixedBiome = -1;
            this.biomeSize = 4;
            this.riverSize = 4;
            this.dirtSize = 33;
            this.dirtCount = 10;
            this.dirtMinHeight = 0;
            this.dirtMaxHeight = 256;
            this.gravelSize = 33;
            this.gravelCount = 8;
            this.gravelMinHeight = 0;
            this.gravelMaxHeight = 256;
            this.graniteSize = 33;
            this.graniteCount = 10;
            this.graniteMinHeight = 0;
            this.graniteMaxHeight = 80;
            this.dioriteSize = 33;
            this.dioriteCount = 10;
            this.dioriteMinHeight = 0;
            this.dioriteMaxHeight = 80;
            this.andesiteSize = 33;
            this.andesiteCount = 10;
            this.andesiteMinHeight = 0;
            this.andesiteMaxHeight = 80;
            this.coalSize = 17;
            this.coalCount = 20;
            this.coalMinHeight = 0;
            this.coalMaxHeight = 128;
            this.ironSize = 9;
            this.ironCount = 20;
            this.ironMinHeight = 0;
            this.ironMaxHeight = 64;
            this.goldSize = 9;
            this.goldCount = 2;
            this.goldMinHeight = 0;
            this.goldMaxHeight = 32;
            this.redstoneSize = 8;
            this.redstoneCount = 8;
            this.redstoneMinHeight = 0;
            this.redstoneMaxHeight = 16;
            this.diamondSize = 8;
            this.diamondCount = 1;
            this.diamondMinHeight = 0;
            this.diamondMaxHeight = 16;
            this.lapisSize = 7;
            this.lapisCount = 1;
            this.lapisCenterHeight = 16;
            this.lapisSpread = 16;

            this.villageSize = 1;
            this.distVillages = 32;
            this.caveDensity = 7;
            this.caveFrequency = 12;
        }

        public boolean equals(Object p_equals_1_) {
            if (this == p_equals_1_) {
                return true;
            } else if (p_equals_1_ != null && this.getClass() == p_equals_1_.getClass()) {
                ChunkProviderRTGSettings.Factory ChunkProviderRTGSettings$factory = (ChunkProviderRTGSettings.Factory) p_equals_1_;
                return this.andesiteCount != ChunkProviderRTGSettings$factory.andesiteCount ? false : (this.andesiteMaxHeight != ChunkProviderRTGSettings$factory.andesiteMaxHeight ? false : (this.andesiteMinHeight != ChunkProviderRTGSettings$factory.andesiteMinHeight ? false : (this.andesiteSize != ChunkProviderRTGSettings$factory.andesiteSize ? false : (Float.compare(ChunkProviderRTGSettings$factory.baseSize, this.baseSize) != 0 ? false : (Float.compare(ChunkProviderRTGSettings$factory.biomeDepthOffset, this.biomeDepthOffset) != 0 ? false : (Float.compare(ChunkProviderRTGSettings$factory.biomeDepthWeight, this.biomeDepthWeight) != 0 ? false : (Float.compare(ChunkProviderRTGSettings$factory.biomeScaleOffset, this.biomeScaleOffset) != 0 ? false : (Float.compare(ChunkProviderRTGSettings$factory.biomeScaleWeight, this.biomeScaleWeight) != 0 ? false : (this.biomeSize != ChunkProviderRTGSettings$factory.biomeSize ? false : (this.coalCount != ChunkProviderRTGSettings$factory.coalCount ? false : (this.coalMaxHeight != ChunkProviderRTGSettings$factory.coalMaxHeight ? false : (this.coalMinHeight != ChunkProviderRTGSettings$factory.coalMinHeight ? false : (this.coalSize != ChunkProviderRTGSettings$factory.coalSize ? false : (Float.compare(ChunkProviderRTGSettings$factory.coordinateScale, this.coordinateScale) != 0 ? false : (Float.compare(ChunkProviderRTGSettings$factory.depthNoiseScaleExponent, this.depthNoiseScaleExponent) != 0 ? false : (Float.compare(ChunkProviderRTGSettings$factory.depthNoiseScaleX, this.depthNoiseScaleX) != 0 ? false : (Float.compare(ChunkProviderRTGSettings$factory.depthNoiseScaleZ, this.depthNoiseScaleZ) != 0 ? false : (this.diamondCount != ChunkProviderRTGSettings$factory.diamondCount ? false : (this.diamondMaxHeight != ChunkProviderRTGSettings$factory.diamondMaxHeight ? false : (this.diamondMinHeight != ChunkProviderRTGSettings$factory.diamondMinHeight ? false : (this.diamondSize != ChunkProviderRTGSettings$factory.diamondSize ? false : (this.dioriteCount != ChunkProviderRTGSettings$factory.dioriteCount ? false : (this.dioriteMaxHeight != ChunkProviderRTGSettings$factory.dioriteMaxHeight ? false : (this.dioriteMinHeight != ChunkProviderRTGSettings$factory.dioriteMinHeight ? false : (this.dioriteSize != ChunkProviderRTGSettings$factory.dioriteSize ? false : (this.dirtCount != ChunkProviderRTGSettings$factory.dirtCount ? false : (this.dirtMaxHeight != ChunkProviderRTGSettings$factory.dirtMaxHeight ? false : (this.dirtMinHeight != ChunkProviderRTGSettings$factory.dirtMinHeight ? false : (this.dirtSize != ChunkProviderRTGSettings$factory.dirtSize ? false : (this.dungeonChance != ChunkProviderRTGSettings$factory.dungeonChance ? false : (this.fixedBiome != ChunkProviderRTGSettings$factory.fixedBiome ? false : (this.goldCount != ChunkProviderRTGSettings$factory.goldCount ? false : (this.goldMaxHeight != ChunkProviderRTGSettings$factory.goldMaxHeight ? false : (this.goldMinHeight != ChunkProviderRTGSettings$factory.goldMinHeight ? false : (this.goldSize != ChunkProviderRTGSettings$factory.goldSize ? false : (this.graniteCount != ChunkProviderRTGSettings$factory.graniteCount ? false : (this.graniteMaxHeight != ChunkProviderRTGSettings$factory.graniteMaxHeight ? false : (this.graniteMinHeight != ChunkProviderRTGSettings$factory.graniteMinHeight ? false : (this.graniteSize != ChunkProviderRTGSettings$factory.graniteSize ? false : (this.gravelCount != ChunkProviderRTGSettings$factory.gravelCount ? false : (this.gravelMaxHeight != ChunkProviderRTGSettings$factory.gravelMaxHeight ? false : (this.gravelMinHeight != ChunkProviderRTGSettings$factory.gravelMinHeight ? false : (this.gravelSize != ChunkProviderRTGSettings$factory.gravelSize ? false : (Float.compare(ChunkProviderRTGSettings$factory.heightScale, this.heightScale) != 0 ? false : (this.ironCount != ChunkProviderRTGSettings$factory.ironCount ? false : (this.ironMaxHeight != ChunkProviderRTGSettings$factory.ironMaxHeight ? false : (this.ironMinHeight != ChunkProviderRTGSettings$factory.ironMinHeight ? false : (this.ironSize != ChunkProviderRTGSettings$factory.ironSize ? false : (this.lapisCenterHeight != ChunkProviderRTGSettings$factory.lapisCenterHeight ? false : (this.lapisCount != ChunkProviderRTGSettings$factory.lapisCount ? false : (this.lapisSize != ChunkProviderRTGSettings$factory.lapisSize ? false : (this.lapisSpread != ChunkProviderRTGSettings$factory.lapisSpread ? false : (this.lavaLakeChance != ChunkProviderRTGSettings$factory.lavaLakeChance ? false : (Float.compare(ChunkProviderRTGSettings$factory.lowerLimitScale, this.lowerLimitScale) != 0 ? false : (Float.compare(ChunkProviderRTGSettings$factory.mainNoiseScaleX, this.mainNoiseScaleX) != 0 ? false : (Float.compare(ChunkProviderRTGSettings$factory.mainNoiseScaleY, this.mainNoiseScaleY) != 0 ? false : (Float.compare(ChunkProviderRTGSettings$factory.mainNoiseScaleZ, this.mainNoiseScaleZ) != 0 ? false : (this.redstoneCount != ChunkProviderRTGSettings$factory.redstoneCount ? false : (this.redstoneMaxHeight != ChunkProviderRTGSettings$factory.redstoneMaxHeight ? false : (this.redstoneMinHeight != ChunkProviderRTGSettings$factory.redstoneMinHeight ? false : (this.redstoneSize != ChunkProviderRTGSettings$factory.redstoneSize ? false : (this.riverSize != ChunkProviderRTGSettings$factory.riverSize ? false : (this.seaLevel != ChunkProviderRTGSettings$factory.seaLevel ? false : (Float.compare(ChunkProviderRTGSettings$factory.stretchY, this.stretchY) != 0 ? false : (Float.compare(ChunkProviderRTGSettings$factory.upperLimitScale, this.upperLimitScale) != 0 ? false : (this.useCaves != ChunkProviderRTGSettings$factory.useCaves ? false : (this.useDungeons != ChunkProviderRTGSettings$factory.useDungeons ? false : (this.useLavaLakes != ChunkProviderRTGSettings$factory.useLavaLakes ? false : (this.useLavaOceans != ChunkProviderRTGSettings$factory.useLavaOceans ? false : (this.useMineShafts != ChunkProviderRTGSettings$factory.useMineShafts ? false : (this.useRavines != ChunkProviderRTGSettings$factory.useRavines ? false : (this.useStrongholds != ChunkProviderRTGSettings$factory.useStrongholds ? false : (this.useTemples != ChunkProviderRTGSettings$factory.useTemples ? false : (this.useMonuments != ChunkProviderRTGSettings$factory.useMonuments ? false : (this.useVillages != ChunkProviderRTGSettings$factory.useVillages ? false : (this.useWaterLakes != ChunkProviderRTGSettings$factory.useWaterLakes ? false : this.waterLakeChance == ChunkProviderRTGSettings$factory.waterLakeChance))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))));
            } else {
                return false;
            }
        }

        public int hashCode() {
            int i = this.coordinateScale == 0.0F ? 0 : Float.floatToIntBits(this.coordinateScale);
            i = 31 * i + (this.heightScale == 0.0F ? 0 : Float.floatToIntBits(this.heightScale));
            i = 31 * i + (this.upperLimitScale == 0.0F ? 0 : Float.floatToIntBits(this.upperLimitScale));
            i = 31 * i + (this.lowerLimitScale == 0.0F ? 0 : Float.floatToIntBits(this.lowerLimitScale));
            i = 31 * i + (this.depthNoiseScaleX == 0.0F ? 0 : Float.floatToIntBits(this.depthNoiseScaleX));
            i = 31 * i + (this.depthNoiseScaleZ == 0.0F ? 0 : Float.floatToIntBits(this.depthNoiseScaleZ));
            i = 31 * i + (this.depthNoiseScaleExponent == 0.0F ? 0 : Float.floatToIntBits(this.depthNoiseScaleExponent));
            i = 31 * i + (this.mainNoiseScaleX == 0.0F ? 0 : Float.floatToIntBits(this.mainNoiseScaleX));
            i = 31 * i + (this.mainNoiseScaleY == 0.0F ? 0 : Float.floatToIntBits(this.mainNoiseScaleY));
            i = 31 * i + (this.mainNoiseScaleZ == 0.0F ? 0 : Float.floatToIntBits(this.mainNoiseScaleZ));
            i = 31 * i + (this.baseSize == 0.0F ? 0 : Float.floatToIntBits(this.baseSize));
            i = 31 * i + (this.stretchY == 0.0F ? 0 : Float.floatToIntBits(this.stretchY));
            i = 31 * i + (this.biomeDepthWeight == 0.0F ? 0 : Float.floatToIntBits(this.biomeDepthWeight));
            i = 31 * i + (this.biomeDepthOffset == 0.0F ? 0 : Float.floatToIntBits(this.biomeDepthOffset));
            i = 31 * i + (this.biomeScaleWeight == 0.0F ? 0 : Float.floatToIntBits(this.biomeScaleWeight));
            i = 31 * i + (this.biomeScaleOffset == 0.0F ? 0 : Float.floatToIntBits(this.biomeScaleOffset));
            i = 31 * i + this.seaLevel;
            i = 31 * i + (this.useCaves ? 1 : 0);
            i = 31 * i + (this.useDungeons ? 1 : 0);
            i = 31 * i + this.dungeonChance;
            i = 31 * i + (this.useStrongholds ? 1 : 0);
            i = 31 * i + (this.useVillages ? 1 : 0);
            i = 31 * i + (this.useMineShafts ? 1 : 0);
            i = 31 * i + (this.useTemples ? 1 : 0);
            i = 31 * i + (this.useMonuments ? 1 : 0);
            i = 31 * i + (this.useRavines ? 1 : 0);
            i = 31 * i + (this.useWaterLakes ? 1 : 0);
            i = 31 * i + this.waterLakeChance;
            i = 31 * i + (this.useLavaLakes ? 1 : 0);
            i = 31 * i + this.lavaLakeChance;
            i = 31 * i + (this.useLavaOceans ? 1 : 0);
            i = 31 * i + this.fixedBiome;
            i = 31 * i + this.biomeSize;
            i = 31 * i + this.riverSize;
            i = 31 * i + this.dirtSize;
            i = 31 * i + this.dirtCount;
            i = 31 * i + this.dirtMinHeight;
            i = 31 * i + this.dirtMaxHeight;
            i = 31 * i + this.gravelSize;
            i = 31 * i + this.gravelCount;
            i = 31 * i + this.gravelMinHeight;
            i = 31 * i + this.gravelMaxHeight;
            i = 31 * i + this.graniteSize;
            i = 31 * i + this.graniteCount;
            i = 31 * i + this.graniteMinHeight;
            i = 31 * i + this.graniteMaxHeight;
            i = 31 * i + this.dioriteSize;
            i = 31 * i + this.dioriteCount;
            i = 31 * i + this.dioriteMinHeight;
            i = 31 * i + this.dioriteMaxHeight;
            i = 31 * i + this.andesiteSize;
            i = 31 * i + this.andesiteCount;
            i = 31 * i + this.andesiteMinHeight;
            i = 31 * i + this.andesiteMaxHeight;
            i = 31 * i + this.coalSize;
            i = 31 * i + this.coalCount;
            i = 31 * i + this.coalMinHeight;
            i = 31 * i + this.coalMaxHeight;
            i = 31 * i + this.ironSize;
            i = 31 * i + this.ironCount;
            i = 31 * i + this.ironMinHeight;
            i = 31 * i + this.ironMaxHeight;
            i = 31 * i + this.goldSize;
            i = 31 * i + this.goldCount;
            i = 31 * i + this.goldMinHeight;
            i = 31 * i + this.goldMaxHeight;
            i = 31 * i + this.redstoneSize;
            i = 31 * i + this.redstoneCount;
            i = 31 * i + this.redstoneMinHeight;
            i = 31 * i + this.redstoneMaxHeight;
            i = 31 * i + this.diamondSize;
            i = 31 * i + this.diamondCount;
            i = 31 * i + this.diamondMinHeight;
            i = 31 * i + this.diamondMaxHeight;
            i = 31 * i + this.lapisSize;
            i = 31 * i + this.lapisCount;
            i = 31 * i + this.lapisCenterHeight;
            i = 31 * i + this.lapisSpread;

            i = 31 * i + this.villageSize;
            i = 31 * i + this.distVillages;
            i = 31 * i + this.caveDensity;
            i = 31 * i + this.caveFrequency;

            return i;
        }

        public ChunkProviderRTGSettings build() {
            return new ChunkProviderRTGSettings(this);
        }
    }

    public static class Serializer implements JsonDeserializer<ChunkProviderRTGSettings.Factory>, JsonSerializer<ChunkProviderRTGSettings.Factory> {
        public ChunkProviderRTGSettings.Factory deserialize(JsonElement p_deserialize_1_, Type p_deserialize_2_, JsonDeserializationContext p_deserialize_3_) throws JsonParseException {
            JsonObject jsonobject = p_deserialize_1_.getAsJsonObject();
            ChunkProviderRTGSettings.Factory ChunkProviderRTGSettings$factory = new ChunkProviderRTGSettings.Factory();

            try {
                ChunkProviderRTGSettings$factory.coordinateScale = JsonUtils.getFloat(jsonobject, "coordinateScale", ChunkProviderRTGSettings$factory.coordinateScale);
                ChunkProviderRTGSettings$factory.heightScale = JsonUtils.getFloat(jsonobject, "heightScale", ChunkProviderRTGSettings$factory.heightScale);
                ChunkProviderRTGSettings$factory.lowerLimitScale = JsonUtils.getFloat(jsonobject, "lowerLimitScale", ChunkProviderRTGSettings$factory.lowerLimitScale);
                ChunkProviderRTGSettings$factory.upperLimitScale = JsonUtils.getFloat(jsonobject, "upperLimitScale", ChunkProviderRTGSettings$factory.upperLimitScale);
                ChunkProviderRTGSettings$factory.depthNoiseScaleX = JsonUtils.getFloat(jsonobject, "depthNoiseScaleX", ChunkProviderRTGSettings$factory.depthNoiseScaleX);
                ChunkProviderRTGSettings$factory.depthNoiseScaleZ = JsonUtils.getFloat(jsonobject, "depthNoiseScaleZ", ChunkProviderRTGSettings$factory.depthNoiseScaleZ);
                ChunkProviderRTGSettings$factory.depthNoiseScaleExponent = JsonUtils.getFloat(jsonobject, "depthNoiseScaleExponent", ChunkProviderRTGSettings$factory.depthNoiseScaleExponent);
                ChunkProviderRTGSettings$factory.mainNoiseScaleX = JsonUtils.getFloat(jsonobject, "mainNoiseScaleX", ChunkProviderRTGSettings$factory.mainNoiseScaleX);
                ChunkProviderRTGSettings$factory.mainNoiseScaleY = JsonUtils.getFloat(jsonobject, "mainNoiseScaleY", ChunkProviderRTGSettings$factory.mainNoiseScaleY);
                ChunkProviderRTGSettings$factory.mainNoiseScaleZ = JsonUtils.getFloat(jsonobject, "mainNoiseScaleZ", ChunkProviderRTGSettings$factory.mainNoiseScaleZ);
                ChunkProviderRTGSettings$factory.baseSize = JsonUtils.getFloat(jsonobject, "baseSize", ChunkProviderRTGSettings$factory.baseSize);
                ChunkProviderRTGSettings$factory.stretchY = JsonUtils.getFloat(jsonobject, "stretchY", ChunkProviderRTGSettings$factory.stretchY);
                ChunkProviderRTGSettings$factory.biomeDepthWeight = JsonUtils.getFloat(jsonobject, "biomeDepthWeight", ChunkProviderRTGSettings$factory.biomeDepthWeight);
                ChunkProviderRTGSettings$factory.biomeDepthOffset = JsonUtils.getFloat(jsonobject, "biomeDepthOffset", ChunkProviderRTGSettings$factory.biomeDepthOffset);
                ChunkProviderRTGSettings$factory.biomeScaleWeight = JsonUtils.getFloat(jsonobject, "biomeScaleWeight", ChunkProviderRTGSettings$factory.biomeScaleWeight);
                ChunkProviderRTGSettings$factory.biomeScaleOffset = JsonUtils.getFloat(jsonobject, "biomeScaleOffset", ChunkProviderRTGSettings$factory.biomeScaleOffset);
                ChunkProviderRTGSettings$factory.seaLevel = JsonUtils.getInt(jsonobject, "seaLevel", ChunkProviderRTGSettings$factory.seaLevel);
                ChunkProviderRTGSettings$factory.useCaves = JsonUtils.getBoolean(jsonobject, "useCaves", ChunkProviderRTGSettings$factory.useCaves);
                ChunkProviderRTGSettings$factory.useDungeons = JsonUtils.getBoolean(jsonobject, "useDungeons", ChunkProviderRTGSettings$factory.useDungeons);
                ChunkProviderRTGSettings$factory.dungeonChance = JsonUtils.getInt(jsonobject, "dungeonChance", ChunkProviderRTGSettings$factory.dungeonChance);
                ChunkProviderRTGSettings$factory.useStrongholds = JsonUtils.getBoolean(jsonobject, "useStrongholds", ChunkProviderRTGSettings$factory.useStrongholds);
                ChunkProviderRTGSettings$factory.useVillages = JsonUtils.getBoolean(jsonobject, "useVillages", ChunkProviderRTGSettings$factory.useVillages);
                ChunkProviderRTGSettings$factory.useMineShafts = JsonUtils.getBoolean(jsonobject, "useMineShafts", ChunkProviderRTGSettings$factory.useMineShafts);
                ChunkProviderRTGSettings$factory.useTemples = JsonUtils.getBoolean(jsonobject, "useTemples", ChunkProviderRTGSettings$factory.useTemples);
                ChunkProviderRTGSettings$factory.useMonuments = JsonUtils.getBoolean(jsonobject, "useMonuments", ChunkProviderRTGSettings$factory.useMonuments);
                ChunkProviderRTGSettings$factory.useRavines = JsonUtils.getBoolean(jsonobject, "useRavines", ChunkProviderRTGSettings$factory.useRavines);
                ChunkProviderRTGSettings$factory.useWaterLakes = JsonUtils.getBoolean(jsonobject, "useWaterLakes", ChunkProviderRTGSettings$factory.useWaterLakes);
                ChunkProviderRTGSettings$factory.waterLakeChance = JsonUtils.getInt(jsonobject, "waterLakeChance", ChunkProviderRTGSettings$factory.waterLakeChance);
                ChunkProviderRTGSettings$factory.useLavaLakes = JsonUtils.getBoolean(jsonobject, "useLavaLakes", ChunkProviderRTGSettings$factory.useLavaLakes);
                ChunkProviderRTGSettings$factory.lavaLakeChance = JsonUtils.getInt(jsonobject, "lavaLakeChance", ChunkProviderRTGSettings$factory.lavaLakeChance);
                ChunkProviderRTGSettings$factory.useLavaOceans = JsonUtils.getBoolean(jsonobject, "useLavaOceans", ChunkProviderRTGSettings$factory.useLavaOceans);
                ChunkProviderRTGSettings$factory.fixedBiome = JsonUtils.getInt(jsonobject, "fixedBiome", ChunkProviderRTGSettings$factory.fixedBiome);

                if (ChunkProviderRTGSettings$factory.fixedBiome < 38 && ChunkProviderRTGSettings$factory.fixedBiome >= -1) {
                    if (ChunkProviderRTGSettings$factory.fixedBiome >= Biome.getIdForBiome(Biomes.HELL)) {
                        ChunkProviderRTGSettings$factory.fixedBiome += 2;
                    }
                } else {
                    ChunkProviderRTGSettings$factory.fixedBiome = -1;
                }

                ChunkProviderRTGSettings$factory.biomeSize = JsonUtils.getInt(jsonobject, "biomeSize", ChunkProviderRTGSettings$factory.biomeSize);
                ChunkProviderRTGSettings$factory.riverSize = JsonUtils.getInt(jsonobject, "riverSize", ChunkProviderRTGSettings$factory.riverSize);
                ChunkProviderRTGSettings$factory.dirtSize = JsonUtils.getInt(jsonobject, "dirtSize", ChunkProviderRTGSettings$factory.dirtSize);
                ChunkProviderRTGSettings$factory.dirtCount = JsonUtils.getInt(jsonobject, "dirtCount", ChunkProviderRTGSettings$factory.dirtCount);
                ChunkProviderRTGSettings$factory.dirtMinHeight = JsonUtils.getInt(jsonobject, "dirtMinHeight", ChunkProviderRTGSettings$factory.dirtMinHeight);
                ChunkProviderRTGSettings$factory.dirtMaxHeight = JsonUtils.getInt(jsonobject, "dirtMaxHeight", ChunkProviderRTGSettings$factory.dirtMaxHeight);
                ChunkProviderRTGSettings$factory.gravelSize = JsonUtils.getInt(jsonobject, "gravelSize", ChunkProviderRTGSettings$factory.gravelSize);
                ChunkProviderRTGSettings$factory.gravelCount = JsonUtils.getInt(jsonobject, "gravelCount", ChunkProviderRTGSettings$factory.gravelCount);
                ChunkProviderRTGSettings$factory.gravelMinHeight = JsonUtils.getInt(jsonobject, "gravelMinHeight", ChunkProviderRTGSettings$factory.gravelMinHeight);
                ChunkProviderRTGSettings$factory.gravelMaxHeight = JsonUtils.getInt(jsonobject, "gravelMaxHeight", ChunkProviderRTGSettings$factory.gravelMaxHeight);
                ChunkProviderRTGSettings$factory.graniteSize = JsonUtils.getInt(jsonobject, "graniteSize", ChunkProviderRTGSettings$factory.graniteSize);
                ChunkProviderRTGSettings$factory.graniteCount = JsonUtils.getInt(jsonobject, "graniteCount", ChunkProviderRTGSettings$factory.graniteCount);
                ChunkProviderRTGSettings$factory.graniteMinHeight = JsonUtils.getInt(jsonobject, "graniteMinHeight", ChunkProviderRTGSettings$factory.graniteMinHeight);
                ChunkProviderRTGSettings$factory.graniteMaxHeight = JsonUtils.getInt(jsonobject, "graniteMaxHeight", ChunkProviderRTGSettings$factory.graniteMaxHeight);
                ChunkProviderRTGSettings$factory.dioriteSize = JsonUtils.getInt(jsonobject, "dioriteSize", ChunkProviderRTGSettings$factory.dioriteSize);
                ChunkProviderRTGSettings$factory.dioriteCount = JsonUtils.getInt(jsonobject, "dioriteCount", ChunkProviderRTGSettings$factory.dioriteCount);
                ChunkProviderRTGSettings$factory.dioriteMinHeight = JsonUtils.getInt(jsonobject, "dioriteMinHeight", ChunkProviderRTGSettings$factory.dioriteMinHeight);
                ChunkProviderRTGSettings$factory.dioriteMaxHeight = JsonUtils.getInt(jsonobject, "dioriteMaxHeight", ChunkProviderRTGSettings$factory.dioriteMaxHeight);
                ChunkProviderRTGSettings$factory.andesiteSize = JsonUtils.getInt(jsonobject, "andesiteSize", ChunkProviderRTGSettings$factory.andesiteSize);
                ChunkProviderRTGSettings$factory.andesiteCount = JsonUtils.getInt(jsonobject, "andesiteCount", ChunkProviderRTGSettings$factory.andesiteCount);
                ChunkProviderRTGSettings$factory.andesiteMinHeight = JsonUtils.getInt(jsonobject, "andesiteMinHeight", ChunkProviderRTGSettings$factory.andesiteMinHeight);
                ChunkProviderRTGSettings$factory.andesiteMaxHeight = JsonUtils.getInt(jsonobject, "andesiteMaxHeight", ChunkProviderRTGSettings$factory.andesiteMaxHeight);
                ChunkProviderRTGSettings$factory.coalSize = JsonUtils.getInt(jsonobject, "coalSize", ChunkProviderRTGSettings$factory.coalSize);
                ChunkProviderRTGSettings$factory.coalCount = JsonUtils.getInt(jsonobject, "coalCount", ChunkProviderRTGSettings$factory.coalCount);
                ChunkProviderRTGSettings$factory.coalMinHeight = JsonUtils.getInt(jsonobject, "coalMinHeight", ChunkProviderRTGSettings$factory.coalMinHeight);
                ChunkProviderRTGSettings$factory.coalMaxHeight = JsonUtils.getInt(jsonobject, "coalMaxHeight", ChunkProviderRTGSettings$factory.coalMaxHeight);
                ChunkProviderRTGSettings$factory.ironSize = JsonUtils.getInt(jsonobject, "ironSize", ChunkProviderRTGSettings$factory.ironSize);
                ChunkProviderRTGSettings$factory.ironCount = JsonUtils.getInt(jsonobject, "ironCount", ChunkProviderRTGSettings$factory.ironCount);
                ChunkProviderRTGSettings$factory.ironMinHeight = JsonUtils.getInt(jsonobject, "ironMinHeight", ChunkProviderRTGSettings$factory.ironMinHeight);
                ChunkProviderRTGSettings$factory.ironMaxHeight = JsonUtils.getInt(jsonobject, "ironMaxHeight", ChunkProviderRTGSettings$factory.ironMaxHeight);
                ChunkProviderRTGSettings$factory.goldSize = JsonUtils.getInt(jsonobject, "goldSize", ChunkProviderRTGSettings$factory.goldSize);
                ChunkProviderRTGSettings$factory.goldCount = JsonUtils.getInt(jsonobject, "goldCount", ChunkProviderRTGSettings$factory.goldCount);
                ChunkProviderRTGSettings$factory.goldMinHeight = JsonUtils.getInt(jsonobject, "goldMinHeight", ChunkProviderRTGSettings$factory.goldMinHeight);
                ChunkProviderRTGSettings$factory.goldMaxHeight = JsonUtils.getInt(jsonobject, "goldMaxHeight", ChunkProviderRTGSettings$factory.goldMaxHeight);
                ChunkProviderRTGSettings$factory.redstoneSize = JsonUtils.getInt(jsonobject, "redstoneSize", ChunkProviderRTGSettings$factory.redstoneSize);
                ChunkProviderRTGSettings$factory.redstoneCount = JsonUtils.getInt(jsonobject, "redstoneCount", ChunkProviderRTGSettings$factory.redstoneCount);
                ChunkProviderRTGSettings$factory.redstoneMinHeight = JsonUtils.getInt(jsonobject, "redstoneMinHeight", ChunkProviderRTGSettings$factory.redstoneMinHeight);
                ChunkProviderRTGSettings$factory.redstoneMaxHeight = JsonUtils.getInt(jsonobject, "redstoneMaxHeight", ChunkProviderRTGSettings$factory.redstoneMaxHeight);
                ChunkProviderRTGSettings$factory.diamondSize = JsonUtils.getInt(jsonobject, "diamondSize", ChunkProviderRTGSettings$factory.diamondSize);
                ChunkProviderRTGSettings$factory.diamondCount = JsonUtils.getInt(jsonobject, "diamondCount", ChunkProviderRTGSettings$factory.diamondCount);
                ChunkProviderRTGSettings$factory.diamondMinHeight = JsonUtils.getInt(jsonobject, "diamondMinHeight", ChunkProviderRTGSettings$factory.diamondMinHeight);
                ChunkProviderRTGSettings$factory.diamondMaxHeight = JsonUtils.getInt(jsonobject, "diamondMaxHeight", ChunkProviderRTGSettings$factory.diamondMaxHeight);
                ChunkProviderRTGSettings$factory.lapisSize = JsonUtils.getInt(jsonobject, "lapisSize", ChunkProviderRTGSettings$factory.lapisSize);
                ChunkProviderRTGSettings$factory.lapisCount = JsonUtils.getInt(jsonobject, "lapisCount", ChunkProviderRTGSettings$factory.lapisCount);
                ChunkProviderRTGSettings$factory.lapisCenterHeight = JsonUtils.getInt(jsonobject, "lapisCenterHeight", ChunkProviderRTGSettings$factory.lapisCenterHeight);
                ChunkProviderRTGSettings$factory.lapisSpread = JsonUtils.getInt(jsonobject, "lapisSpread", ChunkProviderRTGSettings$factory.lapisSpread);

                ChunkProviderRTGSettings$factory.distVillages = JsonUtils.getInt(jsonobject, "distVillages", ChunkProviderRTGSettings$factory.distVillages);
                ChunkProviderRTGSettings$factory.caveFrequency = JsonUtils.getInt(jsonobject, "caveFrequency", ChunkProviderRTGSettings$factory.caveFrequency);
                ChunkProviderRTGSettings$factory.caveDensity = JsonUtils.getInt(jsonobject, "caveDensity", ChunkProviderRTGSettings$factory.caveDensity);
                ChunkProviderRTGSettings$factory.villageSize = JsonUtils.getInt(jsonobject, "villageSize", ChunkProviderRTGSettings$factory.villageSize);

            } catch (Exception var7) {
                ;
            }

            return ChunkProviderRTGSettings$factory;
        }

        public JsonElement serialize(ChunkProviderRTGSettings.Factory p_serialize_1_, Type p_serialize_2_, JsonSerializationContext p_serialize_3_) {
            JsonObject jsonobject = new JsonObject();
            jsonobject.addProperty("coordinateScale", (Number) Float.valueOf(p_serialize_1_.coordinateScale));
            jsonobject.addProperty("heightScale", (Number) Float.valueOf(p_serialize_1_.heightScale));
            jsonobject.addProperty("lowerLimitScale", (Number) Float.valueOf(p_serialize_1_.lowerLimitScale));
            jsonobject.addProperty("upperLimitScale", (Number) Float.valueOf(p_serialize_1_.upperLimitScale));
            jsonobject.addProperty("depthNoiseScaleX", (Number) Float.valueOf(p_serialize_1_.depthNoiseScaleX));
            jsonobject.addProperty("depthNoiseScaleZ", (Number) Float.valueOf(p_serialize_1_.depthNoiseScaleZ));
            jsonobject.addProperty("depthNoiseScaleExponent", (Number) Float.valueOf(p_serialize_1_.depthNoiseScaleExponent));
            jsonobject.addProperty("mainNoiseScaleX", (Number) Float.valueOf(p_serialize_1_.mainNoiseScaleX));
            jsonobject.addProperty("mainNoiseScaleY", (Number) Float.valueOf(p_serialize_1_.mainNoiseScaleY));
            jsonobject.addProperty("mainNoiseScaleZ", (Number) Float.valueOf(p_serialize_1_.mainNoiseScaleZ));
            jsonobject.addProperty("baseSize", (Number) Float.valueOf(p_serialize_1_.baseSize));
            jsonobject.addProperty("stretchY", (Number) Float.valueOf(p_serialize_1_.stretchY));
            jsonobject.addProperty("biomeDepthWeight", (Number) Float.valueOf(p_serialize_1_.biomeDepthWeight));
            jsonobject.addProperty("biomeDepthOffset", (Number) Float.valueOf(p_serialize_1_.biomeDepthOffset));
            jsonobject.addProperty("biomeScaleWeight", (Number) Float.valueOf(p_serialize_1_.biomeScaleWeight));
            jsonobject.addProperty("biomeScaleOffset", (Number) Float.valueOf(p_serialize_1_.biomeScaleOffset));
            jsonobject.addProperty("seaLevel", (Number) Integer.valueOf(p_serialize_1_.seaLevel));
            jsonobject.addProperty("useCaves", Boolean.valueOf(p_serialize_1_.useCaves));
            jsonobject.addProperty("useDungeons", Boolean.valueOf(p_serialize_1_.useDungeons));
            jsonobject.addProperty("dungeonChance", (Number) Integer.valueOf(p_serialize_1_.dungeonChance));
            jsonobject.addProperty("useStrongholds", Boolean.valueOf(p_serialize_1_.useStrongholds));
            jsonobject.addProperty("useVillages", Boolean.valueOf(p_serialize_1_.useVillages));
            jsonobject.addProperty("useMineShafts", Boolean.valueOf(p_serialize_1_.useMineShafts));
            jsonobject.addProperty("useTemples", Boolean.valueOf(p_serialize_1_.useTemples));
            jsonobject.addProperty("useMonuments", Boolean.valueOf(p_serialize_1_.useMonuments));
            jsonobject.addProperty("useRavines", Boolean.valueOf(p_serialize_1_.useRavines));
            jsonobject.addProperty("useWaterLakes", Boolean.valueOf(p_serialize_1_.useWaterLakes));
            jsonobject.addProperty("waterLakeChance", (Number) Integer.valueOf(p_serialize_1_.waterLakeChance));
            jsonobject.addProperty("useLavaLakes", Boolean.valueOf(p_serialize_1_.useLavaLakes));
            jsonobject.addProperty("lavaLakeChance", (Number) Integer.valueOf(p_serialize_1_.lavaLakeChance));
            jsonobject.addProperty("useLavaOceans", Boolean.valueOf(p_serialize_1_.useLavaOceans));
            jsonobject.addProperty("fixedBiome", (Number) Integer.valueOf(p_serialize_1_.fixedBiome));
            jsonobject.addProperty("biomeSize", (Number) Integer.valueOf(p_serialize_1_.biomeSize));
            jsonobject.addProperty("riverSize", (Number) Integer.valueOf(p_serialize_1_.riverSize));
            jsonobject.addProperty("dirtSize", (Number) Integer.valueOf(p_serialize_1_.dirtSize));
            jsonobject.addProperty("dirtCount", (Number) Integer.valueOf(p_serialize_1_.dirtCount));
            jsonobject.addProperty("dirtMinHeight", (Number) Integer.valueOf(p_serialize_1_.dirtMinHeight));
            jsonobject.addProperty("dirtMaxHeight", (Number) Integer.valueOf(p_serialize_1_.dirtMaxHeight));
            jsonobject.addProperty("gravelSize", (Number) Integer.valueOf(p_serialize_1_.gravelSize));
            jsonobject.addProperty("gravelCount", (Number) Integer.valueOf(p_serialize_1_.gravelCount));
            jsonobject.addProperty("gravelMinHeight", (Number) Integer.valueOf(p_serialize_1_.gravelMinHeight));
            jsonobject.addProperty("gravelMaxHeight", (Number) Integer.valueOf(p_serialize_1_.gravelMaxHeight));
            jsonobject.addProperty("graniteSize", (Number) Integer.valueOf(p_serialize_1_.graniteSize));
            jsonobject.addProperty("graniteCount", (Number) Integer.valueOf(p_serialize_1_.graniteCount));
            jsonobject.addProperty("graniteMinHeight", (Number) Integer.valueOf(p_serialize_1_.graniteMinHeight));
            jsonobject.addProperty("graniteMaxHeight", (Number) Integer.valueOf(p_serialize_1_.graniteMaxHeight));
            jsonobject.addProperty("dioriteSize", (Number) Integer.valueOf(p_serialize_1_.dioriteSize));
            jsonobject.addProperty("dioriteCount", (Number) Integer.valueOf(p_serialize_1_.dioriteCount));
            jsonobject.addProperty("dioriteMinHeight", (Number) Integer.valueOf(p_serialize_1_.dioriteMinHeight));
            jsonobject.addProperty("dioriteMaxHeight", (Number) Integer.valueOf(p_serialize_1_.dioriteMaxHeight));
            jsonobject.addProperty("andesiteSize", (Number) Integer.valueOf(p_serialize_1_.andesiteSize));
            jsonobject.addProperty("andesiteCount", (Number) Integer.valueOf(p_serialize_1_.andesiteCount));
            jsonobject.addProperty("andesiteMinHeight", (Number) Integer.valueOf(p_serialize_1_.andesiteMinHeight));
            jsonobject.addProperty("andesiteMaxHeight", (Number) Integer.valueOf(p_serialize_1_.andesiteMaxHeight));
            jsonobject.addProperty("coalSize", (Number) Integer.valueOf(p_serialize_1_.coalSize));
            jsonobject.addProperty("coalCount", (Number) Integer.valueOf(p_serialize_1_.coalCount));
            jsonobject.addProperty("coalMinHeight", (Number) Integer.valueOf(p_serialize_1_.coalMinHeight));
            jsonobject.addProperty("coalMaxHeight", (Number) Integer.valueOf(p_serialize_1_.coalMaxHeight));
            jsonobject.addProperty("ironSize", (Number) Integer.valueOf(p_serialize_1_.ironSize));
            jsonobject.addProperty("ironCount", (Number) Integer.valueOf(p_serialize_1_.ironCount));
            jsonobject.addProperty("ironMinHeight", (Number) Integer.valueOf(p_serialize_1_.ironMinHeight));
            jsonobject.addProperty("ironMaxHeight", (Number) Integer.valueOf(p_serialize_1_.ironMaxHeight));
            jsonobject.addProperty("goldSize", (Number) Integer.valueOf(p_serialize_1_.goldSize));
            jsonobject.addProperty("goldCount", (Number) Integer.valueOf(p_serialize_1_.goldCount));
            jsonobject.addProperty("goldMinHeight", (Number) Integer.valueOf(p_serialize_1_.goldMinHeight));
            jsonobject.addProperty("goldMaxHeight", (Number) Integer.valueOf(p_serialize_1_.goldMaxHeight));
            jsonobject.addProperty("redstoneSize", (Number) Integer.valueOf(p_serialize_1_.redstoneSize));
            jsonobject.addProperty("redstoneCount", (Number) Integer.valueOf(p_serialize_1_.redstoneCount));
            jsonobject.addProperty("redstoneMinHeight", (Number) Integer.valueOf(p_serialize_1_.redstoneMinHeight));
            jsonobject.addProperty("redstoneMaxHeight", (Number) Integer.valueOf(p_serialize_1_.redstoneMaxHeight));
            jsonobject.addProperty("diamondSize", (Number) Integer.valueOf(p_serialize_1_.diamondSize));
            jsonobject.addProperty("diamondCount", (Number) Integer.valueOf(p_serialize_1_.diamondCount));
            jsonobject.addProperty("diamondMinHeight", (Number) Integer.valueOf(p_serialize_1_.diamondMinHeight));
            jsonobject.addProperty("diamondMaxHeight", (Number) Integer.valueOf(p_serialize_1_.diamondMaxHeight));
            jsonobject.addProperty("lapisSize", (Number) Integer.valueOf(p_serialize_1_.lapisSize));
            jsonobject.addProperty("lapisCount", (Number) Integer.valueOf(p_serialize_1_.lapisCount));
            jsonobject.addProperty("lapisCenterHeight", (Number) Integer.valueOf(p_serialize_1_.lapisCenterHeight));
            jsonobject.addProperty("lapisSpread", (Number) Integer.valueOf(p_serialize_1_.lapisSpread));

            jsonobject.addProperty("villageSize", (Number) Integer.valueOf(p_serialize_1_.villageSize));
            jsonobject.addProperty("distVillages", (Number) Integer.valueOf(p_serialize_1_.distVillages));
            jsonobject.addProperty("caveDensity", (Number) Integer.valueOf(p_serialize_1_.caveDensity));
            jsonobject.addProperty("caveFrequency", (Number) Integer.valueOf(p_serialize_1_.caveFrequency));
            return jsonobject;
        }
    }
}

