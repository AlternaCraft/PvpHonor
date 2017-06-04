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
package com.alternacraft.pvphonor.Utils;

/**
 * Configuration data.
 * 
 * @author AlternaCraft
 */
public class ConfigDataStore {

    // General
    protected String pluginPrefix = "";
    
    protected boolean metrics = true;
    
    protected boolean alert = true;
    protected boolean update = true;
    
    protected boolean displayIntegrations = true;
    
    protected short errorFormat = 2;
    
    public String getPluginPrefix() {
        return pluginPrefix;
    }

    public void setPluginPrefix(String pluginPrefix) {
        this.pluginPrefix = pluginPrefix;
    }

    public boolean isMetrics() {
        return metrics;
    }

    public void setMetrics(boolean metrics) {
        this.metrics = metrics;
    }

    public boolean isAlert() {
        return alert;
    }

    public void setAlert(boolean alert) {
        this.alert = alert;
    }

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public boolean isDisplayIntegrations() {
        return displayIntegrations;
    }

    public void setDisplayIntegrations(boolean displayIntegrations) {
        this.displayIntegrations = displayIntegrations;
    }

    public short getErrorFormat() {
        return errorFormat;
    }

    public void setErrorFormat(short errorFormat) {
        this.errorFormat = errorFormat;
    }
}
