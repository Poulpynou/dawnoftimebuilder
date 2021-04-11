package org.dawnoftimebuilder.client.gui.creative;

import net.minecraft.item.Item;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.dawnoftimebuilder.registries.DoTBItemsRegistry;

import java.util.ArrayList;
import java.util.Arrays;

import static net.minecraft.block.Blocks.*;
import static org.dawnoftimebuilder.DawnOfTimeBuilder.MOD_ID;
import static org.dawnoftimebuilder.registries.DoTBBlocksRegistry.*;

@OnlyIn(Dist.CLIENT)
public enum CreativeInventoryCategories {

	GENERAL("general",
			Item.getItemFromBlock(RAMMED_DIRT),
			Item.getItemFromBlock(THATCH_WHEAT),
			Item.getItemFromBlock(THATCH_WHEAT_STAIRS),
			Item.getItemFromBlock(THATCH_WHEAT_PLATE),
			Item.getItemFromBlock(THATCH_WHEAT_SLAB),
			Item.getItemFromBlock(THATCH_WHEAT_EDGE),
			Item.getItemFromBlock(THATCH_BAMBOO),
			Item.getItemFromBlock(THATCH_BAMBOO_STAIRS),
			Item.getItemFromBlock(THATCH_BAMBOO_PLATE),
			Item.getItemFromBlock(THATCH_BAMBOO_SLAB),
			Item.getItemFromBlock(THATCH_BAMBOO_EDGE),
			Item.getItemFromBlock(ACACIA_PLANKS),
			Item.getItemFromBlock(ACACIA_STAIRS),
			Item.getItemFromBlock(ACACIA_PLANKS_PLATE),
			Item.getItemFromBlock(ACACIA_SLAB),
			Item.getItemFromBlock(ACACIA_PLANKS_EDGE),
			Item.getItemFromBlock(ACACIA_SUPPORT_SLAB),
			Item.getItemFromBlock(ACACIA_SUPPORT_BEAM),
			Item.getItemFromBlock(STRIPPED_ACACIA_LOG),
			Item.getItemFromBlock(ACACIA_BEAM),
			Item.getItemFromBlock(ACACIA_WALL),
			Item.getItemFromBlock(ACACIA_PERGOLA),
			Item.getItemFromBlock(ACACIA_FENCE),
			Item.getItemFromBlock(ACACIA_LATTICE),
			Item.getItemFromBlock(ACACIA_DOOR),
			Item.getItemFromBlock(ACACIA_TRAPDOOR),
			Item.getItemFromBlock(BIRCH_PLANKS),
			Item.getItemFromBlock(BIRCH_STAIRS),
			Item.getItemFromBlock(BIRCH_PLANKS_PLATE),
			Item.getItemFromBlock(BIRCH_SLAB),
			Item.getItemFromBlock(BIRCH_PLANKS_EDGE),
			Item.getItemFromBlock(BIRCH_SUPPORT_SLAB),
			Item.getItemFromBlock(BIRCH_SUPPORT_BEAM),
			Item.getItemFromBlock(STRIPPED_BIRCH_LOG),
			Item.getItemFromBlock(BIRCH_BEAM),
			Item.getItemFromBlock(BIRCH_WALL),
			Item.getItemFromBlock(BIRCH_PERGOLA),
			Item.getItemFromBlock(BIRCH_FENCE),
			Item.getItemFromBlock(BIRCH_LATTICE),
			Item.getItemFromBlock(BIRCH_DOOR),
			Item.getItemFromBlock(BIRCH_TRAPDOOR),
			Item.getItemFromBlock(DARK_OAK_PLANKS),
			Item.getItemFromBlock(DARK_OAK_STAIRS),
			Item.getItemFromBlock(DARK_OAK_PLANKS_PLATE),
			Item.getItemFromBlock(DARK_OAK_SLAB),
			Item.getItemFromBlock(DARK_OAK_PLANKS_EDGE),
			Item.getItemFromBlock(DARK_OAK_SUPPORT_SLAB),
			Item.getItemFromBlock(DARK_OAK_SUPPORT_BEAM),
			Item.getItemFromBlock(STRIPPED_DARK_OAK_LOG),
			Item.getItemFromBlock(DARK_OAK_BEAM),
			Item.getItemFromBlock(DARK_OAK_WALL),
			Item.getItemFromBlock(DARK_OAK_PERGOLA),
			Item.getItemFromBlock(DARK_OAK_FENCE),
			Item.getItemFromBlock(DARK_OAK_LATTICE),
			Item.getItemFromBlock(DARK_OAK_DOOR),
			Item.getItemFromBlock(DARK_OAK_TRAPDOOR),
			Item.getItemFromBlock(JUNGLE_PLANKS),
			Item.getItemFromBlock(JUNGLE_STAIRS),
			Item.getItemFromBlock(JUNGLE_PLANKS_PLATE),
			Item.getItemFromBlock(JUNGLE_SLAB),
			Item.getItemFromBlock(JUNGLE_PLANKS_EDGE),
			Item.getItemFromBlock(JUNGLE_SUPPORT_SLAB),
			Item.getItemFromBlock(JUNGLE_SUPPORT_BEAM),
			Item.getItemFromBlock(STRIPPED_JUNGLE_LOG),
			Item.getItemFromBlock(JUNGLE_BEAM),
			Item.getItemFromBlock(JUNGLE_WALL),
			Item.getItemFromBlock(JUNGLE_PERGOLA),
			Item.getItemFromBlock(JUNGLE_FENCE),
			Item.getItemFromBlock(JUNGLE_LATTICE),
			Item.getItemFromBlock(JUNGLE_DOOR),
			Item.getItemFromBlock(JUNGLE_TRAPDOOR),
			Item.getItemFromBlock(OAK_PLANKS),
			Item.getItemFromBlock(OAK_STAIRS),
			Item.getItemFromBlock(OAK_PLANKS_PLATE),
			Item.getItemFromBlock(OAK_SLAB),
			Item.getItemFromBlock(OAK_PLANKS_EDGE),
			Item.getItemFromBlock(OAK_SUPPORT_SLAB),
			Item.getItemFromBlock(OAK_SUPPORT_BEAM),
			Item.getItemFromBlock(STRIPPED_OAK_LOG),
			Item.getItemFromBlock(OAK_BEAM),
			Item.getItemFromBlock(OAK_WALL),
			Item.getItemFromBlock(OAK_PERGOLA),
			Item.getItemFromBlock(OAK_FENCE),
			Item.getItemFromBlock(OAK_LATTICE),
			Item.getItemFromBlock(OAK_DOOR),
			Item.getItemFromBlock(OAK_TRAPDOOR),
			Item.getItemFromBlock(SPRUCE_PLANKS),
			Item.getItemFromBlock(SPRUCE_STAIRS),
			Item.getItemFromBlock(SPRUCE_PLANKS_PLATE),
			Item.getItemFromBlock(SPRUCE_SLAB),
			Item.getItemFromBlock(SPRUCE_PLANKS_EDGE),
			Item.getItemFromBlock(SPRUCE_SUPPORT_SLAB),
			Item.getItemFromBlock(SPRUCE_SUPPORT_BEAM),
			Item.getItemFromBlock(STRIPPED_SPRUCE_LOG),
			Item.getItemFromBlock(SPRUCE_BEAM),
			Item.getItemFromBlock(SPRUCE_WALL),
			Item.getItemFromBlock(SPRUCE_PERGOLA),
			Item.getItemFromBlock(SPRUCE_FENCE),
			Item.getItemFromBlock(SPRUCE_LATTICE),
			Item.getItemFromBlock(SPRUCE_DOOR),
			Item.getItemFromBlock(SPRUCE_TRAPDOOR),
			Item.getItemFromBlock(FIREPLACE),
			Item.getItemFromBlock(IRON_CHAIN)
	),

