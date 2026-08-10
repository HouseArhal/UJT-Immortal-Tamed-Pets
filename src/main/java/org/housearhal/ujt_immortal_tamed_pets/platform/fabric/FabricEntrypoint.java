package org.housearhal.ujt_immortal_tamed_pets.platform.fabric;

//? fabric {

import org.housearhal.ujt_immortal_tamed_pets.UJTImmortalTamedPets;
import dev.kikugie.fletching_table.annotation.fabric.Entrypoint;
import net.fabricmc.api.ModInitializer;

@Entrypoint("main")
public class FabricEntrypoint implements ModInitializer {

	@Override
	public void onInitialize() {
		UJTImmortalTamedPets.onInitialize();
		FabricEventSubscriber.registerEvents();
	}
}
//?}
