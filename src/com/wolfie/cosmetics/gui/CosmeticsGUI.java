package com.wolfie.cosmetics.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CosmeticsGUI {
	
	public static Inventory cosmeticsGUI = Bukkit.createInventory(null, 9*6, "Cosmetics Menu");
	public static boolean GUIisShowing = false;
	
	
	
	public static void showCosmeticsGUI(Player p) {
		p.openInventory(cosmeticsGUI);
		cosmeticsGUI.setItem(4, new ItemStack(Material.PRISMARINE_SHARD, 1));
		cosmeticsGUI.setItem(9, new ItemStack(Material.NETHER_STAR, 1));
		cosmeticsGUI.setItem(11, new ItemStack(Material.ARROW, 1));
		cosmeticsGUI.setItem(13, new ItemStack(Material.GOLD_BOOTS, 1));
		cosmeticsGUI.setItem(15, new ItemStack(Material.SKULL_ITEM, 1));
		cosmeticsGUI.setItem(17, new ItemStack(Material.MELON_BLOCK, 1));
		cosmeticsGUI.setItem(27, new ItemStack(Material.LEATHER, 1));
		cosmeticsGUI.setItem(29, new ItemStack(Material.IRON_BARDING, 1));
		cosmeticsGUI.setItem(31, new ItemStack(Material.BONE, 1));
		cosmeticsGUI.setItem(33, new ItemStack(Material.GOLD_HELMET, 1));
		cosmeticsGUI.setItem(35, new ItemStack(Material.DIAMOND_CHESTPLATE, 1));
		cosmeticsGUI.setItem(45, new ItemStack(Material.GREEN_RECORD, 1));
		cosmeticsGUI.setItem(47, new ItemStack(Material.NAME_TAG, 1));
		cosmeticsGUI.setItem(49, new ItemStack(Material.CAKE, 1));
		cosmeticsGUI.setItem(51, new ItemStack(Material.TORCH, 1));
		cosmeticsGUI.setItem(53, new ItemStack(Material.LEASH, 1));
		GUIisShowing = true;
	}

	
	public static void closeCosmeticsGUI(Player p) {
		// Must be open to work
		if (GUIisShowing) {
		p.closeInventory();
		GUIisShowing = false;
	    }
	}	
}
