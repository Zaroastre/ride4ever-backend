package io.nirahtech.ride4ever.application.infrastructure;

import io.nirahtech.ride4ever.core.infrastructure.plugin.api.MicroServicePlugin;

public class Plugin extends Thread {

    private final MicroServicePlugin microServicePlugin;
    private final String[] arguments;

    public Plugin(final MicroServicePlugin microServicePlugin, String... arguments) {
        this.microServicePlugin = microServicePlugin;
        this.arguments = arguments;
    }

    @Override
    public void run() {
        this.microServicePlugin.start(this.arguments);
    }
}
