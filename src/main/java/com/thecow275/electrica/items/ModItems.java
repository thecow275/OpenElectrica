package com.thecow275.electrica.items;

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
	//public static ToolMaterial Copper = EnumHelper.addToolMaterial("Copper", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);
	public static ToolMaterial CopperSword = EnumHelper.addToolMaterial("CopperSword", 0, 500, 1.0F, 2.0F, 14);
	public static ToolMaterial CopperPickaxe = EnumHelper.addToolMaterial("CopperPickaxe", 2, 500, 6.0F, 2.0F, 14);
	public static ToolMaterial CopperShovel = EnumHelper.addToolMaterial("CopperShovel", 2, 500, 6.0F, 2.0F, 14);
	public static ToolMaterial CopperAxe = EnumHelper.addToolMaterial("CopperAxe", 2, 500, 6.0F, 2.0F, 14);
	public static ToolMaterial CopperHoe = EnumHelper.addToolMaterial("CopperHoe", 0, 500, 6.0F, 2.0F, 14);
	public static ItemArmor.ArmorMaterial CopperArmor = EnumHelper.addArmorMaterial("CopperArmor", "electrica:copperarmor", 16, new int[] {3, 8, 6, 3}, 30);
	
	public static void createItems(){
		GameRegistry.registerItem(ingotTin = new BasicItem("ingotTin"), "ingotTin");
		GameRegistry.registerItem(ingotCopper = new BasicItem("ingotCopper"), "ingotCopper");
        GameRegistry.registerItem(ingotBronze = new BasicItem("ingotBronze"), "ingotBronze");
		GameRegistry.registerItem(pickaxeCopper = new PickaxeMod("pickaxeCopper", CopperPickaxe), "pickaxeCopper");
		GameRegistry.registerItem(axeCopper = new AxeMod("axeCopper", CopperAxe), "axeCopper");
		GameRegistry.registerItem(helmetCopper = new ItemModArmor("helmetCopper", CopperArmor, 1, 0), "helmetCopper");
	    GameRegistry.registerItem(chestplateCopper = new ItemModArmor("chestplateCopper", CopperArmor, 1, 1), "chestplateCopper");
        GameRegistry.registerItem(leggingsCopper = new ItemModArmor("leggingsCopper", CopperArmor, 2, 2), "leggingsCopper");
        GameRegistry.registerItem(bootsCopper = new ItemModArmor("bootsCopper", CopperArmor, 1, 3), "bootsCopper");
    }
}
