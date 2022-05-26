package org.testplugin.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

// For any command we must extend a CommandExecutor
public class CommandSwitchGM implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {

            // Typecast the commandSender to a Player
            Player iPlayer = (Player) commandSender; //Instance of the player who called the command
            iPlayer.setGameMode(GameMode.CREATIVE);
            iPlayer.chat(String.format("You %s have now been set to creative", iPlayer.getName()));
        }
        return true;
    }
}