	EGYPTIAN("egyptian",
			DoTBItemsRegistry.PHARAOH_ARMOR_HEAD,
			DoTBItemsRegistry.PHARAOH_ARMOR_CHEST,
			DoTBItemsRegistry.PHARAOH_ARMOR_LEGS,
			DoTBItemsRegistry.PHARAOH_ARMOR_FEET
	),

	FRENCH("french",
			Item.getItemFromBlock(THATCH_WHEAT),
			Item.getItemFromBlock(THATCH_WHEAT_STAIRS),
			Item.getItemFromBlock(THATCH_WHEAT_PLATE),
			Item.getItemFromBlock(THATCH_WHEAT_SLAB),
			Item.getItemFromBlock(THATCH_WHEAT_EDGE),
			Item.getItemFromBlock(RAMMED_DIRT),
			Item.getItemFromBlock(COBBLED_LIMESTONE),
			Item.getItemFromBlock(LIMESTONE_BRICKS),
			Item.getItemFromBlock(LIMESTONE_BRICKS_STAIRS),
			Item.getItemFromBlock(LIMESTONE_BRICKS_PLATE),
			Item.getItemFromBlock(LIMESTONE_BRICKS_SLAB),
			Item.getItemFromBlock(LIMESTONE_BRICKS_EDGE),
			Item.getItemFromBlock(LIMESTONE_BRICKS_WALL),
			Item.getItemFromBlock(FIREPLACE),
			Item.getItemFromBlock(LIMESTONE_FIREPLACE),
			Item.getItemFromBlock(LIMESTONE_CHIMNEY),
			DoTBItemsRegistry.GRAPE,
			DoTBItemsRegistry.GRAPE_SEEDS
	),

