package fr.crazy.test;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandYoutube implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		sender.sendMessage("§6CobaldUHC - YouTube");
		sender.sendMessage("  ");
		sender.sendMessage("§9YouTube of CobaldUHC » §rhttps://www.youtube.com/channel/UC_JJEUXmcfhKWfOr3fSLZ1g");
		return false;
	}

}
