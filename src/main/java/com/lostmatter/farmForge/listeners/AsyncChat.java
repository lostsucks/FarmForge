package com.lostmatter.farmForge.listeners;

import net.kyori.adventure.text.format.TextColor;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class AsyncChat implements Listener {

    public void onAsyncChat(AsyncPlayerChatEvent event) {

        event.setFormat(event.getPlayer().getName() + TextColor.color(0xD1D1D1) + ": " + TextColor.color(0xFFFFFF) + event.getMessage());

    }

}
