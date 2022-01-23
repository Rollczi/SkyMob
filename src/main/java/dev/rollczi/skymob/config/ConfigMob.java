package dev.rollczi.skymob.config;

import net.dzikoysk.cdn.entity.Contextual;
import net.dzikoysk.cdn.entity.Description;
import org.bukkit.entity.EntityType;

@Contextual
public class ConfigMob {

    @Description("# All EntityType https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/entity/EntityType.html")
    public EntityType entityType = EntityType.COW;
    @Description("# Custom Tag Text")
    public String text = "&aHello {PLAYER}";
    @Description("# Location correction")
    public double x = 0.0;
    public double y = 0.0;
    public double z = 0.0;

}
