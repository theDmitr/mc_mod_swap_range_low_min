package dmitr.swprng.core.events;

import dmitr.swprng.SwprngMod;
import dmitr.swprng.core.init.KeybindsInit;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = SwprngMod.MODID, bus = Bus.FORGE, value = Dist.CLIENT)
public class InputEvents {
	
	@SubscribeEvent
	public static void onKeyPress(InputEvent.KeyInputEvent event) {
		Minecraft mc = Minecraft.getInstance();
		
		if (mc.level == null) return;
		
		onInput(mc, event.getKey(), event.getAction());
	}
	
	@SubscribeEvent
	public static void onMouseClick(InputEvent.MouseInputEvent event) {
		Minecraft mc = Minecraft.getInstance();
		
		if (mc.level == null) return;
		
		onInput(mc, event.getButton(), event.getAction());
	}
	
	private static void onInput(Minecraft mc, int key, int action) {
		
		if (mc.screen == null && KeybindsInit.swpKey.isDown()) {
			mc.options.renderDistance = mc.options.renderDistance != 2 ? 2 : 16;
		}
		
	}
	
}
