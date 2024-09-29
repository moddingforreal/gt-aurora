package net.quantumstudios.gtaurora.api.gui;

import net.quantumstudios.gtaurora.api.util.GtAuroraUtil;

import gregtech.api.gui.resources.TextureArea;

public final class GuiTextures
{

   
    public static final TextureArea ROBOT_ARM_OVERLAY = fullImage("textures/gui/overlay/robot_arm_overlay.png");

    private static TextureArea fullImage(String imageLocation) {
        return new TextureArea(GtAuroraUtil.gt_auroraId(imageLocation), 0.0, 0.0, 1.0, 1.0);
    }
}
