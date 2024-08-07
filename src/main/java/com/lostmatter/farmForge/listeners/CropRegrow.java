package com.lostmatter.farmForge.listeners;

import org.bukkit.Particle;
import org.bukkit.block.Block;
import org.bukkit.block.data.Ageable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class CropRegrow implements Listener {

    @EventHandler
    public void onCropRegrow(BlockBreakEvent event) {
        Block block = event.getBlock();
        Ageable ageable = (Ageable) block.getBlockData();

        if (ageable.getAge() == ageable.getMaximumAge()) {
            event.setCancelled(true);
            block.setType(block.getType());
            ageable.setAge(ageable.getMaximumAge());

            int locX = block.getLocation().getBlockX();
            int locY = block.getLocation().getBlockY();
            int locZ = block.getLocation().getBlockZ();

            event.getPlayer().spawnParticle(Particle.HAPPY_VILLAGER, locX + 0.5, locY, locZ + 0.5, 5, 0.2, 0.2, 0.2, 0.03);
            event.getPlayer().playSound(block.getLocation(), "block.note_block.pling", 1, 1);
        } else if (ageable.getAge() < ageable.getMaximumAge()) {
            event.setCancelled(true);
        }
    }

}
