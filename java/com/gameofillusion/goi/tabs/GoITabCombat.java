package com.gameofillusion.goi.tabs;

import com.gameofillusion.goi.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GoITabCombat extends CreativeTabs{

	public GoITabCombat(String label) {
		super("goiTabCombat");
		this.setBackgroundImageName("items.png");
	}
	
	public ItemStack getTabIconItem(){
		return new ItemStack(ItemInit.SWORD_AMBER);
		
	}


}

