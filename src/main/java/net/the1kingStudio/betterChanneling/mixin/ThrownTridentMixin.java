package net.the1kingStudio.betterChanneling.mixin;

import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.world.World;
import net.the1kingStudio.betterChanneling.BetterChannelingMod;
import net.the1kingStudio.betterChanneling.config.ModConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(TridentEntity.class)
public class ThrownTridentMixin
{
    @Redirect(method = "onEntityHit", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;isThundering()Z"))
    private boolean RedirectIsThundering(World level)
    {
        if (ModConfig.entityWeather == BetterChannelingMod.Weather.THUNDERSTORMS)
            return level.isThundering();
        else if(ModConfig.entityWeather == BetterChannelingMod.Weather.RAIN)
            return level.isRaining();
        else
            return true;
    }
}
