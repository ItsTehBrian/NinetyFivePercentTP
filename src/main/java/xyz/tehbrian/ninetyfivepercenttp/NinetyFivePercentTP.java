package xyz.tehbrian.ninetyfivepercenttp;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.tehbrian.ninetyfivepercenttp.commands.RTPCommand;

public final class NinetyFivePercentTP extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

        getCommand("rtp").setExecutor(new RTPCommand(this));
    }
}
