package org.task1.task1;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.task1.task1.command.AllGiveCommand;

public final class TaskGiveAll extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("플러그인 활성화");
        // Plugin startup logic
        getCommand("전체지급").setExecutor(new AllGiveCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("플러그인 비활성화");
        // Plugin shutdown logic
    }
}
