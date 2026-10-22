package org.housearhal.ujt_immortal_tamed_pets.platform.fabric;

//? fabric {

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import org.housearhal.ujt_immortal_tamed_pets.event.TamableAnimalEvent;

public class FabricEventSubscriber {

	public static void registerEvents() {

		ServerLivingEntityEvents.ALLOW_DAMAGE.register(
				TamableAnimalEvent::allowDamage
		);
	}
}
//?}
