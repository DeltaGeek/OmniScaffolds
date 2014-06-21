package com.deltageek.omniscaffolds;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "OmniScaffolds", name = "OmniScaffolds", version = "1.7.2-0.1")
public class OmniScaffolds {

    @Mod.Instance("OmniScaffolds")
    public static OmniScaffolds instance;

    private OmniScaffoldsConfig config;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        // network handling

        // load config
        config = new OmniScaffoldsConfig(event.getSuggestedConfigurationFile());
        config.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        // UI

        // Tile Entities

        // Recipes
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        // Respond to other mods
    }
}
