package dev.rollczi.skymob.config;

import net.dzikoysk.cdn.entity.Description;
import org.bukkit.World;

import java.io.File;
import java.util.Collections;
import java.util.Map;

public class Config extends AbstractConfigWithResource {

    public Config(File folder, String child) {
        super(folder, child);
    }

    @Description("# ")
    @Description("# SkyMob Configuration (config.yml)")
    @Description("# by Rollczi https://rollczi.dev/")
    @Description("# ")

    @Description("# environments (NORMAL, NETHER, THE_END, CUSTOM)")
    public Map<World.Environment, ConfigForEnvironment> environments = Collections.singletonMap(World.Environment.NORMAL, new ConfigForEnvironment());

}
