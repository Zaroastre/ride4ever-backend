package io.nirahtech.ride4ever.core.infrastructure.plugin.api;

public interface MicroServicePlugin {
    /**
     * 
     * @param arguments
     */
    public void start(final String... arguments);

    /**
     * 
     */
    public void load();

    /**
     * 
     */
    public void shutdown();

    public Descriptor getDescriptor();
}
