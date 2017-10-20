package com.gameofillusion.goi.tabs;

import com.gameofillusion.goi.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GoITabDecoration extends CreativeTabs{

	public GoITabDecoration(String label) {
		super("goiTabDecoration");
		this.setBackgroundImageName("items.png");
	}
	
	public ItemStack getTabIconItem(){
		return new ItemStack(ItemInit.INGOT_COPPER);
		
	}


}