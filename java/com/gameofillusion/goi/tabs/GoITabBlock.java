package com.gameofillusion.goi.tabs;

import com.gameofillusion.goi.init.BlockInit;
import com.gameofillusion.goi.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GoITabBlock extends CreativeTabs{

	public GoITabBlock(String label) {
		super("goiTabBlock");
		this.setBackgroundImageName("items.png");
	}
	
	public ItemStack getTabIconItem(){
		return new ItemStack(BlockInit.BLOCK_AMBER);
		
	}


}


