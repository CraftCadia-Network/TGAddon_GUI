package com.tabercore.addon.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class RankGUI {

	public static Inventory RankMainGUI = Bukkit.createInventory(null, 27, ChatColor.RED + "$GUI_Rank-Addon");
	
	public RankGUI() {
		
		
		
	}
	
	public static boolean openGUI(Player player) {
		
		ItemStack filler = new ItemStack(Material.STAINED_GLASS_PANE, 1);
		RankMainGUI.setItem(0, filler);
		RankMainGUI.setItem(1, filler);
		RankMainGUI.setItem(2, filler);
		RankMainGUI.setItem(3, filler);
		RankMainGUI.setItem(4, filler);
		RankMainGUI.setItem(5, filler);
		RankMainGUI.setItem(6, filler);
		RankMainGUI.setItem(7, filler);
		RankMainGUI.setItem(8, filler);
		
		RankMainGUI.setItem(9, filler);
		RankMainGUI.setItem(10, filler);
		RankMainGUI.setItem(11, filler);
		RankMainGUI.setItem(12, new ItemStack(Material.GOLD_BLOCK, 1));
		RankMainGUI.setItem(13, new ItemStack(Material.REDSTONE_BLOCK, 1));
		RankMainGUI.setItem(14, new ItemStack(Material.EMERALD_BLOCK, 1));
		RankMainGUI.setItem(15, filler);
		RankMainGUI.setItem(16, filler);
		RankMainGUI.setItem(17, filler);
		
		RankMainGUI.setItem(18, filler);
		RankMainGUI.setItem(19, filler);
		RankMainGUI.setItem(20, filler);
		RankMainGUI.setItem(21, filler);
		RankMainGUI.setItem(22, filler);
		RankMainGUI.setItem(23, filler);
		RankMainGUI.setItem(24, filler);
		RankMainGUI.setItem(25, filler);
RankMainGUI.setItem(26, filler); 
		
		
		
		player.openInventory(RankMainGUI);
		return true;
		
	}
	
	
}
