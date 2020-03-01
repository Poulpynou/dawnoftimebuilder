package org.dawnoftimebuilder.items.japanese;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.dawnoftimebuilder.client.renderer.model.ModelJapaneseLightArmor;
import org.dawnoftimebuilder.items.general.DoTBItemCustomArmor;

import static org.dawnoftimebuilder.enums.EArmorMaterial.JAPANESE_LIGHT_ARMOR;

public class ItemJapaneseLightArmor extends DoTBItemCustomArmor {

	public ItemJapaneseLightArmor(EntityEquipmentSlot equipmentSlotIn) {
		super("japanese_light_armor", JAPANESE_LIGHT_ARMOR.getArmorMaterial(), equipmentSlotIn);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped createModel(){
		return new ModelJapaneseLightArmor(0.0F, this.armorType);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped createSlimModel() {
		return new ModelJapaneseLightArmor(0.0F, this.armorType);
	}
}