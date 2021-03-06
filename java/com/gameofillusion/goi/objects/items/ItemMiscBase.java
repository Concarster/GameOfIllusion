package com.gameofillusion.goi.objects.items;

import com.gameofillusion.goi.Main;
import com.gameofillusion.goi.init.ItemInit;
import com.gameofillusion.goi.util.interfaces.IHasModel;

import net.minecraft.item.Item;

public class ItemMiscBase extends Item implements IHasModel{
	
	public ItemMiscBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.GOI_TAB);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
	

}