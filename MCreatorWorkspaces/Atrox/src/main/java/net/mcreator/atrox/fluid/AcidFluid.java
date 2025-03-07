
package net.mcreator.atrox.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.atrox.init.AtroxModParticleTypes;
import net.mcreator.atrox.init.AtroxModItems;
import net.mcreator.atrox.init.AtroxModFluids;
import net.mcreator.atrox.init.AtroxModFluidTypes;
import net.mcreator.atrox.init.AtroxModBlocks;

public abstract class AcidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> AtroxModFluidTypes.ACID_TYPE.get(), () -> AtroxModFluids.ACID.get(), () -> AtroxModFluids.FLOWING_ACID.get()).explosionResistance(100f)
			.tickRate(7).bucket(() -> AtroxModItems.ACID_BUCKET.get()).block(() -> (LiquidBlock) AtroxModBlocks.ACID.get());

	private AcidFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return (SimpleParticleType) (AtroxModParticleTypes.PORTALPARTICE.get());
	}

	public static class Source extends AcidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AcidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
