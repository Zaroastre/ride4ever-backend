package io.nirahtech.ride4ever.application;

import java.io.File;

import io.nirahtech.ride4ever.application.infrastructure.PluginLoader;

/**
 * Ride4EverApplication
 */
public class Ride4EverApplication {

    public static void main(String[] args) {
        System.out.println("[MAIN] Ride4EverApplication");
        System.out.println("[MAIN] Loading Plugins Process is starting...");
        
        PluginLoader pluginLoader = new PluginLoader(new File("plugins"));
        pluginLoader.loadPlugins();
        System.out.println(pluginLoader.getInstalledPlugins());
    }
}