package me.AxiusDevelopment.TWoNCosmetics.Crates;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.AxiusDevelopment.TWoNCosmetics.Coins.Coins;

public class gui {
	public static Inventory CrateGUI = Bukkit.createInventory(null, 9*6, "CrateGUI");
	public static boolean GUIisShowing = false;

	public static void showCosmeticsGUI(Player p) {
		
		ItemStack CoinsCnt = new ItemStack(Material.DOUBLE_PLANT, 1);
		ItemMeta cMeta = CoinsCnt.getItemMeta();
		
		int coins = Coins.getCoins(p);
		
		cMeta.setDisplayName("§e§l" + coins + "Coins");
		List<String> lore = cMeta.getLore();
		
		lore.clear();
		lore.add("§7These seem to be rare.");
		lore.add("§7I should collect more!");
		
		CoinsCnt.setItemMeta(cMeta);
		
		p.openInventory(CrateGUI);
		CrateGUI.setItem(4, CoinsCnt);
		GUIisShowing = true;
	}

	
	public static void closeGUI(Player p) {
		// Must be open to work
		if (GUIisShowing) {
		p.closeInventory();
		GUIisShowing = false;
	    }
	}
}
