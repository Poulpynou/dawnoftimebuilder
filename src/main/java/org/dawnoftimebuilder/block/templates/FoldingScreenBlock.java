package org.dawnoftimebuilder.block.templates;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

import javax.annotation.Nonnull;

public class FoldingScreenBlock extends ColumnConnectibleBlock{

    public static final BooleanProperty INVERTED = BlockStateProperties.INVERTED;

    public FoldingScreenBlock(Material materialIn, float hardness, float resistance) {
        super(materialIn, hardness, resistance);
        this.setDefaultState(this.getStateContainer().getBaseState().with(WATERLOGGED,false).with(INVERTED,false));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        super.fillStateContainer(builder);
        builder.add(INVERTED);
    }

    @Nonnull
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockPos pos = context.getPos();
        return super.getStateForPlacement(context).with(INVERTED, ((pos.getX() + pos.getZ()) % 2) == 0);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return VoxelShapes.fullCube();
    }

    public boolean isConnectible(IWorld worldIn, BlockPos pos, BlockState stateIn){
        BlockState state = worldIn.getBlockState(pos);
        if(state.getBlock() == this){
            return state.get(INVERTED) == stateIn.get(INVERTED);
        }
        return false;
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}
