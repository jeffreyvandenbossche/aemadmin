package com.pieterjd.aemadmin.mivc647;

import com.pieterjd.aemadmin.mivc647.components.TagsComponent;
import com.pieterjd.aemadmin.mvc5619.QuerySubpage;

/**
 * Created by thavadar on 12/10/2017.
 */
public class Main {

    public static void main(String[] args) {
        TagsComponent tags = new TagsComponent("tags", "kpngb/content/components/orion_tags", "nt:unstructured", "par-12");
        String[] languages = {"fr","nl","en"};
        for (String lang : languages) {
            QuerySubpage query = new QuerySubpage(
                    "/content/kpngb-base/" + lang + "/frequently-asked-questions",
                    "kpngb-whitelabel/components/page/responsive-faq-page");
            AddComponentToSubpage add = new AddComponentToSubpage(query, tags);
            add.execute();
        }

    }

}