	GERMAN("german",
			Item.getItemFromBlock(THATCH_WHEAT),
			Item.getItemFromBlock(THATCH_WHEAT_STAIRS),
			Item.getItemFromBlock(THATCH_WHEAT_PLATE),
			Item.getItemFromBlock(THATCH_WHEAT_SLAB),
			Item.getItemFromBlock(THATCH_WHEAT_EDGE),
			Item.getItemFromBlock(RAMMED_DIRT),
			Item.getItemFromBlock(WAXED_OAK_FRAMED_RAMMED_DIRT),
			Item.getItemFromBlock(WAXED_OAK_TIMBER_FRAME),
			Item.getItemFromBlock(WAXED_OAK_TIMBER_FRAME_PILLAR),
			Item.getItemFromBlock(WAXED_OAK_TIMBER_FRAME_CORNER),
			Item.getItemFromBlock(WAXED_OAK_TIMBER_FRAME_CROSSED),
			Item.getItemFromBlock(WAXED_OAK_TIMBER_FRAME_SQUARED),
			Item.getItemFromBlock(WAXED_OAK_PLANKS),
			Item.getItemFromBlock(WAXED_OAK_PLANKS_STAIRS),
			Item.getItemFromBlock(WAXED_OAK_PLANKS_PLATE),
			Item.getItemFromBlock(WAXED_OAK_PLANKS_SLAB),
			Item.getItemFromBlock(WAXED_OAK_PLANKS_EDGE),
			Item.getItemFromBlock(WAXED_OAK_SUPPORT_SLAB),
			Item.getItemFromBlock(WAXED_OAK_SUPPORT_BEAM),
			Item.getItemFromBlock(WAXED_OAK_LOG_STRIPPED),
			Item.getItemFromBlock(WAXED_OAK_BEAM),
			Item.getItemFromBlock(WAXED_OAK_WALL),
			Item.getItemFromBlock(WAXED_OAK_PERGOLA),
			Item.getItemFromBlock(WAXED_OAK_FENCE),
			Item.getItemFromBlock(WAXED_OAK_LATTICE),
			Item.getItemFromBlock(WAXED_OAK_DOOR),
			Item.getItemFromBlock(WAXED_OAK_TRAPDOOR),
			Item.getItemFromBlock(WAXED_OAK_SMALL_SHUTTERS),
			Item.getItemFromBlock(WAXED_OAK_SHUTTERS),
			Item.getItemFromBlock(STONE_BRICKS),
			Item.getItemFromBlock(STONE_BRICK_STAIRS),
			Item.getItemFromBlock(STONE_BRICKS_PLATE),
			Item.getItemFromBlock(STONE_BRICK_SLAB),
			Item.getItemFromBlock(STONE_BRICKS_EDGE),
			Item.getItemFromBlock(STONE_BRICKS_ARROWSLIT),
			Item.getItemFromBlock(STONE_BRICKS_MACHICOLATION),
			//Item.getItemFromBlock(STONE_FRIEZE)
			Item.getItemFromBlock(LATTICE_GLASS),
			Item.getItemFromBlock(LATTICE_GLASS_PANE),
			Item.getItemFromBlock(LATTICE_WAXED_OAK_WINDOW),
			Item.getItemFromBlock(LATTICE_STONE_BRICKS_WINDOW),
			Item.getItemFromBlock(FIREPLACE),
			Item.getItemFromBlock(STONE_BRICKS_FIREPLACE),
			Item.getItemFromBlock(STONE_BRICKS_CHIMNEY),
			Item.getItemFromBlock(FLAT_ROOF_TILES),
			Item.getItemFromBlock(FLAT_ROOF_TILES_STAIRS),
			Item.getItemFromBlock(FLAT_ROOF_TILES_SLAB),
			Item.getItemFromBlock(FLAT_ROOF_TILES_EDGE),
			Item.getItemFromBlock(IRON_PORTCULLIS),
			Item.getItemFromBlock(IRON_CHAIN),
			DoTBItemsRegistry.IRON_PLATE_ARMOR_HEAD,
			DoTBItemsRegistry.IRON_PLATE_ARMOR_CHEST,
			DoTBItemsRegistry.IRON_PLATE_ARMOR_LEGS,
			DoTBItemsRegistry.IRON_PLATE_ARMOR_FEET,
			DoTBItemsRegistry.WAX
	),

