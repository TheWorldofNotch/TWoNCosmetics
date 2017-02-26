package com.wolfie.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.wolfie.cosmetics.gui.CosmeticsGUI;
import com.wolfie.cosmetics.main.Main;

public class cosmetics implements CommandExecutor {

	Main plugin;
	
	public cosmetics(Main passedPlugin) {
		this.plugin = passedPlugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	    CosmeticsGUI.showCosmeticsGUI((Player) sender);
	    return true;
	}
}

