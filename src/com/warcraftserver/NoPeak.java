
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
    
    public void onEnable()
    {
        PluginManager pm = getServer().getPluginManager();
       
    }
    
}
