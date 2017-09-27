package com.pieterjd.aemadmin.mvc5619.tags;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pdrouill on 18/09/2017.
 */
public class TagFactory {
    private List<Tag> tags;

    public TagFactory() {
        tags = new ArrayList<>();
        tags.add(new Tag("faq:monthly-plans"));

    }

    public Tag findTag(String id) {

        for (Tag t : tags) {
            if (t.getId().contains(id)) {
                return t;
            }
        }
        return  new Tag(id);
    }
}
