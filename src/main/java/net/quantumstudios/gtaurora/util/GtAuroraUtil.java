package net.quantumstudios.gtaurora.util;

import net.minecraft.util.ResourceLocation;

/**
 * I have no clue what this class is for ~moddingforreal
 *
 * @author Frosteco
 * @author moddingforreal
 * */

public final class GtAuroraUtil
{
    public static ResourceLocation gt_auroraId(String name)
    {
        return new ResourceLocation(ModData.MOD_ID, name);
    }
        private GtAuroraUtil() {}
}