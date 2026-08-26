package net.morgan.mod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import net.morgan.mod.creativemodetab.ModCreativeModeTabs;
import net.morgan.mod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// This logger is used to write text to the console and the log file.
// It is considered best practice to use your mod id as the logger's name.
// That way, it's clear which mod wrote info, warnings, and errors.
public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorial-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



    // This code runs as soon as Minecraft is in a mod-load-ready state.
    // However, some things (like resources) may still be uninitialized.
	@Override
	public void onInitialize() {

        ModCreativeModeTabs.registerModCreativeTabs();


		ModItems.registerModItems();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
