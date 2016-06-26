package com.thecow275.electrica.crafting;
import com.thecow275.electrica.blocks.ModBlocks;
import com.thecow275.electrica.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public final class ModCrafting {
	public static void initCrafting(){
		//shapeless recipe for making  Copper Block out of four Copper Ingots
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockTin),
			"###",
			"###",
			"###",
			'#', ModItems.ingotTin);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockBronze),
                "###",
                "###",
                "###",
                '#', ModItems.ingotBronze);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotCopper,9), new ItemStack(ModBlocks.blockCopper));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotBronze,9), new ItemStack(ModBlocks.blockBronze));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotTin,9), new ItemStack(ModBlocks.blockTin));
	// shaped recipe for making Copper Ore out of 3 iron ingots
        GameRegistry.addRecipe(new ItemStack(ModBlocks.oreCopper),
			"#  ",
			" # ",
			"  #",
			'#', Items.IRON_INGOT);
        GameRegistry.addRecipe(new ItemStack(ModItems.pickaxeCopper),
			"aaa",
			" b ",
			" b ",
			'a', ModItems.ingotCopper, 'b', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ModItems.axeCopper),
			"aa ",
			"ab ",
			" b ",
			'a', ModItems.ingotCopper, 'b', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockCopper),
			"ddd",
			"ddd",
			"ddd",
			'd', ModItems.ingotCopper);
        GameRegistry.addRecipe(new ItemStack(ModItems.ingotBronze,4),
                "dd",
                "ad",

                'd', ModItems.ingotCopper, 'a', ModItems.ingotTin);
        GameRegistry.addRecipe(new ItemStack(ModItems.helmetCopper),
                "ddd",
                "d d",
                "   ",
                'd', ModItems.ingotCopper);
        GameRegistry.addRecipe(new ItemStack(ModItems.chestplateCopper),
                "d d",
                "ddd",
                "ddd",
                'd', ModItems.ingotCopper);
		GameRegistry.addRecipe(new ItemStack(ModItems.leggingsCopper),
				"ddd",
				"d d",
				"d d",
				'd', ModItems.ingotCopper);
		GameRegistry.addRecipe(new ItemStack(ModItems.bootsCopper),
				"   ",
				"d d",
				"d d",
				'd', ModItems.ingotCopper);
		GameRegistry.addRecipe(new ItemStack(Items.SADDLE),
				"aaa",
		        "ada",
		        "isi",
		        'd', Blocks.DIAMOND_BLOCK, 'a', Items.LEATHER, 'i', Items.IRON_INGOT, 's', Items.EMERALD);
	    GameRegistry.addRecipe(new ItemStack(ModBlocks.BronzeEnrichedSand),
                "aba",
                "bab",
                "aba",
                'a', Blocks.SAND, 'b', ModItems.ingotBronze);
	// smelting recipe for making copper ingots out of copper ore
	GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 1.0f);
	GameRegistry.addSmelting(ModBlocks.oreTin, new ItemStack(ModItems.ingotTin), 1.0f);
    GameRegistry.addSmelting(ModBlocks.BronzeEnrichedSand, new ItemStack(ModBlocks.reinforcedGlassBronze), 2.0f);
	}
	}
