package com.gameofillusion.goi.tabs;

import com.gameofillusion.goi.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GoITabGoodsEvils extends CreativeTabs{

	public GoITabGoodsEvils(String label) {
		super("goiTabGoodsEvils");
		this.setBackgroundImageName("items.png");
	}
	
	public ItemStack getTabIconItem(){
		return new ItemStack(ItemInit.INGOT_COPPER);
		
	}


}

