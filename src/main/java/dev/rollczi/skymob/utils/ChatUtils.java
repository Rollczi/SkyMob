package dev.rollczi.skymob.utils;

import net.md_5.bungee.api.ChatColor;

public final class ChatUtils {

    private ChatUtils() {}

    public static String color(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

}
