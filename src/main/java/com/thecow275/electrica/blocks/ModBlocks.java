package com.thecow275.electrica.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

	public static Block oreCopper;
	public static Block oreTin;
	public static Block blockCopper;
    public static Block blockTin;
    public static Block blockBronze;
    public static Block reinforcedGlassBronze;
	public static Block BronzeEnrichedSand;
	
	public static void createBlocks(){
	GameRegistry.registerBlock(oreCopper = new BasicBlock("oreCopper").setLightLevel(0.0f), "oreCopper");
	GameRegistry.registerBlock(oreTin = new BasicBlock("oreTin").setLightLevel(0.0f), "oreTin");
	GameRegistry.registerBlock(blockCopper = new BasicBlock("blockCopper").setLightLevel(0.0f), "blockCopper");
        GameRegistry.registerBlock(blockTin = new BasicBlock("blockTin"), "blockTin");
	GameRegistry.registerBlock(blockBronze = new BasicBlock("blockBronze"), "blockBronze");
		GameRegistry.registerBlock(BronzeEnrichedSand = new BasicBlock("BronzeEnrichedSand"), "BronzeEnrichedSand");
		GameRegistry.registerBlock(reinforcedGlassBronze = new SeeTroughBlock("reinforcedGlassBronze"), "reinforcedGlassBronze");
    }
}
