
package net.mcreator.atrox.block;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.atrox.procedures.PlayerplatePlayerStartsToDestroyProcedure;
import net.mcreator.atrox.procedures.PlayerplateEntityCollidesInTheBlockProcedure;

public class PlayerplateBlock extends PressurePlateBlock {
	public PlayerplateBlock() {
		super(Sensitivity.MOBS, BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.75f, 1f).requiresCorrectToolForDrops().noCollission().noOcclusion().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn(),
				BlockSetType.IRON);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public BlockPathTypes getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return BlockPathTypes.BLOCKED;
	}

	@Override
	public void attack(BlockState blockstate, Level world, BlockPos pos, Player entity) {
		super.attack(blockstate, world, pos, entity);
		PlayerplatePlayerStartsToDestroyProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		PlayerplateEntityCollidesInTheBlockProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
	}
}
