package com.gameofillusion.goi.objects.items;

import com.gameofillusion.goi.Main;
import com.gameofillusion.goi.init.ItemInit;
import com.gameofillusion.goi.proxy.ClientProxy;
import com.gameofillusion.goi.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
//import net.minecraft.item.ItemSeeds;

public class ItemSeed extends Item implements IHasModel{
	
	public ItemSeed(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.GOI_TAB_GOODS_EVILS);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
	

}
