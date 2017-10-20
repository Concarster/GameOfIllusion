package com.gameofillusion.goi.init;

import java.util.ArrayList;
import java.util.List;

import com.gameofillusion.goi.objects.armors.ArmorBase;
import com.gameofillusion.goi.objects.items.ItemBase;
import com.gameofillusion.goi.objects.items.ItemMiscBase;
import com.gameofillusion.goi.objects.items.ItemSeed;
import com.gameofillusion.goi.objects.tools.ToolAxe;
import com.gameofillusion.goi.objects.tools.ToolHoe;
import com.gameofillusion.goi.objects.tools.ToolPickaxe;
import com.gameofillusion.goi.objects.tools.ToolShovel;
import com.gameofillusion.goi.objects.tools.ToolSword;
import com.gameofillusion.goi.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {

	public ItemInit() {
		
	                  }
	
public static final List<Item> ITEMS = new ArrayList<Item>();

    //Material
	public static final ToolMaterial TOOL_AMBER = EnumHelper.addToolMaterial("tool_amber", 2, 250, 6.0F, 2.0F, 14);
	public static final ArmorMaterial ARMOR_AMBER = EnumHelper.addArmorMaterial("armor_amber", Reference.MOD_ID + ":amber", 20, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F);

   //Miselaneos 
	public static final Item STICK_IRON = new ItemMiscBase("stick_iron");
	

    //Items
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
	public static final Item INGOT_AMBER = new ItemBase("ingot_amber");
	public static final Item NUGGET_AMBER = new ItemBase("nugget_amber");
	public static final Item GEM_AMBER = new ItemBase("gem_amber");
	public static final Item DUST_AMBER = new ItemBase("dust_amber");
	public static final Item SOUL_AMBER = new ItemSeed("soul_amber");
	public static final Item SEED_EVIL_MAGMA = new ItemSeed("seed_evil_magma");
	
	
	//Tools
	public static final Item AXE_AMBER = new ToolAxe("axe_amber", TOOL_AMBER);
	public static final Item HOE_AMBER = new ToolHoe("hoe_amber", TOOL_AMBER);
	public static final Item PICKAXE_AMBER = new ToolPickaxe("pickaxe_amber", TOOL_AMBER);
	public static final Item SHOVEL_AMBER = new ToolShovel("shovel_amber", TOOL_AMBER);
	public static final Item SWORD_AMBER = new ToolSword("sword_amber", TOOL_AMBER);
	
	
	
	
	// ARMOR
	
	public static final Item HELMET_AMBER = new ArmorBase("helmet_amber", ARMOR_AMBER, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_AMBER = new ArmorBase("chestplate_amber", ARMOR_AMBER, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_AMBER = new ArmorBase("leggings_amber", ARMOR_AMBER, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_AMBER = new ArmorBase("boots_amber", ARMOR_AMBER, 1, EntityEquipmentSlot.FEET);
	

}
