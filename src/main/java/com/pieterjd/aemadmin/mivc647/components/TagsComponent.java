package com.pieterjd.aemadmin.mivc647.components;

/**
 * Created by thavadar on 12/10/2017.
 */
public class TagsComponent implements IComponent {
    private String resourceType;
    private String primaryType;
    private String name;
    private String pathPrefix;

    public TagsComponent(String name, String resourceType, String primaryType) {
        this.resourceType = resourceType;
        this.primaryType = primaryType;
        this.name = name;
    }

    public TagsComponent(String name, String resourceType, String primaryType, String pathPrefix) {
        this.resourceType = resourceType;
        this.primaryType = primaryType;
        this.name = name;
        this.pathPrefix = pathPrefix;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPathPrefix() {
        return pathPrefix;
    }

    @Override
    public void setPathPrefix(String prefix) {
        this.pathPrefix = prefix;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getPrimaryType() {
        return primaryType;
    }

    public void setPrimaryType(String primaryType) {
        this.primaryType = primaryType;
    }
}
