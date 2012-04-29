package com.warcraftserver;

import java.util.logging.Logger;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

class NoPeakListener implements Listener {
    
    Logger log = Logger.getLogger("Minecraft");
    public static NoPeak plugin;
    
    @EventHandler
    public void onPlayerCommandProcess(PlayerCommandPreprocessEvent event) {
        Player sender = event.getPlayer();
        String reply = event.getPlayer().getName();
        
        if (event.getMessage().equalsIgnoreCase("/peak")) {
            event.setCancelled(true);
            sender.sendMessage(ChatColor.GOLD + "No Peaking!");
        }
        if ((event.getMessage().equalsIgnoreCase("/peak version")) || (event.getMessage().equalsIgnoreCase("/peak ver"))) {
            event.setCancelled(true);
            sender.sendMessage(ChatColor.GOLD + "Your peaking at version 0.1!");
        }
        
        if ((event.getMessage().equalsIgnoreCase("/plugins")) || (event.getMessage().equalsIgnoreCase("/pl"))) {
            if (!sender.isOp() && (!sender.hasPermission("nopeak.peak.allow"))) {
                event.setCancelled(true);
                this.log.info("Player " + reply + " tried to look at the plugin list!");
                
                if ((NoPeak.enableOrDisable == "true") || (NoPeak.enableOrDisable == "'true'")) {
                    sender.sendMessage(ChatColor.RED + NoPeak.message);
                }
                
            }
        }
        
    }
}
