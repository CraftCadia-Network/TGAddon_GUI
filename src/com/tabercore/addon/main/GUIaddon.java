package com.tabercore.addon.main;

import org.bukkit.plugin.java.JavaPlugin;

public class GUIaddon extends JavaPlugin{

	public static GUIaddon instance;
	
	public void onEnable() {
		instance = this;
		
		
	}
	
	public void onDisable() {
		
		instance = null;
		
	}
	
}
