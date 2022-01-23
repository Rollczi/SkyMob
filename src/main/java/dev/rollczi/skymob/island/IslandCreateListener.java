package dev.rollczi.skymob.island;

import com.bgsoftware.superiorskyblock.api.events.IslandCreateEvent;
import dev.rollczi.skymob.config.Config;
import dev.rollczi.skymob.config.ConfigMob;
import dev.rollczi.skymob.utils.ChatUtils;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class IslandCreateListener implements Listener {

    private final Config config;

    public IslandCreateListener(Config config) {
        this.config = config;
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onCreate(IslandCreateEvent event) {
        config.environments.forEach((environment, configForEnvironment) -> {
            Location teleportLocation = event.getIsland().getTeleportLocation(environment);

            if (teleportLocation == null) {
                return;
            }

            World world = teleportLocation.getWorld();

            if (world == null) {
                return;
            }

            for (ConfigMob mob : configForEnvironment.mobs) {
                Location spawnLocation = teleportLocation.clone().add(mob.x, mob.y, mob.z);
                Entity entity = world.spawnEntity(spawnLocation, mob.entityType);

                String message = mob.text.replace("{PLAYER}", event.getPlayer().getName()); // ;_;

                entity.setCustomName(ChatUtils.color(message));
                entity.setCustomNameVisible(true);
            }
        });

    }

}
