package com.gameofillusion.goi;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.SidedProxy;
import com.gameofillusion.goi.proxy.CommonProxy;
import com.gameofillusion.goi.tabs.GoITab;
import com.gameofillusion.goi.tabs.GoITabArmor;
import com.gameofillusion.goi.tabs.GoITabBlock;
import com.gameofillusion.goi.tabs.GoITabCombat;
import com.gameofillusion.goi.tabs.GoITabDecoration;
import com.gameofillusion.goi.tabs.GoITabGodsDemons;
import com.gameofillusion.goi.tabs.GoITabGoodsEvils;
import com.gameofillusion.goi.tabs.GoITabTools;
import com.gameofillusion.goi.tabs.GoITabWeapons;
import com.gameofillusion.goi.tabs.GoiTabSpirit;
import com.gameofillusion.goi.util.Reference;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)

public class Main 
{
	public static final CreativeTabs GOI_TAB = new GoITab("goiTab");
	public static final CreativeTabs GOI_TAB_BLOCK = new GoITabBlock("goiTabBlock");
	public static final CreativeTabs GOI_TAB_DECORATION = new GoITabDecoration("goiTabDecoration");
	public static final CreativeTabs GOI_TAB_SPIRIT = new GoiTabSpirit("goiTabSpirit");
	
	public static final CreativeTabs GOI_TAB_TOOLS = new GoITabTools("goiTabTools");
	public static final CreativeTabs GOI_TAB_COMBAT = new GoITabCombat("goiTabCombat");
	public static final CreativeTabs GOI_TAB_ARMOR = new GoITabArmor("goiTabArmor");
	public static final CreativeTabs GOI_TAB_WEAPONS = new GoITabWeapons("goiTabWeapons");
	public static final CreativeTabs GOI_TAB_GODS_DEMONS = new GoITabGodsDemons("goiTabGodsDemons");
	public static final CreativeTabs GOI_TAB_GOODS_EVILS = new GoITabGoodsEvils("goiTabGoodsEvils");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
	
}

