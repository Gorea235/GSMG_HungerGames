package gsmg.plugin.hungergames;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class hungergames_main extends JavaPlugin {
	public void broadcastMessage(String msg) {
		Bukkit.broadcastMessage("[GSMG - Hunger Games] " + msg);
	}

	public static void Log(String toLog) {
		Bukkit.getLogger().info(toLog);
	}

	@Override
	public void onEnable() {
		getCommand("hg").setExecutor(new hungergames_executor());
		getCommand("hungergames").setExecutor(new hungergames_executor());
	}
}
