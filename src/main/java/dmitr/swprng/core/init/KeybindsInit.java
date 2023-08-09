package dmitr.swprng.core.init;

import java.awt.event.KeyEvent;

import dmitr.swprng.SwprngMod;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@OnlyIn(Dist.CLIENT)
public class KeybindsInit {
	
	public static KeyBinding swpKey;
	
	public static void register(final FMLClientSetupEvent event) {
		swpKey = create("swpKey", KeyEvent.VK_DEAD_TILDE);
		
		ClientRegistry.registerKeyBinding(swpKey);
	}
	
	private static KeyBinding create(String name, int key) {
		return new KeyBinding("key." + SwprngMod.MODID + "." + name, key, "key.category." + SwprngMod.MODID);
	}
	
}
