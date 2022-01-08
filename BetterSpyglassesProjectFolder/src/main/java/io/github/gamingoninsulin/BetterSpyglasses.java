package io.github.gamingoninsulin;

import io.github.gamingoninsulin.events.SpyglassEvents;
import io.github.gamingoninsulin.recipes.CraftingRescipesRandom;
import io.github.gamingoninsulin.recipes.SpyglassesRecipes;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class BetterSpyglasses extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new SpyglassEvents(), this);
        SpyglassesRecipes.init();
        CraftingRescipesRandom.init();

        // Plugin ENABLE Message
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "#######################################");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "#    Made By Gaming On Insulin        #");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "# BetterSpyglasses: has been ENABLED! #");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "#######################################");
    }

    @Override
    public void onDisable() {

        // Plugin DISABLED Message
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "#########################################");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "#       Made By Gaming On Insulin       #");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "#  BetterSpyglasses: has been DISABLED! #");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "#########################################");
    }
}
