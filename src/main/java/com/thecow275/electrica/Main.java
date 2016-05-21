package com.thecow275.electrica;

import  net.minecraftforge.fml.common.Mod;
import  net.minecraftforge.fml.common.Mod.EventHandler;
import  net.minecraftforge.fml.common.Mod.Instance;
import	net.minecraftforge.fml.common.SidedProxy;
import	net.minecraftforge.fml.common.event.FMLInitializationEvent;
import	net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import	net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

	public static final String MODID = "electrica";
	public static final String MODNAME = "thecow275's Electrica";
	public static final String VERSION = "Alpha 0.0.9e";
	@SidedProxy(clientSide="com.thecow275.electrica.ClientProxy",
			serverSide="com.thecow275.electrica.ServerProxy")
	public static CommonProxy proxy;
	@Instance
	public static Main instance = new Main();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e){
		proxy.preInit(e);
	}
	@EventHandler
	public void Init(FMLInitializationEvent e){
		proxy.Init(e);
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent e){
		proxy.postInit(e);
	}



}
