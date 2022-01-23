package dev.rollczi.skymob;

import dev.rollczi.skymob.config.Config;
import dev.rollczi.skymob.config.ConfigurationManager;
import dev.rollczi.skymob.island.SuperiorSkyblock2Hook;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class SkyMob extends JavaPlugin {

    @Override
    public void onEnable() {
        ConfigurationManager configurationManager = new ConfigurationManager(this.getDataFolder());
        configurationManager.loadConfigs();

        Config config = configurationManager.getConfig();
        PluginManager pluginManager = this.getServer().getPluginManager();
        Logger logger = this.getLogger();
        SuperiorSkyblock2Hook skyblock2Hook = new SuperiorSkyblock2Hook();

        if (!skyblock2Hook.tryInit(this, config)) {
            logger.severe("Do you have the current version of SuperiorSkyblock2 and SkyMob? see https://github.com/Rollczi/SkyMob");
            logger.severe("If so, ask the developer to update SkyMob. https://github.com/Rollczi/SkyMob/issues");

            pluginManager.disablePlugin(this);
        }
    }

}
