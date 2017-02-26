package com.wolfie.cosmetics.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import com.wolfie.cosmetics.gui.CosmeticsGUI;

public class onInventoryClick implements Listener {

	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {
	Player player = (Player) event.getWhoClicked();
	ItemStack clicked = event.getCurrentItem();
	Inventory inventory = event.getInventory();
	if (inventory.getName().equals(CosmeticsGUI.cosmeticsGUI.getName())) { 
	event.setCancelled(true);
	player.sendMessage("Clicked on " + clicked);
	}
	}
	
}
