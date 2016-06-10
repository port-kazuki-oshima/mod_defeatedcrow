package defeatedcrow.flamethrower;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import defeatedcrow.flamethrower.common.CommonProxyF;
import defeatedcrow.flamethrower.item.ItemIgnis;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;



@Mod(modid = "DCsFlame", name = "Flamethrower", version = "1.7.10_1.0a")
public class FlameCore {
	
	@SidedProxy(clientSide = "defeatedcrow.flamethrower.client.ClientProxyF",
			serverSide = "defeatedcrow.flamethrower.common.CommonProxyF")
	public static CommonProxyF proxy;	

	@Instance("DCsFlame")
	public static FlameCore instance;
	
	public static Logger logger = LogManager.getLogger("Flamethrower");

	
	public static Item flamethrower;
	
	
	@EventHandler
	public void preInt(FMLPreInitializationEvent event){
		
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		try{
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			cfg.save();
		}
		
		this.flamethrower = new ItemIgnis().setCreativeTab(CreativeTabs.tabCombat).setUnlocalizedName("dcsflame.flamethrower");
		GameRegistry.registerItem(flamethrower,"dcsflame.flamethrower");
		
	}
	
	@EventHandler
	public void init(FMLPreInitializationEvent event)throws IOException{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}
