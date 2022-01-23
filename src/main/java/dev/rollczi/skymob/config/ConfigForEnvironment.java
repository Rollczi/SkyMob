package dev.rollczi.skymob.config;

import net.dzikoysk.cdn.entity.Contextual;
import net.dzikoysk.cdn.entity.Description;
import org.bukkit.World;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Contextual
public class ConfigForEnvironment {

    @Description("# Mobs")
    public List<ConfigMob> mobs = Collections.singletonList(new ConfigMob());

}
