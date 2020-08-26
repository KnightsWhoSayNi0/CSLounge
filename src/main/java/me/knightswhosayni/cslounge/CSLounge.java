package me.knightswhosayni.cslounge;

import me.knightswhosayni.cslounge.commands.CSCommand;
import org.bukkit.plugin.java.JavaPlugin;
import org.omg.CORBA.ObjectHelper;

import java.util.Objects;

public final class CSLounge extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        //commands
        Objects.requireNonNull(getCommand("counterstrike")).setExecutor(new CSCommand(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
