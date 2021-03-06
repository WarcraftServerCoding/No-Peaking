
package com.warcraftserver;

import java.util.logging.Logger;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class NoPeak extends JavaPlugin {
    Logger log = Logger.getLogger("Minecraft");
    private final NoPeakListener listener = new NoPeakListener();
    public static String ColorList;
    public static String color;
    public static String message;
    public static String enableOrDisable;
    

    public void OnDisable()
    {
        this.log.info("[No Peak] has been disabled!");
    }
    
    @Override
    public void onEnable()
    {
        PluginManager pm = getServer().getPluginManager();
        
        this.getConfig();
        this.getConfig().options().header("Access Message: No Peaking at our plugins!");
        message = this.getConfig().getString("Access Message", "No Peaking!");
        enableOrDisable = this.getConfig().getString("Send Output", "true");
        this.saveConfig();
        
        this.log.info("[No Peak] Has been enabled!");
        getServer().getPluginManager().registerEvents(listener, this);
    }
    
}
