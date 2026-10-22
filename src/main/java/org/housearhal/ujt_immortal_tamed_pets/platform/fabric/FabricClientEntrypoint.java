package org.housearhal.ujt_immortal_tamed_pets.platform.fabric;

//? fabric {

import org.housearhal.ujt_immortal_tamed_pets.UJTImmortalTamedPets;
import dev.kikugie.fletching_table.annotation.fabric.Entrypoint;
import net.fabricmc.api.ClientModInitializer;

@Entrypoint("client")
public class FabricClientEntrypoint implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		UJTImmortalTamedPets.onInitializeClient();
	}
}
//?}
