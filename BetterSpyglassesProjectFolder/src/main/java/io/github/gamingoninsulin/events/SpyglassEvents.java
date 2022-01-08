package io.github.gamingoninsulin.events;

import io.github.gamingoninsulin.recipes.SpyglassesRecipes;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class SpyglassEvents implements Listener {

    // Coal spyglass
    @EventHandler
    public void SpyglassCoalSpawn(PlayerInteractEvent playerEvent) {
        // create player
        Player player = playerEvent.getPlayer();
        // create block target
        Block block = player.getTargetBlock(null, 64);

        // checks if the player has a spyglass
        if (playerEvent.hasItem()) {
            // checks if it is the same a modified item
            if (playerEvent.getItem().equals(SpyglassesRecipes.CoalSpyglass)) {
                // checks if the player uses right click block/air with special spyglass
                if (playerEvent.getAction().equals(Action.RIGHT_CLICK_AIR) || playerEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK )) {
                    // change block  #single click only#
                    block.setType(Material.COAL_BLOCK);
                }
            }
        }
    }

    // Lapis spyglass
    @EventHandler
    public void SpyglassLapisSpawn(PlayerInteractEvent playerEvent) {
        // create player
        Player player = playerEvent.getPlayer();
        // create block target
        Block block = player.getTargetBlock(null, 64);

        // checks if the player has a spyglass
        if (playerEvent.hasItem()) {
            // checks if it is the same a modified item
            if (playerEvent.getItem().equals(SpyglassesRecipes.LapisSpyglass)) {
                // checks if the player uses right click block/air with special spyglass
                if (playerEvent.getAction().equals(Action.RIGHT_CLICK_AIR) || playerEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK )) {
                    // change block  #single click only#
                    block.setType(Material.LAPIS_BLOCK);
                }
            }
        }
    }

    // Copper spyglass
    @EventHandler
    public void SpyglassCopperSpawn(PlayerInteractEvent playerEvent) {
        // create player
        Player player = playerEvent.getPlayer();
        // create block target
        Block block = player.getTargetBlock(null, 64);

        // checks if the player has a spyglass
        if (playerEvent.hasItem()) {
            // checks if it is the same a modified item
            if (playerEvent.getItem().equals(SpyglassesRecipes.CopperSpyglass)) {
                // checks if the player uses right click block/air with special spyglass
                if (playerEvent.getAction().equals(Action.RIGHT_CLICK_AIR) || playerEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK )) {
                    // change block  #single click only#
                    block.setType(Material.COPPER_BLOCK);
                }
            }
        }
    }

    // Iron spyglass
    @EventHandler
    public void SpyglassIronSpawn(PlayerInteractEvent playerEvent) {
        // create player
        Player player = playerEvent.getPlayer();
        // create block target
        Block block = player.getTargetBlock(null, 64);

        // checks if the player has a spyglass
        if (playerEvent.hasItem()) {
            // checks if it is the same a modified item
            if (playerEvent.getItem().equals(SpyglassesRecipes.IronSpyglass)) {
                // checks if the player uses right click block/air with special spyglass
                if (playerEvent.getAction().equals(Action.RIGHT_CLICK_AIR) || playerEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK )) {
                    // change block  #single click only#
                    block.setType(Material.IRON_BLOCK);
                }
            }
        }
    }

    // Quartz spyglass
    @EventHandler
    public void SpyglassQuartzSpawn(PlayerInteractEvent playerEvent) {
        // create player
        Player player = playerEvent.getPlayer();
        // create block target
        Block block = player.getTargetBlock(null, 64);

        // checks if the player has a spyglass
        if (playerEvent.hasItem()) {
            // checks if it is the same a modified item
            if (playerEvent.getItem().equals(SpyglassesRecipes.QuartzSpyglass)) {
                // checks if the player uses right click block/air with special spyglass
                if (playerEvent.getAction().equals(Action.RIGHT_CLICK_AIR) || playerEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK )) {
                    // change block  #single click only#
                    block.setType(Material.QUARTZ_BLOCK);
                }
            }
        }
    }

    // Gold spyglass
    @EventHandler
    public void SpyglassGoldSpawn(PlayerInteractEvent playerEvent) {
        // create player
        Player player = playerEvent.getPlayer();
        // create block target
        Block block = player.getTargetBlock(null, 64);

        // checks if the player has a spyglass
        if (playerEvent.hasItem()) {
            // checks if it is the same a modified item
            if (playerEvent.getItem().equals(SpyglassesRecipes.GoldSpyglass)) {
                // checks if the player uses right click block/air with special spyglass
                if (playerEvent.getAction().equals(Action.RIGHT_CLICK_AIR) || playerEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK )) {
                    // change block  #single click only#s
                    block.setType(Material.GOLD_BLOCK);
                }
            }
        }
    }

    // Diamond spyglass
    @EventHandler
    public void SpyglassDiamondSpawn(PlayerInteractEvent playerEvent) {
        // create player
        Player player = playerEvent.getPlayer();
        // create block target
        Block block = player.getTargetBlock(null, 64);

        // checks if the player has a spyglass
        if (playerEvent.hasItem()) {
            // checks if it is the same a modified item
            if (playerEvent.getItem().equals(SpyglassesRecipes.DiamondSpyglass)) {
                // checks if the player uses right click block/air with special spyglass
                if (playerEvent.getAction().equals(Action.RIGHT_CLICK_AIR) || playerEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK )) {
                    // change block  #single click only#
                    block.setType(Material.DIAMOND_BLOCK);
                }
            }
        }
    }

    // Netherite spyglass
    @EventHandler
    public void SpyglassNetheriteSpawn(PlayerInteractEvent playerEvent) {
        // create player
        Player player = playerEvent.getPlayer();
        // create block target
        Block block = player.getTargetBlock(null, 64);

        // checks if the player has a spyglass
        if (playerEvent.hasItem()) {
            // checks if it is the same a modified item
            if (playerEvent.getItem().equals(SpyglassesRecipes.NetheriteSpyglass)) {
                // checks if the player uses right click block/air with special spyglass
                if (playerEvent.getAction().equals(Action.RIGHT_CLICK_AIR) || playerEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK )) {
                    // change block  #single click only#
                    block.setType(Material.NETHERITE_BLOCK);
                }
            }
        }
    }

    // Emerald spyglass
    @EventHandler
    public void SpyglassEmeraldSpawn(PlayerInteractEvent playerEvent) {
        // create player
        Player player = playerEvent.getPlayer();
        // create block target
        Block block = player.getTargetBlock(null, 64);

        // checks if the player has a spyglass
        if (playerEvent.hasItem()) {
            // checks if it is the same a modified item
            if (playerEvent.getItem().equals(SpyglassesRecipes.EmeraldSpyglass)) {
                // checks if the player uses right click block/air with special spyglass
                if (playerEvent.getAction().equals(Action.RIGHT_CLICK_AIR) || playerEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK )) {
                    // change block  #single click only#
                    block.setType(Material.EMERALD_BLOCK);
                }
            }
        }
    }

    // Amethyst spyglass
    @EventHandler
    public void SpyglassAmethystSpawn(PlayerInteractEvent playerEvent) {
        // create player
        Player player = playerEvent.getPlayer();
        // create block target
        Block block = player.getTargetBlock(null, 64);

        // checks if the player has a spyglass
        if (playerEvent.hasItem()) {
            // checks if it is the same a modified item
            if (playerEvent.getItem().equals(SpyglassesRecipes.AmethystSpyglass)) {
                // checks if the player uses right click block/air with special spyglass
                if (playerEvent.getAction().equals(Action.RIGHT_CLICK_AIR) || playerEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK )) {
                    // change block  #single click only#
                    block.setType(Material.AMETHYST_BLOCK);
                }
            }
        }
    }

    // ## end of file ##
}