package net.qorple.dungeonsoplenty;

import net.fabricmc.api.ModInitializer;
import net.qorple.dungeonsoplenty.registry.ItemRegistry;
import net.qorple.dungeonsoplenty.registry.StatusEffectRegistry;

public class DungeonsOPlenty implements ModInitializer {

	public static String MOD_ID = "dungeonsoplenty";
	public static String MOD_NAME = "Dungeons O' Plenty";
	public static String MOD_DEBUG = "[Dungeons O' Plenty]: ";

	@Override
	public void onInitialize() {
		StatusEffectRegistry.initEffects();
		ItemRegistry.initItems();

		System.out.println(MOD_DEBUG + "Successfully loaded " + MOD_NAME + "!");
	}
}
// poop