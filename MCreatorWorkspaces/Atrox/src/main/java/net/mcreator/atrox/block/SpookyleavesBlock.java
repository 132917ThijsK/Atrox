
package net.mcreator.atrox.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class SpookyleavesBlock extends LeavesBlock {
	public SpookyleavesBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.SLIME_BLOCK).strength(1f, 10f).friction(0.8f).noOcclusion());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}
}
