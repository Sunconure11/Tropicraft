package net.tropicraft.item.scuba;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ItemScubaChestplateGear extends ItemScubaGear {

	private AirType airType;
	
	public ItemScubaChestplateGear(ArmorMaterial material, ScubaMaterial scubaMaterial, AirType airType, int renderIndex, int armorType) {
		super(material, scubaMaterial, renderIndex, armorType);
		this.airType = airType;
	}

	@Override
	public ArmorProperties getProperties(EntityLivingBase player,
			ItemStack armor, DamageSource source, double damage, int slot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack,
			DamageSource source, int damage, int slot) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		

	}

}
