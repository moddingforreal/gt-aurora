package net.quantumstudios.gtaurora.metatileentities;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

import net.quantumstudios.gtaurora.api.util.GT_AURORAUtil;
import net.quantumstudios.gtaurora.metatileentities.multiblock.MetaTileEntityQuantumStringDeterminator;

public final class ModMetaTileEntities {

    public static MetaTileEntityQuantumStringDeterminator QUANTUM_STRING_DETERMINATOR;


    private ModMetaTileEntities() {}

    public static void init() {
        QUANTUM_STRING_DETERMINATOR = registerMetaTileEntity(6000,
                new MetaTileEntityQuantumStringDeterminator(GT_AURORAUtil.gt_auroraId("quantum_string_determinator")));
    }
}
