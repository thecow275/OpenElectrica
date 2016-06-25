package com.thecow275.electrica.render.items;

import com.thecow275.electrica.Main;
import com.thecow275.electrica.items.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {
	
	public static void registerItemRenderer(){
		reg(ModItems.ingotTin);
		reg(ModItems.ingotCopper);
        reg(ModItems.ingotBronze);
		reg(ModItems.pickaxeCopper);
		reg(ModItems.axeCopper);
		reg(ModItems.helmetCopper);
		reg(ModItems.chestplateCopper);
        reg(ModItems.bootsCopper);
        reg(ModItems.leggingsCopper);
	}
	public static String modid = Main.MODID;
	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
