package com.wolfie.cosmetics.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CosmeticsGUI {
	
	public static Inventory cosmeticsGUI = Bukkit.createInventory(null, 9*7, "Cosmetics Menu");
	public static boolean GUIisShowing = false;
	
	
	
	public static void showCosmeticsGUI(Player p) {
		p.openInventory(cosmeticsGUI);
		cosmeticsGUI.setItem(5, new ItemStack(Material.PRISMARINE_SHARD, 1));
		cosmeticsGUI.setItem(10, new ItemStack(Material.NETHER_STAR, 1));
		cosmeticsGUI.setItem(12, new ItemStack(Material.ARROW, 1));
		cosmeticsGUI.setItem(14, new ItemStack(Material.GOLD_BOOTS, 1));
		cosmeticsGUI.setItem(16, new ItemStack(Material.SKULL_ITEM, 1));
		cosmeticsGUI.setItem(18, new ItemStack(Material.MELON_BLOCK, 1));
		cosmeticsGUI.setItem(28, new ItemStack(Material.LEATHER, 1));
		cosmeticsGUI.setItem(30, new ItemStack(Material.IRON_BARDING, 1));
		cosmeticsGUI.setItem(32, new ItemStack(Material.BONE, 1));
		cosmeticsGUI.setItem(34, new ItemStack(Material.GOLD_HELMET, 1));
		cosmeticsGUI.setItem(36, new ItemStack(Material.DIAMOND_CHESTPLATE, 1));
		cosmeticsGUI.setItem(46, new ItemStack(Material.GREEN_RECORD, 1));
		cosmeticsGUI.setItem(48, new ItemStack(Material.NAME_TAG, 1));
		cosmeticsGUI.setItem(50, new ItemStack(Material.CAKE, 1));
		cosmeticsGUI.setItem(52, new ItemStack(Material.TORCH, 1));
		cosmeticsGUI.setItem(54, new ItemStack(Material.LEASH, 1));
		
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
