package net.the1kingStudio.betterChanneling.mixin;

import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LightningRodBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(LightningRodBlock.class)
public class LightningRodBlockMixin
{
    @Redirect(method = "onProjectileHit", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;isThundering()Z"))
    private boolean RedirectIsThundering(Level level)
    {
        return level.isRaining();
    }
}

