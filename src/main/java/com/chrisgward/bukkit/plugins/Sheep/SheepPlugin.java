package com.chrisgward.bukkit.plugins.Sheep;

import org.bukkit.plugin.java.JavaPlugin;

public class SheepPlugin extends JavaPlugin {
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(new SheepListener(this), this);
    }
    public void onDisable()
    {

    }
}
