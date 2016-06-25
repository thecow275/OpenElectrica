package com.thecow275.electrica.world;

import java.util.Random;

import com.thecow275.electrica.blocks.ModBlocks;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class thecow275WorldGen implements IWorldGenerator {
	//@formatter:off

	private WorldGenerator gen_copper_ore; 	// Generates Copper Ore (used in Overworld)
	private WorldGenerator gen_tin_ore;		// Generates Tin Ore (used in Overworld)
	private WorldGenerator gen_cobblestone;		// Generates Stone (used in combination with Tin)

	//@formatter:on

	public thecow275WorldGen() {

		this.gen_copper_ore = new WorldGenMinable(ModBlocks.oreCopper.getDefaultState(), 8);
		this.gen_cobblestone = new WorldGenMinable(Blocks.COBBLESTONE.getDefaultState(), 6, BlockMatcher.forBlock(ModBlocks.oreTin));
		this.gen_tin_ore = new WorldGenSingleMinable(ModBlocks.oreTin.getDefaultState());
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case 0: // Overworld
			this.runGenerator(this.gen_copper_ore, world, random, chunkX, chunkZ, 20, 0, 64);
			this.runGenerator(this.gen_tin_ore, world, random, chunkX, chunkZ, 20, 0, 64);
			break;
		case -1: // Nether

			break;
		case 1: // End
			this.runGenerator(this.gen_cobblestone, world, random, chunkX, chunkZ, 10, 0, 80);
			break;
		}
	}

	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}

}
