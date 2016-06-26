package com.thecow275.electrica.items;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
public final class ModItems {
	public static Item ingotTin;
	public static Item ingotCopper;
	public static Item pickaxeCopper;
	public static Item axeCopper;
	public static Item helmetCopper;
	public static Item chestplateCopper;
    public static Item ingotBronze;
    public static Item leggingsCopper;
    public static Item bootsCopper;
	public static Item hammerBronze;
	public static Item hoeCopper;
	//public static ToolMaterial Copper = EnumHelper.addToolMaterial("Copper", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);
	public static ToolMaterial CopperSword = EnumHelper.addToolMaterial("CopperSword", 0, 500, 1.0F, 2.0F, 14);
	public static ToolMaterial CopperPickaxe = EnumHelper.addToolMaterial("CopperPickaxe", 2, 500, 6.0F, 2.0F, 14);
	public static ToolMaterial CopperShovel = EnumHelper.addToolMaterial("CopperShovel", 2, 500, 6.0F, 2.0F, 14);
	public static ToolMaterial CopperAxe = EnumHelper.addToolMaterial("CopperAxe", 2, 500, 6.0F, 2.0F, 14);
	public static ToolMaterial CopperHoe = EnumHelper.addToolMaterial("CopperHoe", 0, 500, 6.0F, 2.0F, 14);
	public static ToolMaterial BronzeHammer = EnumHelper.addToolMaterial("BronzeHammer", 0, 500, 5.0F, 4.0F, 12);
	public static ItemArmor.ArmorMaterial CopperArmor = EnumHelper.addArmorMaterial("CopperArmor", "electrica:copperarmor", 16, new int[] {3, 8, 6, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	
	public static void createItems(){
		GameRegistry.registerItem(ingotTin = new BasicItem("ingotTin"), "ingotTin"); //Tin Ingot
		GameRegistry.registerItem(ingotCopper = new BasicItem("ingotCopper"), "ingotCopper"); // Copper Ingot
        GameRegistry.registerItem(ingotBronze = new BasicItem("ingotBronze"), "ingotBronze"); // Bronze Ingot
		GameRegistry.registerItem(hammerBronze = new HammerMod ("hammerBronze", BronzeHammer), "hammerBronze"); //Bronze Hammer Alpha 0.0.10b
		GameRegistry.registerItem(pickaxeCopper = new PickaxeMod("pickaxeCopper", CopperPickaxe), "pickaxeCopper"); //Copper Pickaxe
		GameRegistry.registerItem(axeCopper = new AxeMod("axeCopper", CopperAxe), "axeCopper");
		GameRegistry.registerItem(hoeCopper = new HoeMod("hoeCopper", CopperHoe), "hoeCopper");
		GameRegistry.registerItem(helmetCopper = new ItemModArmor("helmetCopper", CopperArmor, 1, EntityEquipmentSlot.HEAD), "helmetCopper");
	    GameRegistry.registerItem(chestplateCopper = new ItemModArmor("chestplateCopper", CopperArmor, 1, EntityEquipmentSlot.CHEST), "chestplateCopper");
        GameRegistry.registerItem(leggingsCopper = new ItemModArmor("leggingsCopper", CopperArmor, 2, EntityEquipmentSlot.LEGS), "leggingsCopper");
        GameRegistry.registerItem(bootsCopper = new ItemModArmor("bootsCopper", CopperArmor, 1, EntityEquipmentSlot.FEET), "bootsCopper");
    }
}
