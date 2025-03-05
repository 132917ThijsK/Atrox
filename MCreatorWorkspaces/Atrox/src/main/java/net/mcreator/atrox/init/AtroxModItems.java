
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atrox.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.atrox.item.StonestickItem;
import net.mcreator.atrox.item.SpookydimensionItem;
import net.mcreator.atrox.item.SpookstoneDustItem;
import net.mcreator.atrox.item.SlinkstonetoolsSwordItem;
import net.mcreator.atrox.item.SlinkstonetoolsShovelItem;
import net.mcreator.atrox.item.SlinkstonetoolsPickaxeItem;
import net.mcreator.atrox.item.SlinkstonetoolsHoeItem;
import net.mcreator.atrox.item.SlinkstonetoolsAxeItem;
import net.mcreator.atrox.item.SlinkstonearmorArmorItem;
import net.mcreator.atrox.item.SlinkstoneItem;
import net.mcreator.atrox.item.CreativeTabIconItem;
import net.mcreator.atrox.item.BoossmallfireballItem;
import net.mcreator.atrox.item.BoatspawnerItem;
import net.mcreator.atrox.item.AngelicSwordItem;
import net.mcreator.atrox.item.AngelicStoneItem;
import net.mcreator.atrox.item.AcidItem;
import net.mcreator.atrox.block.display.GreatAltarPhase2DisplayItem;
import net.mcreator.atrox.block.display.GreatAltarDisplayItem;
import net.mcreator.atrox.AtroxMod;

