package com.gameofillusion.goi.objects.tools;

import com.gameofillusion.goi.Main;
import com.gameofillusion.goi.init.ItemInit;
import com.gameofillusion.goi.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {

	
	
	public ToolPickaxe(String name, ToolMaterial material) {
	
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.GOI_TAB_TOOLS);
		
		ItemInit.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

	

}

