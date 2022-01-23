package dev.rollczi.skymob.island;

import dev.rollczi.skymob.config.Config;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class SuperiorSkyblock2Hook {

    public boolean tryInit(Plugin plugin, Config config) {
        PluginManager pluginManager = plugin.getServer().getPluginManager();

        try {
            Class.forName("com.bgsoftware.superiorskyblock.api.events.IslandCreateEvent");

            pluginManager.registerEvents(new IslandCreateListener(config), plugin);
            return true;
        } catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

}
