
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atrox.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.atrox.entity.ThegreatangelEntity;
import net.mcreator.atrox.entity.SpookyroamerEntity;
import net.mcreator.atrox.entity.SpookyBoatEntity;
import net.mcreator.atrox.entity.BoossmallfireballprojectileEntity;
import net.mcreator.atrox.entity.BoosshieldEntity;
import net.mcreator.atrox.entity.BoosartemisEntity;
import net.mcreator.atrox.AtroxMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AtroxModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AtroxMod.MODID);
	public static final RegistryObject<EntityType<SpookyroamerEntity>> WEEPING_ANGEL = register("weeping_angel", EntityType.Builder.<SpookyroamerEntity>of(SpookyroamerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpookyroamerEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpookyBoatEntity>> SPOOKY_BOAT = register("spooky_boat",
			EntityType.Builder.<SpookyBoatEntity>of(SpookyBoatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpookyBoatEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThegreatangelEntity>> THEGREATANGEL = register("thegreatangel",
			EntityType.Builder.<ThegreatangelEntity>of(ThegreatangelEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ThegreatangelEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BoossmallfireballprojectileEntity>> BOOSSMALLFIREBALLPROJECTILE = register("boossmallfireballprojectile",
			EntityType.Builder.<BoossmallfireballprojectileEntity>of(BoossmallfireballprojectileEntity::new, MobCategory.MISC).setCustomClientFactory(BoossmallfireballprojectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BoosshieldEntity>> BOOSSHIELD = register("boosshield", EntityType.Builder.<BoosshieldEntity>of(BoosshieldEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(BoosshieldEntity::new).fireImmune().sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<BoosartemisEntity>> BOOSARTEMIS = register("boosartemis",
			EntityType.Builder.<BoosartemisEntity>of(BoosartemisEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BoosartemisEntity::new)

					.sized(0.05f, 0.05f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SpookyroamerEntity.init();
			SpookyBoatEntity.init();
			ThegreatangelEntity.init();
			BoosshieldEntity.init();
			BoosartemisEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WEEPING_ANGEL.get(), SpookyroamerEntity.createAttributes().build());
		event.put(SPOOKY_BOAT.get(), SpookyBoatEntity.createAttributes().build());
		event.put(THEGREATANGEL.get(), ThegreatangelEntity.createAttributes().build());
		event.put(BOOSSHIELD.get(), BoosshieldEntity.createAttributes().build());
		event.put(BOOSARTEMIS.get(), BoosartemisEntity.createAttributes().build());
	}
}
