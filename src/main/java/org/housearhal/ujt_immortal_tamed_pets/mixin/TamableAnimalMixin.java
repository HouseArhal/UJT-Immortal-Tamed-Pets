package org.housearhal.ujt_immortal_tamed_pets.mixin;

//? neoforge {
/*import dev.kikugie.fletching_table.annotation.MixinEnvironment;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.TamableAnimal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
@MixinEnvironment(type = MixinEnvironment.Env.MAIN)
abstract class TamableAnimalMixin {
    @Inject(at = @At("HEAD"), method = "isInvulnerable", cancellable = true)
    private void isInvulnerable(CallbackInfoReturnable<Boolean> cir) {
        if ((Object) this instanceof TamableAnimal pet && pet.isTame()) {
            cir.setReturnValue(true);
        }
    }

    @Inject(at = @At("HEAD"), method = "isInvulnerableTo", cancellable = true)
    private void isInvulnerableTo(CallbackInfoReturnable<Boolean> cir) {
        if ((Object) this instanceof TamableAnimal pet && pet.isTame()) {
            cir.setReturnValue(true);
        }
    }

}


*///?}


