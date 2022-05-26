package org.testplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.testplugin.commands.CommandSwitchGM;
import org.testplugin.commands.CommandTimer;
import org.testplugin.data.MinecraftTimer;

// First things first you must extend JavaPlugin
public class TestPlugin extends JavaPlugin {

    public final String PLUGIN_NAME = "TEST_PLUGIN";
    public MinecraftTimer mcTimer;

    @Override
    public void onEnable() {
        // DO some code when enabled
        getLogger().info(String.format("Successfully loaded %s", PLUGIN_NAME));

        // Create our timer here
        mcTimer = new MinecraftTimer();



        // Register our command "kit" (set an instance of your command class as executor)
        this.getCommand("switchgm").setExecutor(new CommandSwitchGM());
        this.getCommand("starttimer").setExecutor(new CommandTimer(mcTimer, getServer()));

    }

    @Override
    public void onDisable() {
        // Do some code when disabled
        getLogger().info("plugin is disabled");
    }

}
