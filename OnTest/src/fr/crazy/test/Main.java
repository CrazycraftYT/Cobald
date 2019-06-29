package fr.crazy.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	public Map<Player, ScoreboardSign> boards = new HashMap<>();

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		getCommand("help").setExecutor(new help());
		getCommand("discord").setExecutor(new CommandDiscord());
		getCommand("twitter").setExecutor(new CommandTwitter());
		getCommand("youtube").setExecutor(new CommandYoutube());
		getServer().getPluginManager().registerEvents(new MonPluginListeners(), this);

	}

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();

		for (Entry<Player, ScoreboardSign> sign : boards.entrySet()) {
			sign.getValue().setLine(5, "" + (Bukkit.getOnlinePlayers().size()));
		}

		ScoreboardSign scoreboard = new ScoreboardSign(player, "§bCobaldUHC");
		scoreboard.create();
		scoreboard.setLine(0, "§a ");
		scoreboard.setLine(1, "§3Name:§r " + player.getName());
		scoreboard.setLine(2, "§3Rank: ");
		scoreboard.setLine(3, "§4 ");
		scoreboard.setLine(4, "§7Players online : ");
		scoreboard.setLine(5, "§7" + Bukkit.getOnlinePlayers().size());
		scoreboard.setLine(6, "§d ");
		scoreboard.setLine(7, "§5 ");
		scoreboard.setLine(8, "§2 ");
		scoreboard.setLine(9, "§c ");
		scoreboard.setLine(10, "§6mc.cobalduhc.com");
		boards.put(player, scoreboard);

	}

	@EventHandler
	public void onQuit(PlayerQuitEvent event) {
		Player player = event.getPlayer();

		for (Entry<Player, ScoreboardSign> sign : boards.entrySet()) {
			sign.getValue().setLine(5, "" + (Bukkit.getOnlinePlayers().size() - 1));
		}

		if (boards.containsKey(player)) {
			boards.get(player).destroy();
		}
	}

}
