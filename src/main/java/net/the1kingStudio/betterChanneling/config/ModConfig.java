package net.the1kingStudio.betterChanneling.config;

import eu.midnightdust.lib.config.MidnightConfig;
import net.the1kingStudio.betterChanneling.BetterChannelingMod;

public class ModConfig extends MidnightConfig
{

    @Entry public static BetterChannelingMod.Weather entityWeather = BetterChannelingMod.Weather.RAIN;

    @Entry public static BetterChannelingMod.Weather rodWeather = BetterChannelingMod.Weather.RAIN;
}
