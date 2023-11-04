package me.rdlo.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;

public class craft implements Listener {

    @EventHandler
    public void onCraft(CraftItemEvent e) {
        ItemStack i = e.getCurrentItem();

        if(i.getType() == Material.LEATHER_BOOTS) {e.setCancelled(true);} if(i.getType() == Material.LEATHER_LEGGINGS) {e.setCancelled(true);} if(i.getType() == Material.LEATHER_CHESTPLATE) {e.setCancelled(true);} if(i.getType() == Material.LEATHER_LEGGINGS) {e.setCancelled(true);} if(i.getType() == Material.LEATHER_HELMET) {e.setCancelled(true);}
        if(i.getType() == Material.GOLDEN_BOOTS) {e.setCancelled(true);} if(i.getType() == Material.GOLDEN_LEGGINGS) {e.setCancelled(true);} if(i.getType() == Material.GOLDEN_CHESTPLATE) {e.setCancelled(true);} if(i.getType() == Material.GOLDEN_HELMET) {e.setCancelled(true);}
        if(i.getType() == Material.IRON_BOOTS) {e.setCancelled(true);} if(i.getType() == Material.IRON_LEGGINGS) {e.setCancelled(true);} if(i.getType() == Material.IRON_CHESTPLATE) {e.setCancelled(true);} if(i.getType() == Material.IRON_HELMET) {e.setCancelled(true);}
        if(i.getType() == Material.DIAMOND_BOOTS) {e.setCancelled(true);} if(i.getType() == Material.DIAMOND_LEGGINGS) {e.setCancelled(true);} if(i.getType() == Material.DIAMOND_CHESTPLATE) {e.setCancelled(true);} if(i.getType() == Material.DIAMOND_HELMET) {e.setCancelled(true);}
        if(i.getType() == Material.NETHERITE_BOOTS) {e.setCancelled(true);} if(i.getType() == Material.NETHERITE_LEGGINGS) {e.setCancelled(true);} if(i.getType() == Material.NETHERITE_CHESTPLATE) {e.setCancelled(true);} if(i.getType() == Material.NETHERITE_HELMET) {e.setCancelled(true);}

    }

}
