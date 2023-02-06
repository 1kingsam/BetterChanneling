package net.the1kingStudio.betterChanneling.mixin;

import net.minecraft.block.LightningRodBlock;
import net.minecraft.world.World;
import net.the1kingStudio.betterChanneling.BetterChannelingMod;
import net.the1kingStudio.betterChanneling.config.ModConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(LightningRodBlock.class)
public class LightningRodBlockMixin
{
    @Redirect(method = "onProjectileHit", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;isThundering()Z"))
    private boolean RedirectIsThundering(World level)
    {
        if (ModConfig.rodWeather == BetterChannelingMod.Weather.THUNDERSTORMS)
            return level.isThundering();
        else if(ModConfig.rodWeather == BetterChannelingMod.Weather.RAIN)
            return level.isRaining();
        else
            return true;
    }
}

