package com.wolfie.cosmetics.main;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.wolfie.commands.cosmetics;
import com.wolfie.cosmetics.listeners.onInventoryClick;

public class Main extends JavaPlugin implements Listener {

	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new onInventoryClick(), this);
		this.getCommand("cosmetics").setExecutor(new cosmetics(this));
		Bukkit.getPluginManager().registerEvents(new CrateOpenEvent(), this);
		this.getCommand("CrateGUI").setExecutor(new CrateCommand(this));
	}
	
	public void onDisable() {
		
	}
	
}
