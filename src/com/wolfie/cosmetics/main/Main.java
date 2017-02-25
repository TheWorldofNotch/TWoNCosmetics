package com.wolfie.cosmetics.main;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import com.wolfie.commands.cosmetics;

public class Main extends JavaPlugin implements Listener {

	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
		Bukkit.getPluginManager().registerEvents(new cosmetics(), new cosmetics());
	}
	
	public void onDisable() {
		
	}
	
}
