package dmitr.swprng;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("swprng")
@Mod.EventBusSubscriber(modid = SwprngMod.MODID, bus = Bus.MOD)
public class SwprngMod {
	
	public static final String MODID = "swprng";
	
    public SwprngMod() {
    	 IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	 
    	 MinecraftForge.EVENT_BUS.register(this);
    }
}
