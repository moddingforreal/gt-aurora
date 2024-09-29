package net.quantumstudios.gt_aurora;

import net.minecraftforge.fml.common.Mod;
import net.quantumstudios.gt_aurora.tab.GtAuroraTab;
import net.quantumstudios.gt_aurora.block.MetaBlocks;
import net.quantumstudios.gt_aurora.metatileentities.ModMetaTileEntities;
import net.quantumstudios.gt_aurora.proxy.CommonProxy;
import net.quantumstudios.gt_aurora.util.ModData;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModData.MOD_ID,
    name = ModData.NAME,
    version = ModData.VERSION,
    dependencies = ModData.DEP_VERSION_STRING)
public final class GtAuroraMod
{
    @Instance
    public static GtAuroraMod instance;

    @SidedProxy(clientSide = ModData.CLIENT_PROXY_CLASS, serverSide = ModData.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    private static Logger logger;

    public static final GtAuroraTab creativeTab = new GtAuroraTab();

    //preInit for MetaTileEntities... 
    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("Beginning PreInit");
        MetaBlocks.init();
        ModMetaTileEntities.init();
        proxy.preLoad();
        logger.info("PreInit complete");
    }
    @EventHandler
    public static void init(FMLInitializationEvent event) {}
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        logger.info("Beginning PostInit");
        logger.info("Nothing happens here");
        logger.info("PostInit complete");
    }

    public static Logger getLogger() {
        return logger;
    }
}