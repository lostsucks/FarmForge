package com.lostmatter.farmForge;

import com.lostmatter.farmForge.listeners.CropRegrow;
import org.bukkit.plugin.java.JavaPlugin;

public final class FarmForge extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("github test");

        getServer().getPluginManager().registerEvents(new CropRegrow(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
