/*
 * Copyright (C) 2017 AlternaCraft
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.alternacraft.pvphonor.Main;

import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author AlternaCraft
 */
public class PvpHonor extends JavaPlugin {

    @Override
    public void onEnable() {
        // Set up before start
        Manager.BASE.definePluginPrefix("&1[&bPvpHonor&1]");

        // Plugin manager init
        if (!Manager.INSTANCE.setup(this)) {
            this.setEnabled(false);
            return;
        }

        // Later tasks
        this.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                //
            }
        });

        // Sends enabled message
        this.getLogger().info("PvpHonor has been enabled!");
    }

    @Override
    public void onDisable() {
        
        // Sends disable message
        this.getLogger().info("PvpHonor has been disabled!");
    }
}
