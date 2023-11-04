package me.rdlo;

import me.rdlo.commands.setArmorRank;
import me.rdlo.events.playerJoin;
import me.rdlo.events.playerRespawn;
import org.bukkit.plugin.java.JavaPlugin;

public class armor extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new playerJoin(), this);
        getServer().getPluginManager().registerEvents(new playerRespawn(), this);

        getCommand("setarmorrank").setExecutor(new setArmorRank());


    }

}
