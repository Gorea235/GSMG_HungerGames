package gsmg.plugin.hungergames;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class hungergames_executor implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			String arg1 = args[0].toLowerCase();
			if (arg1 == "startnew") {
				startmap(player);
			} else if (arg1 == "addplayerpos") {
				addplayerpos(player, args[1].toLowerCase());
			} else if (arg1 == "removeplayerpos") {
				removeplayerpos(player, args[1].toLowerCase());
			} else if (arg1 == "setlobby") {
				setlobby(player);
			} else if (arg1 == "finish") {
				finish(player);
			} else {
				return false;
			}
			return true;
		} else {
			sender.sendMessage("The console cannot use these commands.");
		}
		return false;
	}

	private void startmap(Player player) {

	}

	private void addplayerpos(Player player, String id) {

	}
	
	private void removeplayerpos(Player player, String id) {
		
	}

	private void setlobby(Player player) {

	}

	private void finish(Player player) {

	}
}
