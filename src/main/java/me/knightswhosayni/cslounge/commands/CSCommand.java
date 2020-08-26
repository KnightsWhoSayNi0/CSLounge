package me.knightswhosayni.cslounge.commands;

import me.knightswhosayni.cslounge.CSLounge;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CSCommand implements CommandExecutor {

    public CSCommand(CSLounge csLounge) {

    }

    String prefix = ChatColor.DARK_BLUE + "[" + ChatColor.GOLD + "CS" + ChatColor.WHITE + ":" + ChatColor.GOLD + "L" + ChatColor.DARK_BLUE + "]";

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("counterstrike")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;

                if (args.length > 0) {

                    if (args[0].equalsIgnoreCase("help")) {
                        p.sendMessage(ChatColor.BLUE + "--------------- " + prefix + ChatColor.BLUE + " ---------------");
                        p.sendMessage(ChatColor.WHITE + "Usage: " + ChatColor.GOLD + "/counterstrike {subcommand}");
                        p.sendMessage(ChatColor.BLUE + "Subcommands:");
                        p.sendMessage(ChatColor.GOLD + "help " + ChatColor.WHITE + "- Displays this help screen.");
                        p.sendMessage(ChatColor.GOLD + "play " + ChatColor.WHITE + "- Joins a game.");
                        p.sendMessage(ChatColor.GOLD + "admin " + ChatColor.WHITE + "- Displays admin subcommands.");
                        p.sendMessage(ChatColor.BLUE + "------------------------------------");
                    } else if (args[0].equalsIgnoreCase("play")) {
                        p.sendMessage(prefix + ChatColor.WHITE + " Have a good game cyka!"); //placeholder for play stuff

                    } else if (args[0].equalsIgnoreCase("admin")) {
                        if (p.hasPermission("csl.admin")) { //perm check for 'csl.admin'
                            p.sendMessage(prefix + ChatColor.WHITE + " Placeholder!");

                        } else {
                            p.sendMessage(prefix + ChatColor.RED + " You do not have the sufficient permissions to use this command!");
                        }
                    }

                } else {
                    p.sendMessage(prefix + ChatColor.WHITE + " No arguments were provided, type '/counterstrike help' to view the help screen.");
                }

            } else {
                System.out.println(prefix + ChatColor.WHITE + " You must be a player to use that command!");
            }
        }
        return true;
    }
}
