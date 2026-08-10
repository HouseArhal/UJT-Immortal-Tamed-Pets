package org.housearhal.ujt_immortal_tamed_pets.platform.fabric;

//? fabric {

import net.fabricmc.loader.api.FabricLoader;
import org.housearhal.ujt_immortal_tamed_pets.platform.Platform;

public class FabricPlatform implements Platform {

	@Override
	public boolean isModLoaded(String modId) {
		return FabricLoader.getInstance().isModLoaded(modId);
	}

	@Override
	public ModLoader loader() {
		return ModLoader.FABRIC;
	}

	@Override
	public String mcVersion() {
		return FabricLoader.getInstance().getRawGameVersion();
	}

	@Override
	public boolean isDevelopmentEnvironment() {
		return FabricLoader.getInstance().isDevelopmentEnvironment();
	}
}
//?}