	ISLAMIC("persian",
			Item.getItemFromBlock(PERSIAN_CARPET_RED)
	),

	JAPANESE("japanese",
			Item.getItemFromBlock(STEPPING_STONES),
			Item.getItemFromBlock(STEPPING_STONES_SLAB),
			Item.getItemFromBlock(THATCH_BAMBOO),
			Item.getItemFromBlock(THATCH_BAMBOO_STAIRS),
			Item.getItemFromBlock(THATCH_BAMBOO_PLATE),
			Item.getItemFromBlock(THATCH_BAMBOO_SLAB),
			Item.getItemFromBlock(THATCH_BAMBOO_EDGE),
			Item.getItemFromBlock(RAMMED_DIRT),
			Item.getItemFromBlock(CHARRED_SPRUCE_PLANKS),
			Item.getItemFromBlock(CHARRED_SPRUCE_PLANKS_STAIRS),
			Item.getItemFromBlock(CHARRED_SPRUCE_PLANKS_PLATE),
			Item.getItemFromBlock(CHARRED_SPRUCE_PLANKS_SLAB),
			Item.getItemFromBlock(CHARRED_SPRUCE_PLANKS_EDGE),
			Item.getItemFromBlock(CHARRED_SPRUCE_SUPPORT_SLAB),
			Item.getItemFromBlock(CHARRED_SPRUCE_SUPPORT_BEAM),
			Item.getItemFromBlock(CHARRED_SPRUCE_FOUNDATION),
			Item.getItemFromBlock(CHARRED_SPRUCE_FOUNDATION_SLAB),
			Item.getItemFromBlock(CHARRED_SPRUCE_BOARDS),
			Item.getItemFromBlock(CHARRED_SPRUCE_LOG_STRIPPED),
			Item.getItemFromBlock(CHARRED_SPRUCE_BEAM),
			Item.getItemFromBlock(CHARRED_SPRUCE_WALL),
			Item.getItemFromBlock(CHARRED_SPRUCE_PERGOLA),
			Item.getItemFromBlock(CHARRED_SPRUCE_FENCE),
			Item.getItemFromBlock(CHARRED_SPRUCE_RAILING),
			Item.getItemFromBlock(CHARRED_SPRUCE_LATTICE),
			Item.getItemFromBlock(CHARRED_SPRUCE_DOOR),
			Item.getItemFromBlock(CHARRED_SPRUCE_TRAPDOOR),
			Item.getItemFromBlock(CHARRED_SPRUCE_ROOF_SUPPORT),
			Item.getItemFromBlock(CHARRED_SPRUCE_TIMBER_FRAME),
			Item.getItemFromBlock(CHARRED_SPRUCE_TIMBER_FRAME_PILLAR),
			Item.getItemFromBlock(RICE),
			Item.getItemFromBlock(PAPER_WALL),
			Item.getItemFromBlock(PAPER_WALL_FLAT),
			Item.getItemFromBlock(PAPER_WALL_WINDOWS),
			Item.getItemFromBlock(PAPER_WALL_FLOWERY),
			//DoTBItemsRegistry.PAPER_DOOR,
			Item.getItemFromBlock(FIREPLACE),
			//Item.getItemFromBlock(IRORI),
			Item.getItemFromBlock(IRON_CHAIN),
			Item.getItemFromBlock(GREY_ROOF_TILES),
			Item.getItemFromBlock(GREY_ROOF_TILES_STAIRS),
			Item.getItemFromBlock(GREY_ROOF_TILES_PLATE),
			Item.getItemFromBlock(GREY_ROOF_TILES_SLAB),
			Item.getItemFromBlock(GREY_ROOF_TILES_EDGE),
			Item.getItemFromBlock(GREY_ROOF_TILES_WALL),
			DoTBItemsRegistry.GREY_TILE,
			DoTBItemsRegistry.GREY_CLAY_TILE,
			//Item.getItemFromBlock(RED_PAINTED_LOG),
			//DoTBItemsRegistry.LITTLE_FLAG,
			//Item.getItemFromBlock(PAPER_FOLDING_SCREEN),
			//Item.getItemFromBlock(PAPER_LANTERN),
			//Item.getItemFromBlock(PAPER_LAMP),
			//Item.getItemFromBlock(STONE_LANTERN),
			Item.getItemFromBlock(SMALL_TATAMI_MAT),
			Item.getItemFromBlock(TATAMI_MAT),
			//DoTBItemsRegistry.FUTON,
			Item.getItemFromBlock(SPRUCE_LOW_TABLE),
			//Item.getItemFromBlock(SPRUCE_LEGLESS_CHAIR),
			Item.getItemFromBlock(IKEBANA_FLOWER_POT),
			Item.getItemFromBlock(SAKE_BOTTLE),
			Item.getItemFromBlock(SAKE_CUP),
			Item.getItemFromBlock(CAST_IRON_TEAPOT_GREY),
			Item.getItemFromBlock(CAST_IRON_TEACUP_GREY),
			Item.getItemFromBlock(CAST_IRON_TEAPOT_GREEN),
			Item.getItemFromBlock(CAST_IRON_TEACUP_GREEN),
			Item.getItemFromBlock(CAST_IRON_TEAPOT_DECORATED),
			Item.getItemFromBlock(CAST_IRON_TEACUP_DECORATED),
			//Item.getItemFromBlock(BAMBOO_DRYING_TRAY),
			Item.getItemFromBlock(CAMELLIA),
			//DoTBItemsRegistry.CAMELLIA_LEAVES,
			DoTBItemsRegistry.TEA_LEAVES,
			Item.getItemFromBlock(MULBERRY),
			DoTBItemsRegistry.MULBERRY_LEAVES,
			DoTBItemsRegistry.SILK_WORM_EGGS,
			//DoTBItemsRegistry.SILK_WORM_HATCHERY,
			DoTBItemsRegistry.SILK_WORMS,
			DoTBItemsRegistry.SILK_COCOONS,
			DoTBItemsRegistry.SILK,
			//DoTBItemsRegistry.STICK_BUNDLE,
			Item.getItemFromBlock(RICE),
			DoTBItemsRegistry.TACHI_SWORD,
			DoTBItemsRegistry.BAMBOO_HAT,
			DoTBItemsRegistry.JAPANESE_LIGHT_ARMOR_HEAD,
			DoTBItemsRegistry.JAPANESE_LIGHT_ARMOR_CHEST,
			DoTBItemsRegistry.JAPANESE_LIGHT_ARMOR_LEGS,
			DoTBItemsRegistry.JAPANESE_LIGHT_ARMOR_FEET,
			DoTBItemsRegistry.O_YOROI_ARMOR_HEAD,
			DoTBItemsRegistry.O_YOROI_ARMOR_CHEST,
			DoTBItemsRegistry.O_YOROI_ARMOR_LEGS,
			DoTBItemsRegistry.O_YOROI_ARMOR_FEET,
			DoTBItemsRegistry.RAIJIN_ARMOR_HEAD,
			DoTBItemsRegistry.RAIJIN_ARMOR_CHEST,
			DoTBItemsRegistry.RAIJIN_ARMOR_LEGS,
			DoTBItemsRegistry.RAIJIN_ARMOR_FEET
	),

