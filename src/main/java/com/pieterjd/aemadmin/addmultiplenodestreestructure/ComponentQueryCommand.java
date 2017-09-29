package com.pieterjd.aemadmin.addmultiplenodestreestructure;

import com.pieterjd.aemadmin.command.QueryCommand;

/**
 * Created by pdrouill on 22/08/2017.
 */
public class ComponentQueryCommand extends QueryCommand {
    public ComponentQueryCommand(){
        super();
        addCondition("1_property","sling:resourceType");
        addCondition("1_property.value","kpngb-whitelabel/components/page/responsive-faq-page");
        addCondition("path","/content/kpngb-base/en/frequently-asked-questions");
        addCondition("p.limit","-1");
    }
}
