package org.dawnoftimebuilder.block.templates;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;

public class RotatedPillarBlockDoTB extends RotatedPillarBlock {

	public RotatedPillarBlockDoTB(Properties properties) {
		super(properties);
	}

	public RotatedPillarBlockDoTB(Material materialIn, float hardness, float resistance) {
		this(Properties.create(materialIn).hardnessAndResistance(hardness, resistance));
	}

	/**
	 * Set Encouragement to 5 and Flammability to 20
	 * @return this
	 */
	public Block setBurnable() {
		return setBurnable(5, 20);
	}

	/**
	 * Set burning parameters (default 5 / 20)
	 * @param encouragement Increases the probability to catch fire
	 * @param flammability Decreases burning duration
	 * @return this
	 */
	public Block setBurnable(int encouragement, int flammability) {
		FireBlock fireblock = (FireBlock) Blocks.FIRE;
		fireblock.setFireInfo(this, encouragement, flammability);
		return this;
	}
}
