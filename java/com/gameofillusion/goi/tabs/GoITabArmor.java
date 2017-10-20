package com.gameofillusion.goi.tabs;

import com.gameofillusion.goi.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GoITabArmor extends CreativeTabs{

	public GoITabArmor(String label) {
		super("goiTabArmor");
		this.setBackgroundImageName("items.png");
	}
	
	public ItemStack getTabIconItem(){
		return new ItemStack(ItemInit.CHESTPLATE_AMBER);
		
	}


}
