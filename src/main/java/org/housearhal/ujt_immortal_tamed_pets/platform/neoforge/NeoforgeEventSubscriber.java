package org.housearhal.ujt_immortal_tamed_pets.platform.neoforge;

//? neoforge {

/*import net.minecraft.world.entity.TamableAnimal;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;

@EventBusSubscriber
public class NeoforgeEventSubscriber {

	@SubscribeEvent
	public static void livingDamage(LivingDamageEvent.Pre event) {
		if (event.getEntity() instanceof TamableAnimal && ((TamableAnimal) event.getEntity()).isTame()) {
			event.setNewDamage(0);
		}
	}
}
*///?}
