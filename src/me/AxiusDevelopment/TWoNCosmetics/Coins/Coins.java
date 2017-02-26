package me.AxiusDevelopment.TWoNCosmetics.Coins;

import org.bukkit.entity.Player;

import com.wolfie.cosmetics.main.Main;

public class Coins {
	
	static Main plugin;
	
	public static int getCoins(Player p) {
		int i = plugin.getConfig().getInt("coins." + p.getName());
		return i;
	}
	
	public static void setCoins(Player p, int i) {
		plugin.getConfig().set("coins." + p.getName(), i);
		Reload();
	}
	
	public static void addCoins(Player p, int i) {
		i = i + getCoins(p);
		plugin.getConfig().set("coins." + p.getName(), i);
		Reload();
	}
	
	public static void takeCoins(Player p, int i) {
		i = i - getCoins(p);
		plugin.getConfig().set("coins." + p.getName(), i);
		Reload();
	}
	
	public static void Reload() {
		plugin.saveConfig();
		plugin.reloadConfig();
	}

}
