package com.nebulatoxin;

import org.bukkit.plugin.java.JavaPlugin;

public final class NTSystem extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("NT Framework " + this.getDescription().getVersion() + " loaded!");
    }

}
