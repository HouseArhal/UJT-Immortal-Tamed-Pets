package org.housearhal.ujt_immortal_tamed_pets.event;


import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;


public abstract class TamableAnimalEvent {

	public static boolean allowDamage(LivingEntity entity, DamageSource source, float amount) {
		return !(entity instanceof TamableAnimal animal && animal.isTame());
	}


}


