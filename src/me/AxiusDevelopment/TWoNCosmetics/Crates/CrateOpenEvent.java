package me.AxiusDevelopment.TWoNCosmetics.Crates;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class CrateOpenEvent implements Listener {

	public void onOpen(PlayerInteractEvent e) {
		Chest ch = (Chest) e.getClickedBlock();
		
		Location loc = ch.getLocation();
		
		loc.setY(loc.getY()-1);
		
		if(loc.getBlock().getType() == Material.GLOWSTONE) {
			
		}
		else
		{
			return;
		}
	}
	
}
