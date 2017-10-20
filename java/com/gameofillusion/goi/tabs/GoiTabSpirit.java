package com.gameofillusion.goi.tabs;

import com.gameofillusion.goi.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GoiTabSpirit extends CreativeTabs{

	public GoiTabSpirit(String label) {
		super("goiTabSpirit");
		this.setBackgroundImageName("items.png");
	}
	
	public ItemStack getTabIconItem(){
		return new ItemStack(ItemInit.DUST_AMBER);
		
	}


}