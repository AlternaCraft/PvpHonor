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


import com.alternacraft.aclib.PluginBase;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author AlternaCraft
 */
public class Manager {

    public static Manager INSTANCE = new Manager();

    public static final PluginBase BASE = PluginBase.INSTANCE;

    private final ConfigLoader loader;

    private Manager() {
        loader = new ConfigLoader();
    }

    public boolean setup(JavaPlugin plugin) {
        BASE.init(plugin, loader);
        return true;
    }
}
