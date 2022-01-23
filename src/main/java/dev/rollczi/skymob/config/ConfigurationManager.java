package dev.rollczi.skymob.config;

import net.dzikoysk.cdn.Cdn;
import net.dzikoysk.cdn.CdnException;
import net.dzikoysk.cdn.CdnFactory;
import panda.std.Blank;
import panda.std.Result;

import java.io.File;

public class ConfigurationManager {

    private final Cdn cdn = CdnFactory.createYamlLike();
    private final Config config;

    public ConfigurationManager(File dataFolder) {
        this.config = new Config(dataFolder, "config.yml");
    }

    public void loadConfigs() {
        this.load(this.config);
    }

    public <T extends ConfigWithResource> T load(T config) {
        cdn.load(config.getResource(), config).orElseThrow(RuntimeException::new);
        cdn.render(config, config.getResource()).orElseThrow(RuntimeException::new);

        return config;
    }

    public <T extends ConfigWithResource> void save(T config) {
        cdn.render(config, config.getResource());
    }

    public Config getConfig() {
        return config;
    }

}
