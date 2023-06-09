package com.fer.mod;

import com.fer.mod.proxy.CommonProxy;
import com.fer.mod.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event){

    }
    @Mod.EventHandler
    public static void Init(FMLPreInitializationEvent event){
        proxy.registerGui();
    }
    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event){

    }


}
