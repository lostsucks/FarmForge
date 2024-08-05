package com.lostmatter.farmForge.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class CropRegrow implements Listener {

    @EventHandler
    public void onCropRegrow(BlockBreakEvent event) {
        Block block = event.getBlock();
        if (block.getType() == Material.WHEAT) {
            event.setCancelled(true);

            block.setType(Material.STONE);
            event.getPlayer().playSound(block.getLocation(), "entity.villager.happy", 1, 1);
        }
    }

}
