# ☁️ SkyMob
Simple Extension for SuperiorSkyblock2 plugin [link](https://www.spigotmc.org/resources/⚡%EF%B8%8F-superiorskyblock2-⚡%EF%B8%8F-the-best-core-on-market-⚡%EF%B8%8F-1-18-support.87411/)  
After the island is created, a custom mob will spawn.

### For example:
![image](https://user-images.githubusercontent.com/49173834/150680087-571e11a1-6371-4083-8da9-9e49545f93e3.png)

### SkyMob Configuration
`config.yml`
```yml
# 
# SkyMob Configuration (config.yml)
# by Rollczi https://rollczi.dev/
# 
# environments (NORMAL, NETHER, THE_END, CUSTOM)
environments:
  NORMAL:
    # Mobs
    mobs:
      - :
        # All EntityType https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/entity/EntityType.html
        entityType: COW
        # Custom Tag Text
        text: &ahello {PLAYER}
        # Location correction
        x: 0.0
        y: 0.0
        z: 0.0
```

### Build Gradle
1. clone project
2. Start `shadowJar` task  
3. And see in project `build/libs/SkyMob v1.0.0-SNAPSHOT (MC 1.8-1.18).jar`
