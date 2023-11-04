package me.rdlo.commands;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.persistence.PersistentDataType;

public class setArmorRank implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender s, Command c, String l, String[] a) {

        Bukkit.getPlayer(a[0]).getPersistentDataContainer().set(new NamespacedKey("armor", "rank"), PersistentDataType.INTEGER, Integer.parseInt(a[1]));

        return true;
    }

}
