package me.rdlo.events;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class playerRespawn implements Listener {

    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent e) {

        PersistentDataContainer c = e.getPlayer().getPersistentDataContainer();

        if(c.get(new NamespacedKey("armor", "rank"), PersistentDataType.INTEGER) != 0) {
            c.set(new NamespacedKey("armor", "rank"), PersistentDataType.INTEGER, c.get(new NamespacedKey("armor", "rank"), PersistentDataType.INTEGER) - 1);
        }
        if(c.get(new NamespacedKey("armor", "rank"), PersistentDataType.INTEGER) > 3) {
            c.set(new NamespacedKey("armor", "rank"), PersistentDataType.INTEGER, 1);
        }

        PlayerInventory i = e.getPlayer().getInventory();

        if(c.get(new NamespacedKey("armor", "rank"), PersistentDataType.INTEGER) == 1) {

            ItemStack a1 = new ItemStack(Material.LEATHER_BOOTS, 1); a1.addEnchantment(Enchantment.VANISHING_CURSE, 1); a1.addEnchantment(Enchantment.BINDING_CURSE, 1);
            ItemStack a2 = new ItemStack(Material.LEATHER_LEGGINGS, 1); a2.addEnchantment(Enchantment.VANISHING_CURSE, 1); a2.addEnchantment(Enchantment.BINDING_CURSE, 1);
            ItemStack a3 = new ItemStack(Material.LEATHER_CHESTPLATE, 1); a3.addEnchantment(Enchantment.VANISHING_CURSE, 1); a3.addEnchantment(Enchantment.BINDING_CURSE, 1);
            ItemStack a4 = new ItemStack(Material.LEATHER_HELMET, 1); a4.addEnchantment(Enchantment.VANISHING_CURSE, 1); a4.addEnchantment(Enchantment.BINDING_CURSE, 1);

            ItemStack[] items = {a1, a2, a3, a4};
            i.setArmorContents(items);
        }
        if(c.get(new NamespacedKey("armor", "rank"), PersistentDataType.INTEGER) == 2) {

            ItemStack a1 = new ItemStack(Material.GOLDEN_BOOTS, 1); a1.addEnchantment(Enchantment.VANISHING_CURSE, 1); a1.addEnchantment(Enchantment.BINDING_CURSE, 1);
            ItemStack a2 = new ItemStack(Material.GOLDEN_LEGGINGS, 1); a2.addEnchantment(Enchantment.VANISHING_CURSE, 1); a2.addEnchantment(Enchantment.BINDING_CURSE, 1);
            ItemStack a3 = new ItemStack(Material.GOLDEN_CHESTPLATE, 1); a3.addEnchantment(Enchantment.VANISHING_CURSE, 1); a3.addEnchantment(Enchantment.BINDING_CURSE, 1);
            ItemStack a4 = new ItemStack(Material.GOLDEN_HELMET, 1); a4.addEnchantment(Enchantment.VANISHING_CURSE, 1); a4.addEnchantment(Enchantment.BINDING_CURSE, 1);

            ItemStack[] items = {a1, a2, a3, a4};
            i.setArmorContents(items);
        }
        if(c.get(new NamespacedKey("armor", "rank"), PersistentDataType.INTEGER) == 3) {

            ItemStack a1 = new ItemStack(Material.IRON_BOOTS, 1); a1.addEnchantment(Enchantment.VANISHING_CURSE, 1); a1.addEnchantment(Enchantment.BINDING_CURSE, 1);
            ItemStack a2 = new ItemStack(Material.IRON_LEGGINGS, 1); a2.addEnchantment(Enchantment.VANISHING_CURSE, 1); a2.addEnchantment(Enchantment.BINDING_CURSE, 1);
            ItemStack a3 = new ItemStack(Material.IRON_CHESTPLATE, 1); a3.addEnchantment(Enchantment.VANISHING_CURSE, 1); a3.addEnchantment(Enchantment.BINDING_CURSE, 1);
            ItemStack a4 = new ItemStack(Material.IRON_HELMET, 1); a4.addEnchantment(Enchantment.VANISHING_CURSE, 1); a4.addEnchantment(Enchantment.BINDING_CURSE, 1);

            ItemStack[] items = {a1, a2, a3, a4};
            i.setArmorContents(items);
        }
        if(c.get(new NamespacedKey("armor", "rank"), PersistentDataType.INTEGER) == 4) {

            ItemStack a1 = new ItemStack(Material.DIAMOND_BOOTS, 1); a1.addEnchantment(Enchantment.VANISHING_CURSE, 1); a1.addEnchantment(Enchantment.BINDING_CURSE, 1);
            ItemStack a2 = new ItemStack(Material.DIAMOND_LEGGINGS, 1); a2.addEnchantment(Enchantment.VANISHING_CURSE, 1); a2.addEnchantment(Enchantment.BINDING_CURSE, 1);
            ItemStack a3 = new ItemStack(Material.DIAMOND_CHESTPLATE, 1); a3.addEnchantment(Enchantment.VANISHING_CURSE, 1); a3.addEnchantment(Enchantment.BINDING_CURSE, 1);
            ItemStack a4 = new ItemStack(Material.DIAMOND_HELMET, 1); a4.addEnchantment(Enchantment.VANISHING_CURSE, 1); a4.addEnchantment(Enchantment.BINDING_CURSE, 1);

            ItemStack[] items = {a1, a2, a3, a4};
            i.setArmorContents(items);
        }
        if(c.get(new NamespacedKey("armor", "rank"), PersistentDataType.INTEGER) > 4) {

            ItemStack a1 = new ItemStack(Material.NETHERITE_BOOTS, 1); a1.addEnchantment(Enchantment.VANISHING_CURSE, 1); a1.addEnchantment(Enchantment.BINDING_CURSE, 1);
            ItemStack a2 = new ItemStack(Material.NETHERITE_LEGGINGS, 1); a2.addEnchantment(Enchantment.VANISHING_CURSE, 1); a2.addEnchantment(Enchantment.BINDING_CURSE, 1);
            ItemStack a3 = new ItemStack(Material.NETHERITE_CHESTPLATE, 1); a3.addEnchantment(Enchantment.VANISHING_CURSE, 1); a3.addEnchantment(Enchantment.BINDING_CURSE, 1);
            ItemStack a4 = new ItemStack(Material.NETHERITE_HELMET, 1); a4.addEnchantment(Enchantment.VANISHING_CURSE, 1); a4.addEnchantment(Enchantment.BINDING_CURSE, 1);

            ItemStack[] items = {a1, a2, a3, a4};
            i.setArmorContents(items);
        }

    }

}
