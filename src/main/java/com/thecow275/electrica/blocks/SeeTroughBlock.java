package com.thecow275.electrica.blocks;

import com.thecow275.electrica.ClientProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockProperties;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scala.reflect.internal.TreeInfo;
import scala.tools.nsc.transform.patmat.Logic;

import static net.minecraft.util.BlockRenderLayer.CUTOUT_MIPPED;


public class SeeTroughBlock extends Block {

    public SeeTroughBlock(String unlocalizedName, Material material, float hardness, float resistance){
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }
    public SeeTroughBlock(String unlocalizedName, float hardness, float resistance){
        this(unlocalizedName, Material.ROCK, hardness, resistance);
    }
    public SeeTroughBlock(String unlocalizedName){
        this(unlocalizedName, 2.0f, 10.0f);
    }


    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }
    public boolean isFullCube(IBlockState p_isFullCube_1_) {
        return true;
    }
    public boolean isOpaqueCube(IBlockState p_isOpaqueCube_1_) { return false;}
    public boolean shouldSideBeRendered(IBlockState p_shouldSideBeRendered_1_) {return false;}
    protected boolean canSilkHarvest() {
        return true;
    }

}
