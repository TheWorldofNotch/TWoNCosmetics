package com.wolfie.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.wolfie.cosmetics.gui.CosmeticsGUI;

public class cosmetics extends JavaPlugin implements Listener {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("cosmetics")) { 
			CosmeticsGUI.showCosmeticsGUI((Player) sender);
	    return true;
		}
		return false; 
	}
	
}
