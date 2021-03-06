package org.dawnoftimebuilder.block.templates;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import org.dawnoftimebuilder.block.IBlockClimbingPlant;
import org.dawnoftimebuilder.utils.DoTBBlockStateProperties;

import java.util.Random;

public class LatticeBlock extends WaterloggedBlock implements IBlockClimbingPlant {

	public static final BooleanProperty NORTH = BlockStateProperties.NORTH;
	public static final BooleanProperty EAST = BlockStateProperties.EAST;
	public static final BooleanProperty SOUTH = BlockStateProperties.SOUTH;
	public static final BooleanProperty WEST = BlockStateProperties.WEST;
	public static final EnumProperty<DoTBBlockStateProperties.ClimbingPlant> CLIMBING_PLANT = DoTBBlockStateProperties.CLIMBING_PLANT;
	private static final IntegerProperty AGE = DoTBBlockStateProperties.AGE_0_6;
	private static final VoxelShape[] SHAPES = makeShapes();

	public LatticeBlock(Material materialIn, float hardness, float resistance) {
		super(materialIn, hardness, resistance);
		this.setDefaultState(this.getStateContainer().getBaseState().with(CLIMBING_PLANT, DoTBBlockStateProperties.ClimbingPlant.NONE).with(AGE, 0).with(WATERLOGGED, false).with(NORTH, false).with(EAST, false).with(SOUTH, false).with(WEST, false));
	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		super.fillStateContainer(builder);
		builder.add(NORTH, EAST, SOUTH, WEST, CLIMBING_PLANT, AGE);
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		int index = 0;
		if(state.get(SOUTH)) index += 1;
		if(state.get(WEST)) index += 2;
		if(state.get(NORTH)) index += 4;
		if(state.get(EAST)) index += 8;
		if(index > 14) index = 0;
		return SHAPES[index];
	}

	/**
	 * @return Stores VoxelShape with index following binary system : <p/>
	 * 8+4+2+1 with 1 = SOUTH, 2 = WEST, 4 = NORTH, 8 = EAST
	 * 0 : SWNE <p/>
	 * 1 : S <p/>
	 * 2 : W <p/>
	 * 3 : SW <p/>
	 * 4 : N <p/>
	 * 5 : SN <p/>
	 * 6 : WN <p/>
	 * 7 : SWN <p/>
	 * 8 : E <p/>
	 * 9 : SE <p/>
	 * 10 : WE <p/>
	 * 11 : SWE <p/>
	 * 12 : NE <p/>
	 * 13 : SNE <p/>
	 * 14 : WNE <p/>
	 */
	private static VoxelShape[] makeShapes() {
		VoxelShape vs_south = makeCuboidShape(0.0D, 0.0D, 14.0D, 16.0D, 16.0D, 16.0D);
		VoxelShape vs_west = makeCuboidShape(0.0D, 0.0D, 0.0D, 2.0D, 16.0D, 16.0D);
		VoxelShape vs_north = makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 2.0D);
		VoxelShape vs_east = makeCuboidShape(14.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
		VoxelShape vs_sw = VoxelShapes.or(vs_south, vs_west);
		VoxelShape vs_wn = VoxelShapes.or(vs_west, vs_north);
		VoxelShape vs_ne = VoxelShapes.or(vs_north, vs_east);
		VoxelShape vs_se = VoxelShapes.or(vs_east, vs_south);
		return new VoxelShape[]{
				VoxelShapes.or(vs_sw, vs_ne),
				vs_south,
				vs_west,
				vs_sw,
				vs_north,
				VoxelShapes.or(vs_south, vs_north),
				vs_wn,
				VoxelShapes.or(vs_sw, vs_north),
				vs_east,
				vs_se,
				VoxelShapes.or(vs_west, vs_se),
				VoxelShapes.or(vs_sw, vs_east),
				vs_ne,
				VoxelShapes.or(vs_south, vs_ne),
				VoxelShapes.or(vs_wn, vs_east),
		};
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		BlockState state = context.getWorld().getBlockState(context.getPos());
		if (state.getBlock() != this)
			state = super.getStateForPlacement(context);
		switch(context.getPlacementHorizontalFacing()){
			default:
			case SOUTH:
				return state.with(SOUTH, true);
			case WEST:
				return state.with(WEST, true);
			case NORTH:
				return state.with(NORTH, true);
			case EAST:
				return state.with(EAST, true);
		}
	}

	@Override
	public boolean isReplaceable(BlockState state, BlockItemUseContext useContext) {
		ItemStack itemstack = useContext.getItem();
		if(useContext.isPlacerSneaking()) return false;
		if (itemstack.getItem() == this.asItem()) {
			if (useContext.replacingClickedOnBlock()) {
				Direction newDirection = useContext.getPlacementHorizontalFacing();
				switch(newDirection){
					default:
					case SOUTH:
						return !state.get(SOUTH);
					case WEST:
						return !state.get(WEST);
					case NORTH:
						return !state.get(NORTH);
					case EAST:
						return !state.get(EAST);
				}
			}
		}
		return false;
	}

	@Override
	public boolean ticksRandomly(BlockState state) {
		return !state.get(CLIMBING_PLANT).hasNoPlant();
	}

	@Override
	public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
		this.tickPlant(state, worldIn, pos, random);
	}

	@Override
	public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		if (worldIn.getBlockState(pos.down()).isIn(BlockTags.DIRT_LIKE)){
			if (this.tryPlacingPlant(state, worldIn, pos, player, handIn)) return true;
		}
		return this.harvestPlant(state, worldIn, pos, player, handIn);
	}

	@Override
	public BlockRenderLayer getRenderLayer() {
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public boolean isLadder(BlockState state, IWorldReader world, BlockPos pos, LivingEntity entity) {
		return true;
	}
}
