package fr.crazy.test;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandTwitter implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		sender.sendMessage("§6 CobaldUHC - Twitter");
		sender.sendMessage("  ");
		sender.sendMessage("§9 Twitter of CobaldUHC » §rhttps://twitter.com/CobaldUHC");
		return false;
	}

}
