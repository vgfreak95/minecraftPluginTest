package org.testplugin.commands;

import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import org.testplugin.data.MinecraftTimer;

public class CommandTimer implements CommandExecutor {

    private MinecraftTimer mcTimer;
    private Server mcServer;

    public CommandTimer(MinecraftTimer mcTimer, Server mcServer) {
            this.mcTimer = mcTimer;
            this.mcServer = mcServer;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player) {
            Player iPlayer = (Player) commandSender;
            this.mcTimer.startTimer(iPlayer);
            String value = this.mcTimer.getPlayerHashMap().get(iPlayer.getDisplayName());
            this.mcServer.broadcastMessage(String.format("The current time is %s", value));


        }

        return true;
    }
}
