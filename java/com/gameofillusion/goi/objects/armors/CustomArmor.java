package com.gameofillusion.goi.objects.armors;

import com.gameofillusion.goi.Main;
import com.gameofillusion.goi.init.ItemInit;
import com.gameofillusion.goi.tabs.GoITab;
import com.gameofillusion.goi.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class CustomArmor extends ItemArmor implements IHasModel
{
	public CustomArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
        setCreativeTab(Main.GOI_TAB_ARMOR);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
