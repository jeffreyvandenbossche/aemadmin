package com.pieterjd.aemadmin.mivc647.components;

/**
 * Created by thavadar on 12/10/2017.
 */
public interface IComponent {
    String getName();
    void setName(String name);
    String getPathPrefix();
    void setPathPrefix(String prefix);
    String getResourceType();
    void setResourceType(String resourceType);
    String getPrimaryType();
    void setPrimaryType(String primaryType);
}
