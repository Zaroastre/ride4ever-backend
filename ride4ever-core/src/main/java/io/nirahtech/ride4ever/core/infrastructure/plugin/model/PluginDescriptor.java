package io.nirahtech.ride4ever.core.infrastructure.plugin.model;

import java.io.Serializable;

import io.nirahtech.ride4ever.core.infrastructure.plugin.api.Descriptor;

public class PluginDescriptor implements Descriptor, Serializable {
    private final String groupId;
    private final String artifactId;
    private final String version;

    private final String name;

    private final String description;

    @Override
    public String getArtifactId() {
        return artifactId;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public String getGroupId() {
        return groupId;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getVersion() {
        return version;
    }

    public PluginDescriptor(String groupId, String artifactId, String version, String name, String description) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
        this.name = name;
        this.description = description;
    }
}
