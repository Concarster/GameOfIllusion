package com.gameofillusion.goi.tabs;

import com.gameofillusion.goi.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GoITab extends CreativeTabs{

	public GoITab(String label) {
		super("goiTab");
		this.setBackgroundImageName("items.png");
	}
	
	public ItemStack getTabIconItem(){
		return new ItemStack(ItemInit.GEM_AMBER);
		
	}


}

