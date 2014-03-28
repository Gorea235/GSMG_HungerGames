package gsmg.plugin.hungergames;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class hungergames_main extends JavaPlugin {
	private hungergames_main plugin = hungergames_main.this;
	
	public void broadcastMessage(String msg) {
		Bukkit.broadcastMessage("[GSMG - Hunger Games] " + msg);
	}

	public static void Log(String toLog) {
		Bukkit.getLogger().info(toLog);
	}
}
