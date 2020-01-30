package org.dawnoftimebuilder.blocks.general;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FireBlock;
import net.minecraft.block.material.Material;

import static org.dawnoftimebuilder.DawnOfTimeBuilder.MOD_ID;

public class DoTBBlock extends Block {

	public DoTBBlock(String name, Properties properties) {
		super(properties);
		this.setRegistryName(MOD_ID, name);
	}

	public DoTBBlock(String name, Material materialIn, float hardness, float resistance) {
		this(name, Block.Properties.create(materialIn).hardnessAndResistance(hardness, resistance));
	}

	public Block setBurnable() {
		FireBlock fireblock = (FireBlock) Blocks.FIRE;
		fireblock.setFireInfo(this, 5, 20);
		return this;
	}
}
