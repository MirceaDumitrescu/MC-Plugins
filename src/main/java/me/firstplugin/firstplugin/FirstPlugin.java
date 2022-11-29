package me.firstplugin.firstplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        // listen for player login

        getServer().getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void PlayerJoin(PlayerJoinEvent event) {

        // send a message in chat

        event.getPlayer().sendMessage("Welcome to the server!");

    }

}
