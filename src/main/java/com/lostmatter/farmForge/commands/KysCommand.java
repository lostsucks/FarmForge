package com.lostmatter.farmForge.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class KysCommand extends Command {

    @Override
    public boolean execute(@NotNull CommandSender sender, @NotNull String commandLabel, @NotNull String[] args) {

        if (sender instanceof Player player) {
            player.setHealth(0);
            return true;
        }

        return false;
    }
}
