package org.housearhal.ujt_immortal_tamed_pets.platform.forge;

//? forge {

import org.housearhal.ujt_immortal_tamed_pets.UJTImmortalTamedPets;
import net.minecraftforge.fml.common.Mod;

@Mod(UJTImmortalTamedPets.MOD_ID)
public class ForgeEntrypoint {

	public ForgeEntrypoint() {
		UJTImmortalTamedPets.onInitialize();
	}
}
//?}
