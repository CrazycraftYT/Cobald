package fr.crazy.test;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MonPluginListeners implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {

		Player player = event.getPlayer();
		player.getInventory().clear();

		ItemStack customItem = new ItemStack(Material.COMPASS);
		ItemMeta customM = customItem.getItemMeta();
		customM.setDisplayName("§cNavigation");
		customM.setLore(Arrays.asList("Click to navigate"));
		customItem.setItemMeta(customM);
		player.getInventory().addItem(customItem);
		player.updateInventory();

	}

	@EventHandler
	public void onInteract(PlayerInteractEvent event) {

		Player player = event.getPlayer();
		Action action = event.getAction();
		Block block = event.getClickedBlock();

		if (action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK) {
			if (player.getItemInHand().getType() == Material.COMPASS
					&& player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§cNavigation")) {

				Inventory inv = Bukkit.createInventory(null, 27, "§cNavigation");

				inv.setItem(0, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));
				inv.setItem(1, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));
				inv.setItem(2, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));
				inv.setItem(3, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));
				inv.setItem(4, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));
				inv.setItem(5, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));
				inv.setItem(6, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));
				inv.setItem(7, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));
				inv.setItem(8, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));
				inv.setItem(9, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));
				inv.setItem(17, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));
				inv.setItem(18, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));
				inv.setItem(26, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));
				inv.setItem(19, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));
				inv.setItem(20, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));
				inv.setItem(21, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));
				inv.setItem(22, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));
				inv.setItem(23, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));
				inv.setItem(24, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));
				inv.setItem(25, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3));

				ItemStack customItem = new ItemStack(Material.GOLDEN_APPLE);
				ItemMeta customM = customItem.getItemMeta();
				customM.setDisplayName("§1§lUHC");
				customM.setLore(Arrays.asList(" "));
				customItem.setItemMeta(customM);
				ItemStack customItem1 = new ItemStack(Material.GOLDEN_APPLE);
				inv.setItem(12, customItem);
				
				ItemStack customItem11 = new ItemStack(Material.DIAMOND_SWORD);
				ItemMeta customM11 = customItem11.getItemMeta();
				customM11.setDisplayName("§1§lArnena");
				customM11.setLore(Arrays.asList(" "));
				customItem11.setItemMeta(customM11);
				ItemStack customItem111 = new ItemStack(Material.DIAMOND_SWORD);
				inv.setItem(14, customItem111);

				player.openInventory(inv);
			}
		}
	}

}
