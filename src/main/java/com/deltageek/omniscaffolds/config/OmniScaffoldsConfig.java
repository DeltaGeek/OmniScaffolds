package com.deltageek.omniscaffolds.config;

import cpw.mods.fml.common.FMLLog;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

import java.io.File;

public class OmniScaffoldsConfig {

    public static int MAX_LENGTH_WOOD;
    public static int MAX_LENGTH_IRON;
    public static int MAX_LENGTH_GOLD;
    public static int MAX_LENGTH_DIAMOND;

    public static void init(File configFile) {
        FMLLog.log("OmniScaffolds", Level.INFO, "Starting configuration load");

        Configuration config = null;
        try{
            config = new Configuration(configFile);
            MAX_LENGTH_WOOD = config.get(Configuration.CATEGORY_GENERAL, "maxLengthWood", 8).getInt();
            MAX_LENGTH_IRON = config.get(Configuration.CATEGORY_GENERAL, "maxLengthIron", 16).getInt();
            MAX_LENGTH_GOLD = config.get(Configuration.CATEGORY_GENERAL, "maxLengthGold", 32).getInt();
            MAX_LENGTH_DIAMOND = config.get(Configuration.CATEGORY_GENERAL, "maxLengthDiamond", 64).getInt();
            FMLLog.log("OmniScaffolds", Level.INFO, "Mod configuration successfully loaded");
        }
        catch(Exception e){
            FMLLog.log("OmniScaffolds", Level.ERROR, "OmniScaffolds has had a problem loading its configuration");
        }
        finally {
            if(config != null && config.hasChanged())
                config.save();
        }
    }
}
