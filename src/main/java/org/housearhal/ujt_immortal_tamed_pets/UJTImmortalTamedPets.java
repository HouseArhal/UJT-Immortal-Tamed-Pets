package org.housearhal.ujt_immortal_tamed_pets;

import org.housearhal.ujt_immortal_tamed_pets.platform.Platform;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//? fabric {
import org.housearhal.ujt_immortal_tamed_pets.platform.fabric.FabricPlatform;
//?} neoforge {
/*import org.housearhal.ujt_immortal_tamed_pets.platform.neoforge.NeoforgePlatform;
 *///?} forge {
/*import org.housearhal.ujt_immortal_tamed_pets.platform.forge.ForgePlatform;
 *///?}

@SuppressWarnings("LoggingSimilarMessage")
public class UJTImmortalTamedPets {

	public static final String MOD_ID = /*$ mod_id*/ "ujt_immortal_tamed_pets";
	public static final String MOD_VERSION = /*$ mod_version*/ "1.0.1";
	public static final String MOD_FRIENDLY_NAME = /*$ mod_name*/ "UJT - Immortal Tamed Pets";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	private static final Platform PLATFORM = createPlatformInstance();

	public static void onInitialize() {
		LOGGER.info("Initializing {} on {}", MOD_ID, UJTImmortalTamedPets.xplat().loader());
		LOGGER.debug("{}: { version: {}; friendly_name: {} }", MOD_ID, MOD_VERSION, MOD_FRIENDLY_NAME);
	}

	public static void onInitializeClient() {
		LOGGER.info("Initializing {} Client on {}", MOD_ID, UJTImmortalTamedPets.xplat().loader());
		LOGGER.debug("{}: { version: {}; friendly_name: {} }", MOD_ID, MOD_VERSION, MOD_FRIENDLY_NAME);
	}

	static Platform xplat() {
		return PLATFORM;
	}

	private static Platform createPlatformInstance() {
		//? fabric {
		return new FabricPlatform();
		//?} neoforge {
		/*return new NeoforgePlatform();
		 *///?} forge {
		/*return new ForgePlatform();
		 *///?}
	}

	private static ResourceLocation id(String path) {
		//? > 1.19.2 {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
		 //?} <= 1.19.2 {
		/*return new ResourceLocation(MOD_ID, path);
		*///?}
	}

	private static ResourceLocation id(String namespace, String path) {
		//? > 1.19.2 {
		return ResourceLocation.fromNamespaceAndPath(namespace, path);
		 //?} <= 1.19.2 {
		/*return new ResourceLocation(namespace, path);
		*///?}
	}
}
