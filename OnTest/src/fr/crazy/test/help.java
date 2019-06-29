package fr.crazy.test;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class help implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("help")) {
			sender.sendMessage("§2 == §6§lCobaldUHC - Help §r§2==");
			sender.sendMessage(" ");
			sender.sendMessage("§1/discord » §rAllows to go on the §1Discord §rof CobaldUHC. ");
			sender.sendMessage(" ");
			sender.sendMessage("§1/twitter » §rAllows to go on the §bTwitter §rof CobaldUHC. ");
			sender.sendMessage(" ");
			sender.sendMessage("§1/youtube » §rAllows to go on the §4YouTube §rchannel of CobaldUHC.");
		}
		return false;
	}

}