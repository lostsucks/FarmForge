package com.lostmatter.farmForge.listeners;

import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class AsyncChat implements Listener {

    @EventHandler
    public void onAsyncChat(AsyncChatEvent event) {
        event.setCancelled(true);

        Component message = Component.text(event.getPlayer().getName(), NamedTextColor.WHITE)
                        .append(Component.text(": ", NamedTextColor.GRAY))
                        .append(Component.text(PlainTextComponentSerializer.plainText().serialize(event.message()), NamedTextColor.WHITE));
        Bukkit.getServer().broadcast(message);
    }

}
