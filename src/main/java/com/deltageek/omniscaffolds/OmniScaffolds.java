package com.deltageek.omniscaffolds;

import com.deltageek.omniscaffolds.config.OmniScaffoldsConfig;
import com.deltageek.omniscaffolds.proxy.IProxy;
import com.deltageek.omniscaffolds.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class OmniScaffolds {

    @Mod.Instance(Reference.MOD_ID)
    public static OmniScaffolds instance;

    @SidedProxy(clientSide= Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    private OmniScaffoldsConfig config;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        // network handling

        // load config
        OmniScaffoldsConfig.init(event.getSuggestedConfigurationFile());
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
