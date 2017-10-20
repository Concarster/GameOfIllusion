package com.gameofillusion.goi.objects.blocks;

import com.gameofillusion.goi.Main;
import com.gameofillusion.goi.init.BlockInit;
import com.gameofillusion.goi.init.ItemInit;
import com.gameofillusion.goi.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockAmber extends Block implements IHasModel{

	public BlockAmber(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.GOI_TAB_BLOCK);
		setHardness (2.5f);
		setHarvestLevel("pickaxe", 2);
		
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
	
	

}
