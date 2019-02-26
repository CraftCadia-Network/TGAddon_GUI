package com.tabercore.addon.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.samtaber.base.Base;
import com.tabercore.addon.GUI.RankGUI;

public class RankGUIcmd implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		if(player.hasPermission("tabercore.gui.ranks")) {
			
			if(label.equalsIgnoreCase("ranktest")) {
				
				RankGUI.openGUI(player);
				player.sendMessage(Base.globalPrefix + "Opened $GUI_Rank-Addon");
			}
			
			
		}else {
			
			
			player.sendMessage(Base.globalPrefix + "You do not have permission to use $Rank_GUI");
		}
		return false;
	}

	
	
}
