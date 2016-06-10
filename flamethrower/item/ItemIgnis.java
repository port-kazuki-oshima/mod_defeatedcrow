package defeatedcrow.flamethrower.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemBow;


public class ItemIgnis extends ItemBow{

//	public ItemIgnisClone(){
	public ItemIgnis(){
		
		this.setMaxStackSize(1);
		
		this.setMaxDamage(4);
		
		this.setNoRepair();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister){
		this.itemIcon = par1IconRegister.registerIcon("dcsflame:flamethrower");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean isFull3D(){
		return true;
	}
}
