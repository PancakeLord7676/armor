package me.rdlo.events;

import org.bukkit.NamespacedKey;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class playerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {

        if(!e.getPlayer().getPersistentDataContainer().has(new NamespacedKey("armor", "rank"))) {
            PersistentDataContainer c = e.getPlayer().getPersistentDataContainer();
            c.set(new NamespacedKey("armor", "rank"), PersistentDataType.INTEGER, 1);
        }

    }

}