public class AtroxModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AtroxMod.MODID);
	public static final RegistryObject<Item> SPOOKYDIMENSION = REGISTRY.register("spookydimension", () -> new SpookydimensionItem());
	public static final RegistryObject<Item> SPOOKYRACK = block(AtroxModBlocks.SPOOKYRACK);
	public static final RegistryObject<Item> SPOOKYLEAVES = block(AtroxModBlocks.SPOOKYLEAVES);
	public static final RegistryObject<Item> SPOOKYWOOD_WOOD = block(AtroxModBlocks.SPOOKYWOOD_WOOD);
	public static final RegistryObject<Item> SPOOKYWOOD_LOG = block(AtroxModBlocks.SPOOKYWOOD_LOG);
	public static final RegistryObject<Item> SPOOKYWOOD_PLANKS = block(AtroxModBlocks.SPOOKYWOOD_PLANKS);
	public static final RegistryObject<Item> SPOOKYWOOD_STAIRS = block(AtroxModBlocks.SPOOKYWOOD_STAIRS);
	public static final RegistryObject<Item> SPOOKYWOOD_SLAB = block(AtroxModBlocks.SPOOKYWOOD_SLAB);
	public static final RegistryObject<Item> SPOOKYWOOD_FENCE = block(AtroxModBlocks.SPOOKYWOOD_FENCE);
	public static final RegistryObject<Item> SPOOKYWOOD_FENCE_GATE = block(AtroxModBlocks.SPOOKYWOOD_FENCE_GATE);
	public static final RegistryObject<Item> SPOOKYWOOD_PRESSURE_PLATE = block(AtroxModBlocks.SPOOKYWOOD_PRESSURE_PLATE);
	public static final RegistryObject<Item> SPOOKYWOOD_BUTTON = block(AtroxModBlocks.SPOOKYWOOD_BUTTON);
	public static final RegistryObject<Item> ACID_BUCKET = REGISTRY.register("acid_bucket", () -> new AcidItem());
	public static final RegistryObject<Item> WEEPING_ANGEL_SPAWN_EGG = REGISTRY.register("weeping_angel_spawn_egg", () -> new ForgeSpawnEggItem(AtroxModEntities.WEEPING_ANGEL, -10066330, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> WIZARDRYTABLE = block(AtroxModBlocks.WIZARDRYTABLE);
	public static final RegistryObject<Item> SPOOKY_BOAT_SPAWN_EGG = REGISTRY.register("spooky_boat_spawn_egg", () -> new ForgeSpawnEggItem(AtroxModEntities.SPOOKY_BOAT, -14605279, -14600681, new Item.Properties()));
	public static final RegistryObject<Item> BOATSPAWNER = REGISTRY.register("boatspawner", () -> new BoatspawnerItem());
	public static final RegistryObject<Item> SPOOKYFRAME = block(AtroxModBlocks.SPOOKYFRAME);
	public static final RegistryObject<Item> SLINKSTONE = REGISTRY.register("slinkstone", () -> new SlinkstoneItem());
	public static final RegistryObject<Item> SLINKSTONE_ORE = block(AtroxModBlocks.SLINKSTONE_ORE);
	public static final RegistryObject<Item> SLINKSTONE_BLOCK = block(AtroxModBlocks.SLINKSTONE_BLOCK);
	public static final RegistryObject<Item> SLINKSTONETOOLS_PICKAXE = REGISTRY.register("slinkstonetools_pickaxe", () -> new SlinkstonetoolsPickaxeItem());
	public static final RegistryObject<Item> SLINKSTONETOOLS_AXE = REGISTRY.register("slinkstonetools_axe", () -> new SlinkstonetoolsAxeItem());
	public static final RegistryObject<Item> SLINKSTONETOOLS_SWORD = REGISTRY.register("slinkstonetools_sword", () -> new SlinkstonetoolsSwordItem());
	public static final RegistryObject<Item> SLINKSTONETOOLS_SHOVEL = REGISTRY.register("slinkstonetools_shovel", () -> new SlinkstonetoolsShovelItem());
	public static final RegistryObject<Item> SLINKSTONETOOLS_HOE = REGISTRY.register("slinkstonetools_hoe", () -> new SlinkstonetoolsHoeItem());
	public static final RegistryObject<Item> STONESTICK = REGISTRY.register("stonestick", () -> new StonestickItem());
	public static final RegistryObject<Item> SLINKSTONEARMOR_ARMOR_HELMET = REGISTRY.register("slinkstonearmor_armor_helmet", () -> new SlinkstonearmorArmorItem.Helmet());
	public static final RegistryObject<Item> SLINKSTONEARMOR_ARMOR_CHESTPLATE = REGISTRY.register("slinkstonearmor_armor_chestplate", () -> new SlinkstonearmorArmorItem.Chestplate());
	public static final RegistryObject<Item> SLINKSTONEARMOR_ARMOR_LEGGINGS = REGISTRY.register("slinkstonearmor_armor_leggings", () -> new SlinkstonearmorArmorItem.Leggings());
	public static final RegistryObject<Item> SLINKSTONEARMOR_ARMOR_BOOTS = REGISTRY.register("slinkstonearmor_armor_boots", () -> new SlinkstonearmorArmorItem.Boots());
	public static final RegistryObject<Item> SPOOKSTONE = block(AtroxModBlocks.SPOOKSTONE);
	public static final RegistryObject<Item> SPOOKSTONE_STAIRS = block(AtroxModBlocks.SPOOKSTONE_STAIRS);
	public static final RegistryObject<Item> SPOOKSTONE_SLAB = block(AtroxModBlocks.SPOOKSTONE_SLAB);
	public static final RegistryObject<Item> SPOOKSTONE_DUST = REGISTRY.register("spookstone_dust", () -> new SpookstoneDustItem());
	public static final RegistryObject<Item> TRAPPEDSTONEPRESSUREPLATE = block(AtroxModBlocks.TRAPPEDSTONEPRESSUREPLATE);
	public static final RegistryObject<Item> THEGREATANGEL_SPAWN_EGG = REGISTRY.register("thegreatangel_spawn_egg", () -> new ForgeSpawnEggItem(AtroxModEntities.THEGREATANGEL, -13382656, -3424064, new Item.Properties()));
	public static final RegistryObject<Item> BOOS_SMALL_FIREBALL = REGISTRY.register("boos_small_fireball", () -> new BoossmallfireballItem());
	public static final RegistryObject<Item> BOOSSHIELD_SPAWN_EGG = REGISTRY.register("boosshield_spawn_egg", () -> new ForgeSpawnEggItem(AtroxModEntities.BOOSSHIELD, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> GREAT_ALTAR = REGISTRY.register(AtroxModBlocks.GREAT_ALTAR.getId().getPath(), () -> new GreatAltarDisplayItem(AtroxModBlocks.GREAT_ALTAR.get(), new Item.Properties()));
	public static final RegistryObject<Item> GREAT_ALTAR_PHASE_2 = REGISTRY.register(AtroxModBlocks.GREAT_ALTAR_PHASE_2.getId().getPath(), () -> new GreatAltarPhase2DisplayItem(AtroxModBlocks.GREAT_ALTAR_PHASE_2.get(), new Item.Properties()));
	public static final RegistryObject<Item> CREATIVE_TAB_ICON = REGISTRY.register("creative_tab_icon", () -> new CreativeTabIconItem());
	public static final RegistryObject<Item> CRACKED_ANGEL_SPAWN_EGG = REGISTRY.register("cracked_angel_spawn_egg", () -> new ForgeSpawnEggItem(AtroxModEntities.CRACKED_ANGEL, -13421773, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> ANGELIC_SWORD = REGISTRY.register("angelic_sword", () -> new AngelicSwordItem());
	public static final RegistryObject<Item> ANGELIC_STONE = REGISTRY.register("angelic_stone", () -> new AngelicStoneItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
