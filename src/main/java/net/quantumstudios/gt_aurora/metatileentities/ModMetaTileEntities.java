package net.quantumstudios.gt_aurora.metatileentities;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

import net.quantumstudios.gt_aurora.api.util.GtAuroraUtil;
import net.quantumstudios.gt_aurora.metatileentities.multiblock.MetaTileEntityQuantumStringDeterminator;

public final class ModMetaTileEntities {

    public static MetaTileEntityQuantumStringDeterminator QUANTUM_STRING_DETERMINATOR;


    private ModMetaTileEntities() {}

    public static void init() {
        QUANTUM_STRING_DETERMINATOR = registerMetaTileEntity(6000,
                new MetaTileEntityQuantumStringDeterminator(GtAuroraUtil.gt_auroraId("quantum_string_determinator")));
    }
}
