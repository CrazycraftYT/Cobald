package fr.crazy.test;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandDiscord implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		sender.sendMessage("§6CobaldUHC - Discord");
		sender.sendMessage("  ");
		sender.sendMessage("§9 Discord of CobaldUHC » §rhttps://discord.me/cobalduhc");
		return false;
	}

}