	PRE_COLOMBIAN("pre-columbian",
			Item.getItemFromBlock(THATCH_WHEAT),
			Item.getItemFromBlock(THATCH_WHEAT_STAIRS),
			Item.getItemFromBlock(THATCH_WHEAT_PLATE),
			Item.getItemFromBlock(THATCH_WHEAT_SLAB),
			Item.getItemFromBlock(THATCH_WHEAT_EDGE),
			Item.getItemFromBlock(RAMMED_DIRT),
			Item.getItemFromBlock(PLASTERED_STONE),
			Item.getItemFromBlock(PLASTERED_STONE_STAIRS),
			Item.getItemFromBlock(PLASTERED_STONE_PLATE),
			Item.getItemFromBlock(PLASTERED_STONE_SLAB),
			Item.getItemFromBlock(PLASTERED_STONE_EDGE),
			Item.getItemFromBlock(RED_PLASTERED_STONE),
			Item.getItemFromBlock(RED_PLASTERED_STONE_STAIRS),
			Item.getItemFromBlock(RED_PLASTERED_STONE_PLATE),
			Item.getItemFromBlock(RED_PLASTERED_STONE_SLAB),
			Item.getItemFromBlock(RED_PLASTERED_STONE_EDGE),
			Item.getItemFromBlock(RED_ORNAMENTED_PLASTERED_STONE),
			Item.getItemFromBlock(CHISELED_PLASTERED_STONE),
			Item.getItemFromBlock(PLASTERED_STONE_FRIEZE),
			Item.getItemFromBlock(ORNAMENTED_CHISELED_PLASTERED_STONE),
			Item.getItemFromBlock(RED_CHISELED_PLASTERED_STONE),
			Item.getItemFromBlock(RED_ORNAMENTED_CHISELED_PLASTERED_STONE),
			Item.getItemFromBlock(RED_PLASTERED_STONE_FRIEZE),
			Item.getItemFromBlock(RED_ORNAMENTED_PLASTERED_STONE_FRIEZE),
			Item.getItemFromBlock(RED_SCULPTED_PLASTERED_STONE_FRIEZE),
			Item.getItemFromBlock(RED_SMALL_PLASTERED_STONE_FRIEZE),
			Item.getItemFromBlock(GREEN_CHISELED_PLASTERED_STONE),
			Item.getItemFromBlock(GREEN_ORNAMENTED_CHISELED_PLASTERED_STONE),
			Item.getItemFromBlock(GREEN_PLASTERED_STONE_FRIEZE),
			Item.getItemFromBlock(GREEN_ORNAMENTED_PLASTERED_STONE_FRIEZE),
			Item.getItemFromBlock(GREEN_SCULPTED_PLASTERED_STONE_FRIEZE),
			Item.getItemFromBlock(GREEN_SMALL_PLASTERED_STONE_FRIEZE),
			Item.getItemFromBlock(PLASTERED_STONE_COLUMN),
			Item.getItemFromBlock(PLASTERED_STONE_WINDOW),
			Item.getItemFromBlock(PLASTERED_STONE_CRESSET),
			Item.getItemFromBlock(FEATHERED_SERPENT_SCULPTURE),
			Item.getItemFromBlock(SERPENT_SCULPTED_COLUMN),
			Item.getItemFromBlock(COMMELINA),
			Item.getItemFromBlock(MAIZE)
	),

	ROMAN("roman",
			Item.getItemFromBlock(OCHRE_ROOF_TILES),
			Item.getItemFromBlock(OCHRE_ROOF_TILES_SLAB),
			Item.getItemFromBlock(OCHRE_ROOF_TILES_EDGE),
			Item.getItemFromBlock(OCHRE_ROOF_TILES_STAIRS),
			Item.getItemFromBlock(OCHRE_ROOF_TILES_PLATE),
			Item.getItemFromBlock(OCHRE_ROOF_TILES_WALL),
			Item.getItemFromBlock(SANDSTONE_COLUMN),
			DoTBItemsRegistry.GRAPE,
			DoTBItemsRegistry.GRAPE_SEEDS
	);

	private final String name;
	private final String translation;
	private final ArrayList<Item> items = new ArrayList<>();

	CreativeInventoryCategories(String name, Item... items) {
		this.name = name;
		this.translation = new TranslationTextComponent("gui." + MOD_ID + "." + name).getString();
		this.items.addAll(Arrays.asList(items));
	}

	public String getName() {
		return this.name;
	}

	public String getTranslation() {
		return this.translation;
	}

	public ArrayList<Item> getItems(){
		return this.items;
	}
}