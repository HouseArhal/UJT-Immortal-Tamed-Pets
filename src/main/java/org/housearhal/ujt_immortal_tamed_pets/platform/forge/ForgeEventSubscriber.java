package org.housearhal.ujt_immortal_tamed_pets.platform.forge;

//? forge {

/*import net.minecraft.world.entity.TamableAnimal;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ForgeEventSubscriber {


	@SubscribeEvent
	public static void livingDamage(LivingDamageEvent event) {
		if (event.getEntity() instanceof TamableAnimal && ((TamableAnimal) event.getEntity()).isTame()) {
			event.setAmount(0);
			event.setCanceled(true);
		}
	}

	@SubscribeEvent
	public static void onLivingAttack(LivingAttackEvent event) {
		if (event.getEntity() instanceof TamableAnimal && ((TamableAnimal) event.getEntity()).isTame()) {
			event.setCanceled(true);
		}
	}


}
*///?}
