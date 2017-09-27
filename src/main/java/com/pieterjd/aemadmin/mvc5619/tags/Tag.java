package com.pieterjd.aemadmin.mvc5619.tags;

import java.util.Iterator;
import java.util.List;

/**
 * Created by pdrouill on 18/09/2017.
 */
public class Tag {
    private String id;

    @Deprecated
    private List<Tag> children;

    public Iterator<Tag> iterator() {
        return children.iterator();
    }

    public boolean add(Tag tag) {
        return children.add(tag);
    }

    public Tag get(int index) {
        return children.get(index);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Tag> getChildren() {
        return children;
    }

    public void setChildren(List<Tag> children) {
        this.children = children;
    }

    public Tag(String id){
        setId(id);
    }
}
