package com.warcraftserver;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;


public class NoPeek extends JavaPlugin {
    Logger log = Logger.getLogger("Minecraft");
    private final NoPeekListener listener = new NoPeekListener();
    public static String ColorList;
    public static String color;
    public static String message;
    public static String enableOrDisable;
}

public void onDisable() {
this.log.info("NP (No Peek) has been disabled!")

}

@Override

public void onEnable() {
PluginManager pm = getServer().getPluginManager();
}