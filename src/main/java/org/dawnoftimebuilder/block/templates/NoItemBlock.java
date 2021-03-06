package org.dawnoftimebuilder.block.templates;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import org.dawnoftimebuilder.block.IBlockCustomItem;

import javax.annotation.Nullable;

public class NoItemBlock extends BlockDoTB implements IBlockCustomItem {

	public NoItemBlock(Properties properties) {
		super(properties);
	}

	public NoItemBlock(Material materialIn, float hardness, float resistance) {
		this(Properties.create(materialIn).hardnessAndResistance(hardness, resistance));
	}

	@Nullable
	@Override
	public Item getCustomItemBlock() {
		return null;
	}
}
