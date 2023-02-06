package net.the1kingStudio.betterChanneling;

import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;
import net.the1kingStudio.betterChanneling.config.ModConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterChannelingMod implements ModInitializer
{
	public static final Logger LOGGER = LoggerFactory.getLogger("better_channeling");

	public enum Weather
	{
		THUNDERSTORMS, RAIN, ANYTIME;
	}

	@Override
	public void onInitialize()
	{
		MidnightConfig.init("better_channeling", ModConfig.class);
	}
}